sFeature: Get deleted created user payments by Id for REST APIs

  Background: 
    * call read('classpath:reusable.feature')

  @Payment @GET_DeletedUserPaymentDetails
  Scenario: Get deleted user payment details by Id of REST APIs
    * call read('classpath:com/sample/rest/apis/GetAllPaymentDetails.feature')
    * call read('classpath:com/sample/rest/apis/CreateNewUserPayment.feature')
    * call read('classpath:com/sample/rest/apis/GetCreatedUserPaymentById.feature')
    * call read('classpath:com/sample/rest/apis/ModifyCreatedUserPayment.feature')
    * call read('classpath:com/sample/rest/apis/PatchCreatedUserPayment.feature')
    * call read('classpath:com/sample/rest/apis/DeleteCreatedUserPayment.feature')
    Given url 'https://sample-4e6d.restdb.io/rest/payments/'+id
    And header x-apikey = '9677194df0cd556c1bb2f9aeee86c7e218482'
    When method get
    Then status 200
    * print 'response : '+response
