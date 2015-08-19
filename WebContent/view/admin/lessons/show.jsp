<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/admin/categories/"/>">Back</a>
<h1>
	Lesson
	<s:property value="lesson.lessonId" />
</h1>
<table>
	<tr>
		<td>Name:</td>
		<td><s:property value="lesson.lessonId" /></td>
	</tr>
	<tr>
		<td>Category:</td>
		<td><s:property value="lesson.category.categoryName" /></td>
	</tr>
	<tr>
		<td>User:</td>
		<td><s:property value="lesson.user.username" /></td>
	</tr>
	<tr>
		<td>Result:</td>
		<td><s:property value="lesson.result" /></td>
	</tr>
</table>