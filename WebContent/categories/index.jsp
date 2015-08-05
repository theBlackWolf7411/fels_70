<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>Category</h1>
<a href="<s:url value="/categories/new"/>">Create a new category</a>
<table>
	<tr>
		<td>Name</td>
		<td>Describe</td>
		<td>Picture</td>
	</tr>
	<s:iterator value="categories">
		<tr>
			<td><a
				href="<s:url value="/categories/"/><s:property value="categoryId"/>/show">
					<s:property value="categoryName" />
			</a></td>
			<td><a
				href="<s:url value="/categories/"/><s:property value="categoryId"/>/show">
					<s:property value="description" />
			</a></td>
			<td><a
				href="<s:url value="/categories/"/><s:property value="categoryId"/>/show">
					<s:property value="picture" />
			</a></td>
			<td><a
				href="<s:url value="/categories/"/><s:property value="categoryId"/>/edit">
					Edit </a></td>
			<td><a
				href="<s:url value="/categories/"/><s:property value="categoryId"/>/destroy">
					Delete </a></td>
		</tr>
	</s:iterator>
</table>