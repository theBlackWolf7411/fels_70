<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/admin/users/"/>">Back</a>
<h1>Create user</h1>
<div>
	<div>
		<s:form action="/admin/users/create" enctype="multipart/form-data">
			<s:textfield key="Name" name="user.username" />
			<s:textfield key="Email" name="user.email" />
			<s:file name="fileUpload" label="Avatar"/>
			<s:checkbox label="Admin User" name="user.isAdmin"
				value="user.isAdmin" />
			<s:password key="Password" name="user.password" />
			<s:submit key="submit" />
		</s:form>
	</div>
</div>