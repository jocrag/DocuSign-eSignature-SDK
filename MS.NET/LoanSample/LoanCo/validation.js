// modified
// originally taken from Apple.com web development reference
//

function checkEmail (strng) {
var error="";
if (strng == "") {
   error = "You didn't enter an email address.<br>";
}

    var emailFilter=/^.+@.+\..+$/;
    if (!(emailFilter.test(strng))) { 
       error = "Please enter a valid email address.<br>";
    }
    else {
//test email for illegal characters
       var illegalChars= /[\(\)\<\>\,\;\:\\\"\[\]]/
         if (strng.match(illegalChars)) {
          error = "The email address contains illegal characters.<br>";
       }
    }
return error;    
}


// phone number - strip out delimiters and check for 10 digits

function checkPhone (strng) {
var error = "";
if (strng == "") {
   error = "You didn't enter a phone number.<br>";
}

var stripped = strng.replace(/[\(\)\.\-\ ]/g, ''); //strip out acceptable non-numeric characters
    if (isNaN(parseInt(stripped))) {
       error = "The phone number contains illegal characters.";
  
    }
    if (!(stripped.length == 10)) {
	error = "The phone number is the wrong length. Make sure you included an area code.<br>";
    } 
return error;
}

// float parsing
function checkFloat(val, name) {

var error = "";
if (val == "") {
   error = name + " is required <br>";
}

    var regExp = /(^-?\d\d*\.\d*$)|(^-?\d\d*$)|(^-?\.\d\d*$)/;
    if (regExp.test(val) == false ) {
           error = name + " is not in the right format.";
    }

return error;

}


// password - between 6-8 chars, uppercase, lowercase, and numeral

function checkPassword (strng) {
var error = "";
if (strng == "") {
   error = "You didn't enter a password.<br>";
}

    var illegalChars = /[\W_]/; // allow only letters and numbers
    
    if ((strng.length < 6) || (strng.length > 8)) {
       error = "The password is the wrong length.<br>";
    }
    else if (illegalChars.test(strng)) {
      error = "The password contains illegal characters.<br>";
    } 
    else if (!((strng.search(/(a-z)+/)) && (strng.search(/(A-Z)+/)) && (strng.search(/(0-9)+/)))) {
       error = "The password must contain at least one uppercase letter, one lowercase letter, and one numeral.<br>";
    }  
return error;    
}    


// username - 4-10 chars, uc, lc, and underscore only.

function checkUsername (strng) {
var error = "";
if (strng == "") {
   error = "You didn't enter a username.<br>";
}


    var illegalChars = /\W/; // allow letters, numbers, and underscores
    if ((strng.length < 4) || (strng.length > 10)) {
       error = "The username is the wrong length.<br>";
    }
    else if (illegalChars.test(strng)) {
    error = "The username contains illegal characters.<br>";
    } 
return error;
}       


// non-empty textbox

function isEmpty(strng, elementName) {
var error = "";
  if (strng.length == 0) {
     error = elementName + " is required.<br>";
  }
return error;	  
}

// was textbox altered

function isDifferent(strng) {
var error = ""; 
  if (strng != "Can\'t touch this!") {
     error = "You altered the inviolate text area.<br>";
  }
return error;
}

// exactly one radio button is chosen

function checkRadio(checkvalue) {
var error = "";
   if (!(checkvalue)) {
       error = "Please check a radio button.<br>";
    }
return error;
}

// valid selector from dropdown list

function checkDropdown(choice) {
var error = "";
    if (choice == 0) {
    error = "You didn't choose an option from the drop-down list.<br>";
    }    
return error;
}    