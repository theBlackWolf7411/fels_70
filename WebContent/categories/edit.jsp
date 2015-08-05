<%@ taglib prefix="s" uri="/struts-tags"%>
<h1>Category</h1>
<div>
	<div>
		<s:form action="/categories/update">
			<s:hidden name="category.categoryId"/>
			<s:textfield key="Name" name="category.categoryName" />
			<s:textfield key="Description" name="category.description" />
			<s:textfield key="Picture" name="category.picture" />
			<s:token />
			<s:submit key="submit" />
		</s:form>
	</div>
</div>