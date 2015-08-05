<%@ taglib prefix="s" uri="/struts-tags"%>
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