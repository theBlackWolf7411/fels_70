<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/users/"/>">Back</a>
<s:if test="#session.username != null">
	<a>Welcome, <s:property value="#session.username" />!
	</a>
</s:if>
<h1>
	User
	<s:property value="user.username" />
</h1>
<table>
	<tr>
		<td>Name:</td>
		<td><s:property value="user.username" /></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><s:property value="user.email" /></td>
	</tr>
	<tr>
		<td>Avatar:</td>
		<td><s:property value="user.avatar" /></td>
	</tr>
	<tr>
		<td>isAdmin:</td>
		<td><s:property value="user.isAdmin" /></td>
	</tr>
</table>
<s:label>Activity</s:label>
<table>
	<s:iterator value="user.activities">
		<tr>
			<td><s:property value="type" /> <s:property value="targetId" /></td>
		</tr>
	</s:iterator>
</table>

<s:label>Following</s:label>
<table>
	<s:iterator value="user.followingUsers">
		<tr>
			<td><s:property value="followedUser.username" /></td>
		</tr>
	</s:iterator>
</table>
<s:label>Followed</s:label>
<table>
	<s:iterator value="user.followedUsers">
		<tr>
			<td><s:property value="followingUser.username" /></td>
		</tr>
	</s:iterator>
</table>

<s:label>Follow Activity</s:label>
<table>
	<s:iterator value="user.followingUsers">
		<s:iterator value="followedUser.activities">
			<tr>
				<td><s:property value="type" /> <s:property value="targetId" /></td>
			</tr>
		</s:iterator>
	</s:iterator>
</table>