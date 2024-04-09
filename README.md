

This project demonstrates basic CRUD (Create, Read, Update, Delete) operations using Spring Boot, along with user authentication.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL (or any other database of your choice)


## Setup

1. **Clone the repository:**

    ```bash
    git clone  https://github.com/Veena-h/crudSpringExample.git

    ```

2. **Configure the database:**

    - Create a MySQL database named `spring_crud` (or any name of your choice).
    - Update the `application.properties` file with your database configuration:

        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/spring_crud
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        ```

3. **Run the application:**

    ```bash
    ./mvnw spring-boot:run
    ```

    The application will start on `http://localhost:8585`.

## Functionality

- **CRUD Operations:** You can perform CRUD operations on a resource (e.g., `Product`, `Customer`, etc.) via the provided REST endpoints.


## REST API Endpoints


- `POST /api/register`: User registration
- `GET /api/resource`: Retrieve a resource
- `POST /api/resource`: Create a new resource
- `PUT /api/resource/{id}`: Update an existing resource
- `DELETE /api/resource/{id}`: Delete a resource

## Contributing

Contributions are welcome! Feel free to open issues or pull requests for any improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
