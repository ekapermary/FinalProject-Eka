@api

  scenario: Test API demoblaze
    Given I set the base URL to "https://api.demoblaze.com"
    When I send a GET request to "/products"
    Then the response status code should be 200
