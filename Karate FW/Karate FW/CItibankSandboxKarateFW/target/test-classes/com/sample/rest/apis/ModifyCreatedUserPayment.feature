Feature: Modify created user payments by Id for REST APIs

  Background: 
    * call read('classpath:reusable.feature')
    * def ModifyUserReq = read('classpath:com/sample/rest/apis/ModifyCreatedUserPayment.json')

  @Payment @GET_ModifyCreatedUserPaymentDetails
  Scenario: Modify user payment details by Id of REST APIs
    # * call read('classpath:com/sample/rest/apis/CreateNewUserPayment.feature')
   # * call read('classpath:com/sample/rest/apis/GetCreatedUserPaymentById.feature')
    Given url 'https://sample-4e6d.restdb.io/rest/payments/'+id
    And header x-apikey = '9677194df0cd556c1bb2f9aeee86c7e218482'
    And header Content-Type = 'application/json'
    And request ModifyUserReq
    When method put
    Then status 200
    * print 'response : '+response
