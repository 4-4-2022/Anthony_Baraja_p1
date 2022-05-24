# Anthony_Baraja_p1

## Gas Mileage Reimbursement API with Spring

Employees are able to view and send their reimbursement request to the API. 
Managers are able to view and approve their employees request. 
Administrators are able to view and bill the request to the respective employee.
## Technologies Used

* Java - version 8
* Git SCM - GitHub
* Spring Framework
* Spring Data JPA
* REST - Webservice
* REST - Consumer

## Features
* Employees Service - List of Employees and basic information
* Reimbursement Service - List of Employee Requests and their respective approval/bill status
* Service Requests - Restful API for users to interact, consumes the web services

To-do list:
* Management Service - Lookup Employees/Managers Relation List
* Unit Testing - Junit, Mockito
* Logging - Logback

## Getting Started

> Using Spring ToolSuite, Run Web Services first: ServiceEmployees and ServiceRequests

> Then Run ClientInterface, this is the REST application that consumes the Services


## Usage

> With the Services and Client running, use a browser or an API consumption tool (ARC, Postman).

> Make HTTP Requests: 

>       Example #1 Get Request, list all employees | GET http://localhost:8080/requests/all

>       Example #2 POST Request, make a new reimbursement request | POST http://localhost:8080/requests/reimbursement
>          Append the folowing Body: 
>             {
>                 "id": "14",
>                 "employeeId": "6",
>                 "requestAmount": 400.0,
>                 "requestReason": "World Tour business trip, first class",
>                 "approvalStatus": 0,
>                 "billStatus": 0
>             }

## Contributor

> Anthony Baraja