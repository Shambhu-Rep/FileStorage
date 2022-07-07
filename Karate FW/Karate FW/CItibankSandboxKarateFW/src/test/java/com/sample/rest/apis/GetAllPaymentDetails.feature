Feature: Get all user payments for REST APIs

  Background: 
    * call read('classpath:reusable.feature')

  @Payment @GET_AllPayment
  Scenario: Fetch all user payment details of REST APIs
    Given url 'https://sample-4e6d.restdb.io/rest/payments'
    And header x-apikey = '9677194df0cd556c1bb2f9aeee86c7e218482'
    When method get
    Then status 200
    * print 'response : '+response
