Feature: Flipkart Product Search Functionality

  Scenario Outline: To Validate Search Functionality with multiple products
    Given To launch the browser and navigate the url
    When Click on the search bar and search for "<product_name>"
    Then Navigate to the search page results for "<product_name>"

    Examples:
      | product_name |
      | iPhone       |
      | Running Shoes |
      | Laptop       |