<%@page language="Java" %>

<html>
    <body>
        <h1>Welcome to the My First Web Page!</h1>
        <p>This is a simple web page created using Java and Spring Boot.</p>
        <p>result is ${result} </p>
        <p>orrrrr --------------</p>
        <p>add is : <%= session.getAttribute("result") %> </p>
    </body>
</html>