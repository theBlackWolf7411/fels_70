<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>User</h1>
<a href="<s:url value="/admin/users/new"/>">Create a new account</a>
<table>
	<tr>
		<td>Id</td>
		<td>Name</td>
		<td>Email</td>
		<td>Avatar</td>
	</tr>
	<s:iterator value="users">
		<tr>
			<td><a
				href="<s:url value="/admin/users/"/><s:property value="userId"/>/show">
					<s:property value="userId" />
			</a></td>
			<td><a
				href="<s:url value="/admin/users/"/><s:property value="userId"/>/show">
					<s:property value="username" />
			</a></td>
			<td><a
				href="<s:url value="/admin/users/"/><s:property value="userId"/>/show">
					<s:property value="email" />
			</a></td>
			<td><a
				href="<s:url value="/admin/users/"/><s:property value="userId"/>/show">
					<s:property value="avatar" />
			</a></td>
			<td><a
				href="<s:url value="/admin/users/"/><s:property value="userId"/>/edit">
					Edit </a></td>
			<td><a
				href="<s:url value="/admin/users/"/><s:property value="userId"/>/destroy">
					Delete </a></td>
		</tr>
	</s:iterator>
</table>