<%@ page import="java.io.*, java.util.*" %>
<html>
<head>
    <title>Processed User Details</title>
</head>
<body>
    <h1>User Details Submitted</h1>
    <%
        // Retrieving form values using request.getParameter()
        String name = request.getParameter("username");
        String birthdate = request.getParameter("birthdate");
        String email = request.getParameter("email");
        String luckyNumStr = request.getParameter("luckyNumber");

        // Convert lucky number from String to int
        int luckyNumber = 0;
        try {
            luckyNumber = Integer.parseInt(luckyNumStr);
        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Invalid lucky number entered!</p>");
        }
    %>

    <h2>Collected Information:</h2>
    <table border="1" cellpadding="10">
        <tr><th>Name</th><td><%= name %></td></tr>
        <tr><th>Birth Date</th><td><%= birthdate %></td></tr>
        <tr><th>Email</th><td><%= email %></td></tr>
        <tr><th>Lucky Number</th><td><%= luckyNumber %></td></tr>
    </table>
</body>
</html>
