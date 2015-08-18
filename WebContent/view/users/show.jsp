<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/users/"/>">Back</a>
<s:if test="#session.username != null">
<a>Welcome, <s:property value="#session.username"/>!</a>
</s:if>
<br/>
<s:property value="user.email"/>
___
<s:property value="user.username" />
___
<s:property value="user.isAdmin" />
