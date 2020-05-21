<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
<c:when test="${!empty langList}">
<ul>
<c:forEach var="lang" items="${langList}">
<li>${lang}</li>
</c:forEach>
</ul>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">Error</h1>
</c:otherwise>
</c:choose>
<br><br>
<a href="welcome.htm">Home</a>