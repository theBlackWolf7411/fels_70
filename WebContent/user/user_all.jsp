<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach items="${users}" var="user">
	<tr>
		<td>${user.userId}</td>
		<td>${user.username}</td>
		<td>${user.email}</td>
		<td>${user.avatar}</td>
	</tr>
</c:forEach>