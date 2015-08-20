<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/lessons/"/>">Back</a>
<h1>Create lesson</h1>
<div>
	<div>
		<s:form action="/lessons/create">
			<s:select label="Category" headerKey="-1"
				headerValue="Select Category" list="categories" listKey="categoryId"
				listValue="categoryName" name="lesson.category.categoryId" />
			<s:select label="User" headerKey="-1"
				headerValue="Select User" list="users" listKey="userId"
				listValue="username" name="lesson.user.userId" />
			<s:textfield key="Result" name="lesson.result" />
			<s:submit key="submit" />
		</s:form>
	</div>
</div>