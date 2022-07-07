@Regression @POST_PDT_Confirmation
Feature: POST_PDT-Confirmation APIs

  Background: 
    * call read('classpath:reusable.feature')
    * def testData = read('classpath:com/assignment3/karateFW/testdata/testData.json')
    * def PDT_Confirmation_Payload = read('classpath:com/assignment3/karateFW/testData/PDT_Confirmation.json')

  @TC_021 @PDT_Confirmation @Positive
  Scenario: Initiate the PDT-Confirmation API with valid fields and verify the Expected Result
    * call read('classpath:com/assignment3/karateFWFeature/POST_PDT-PreProcess.feature@PDT_Preprocess')
    Given url testData.baseURI + testData.PDT_Confirmation_Resource
    And header Authorization = authorization
    And header Accept = testData.accept
    And header uuid = randomString(20)
    And header client_id = testData.client_Id
    And header Content-Type = testData.Content_Type_PDT_Confirmation
    * set PDT_Confirmation_Payload.controlFlowId = control_Flow_Id
    * print 'POST_PDT-Confirmation Payload Request : ' + PDT_Confirmation_Payload
    And request PDT_Confirmation_Payload
    When method post
    Then status 200
    * print 'Response Time : ' + responseTime
    And assert responseTime < 10000
    And match responseType == 'json'
    * print response
    * match response.SourceAccount.displaySourceAccountNumber == '#notnull'
    * match response.SourceAccount.sourceAccountAvailableBalance == '#present'
    * match response.SourceAccount.sourceCurrencyCode == 'BHD'
    * match response.DestinationAccount.displayDestinationAccountNumber == '#notnull'
    * match response.DestinationAccount.destinationAccountAvailableBalance == '#present'
    * match response.DestinationAccount.destinationCurrencyCode == 'BHD'
    * def transaction_ReferenceId = response.transactionReferenceId
    * match response.transactionReferenceId == '#present'
    * print transaction_ReferenceId
    * print '********* PDT-Confirmation Done and transactionReferenceId Generated  *********'
    
    @TC_022 @PDT_ConfirmationNegative @Negative
  Scenario: To verify the PDT-Confirmation API with invalid controlFlowId
    * call read('classpath:com/assignment3/karateFWFeature/POST_PDT-PreProcess.feature@PDT_Preprocess')
    Given url testData.baseURI + testData.PDT_Confirmation_Resource
    And header Authorization = authorization
    And header Accept = testData.accept
    And header uuid = randomString(20)
    And header client_id = testData.client_Id
    And header Content-Type = testData.Content_Type_PDT_Confirmation
    * set PDT_Confirmation_Payload.controlFlowId = testData.invalid_controlFlowId
    * print 'POST_PDT-Confirmation Payload Request : ' + PDT_Confirmation_Payload
    And request PDT_Confirmation_Payload
    When method post
    Then status 400
    * print 'Response Time : ' + responseTime
    And assert responseTime < 10000
    And match responseType == 'json'
    * print response
    * match response.type == 'error'
    * match response.code == 'invalidControlFlowId'
    * match response.details == 'Control flow ID is invalid'
    
    * print '********* PDT-Confirmation and invalid_controlFlowId *********'
    