<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>User</h1>
<table>
	<tr>
		<td>Id</td>
		<td>Name</td>
		<td>Email</td>
		<td>Avatar</td>
	</tr>
	<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.userId}</td>
			<td>${user.username}</td>
			<td>${user.email}</td>
			<td>${user.avatar}</td>
		</tr>
	</c:forEach>
</table>