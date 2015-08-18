<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/categories/"/>">Back</a>
<h1>
	Category
	<s:property value="category.categoryName" />
</h1>
<table>
	<tr>
		<td>Name:</td>
		<td><s:property value="category.categoryName" /></td>
	</tr>
	<tr>
		<td>Description:</td>
		<td><s:property value="category.description" /></td>
	</tr>
	<tr>
		<td>Picture:</td>
		<td><s:property value="category.picture" /></td>
	</tr>
</table>
<h1>Words</h1>
<table>
	<tr>
		<td>Word</td>
		<td>Audio</td>
	</tr>
	<s:iterator value="category.words">
		<tr>
			<td><s:property value="wordContent" /></td>
			<td><s:property value="audio" /></td>
		</tr>
	</s:iterator>
</table>