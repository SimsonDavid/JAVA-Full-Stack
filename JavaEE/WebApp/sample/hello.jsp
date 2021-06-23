<html>
<head>
<title>Sample Application JSP Page</title>
</head>
<body bgcolor=Blue>
    <h1><center>JSP FILE</center></h1>

<table border="2">
<tr>
<td align=center>
<img src="images/tomcat.gif">
</td>
<td>
<h1>Sample Application JSP Page</h1>
This is the output of a JSP page that is part of the Hello, World
application.
</td>
</tr>
</table>

<%= new String("Hello!") %>
<% int i=1;
for(i=1;i<10;i++)
{
out.print("<h2> "+i+"</h2>");
}
%>

</body>
</html>
