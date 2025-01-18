# Learn-SpringAPI

## Overview
This project is a simple Spring Boot application that demonstrates the basics of creating a RESTful API. The application manages a list of users and provides endpoints to retrieve user information.

## Technologies Used
- Java
- Spring Boot
- Maven

## Project Structure
- `src/main/java/org/example/springapi/api/model/User.java`: Defines the `User` model class.
- `src/main/java/org/example/springapi/api/controller/UserController.java`: Contains the REST controller for handling user-related requests.
- `src/main/java/org/example/springapi/service/UserService.java`: Provides the service layer for managing users.

## Endpoints
### Get User
- **URL**: `/user`
- **Method**: `GET`
- **Request Parameter**: `id` (Integer) - The ID of the user to retrieve.
- **Response**: Returns the user details if the user is found, otherwise returns `null`.

## How to Run
1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/Learn-SpringAPI.git
    ```
2. Navigate to the project directory:
    ```sh
    cd Learn-SpringAPI
    ```
3. Build the project using Maven:
    ```sh
    mvn clean install
    ```
4. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## Example Usage
To retrieve a user with ID 1, you can use the following curl command:
```sh
curl -X GET "http://localhost:8080/user?id=1"
