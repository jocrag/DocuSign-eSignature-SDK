/*
 *   <p>&copy; Copyright 2007 <a href="http://www.stickmanlabs.com"><small>stickmanlabs</small></a></p>
 *   <p>Accordion is freely distributable under the terms of an MIT-style license.</p>
 *
/*--------------------------------------------------------------------------*/


Accordian = Class.create();
Accordian.prototype = {
	initialize: function(elem, clickableEntity) {
		this.container = $(elem);
		var headers = $$('#' + elem + ' .section ' + clickableEntity);
		headers.each(function(header) {
			Event.observe(header,'click',this.sectionClicked.bindAsEventListener(this));
		}.bind(this));
	},
	sectionClicked: function(event) {
		this.openSection(Event.element(event).parentNode);
	},
	openSection: function(section) {
		var section = $(section);
		if(section.id != this.currentSection) {
			this.closeExistingSection();
			this.currentSection = section.id;
			var contents = document.getElementsByClassName('contents',section);
			contents[0].show();
		}
	},
	closeExistingSection: function() {
		if(this.currentSection) {
			var contents = document.getElementsByClassName('contents',this.currentSection);
			contents[0].hide();
		}
	}
}