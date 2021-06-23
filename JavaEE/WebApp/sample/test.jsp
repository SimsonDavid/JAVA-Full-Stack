<%@ page session="false"%>

<body bgcolor="white">
<jsp:useBean id='simson' scope='page' class='sd.myclass' type="sd.myclass" />
<h1> SIMSON method is   <jsp:getProperty  name="simson" property="name"/> </h1>
<h1> friends method is   <jsp:getProperty  name="simson" property="friends"/> </h1>


</body>
