<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<sql:query var="rs" dataSource="jdbc/employee">
select * from exams
</sql:query>
<html>
 <head>
 <title>DB Test</title>
 </head>
 <body>
 <h2>Results</h2>
<c:forEach var="row" items="${rs.rows}">
 Foo ${row.mark1}<br/>
 Bar ${row.mark2}<br/>
</c:forEach>
 </body>
</html>