<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Current Date and Time</title>
</head>
<body>
    <h2>Current Date and Time</h2>
    <%
        java.util.Date currentDate = new java.util.Date();
        out.println("Current Date and Time: " + currentDate.toString());
    %>
</body>
</html>


      
//web.xml file ko and cdt.jsp dono ko ek sath 
// sample wale folder ke aandar daal do 
 //then tomcat chalu karke http://127.0.0.1:8080/Sample/cdt.jsp
   
