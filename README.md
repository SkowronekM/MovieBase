# MovieBase

This is an application I created at the end of my Java course. It is a web application for managing a movie database. It allows users to register, vote for their favorite titles, and browse ratings. The application has different levels of user permissions, including the ability for editors and administrators to add new content.

## Features

- **User Registration:** Users can create accounts to access the application's features.
- **Voting:** Users can vote for their favorite movie titles.
- **Rating Browsing:** Users can browse movie ratings.
- **Content Management:** Editors and administrators can add, edit, and delete movie entries.

## Technologies

- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Thymeleaf**
- **Liquibase**
- **H2 Database**
- **MySQL Connector/J**
- **Apache Commons IO**
- **Spring Security**

## Installation

1. **Clone the repository:**
   
   ```bash
   git clone https://github.com/SkowronekM/MovieBase.git

2. **Navigate to the project directory:**
   
   ```bash
   cd MovieBase
   
3. **Build and run the application:**

   ```bash
   ./mvnw spring-boot:run

Alternatively, you can use an IDE such as IntelliJ IDEA or Eclipse to run the application directly.

## Usage

- Access the application through `http://localhost:8080` in your web browser.
- Use the admin panel for managing categories and products.

## License

This project is licensed under the MIT License.
