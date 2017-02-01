function getPage(path, locator, callback) {
	$.get(path, function(page) {		
		$(locator).html(page);		
		if (typeof callback == "function")
			callback();
	});
}

function postData(path, data, callback) {
	$.post(path, data, function(r) {
		if (typeof callback == "function")
			callback(r);
	});
}

function notify(message, type, delay) {
	$.notify(message,{		
		className: type,
		autoHideDelay: delay || 5000
	});
}