# ValidationDemo
Sample validation with database constraints for Spring Boot

This example shows how to use the Databse Integrity Violation exception to extend the validation of a form. The example used is a User entity with a constraint of uniqueness on its e-mail field. 
This method allows the use of other validation (@NotEmpty, @Size, @Min, @Max, etc.) as well as custom errors added to the Binding Result that will display for the affected text input. 

Instructions to use this example: 

    - Clone the project to a folder on your machine 
    - Create a database/schema (daveslistaoa4eva is expected, but you can change this in application properties)
    - Open up the project in an IDE 
    - Run as a Spring Boot project 
    - Open up a browser to localhost:8080 (or the designated port for the application) 
    - Enter an e-mail address and submit the form. 
    - Use the 'Return to input form' link to make another entry 
