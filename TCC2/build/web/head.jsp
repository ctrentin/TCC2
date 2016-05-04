<%-- 
    Document   : head
    Created on : 04/05/2016, 00:00:38
    Author     : trentin
--%>

<%@page import="br.com.session.Session"%>
<div class="head gradientdefault">
    <%
        Session sessao = (Session) session.getAttribute("controlSession");
        if (sessao != null) {
            %>
            <a  style="color: white" href="main.jsp" >Tasy Bot</a>
    <%
        } else {
    %>
    <label >Tasy Bot </label>
    <%
        }
    %>



    <a class="logout a" href="processaLogin.jsp?L=0" >Exit</a>

</div>