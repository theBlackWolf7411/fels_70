<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>Welcome to our system</h1>
<s:if test="#session.logined == 'true'">
<a href="<s:url value="/user/"/><s:property value="user.userId"/>">User 's page</a>
</s:if>
<s:else>
<a href="<s:url value="/login"/>">Login</a>
</s:else>