Feature: Get created user payments by Id for REST APIs

  Background: 
    * call read('classpath:reusable.feature')

  @Payment @GET_CreatedUserPaymentDetails
  Scenario: Fetch user payment details by Id of REST APIs
   # * call read('classpath:com/sample/rest/apis/CreateNewUserPayment.feature')
    Given url 'https://sample-4e6d.restdb.io/rest/payments/'+id
    And header x-apikey = '9677194df0cd556c1bb2f9aeee86c7e218482'
    When method get
    Then status 200
    * print 'response : '+response
