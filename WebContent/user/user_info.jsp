<%@ taglib prefix="s" uri="/struts-tags"%>
<s:if test="#session.username != null">
<a>Welcome, <s:property value="#session.username"/>!</a>
</s:if>
<br/>
<s:property value="user.email"/>
___
<s:property value="user.username" />
