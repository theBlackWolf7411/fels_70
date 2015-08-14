function addMoreWords() {
	var table = $('#wordTable');
	var rowCount = table.children().length;
	var row = $("<tr>");

	var cell1 = $("<td>");
	var contentCol = $('<input type="text" name="category.words['
			+ (rowCount - 1) + '].wordContent"/>');
	cell1.append(contentCol);
	row.append(cell1);

	var cell2 = $("<td>");
	var audioCol = $('<input type="text" name="category.words['
			+ (rowCount - 1) + '].audio"/>');
	cell2.append(audioCol);
	row.append(cell2);

	table.append(row);
	return false;
}

$(document).ready(function() {
	$("[type=checkbox]").click(function() {
		// alert("Boom");
		var $box = $(this);
		if ($box.is(":checked")) {
			var group = "input:checkbox[class='" + $box.attr("class") + "']";
			$(group).prop("checked", false);
			$box.prop("checked", true);
		} else {
			$box.prop("checked", false);
		}
	});
});
