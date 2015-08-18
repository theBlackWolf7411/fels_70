<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url value="/admin/words/"/>">Back</a>
<h1>
	Word
	<s:property value="word.wordContent" />
</h1>
<a
	href="<s:url value="/admin/words/"/><s:property value="word.wordId"/>/edit">
	Edit </a>
<table>
	<tr>
		<td>Category:</td>
		<td><s:property value="word.category.categoryId" /></td>
	</tr>
	<tr>
		<td>Audio:</td>
		<td><s:property value="word.audio" /></td>
	</tr>
</table>
<s:label value="Answers:" />
<table>
	<s:iterator value="word.answers" status="answer" var="word.answers">
		<tr>
			<td><s:property value="answerContent" /></td>
			<td><s:checkbox label="Correct Answer" name="isCorrect"
					value="isCorrect" /></td>
		</tr>
	</s:iterator>
</table>