Feature: Get all user payments fo REST APIs

  Background: 
    * call read('classpath:reusable.feature')

  @NextRepayment
  Scenario: get call test
    Given url 'https://reqres.in//api/users?page=2'
    When method get
    Then status 200
    * print 'response : '+response
