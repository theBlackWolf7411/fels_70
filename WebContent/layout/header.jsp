<%@ page import="com.opensymphony.xwork2.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="authz"
	uri="http://www.springframework.org/security/tags"%>
<div id="top-header"></div>

<div id="bottom-header">
	<s:if test="#session.logined == 'true'">
		<a
			href="<s:url value="/users/"/>
		<s:property value="user.userId"/>">
			<s:property value="user.username" />
		</a>
		<a href="<s:url value="/logout"/>">Log out</a>
	</s:if>
	<s:else>
		<a href="<s:url value="/login"/>">Login</a>
	</s:else>
</div>