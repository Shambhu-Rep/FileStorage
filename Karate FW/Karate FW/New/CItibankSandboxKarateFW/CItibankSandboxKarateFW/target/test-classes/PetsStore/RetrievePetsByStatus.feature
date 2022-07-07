Feature: retrieve  pet by status from petsStore

  Background:

   #* url baseURL

  @PetByStatus
  Scenario:  fetch user into documents
    Given url 'https://petstore.swagger.io/v2/pet/findByStatus'
    And param status = 'sold'
    When method get
    Then status 200/
    * print response
    * print response.id

    And match response.id contains '15435006001960'