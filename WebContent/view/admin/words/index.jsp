<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>Word</h1>
<a href="<s:url value="/admin/words/new"/>">Create a new word</a>



<s:form action="/admin/words/import" enctype="multipart/form-data">
   <s:file name="excelUploadedFile" label="Choose File" size="40" />
   <s:submit value="Upload" name="submit" />
</s:form>

<table>
	<tr>
		<td>Word</td>
		<td>Category</td>
		<td>Audio</td>
	</tr>
	<s:iterator value="words">
		<tr>
			<td><a
				href="<s:url value="/admin/words/"/><s:property value="wordId"/>/show">
					<s:property value="wordContent" />
			</a></td>
			<td><a
				href="<s:url value="/admin/categories/"/><s:property value="category.categoryId"/>/show">
					<s:property value="category.categoryId" />
			</a></td>
			<td><a
				href="<s:url value="/admin/words/"/><s:property value="wordId"/>/show">
					<s:property value="audio" />
			</a></td>
			<td><a
				href="<s:url value="/admin/words/"/><s:property value="wordId"/>/edit">
					Edit </a></td>
			<td><a
				href="<s:url value="/admin/words/"/><s:property value="wordId"/>/destroy">
					Delete </a></td>
		</tr>
	</s:iterator>
</table>
<a href="<s:url value="/admin/words/export"/>">Download words to excel file</a>