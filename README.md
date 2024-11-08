<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--     <title>Flight Management System</title> -->
</head>
<body>

<h1>Flight Management System</h1>

<h2>Project Overview</h2>
<p>The Flight Management System is a Java-based web application that allows users to manage and view flight information. This application provides functionalities to store, update, and retrieve flight details such as flight number, type, source, destination, layovers, date, and charge.</p>
<p>The project is designed using Java, JDBC, Servlets, JSP, and MySQL, aiming to offer a simple and efficient interface for both administrators and users.</p>

<h2>Features</h2>
<ul>
    <li><strong>Flight Information Management</strong>: Add, update, delete, and view details of flights, including flight number, type, source, destination, layoff points, date, and charge.</li>
    <li><strong>User-Friendly Interface</strong>: Intuitive interface for easy navigation and management.</li>
    <li><strong>Database Connectivity</strong>: Efficient data storage and retrieval using MySQL database.</li>
</ul>

<h2>Technologies Used</h2>
<ul>
    <li><strong>Frontend</strong>: JSP, HTML, CSS</li>
    <li><strong>Backend</strong>: Java, Servlets, JDBC</li>
    <li><strong>Database</strong>: MySQL</li>
</ul>

<h2>Project Structure</h2>
<ul>
    <li><code>src/</code>: Contains Java source code for servlets and business logic.</li>
    <li><code>WebContent/</code>: Holds JSP files, CSS, and other static resources.</li>
    <li><code>lib/</code>: Includes necessary libraries for JDBC and MySQL connectivity.</li>
    <li><strong>Database Schema</strong>: SQL script for creating and initializing the database tables.</li>
</ul>

<h2>Setup Instructions</h2>
<ol>
    <li><strong>Clone the Repository</strong>:
        <pre><code>git clone https://github.com/ShivamRaje/Flight-Management-System.git</code></pre>
    </li>
    <li><strong>Import into Eclipse</strong>:
        <ul>
            <li>Open Eclipse and import the project as a <strong>Dynamic Web Project</strong>.</li>
        </ul>
    </li>
    <li><strong>Configure Database</strong>:
        <ul>
            <li>Create a MySQL database named <code>flight_management</code>.</li>
            <li>Run the provided SQL script to create the required tables.</li>
        </ul>
    </li>
    <li><strong>Update Database Configuration</strong>:
        <ul>
            <li>In the database configuration file, update the username and password as per your MySQL setup.</li>
        </ul>
    </li>
    <li><strong>Run the Application</strong>:
        <ul>
            <li>Start the server (e.g., Apache Tomcat).</li>
            <li>Access the application in your browser at <code>http://localhost:8080/FlightManagementSystem</code>.</li>
        </ul>
    </li>
</ol>

<h2>Usage</h2>
<ul>
    <li><strong>Admin</strong>: Manages flight data by adding, updating, and deleting flight information.</li>
    <li><strong>User</strong>: Views available flights based on different search criteria.</li>
</ul>

<h2>Future Enhancements</h2>
<ul>
    <li>Add authentication for admin access.</li>
    <li>Implement search filters for users to refine flight searches.</li>
    <li>Integrate payment gateway for flight booking.</li>
</ul>

<h2>Contributing</h2>
<p>Feel free to fork the repository and submit pull requests with any enhancements or bug fixes.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License.</p>

<h2>GitHub Repository</h2>
<p><a href="https://github.com/ShivamRaje/Flight-Management-System.git" target="_blank">Flight Management System on GitHub</a></p>

</body>
</html>
