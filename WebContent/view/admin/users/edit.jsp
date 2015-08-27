<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/admin/users/"/>">Back</a>
<img
	src="<s:url value="http://localhost:8080/fels_70-images/images/User"/><s:property value="user.userId" />.jpg"
	border="0" height="120" width="150">
<h1>
	User
	<s:property value="user.username" />
</h1>
<div>
	<div>
		<s:form action="/admin/users/update" enctype="multipart/form-data">
			<s:hidden name="user.userId" />
			<s:textfield key="Name" name="user.username" />
			<s:textfield key="Email" name="user.email" />
			<s:file name="fileUpload" label="Avatar" />
			<s:checkbox label="Admin User" name="user.isAdmin"
				value="user.isAdmin" />
			<s:password key="Password" name="user.password" />
			<s:submit key="submit" />
		</s:form>
	</div>
</div>