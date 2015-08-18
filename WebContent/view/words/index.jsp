<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>Word</h1>
<table>
	<tr>
		<td>Category</td>
		<td>Content</td>
		<td>Audio</td>
	</tr>
	<s:iterator value="words">
		<tr>
			<td><a
				href="<s:url value="/categories/"/><s:property value="category.categoryId"/>/show">
					<s:property value="category.categoryId" />
			</a></td>
			<td><a
				href="<s:url value="/words/"/><s:property value="wordId"/>/show">
					<s:property value="wordContent" />
			</a></td>
			<td><a
				href="<s:url value="/words/"/><s:property value="wordId"/>/show">
					<s:property value="audio" />
			</a></td>
		</tr>
	</s:iterator>
</table>