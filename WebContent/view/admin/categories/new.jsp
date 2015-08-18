<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/admin/categories/"/>">Back</a>
<h1>Create category</h1>
<div>
	<div>
		<s:form action="/admin/categories/create">
			<s:textfield key="Name" name="category.categoryName" />
			<s:textfield key="Description" name="category.description" />
			<s:textfield key="Picture" name="category.picture" />


			<table>
				<tbody id="wordTable">
					<tr>
						<td>Word</td>
						<td>Audio</td>
					</tr>
					<s:iterator value="category.words" status="word"
						var="category.words">
						<tr>
							<td><s:textfield
									name="category.words[%{#word.count-1}].wordContent" /></td>
							<td><s:textfield
									name="category.words[%{#word.count-1}].audio" /></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<table>
				<tr>
					<td><a href="javascript:void(0)" onclick="addMoreWords();">Add
							Words</a></td>
				</tr>
				<tr>
					<td><s:submit key="submit" /></td>
				</tr>
			</table>
		</s:form>
	</div>
</div>