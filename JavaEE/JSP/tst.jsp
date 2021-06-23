

<%@ page session="false"%>

<body bgcolor="white">
<jsp:useBean id='ss' scope='page' class='number.mynumber' type="number.mynumber" />
<h1> SIMSON method is   <jsp:getProperty  name="ss" property="number"/> </h1>

</body>
