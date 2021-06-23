<%--
 Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
--%>
<html>

<%@ page session="false"%>

<body bgcolor="white">
<jsp:useBean id='clock' scope='page' class='dates.JspCalendar' type="dates.JspCalendar" />
<h1> SIMSON</h1>
<table border=1 bordercolor="red" bgcolor="yellow">
  <center>
<%
String s="NUMBERS";
out.print(s);
 
for(int i=0;i<10;i++)
{
  int j= i+1;
    out.print("<tr><td>" +j+ "</td></tr>");

}

int n=4;
if(n%2==0)
{
  out.print("The number "+n+" is even");
}
  else{
    out.print("the number "+n+" is odd");
  
}
out.print("<br/");
int a,b,c;
a=0;
b=1;
out.print(a+"<br/>"+b);
for(int k=1;k<=10;k++){
c=a+b;
out.println(c);
a=b;
        b=c;

     
        }

%>
</center>
</table>

</body>
</html>
