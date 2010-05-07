/**
 * Bind embedded signing and sending to toggle the correct fields.
 */

$(document).ready(function() {
	$("#embeddedSigning").change(function() {
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
}