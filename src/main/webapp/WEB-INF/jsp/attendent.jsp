<%@page import="java.util.HashMap" %>
<%@page import="java.util.ArrayList" %>
<html>
<h1>This is the Attendent Page</h1>
<% 
ArrayList<HashMap<String ,Object>> list = (ArrayList<HashMap<String ,Object>>) request.getAttribute("list");
for(HashMap<String ,Object> attendent:list){
%>
Attendent Name:<br/><h2><%=attendent.get("name")%></h2><br/>
Speciality:<br/><h2><%=attendent.get("specility")%></h2>
<%
}
%>
</html>