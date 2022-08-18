/**
 * 
 */
function firstCheck() {
	let nameRegex = /^[a-z A-Z]+$/;
	if (!document.form.firstName.value.match(nameRegex)) {
		if (alert("Name can't be empty or must contain only alphabets")) {
			document.form.firstName.focus();
		}
		else
			document.activeElement.blur();
	}
	else {
		return false;
	}

}
function lastCheck() {
	let nameRegex = /^[a-z A-Z]+$/;
	if (!document.form.lastName.value.match(nameRegex)) {
		if (alert("Name can't be empty or must contain only alphabets")) {
			document.form.lastName.focus();
		}
		else
			document.activeElement.blur();
	}
	else {
		return false;
	}

}
function emailCheck() {
	let nameRegex = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/;
	if (!document.form.email.value.match(nameRegex)) {
		if (alert("Email not in the correct format")) {
			document.form.email.focus();
		}
		else
			document.activeElement.blur();
	}
	else {
		return false;
	}
}
function phoneNoCheck() {
	let nameRegex = /\d{10}/;
	if (!document.form.phoneNo.value.match(nameRegex)) {
		if (alert("Phone number must have 10 digits")) {
			document.form.phoneNo.focus();
		}
		else
			document.activeElement.blur();
	}
	else {
		return false;
	}
}
function passwordCheck() {
	let nameRegex = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/;
	if (!document.form.password.value.match(nameRegex)) {
		if (alert("Password must begin with letter and contain atleast one number and must have atleast 8 characters")) {
			document.form.password.focus();
		}
		else
			document.activeElement.blur();
	}
	else {
		return false;
	}

}
function addressCheck() {
	if (document.form.address.value == "") {
		if (alert("Address cannot be blank")) {
			document.form.address.focus();
		}
		else
			document.activeElement.blur();
	}
	else {
		return false;
	}
}

function checkDateOfBirth() {
	let date = document.getElementById('dob').value;
	let now = new Date();
	let dt1 = Date.parse(now),
		dt2 = Date.parse(date);
	if (dt2 >= dt1) {
		alert("Date must be in the past");
	}
}