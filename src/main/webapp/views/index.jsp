<%@page language="Java" %>

<html>
  <body>
    <h1>Welcome to the My First Web Page!</h1>
    <p>This is a simple web page created using Java and Spring Boot.</p>
    <form action="student">
      <label for="id">Student Id:</label><br>
      <input type="text" id="id" name="id"><br>
      <label for="sName">Last number:</label><br>
      <input type="text" id="sName" name="sName"><br><br>
      <input type="submit" value="Submit">
    </form>
    <p>${someConstantOrValue}</p>
  </body>
</html>