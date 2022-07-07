Feature: Create new user payments for REST APIs

  Background: 
    * call read('classpath:reusable.feature')
    * def CreateUserReq = read('classpath:com/sample/rest/apis/CreateNewUserPayment.json')

  @Payment @POST_CrateUserPayment
  Scenario: Create new user payment details of REST APIs
    #* call read('classpath:com/sample/rest/apis/GetAllPaymentDetails.feature')
    Given url 'https://sample-4e6d.restdb.io/rest/payments'
    And header x-apikey = '9677194df0cd556c1bb2f9aeee86c7e218482'
    And request CreateUserReq
    When method post
    Then status 201
    * print 'response : '+response
    * def id = response._id
    * print 'Response Id : '+id
    * match response._id == '#string'
    * match response._id == '#notnull'
    * match response._id == '#present'
    * match response.fromAccount =='#number'
    * match response.toAccount =='#number'
    * match response.amount =='#number'
    * match response.remarks =='#string'
    * print 'Remorks : ' + response.remarks
