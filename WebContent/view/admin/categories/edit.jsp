<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/admin/categories/"/>">Back</a>
<h1>Category</h1>
<div>
	<div>
		<s:form action="/admin/categories/update">
			<s:hidden name="category.categoryId" />
			<s:textfield key="Name" name="category.categoryName" />
			<s:textfield key="Description" name="category.description" />
			<s:textfield key="Picture" name="category.picture" />
			<table>
				<tbody id="wordTable">
					<tr>
						<td>Words</td>
					</tr>
					<s:iterator value="category.words" status="word"
						var="category.words">
						<s:hidden name="category.words[%{#word.count-1}].wordId" />
						<tr>
							<td><s:textfield
									name="category.words[%{#word.count-1}].wordContent" key="Words" /></td>
							<td><s:textfield
									name="category.words[%{#word.count-1}].audio" key="Pronounce" /></td>
							<td><a
								href="<s:url value="/admin/words/"/><s:property value="wordId"/>/destroy">
									Delete </a></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<a href="javascript:void(0)" onclick="addMoreWords();">Add Words</a>
			<s:submit key="submit" />
		</s:form>
	</div>
</div>