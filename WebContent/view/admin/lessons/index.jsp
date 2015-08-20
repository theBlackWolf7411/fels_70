<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>Lesson</h1>
<a href="<s:url value="/admin/lessons/new"/>">Create a new lesson</a>
<table>
	<tr>
		<td>Name</td>
		<td>Category</td>
		<td>User</td>
		<td>Result</td>
	</tr>
	<s:iterator value="lessons">
		<tr>
			<td><a
				href="<s:url value="/admin/lessons/"/><s:property value="lessonId"/>/show">
					<s:property value="lessonId" />
			</a></td>
			<td><a
				href="<s:url value="/admin/lessons/"/><s:property value="lessonId"/>/show">
					<s:property value="category.categoryName" />
			</a></td>
			<td><a
				href="<s:url value="/admin/lessons/"/><s:property value="lessonId"/>/show">
					<s:property value="user.userName" />
			</a></td>
			<td><a
				href="<s:url value="/admin/lessons/"/><s:property value="lessonId"/>/show">
					<s:property value="result" />
			</a></td>
			<td><a
				href="<s:url value="/admin/lessons/"/><s:property value="lessonId"/>/edit">
					Edit </a></td>
			<td><a
				href="<s:url value="/admin/lessons/"/><s:property value="lessonId"/>/destroy">
					Delete </a></td>
		</tr>
	</s:iterator>
</table>