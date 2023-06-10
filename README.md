
## Project Description
This project consists of two microservices: Stock Calculation and Stock Price Service. The microservices are registered with a Eureka server and provide functionality related to stock calculations and retrieving stock prices.

## Stock Calculation Microservice
The Stock Calculation microservice includes a REST controller class named StockCalculationRestController that handles the stock calculation functionality.

## Stock Price Microservice
The Stock Price microservice includes a REST controller class named StockPriceController that handles the stock price retrieval functionality.

## Endpoints
The project includes the following endpoints:

### Stock Calculation Microservice:

GET /calculate/{companyName}/{quantity}: Calculates the total cost of stocks for the specified company and quantity.

### Stock Price Microservice:

GET /price/{companyName}: Retrieves the stock price for the specified company.


## Learning Outcomes:
With the help of this project, I learned:
* Implementation of microservices using Spring Boot.
* Utilizing the Eureka server for service registration and discovery.
* Sending Custom Exception messages to the client.