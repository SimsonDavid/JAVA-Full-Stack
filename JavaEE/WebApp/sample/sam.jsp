<%@ page session="false"%>
<html>


<body bgcolor="lightblue">
   
<%= new String("Hello! Your details") %>


<p><b>First Name:</b>
       <%= request.getParameter("first_name")%>
    </p>
    <p><b>Last  Name:</b>
       <%= request.getParameter("last_name")%>
    </p>
   <p><b>Residental_address:</b>
   <%= request.getParameter("address")%></p> 
    <p>
      <p><b>date of birth:</b>
         <%= request.getParameter("dateofbirth")%></p> 
          <p>
         
      <tr>
         <td><b>Gender</b></td>
         <td><%=request.getParameter("gender")%></td>
     </tr>
     <br>
     <td><b>Nationality</b></td>
         <td><%=request.getParameter("country")%></td>
     </tr>
     <br>
      <%

      String select[] = request.getParameterValues("languages"); 
      if (select != null && select.length != 0) {
      out.println("<b>Languages known  :</b> ");
      for (int i = 0; i < select.length; i++) {
      out.println(select[i]); 
     }
      }
      %>
      <br>
      <tr>
        <jsp:useBean id='clock' scope='page' class='rag.date' type="rag.date" />
        <p>
             Date:   <jsp:getProperty name="clock" property="date"/>
             
          
          </p>
        </tr>
   


    </p>
 </ul>


</body>
</html>
