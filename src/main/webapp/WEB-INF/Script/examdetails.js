/**
 * 
 */
function timeCheck() {
	let startTime = document.getElementById("startTime").value;
	let endTime = document.getElementById("endTime").value;
	if (startTime >= endTime) {
		if (alert("Not valid time")) {
			document.form.endTime.focus();
		}
		else
			document.activeElement.blur();
	}
	else {
		return false;
	}
}
function checkExamDate() {
	let date = document.getElementById('examDate').value;
	let now = new Date();
	let dt1 = Date.parse(now),
		dt2 = Date.parse(date);
	if (dt2 >= dt1) {
		alert("Date must be in the past");
	}
}