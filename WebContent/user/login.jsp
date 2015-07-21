<%@ taglib prefix="s" uri="/struts-tags"%>
<s:div>Login</s:div>
<s:form action="/login">
	<s:textfield key="Name" name="user.username" />
	<s:password key="Password" name="user.password" />
	<s:token />
	<s:submit key="submit" />
</s:form>
<s:if test="#session.logined == 'false'">
<a>Invalid user name or password</a>
</s:if>