/**
 * Bind embedded signing and sending to toggle the correct fields.
 */

function ShowHide() {
	//alert("test");
	//alert(document.getElementById("embeddedSigning").checked);
	if (document.getElementById("embeddedSigning").checked==true) {
		document.getElementById("embeddedSendingFieldSection").style.display="none";
	}
	if (document.getElementById("embeddedSigning").checked==false) {
		document.getElementById("embeddedSendingFieldSection").style.display="block";
	}
}

function ShowHide1() {
	//alert("test");
	//alert(document.getElementById("embeddedSigning").checked);
	if (document.getElementById("embeddedSending").checked==true) {
		document.getElementById("embeddedSigningFieldSection").style.display="none";
	}
	if (document.getElementById("embeddedSending").checked==false) {
		document.getElementById("embeddedSigningFieldSection").style.display="block";
	}
}

function togglePhoneNumberInput(){
	var el = document.forms[0].AuthenticationMethod;
	for (var i=0; i < el.length; i++)
	{
		if (el[i].checked)
		{
			var val = el[i].value;
		}
	}
	if (val=="Phone") {
		document.getElementById("authPhoneNumberContainer").style.display="block";
	} else {
		document.getElementById("authPhoneNumberContainer").style.display="none";
	}
}


/*$(document).ready(function() {
	$("#embeddedSigning").change(function() {
		alert("test");								  
		$('#embeddedSendingFieldSection').toggle();
		toggleFieldDisablement(document.getElementById('embeddedSending'));
	});

	$("#embeddedSending").change(function() {
		$('#embeddedSigningFieldSection').toggle();
		toggleFieldDisablement(document.getElementById('embeddedSigning'));
	});
});

function toggleFieldDisablement(field) {
    if($(field).attr('disabled') == true) {
        $(field).removeAttr('disabled');
    }
    else {
        $(field).attr('disabled', true);
    }
}*/