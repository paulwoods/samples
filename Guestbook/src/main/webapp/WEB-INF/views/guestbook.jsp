<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<html>
<head>
	<title>Guestbook</title>
</head>
<body>
<h1>
	Sign my guestbook!
</h1>

<sf:form modelAttribute="guest">
	<sf:label path="name">Name:</sf:label><sf:input path="name"/><br/>
	<sf:label path="email">E-mail:</sf:label><sf:input path="email"/> (not displayed)<br/>
	<input type="submit" />
</sf:form>

<h3>Guests</h3>
<c:forEach items="${guests}" var="guest">
  <li><c:out value="${guest.name}"/> - <fmt:formatDate value="${guest.dateOfVisit}" pattern="yyyy-MM-dd HH:mm:ss"/></li>
</c:forEach>

</body>
</html>
