# Online Course Management System

## Project Overview
This project is an Online Course Management System designed to facilitate the management of courses, lessons, and materials. It provides an interactive platform for students to access course content, including videos and PDFs.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Features
- User authentication (Admin and Student roles)
- Create, read, update, and delete (CRUD) operations for courses and lessons
- Upload and manage course materials (videos, PDFs)
- Responsive web interface using React
- Mobile application support using React Native

## Technologies Used
- **Backend**: Spring Boot, JPA, Hibernate
- **Frontend**: React, Boostrap
- **Mobile**: React Native
- **Database**: MySQL

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/pubudusanka/online-course-management-system.git

## Usage
- Access the application via http://localhost:3000 for the front-end.
- Use Postman or any API client to test the backend API endpoints.

## API Endpoints
- User Endpoints <br/>
  1. GET /api/users - Retrieve all users <br/>
  2. GET /api/users/{id} - Retrieve a specific user by ID <br/>
  3. POST /api/users - Create a new user <br/>
  4. PUT /api/users/{id} - Update an existing user by ID <br/>
  5. DELETE /api/users/{id} - Delete a user by ID <br/>

- Student Endpoints <br/>
  1. GET /api/students - Retrieve all students. <br/>
  2. GET /api/students/{id} - Retrieve a specific student by ID <br/>
  3. POST /api/students - Create a new student <br/>
  4. PUT /api/students/{id} - Update an existing student by ID <br/>
  5. DELETE /api/students/{id} - Delete a student by ID <br/>

- Profile Endpoints (Optional) <br/>
  1. GET /api/users/{userId}/profile - Retrieve a user's profile <br/>
  2. PUT /api/users/{userId}/profile - Update a user's profile information <br/>

- Courses Endpoints <br/>
  1. GET /api/courses - Retrieve all courses <br/>
  2. GET /api/courses/{id} - Retrieve a specific course by ID <br/>
  3. POST /api/courses - Create a new course <br/>
  4. PUT /api/courses/{id} - Update an existing course by ID <br/>
  5. DELETE /api/courses/{id} - Delete a course by ID <br/>

- Lesson Endpoints <br/>
  1. GET /api/courses/{courseId}/lessons - Retrieve all lessons for a specific course <br/>
  2. GET /api/courses/{courseId}/lessons/{id} - Retrieve a specific lesson by ID <br/>
  3. POST /api/courses/{courseId}/lessons - Create a new lesson for a specific course <br/>
  4. PUT /api/courses/{courseId}/lessons/{id} - Update an existing lesson by ID <br/>
  5. DELETE /api/courses/{courseId}/lessons/{id} - Delete a lesson by ID <br/>

- Material Endpoints <br/>
  1. GET /api/lessons/{lessonId}/materials - Retrieve all materials for a specific lesson <br/>
  2. POST /api/lessons/{lessonId}/materials - Upload new material for a specific lesson <br/>
  3. DELETE /api/lessons/{lessonId}/materials/{id} - Delete a specific material by ID <br/>

- User Authentication Endpoints (Optional) <br/>
  1. POST /api/auth/login - Authenticate a user <br/>
  2. POST /api/auth/register - Register a new user <br/>
