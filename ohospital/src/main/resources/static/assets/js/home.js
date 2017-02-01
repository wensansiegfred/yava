$(document).ready(function() {	
	$(".sidebar-menu li a").click(function(e) {
		e.preventDefault();
		e.stopPropagation();
		$(".sidebar-menu").find("li").removeClass("active");
		$(this).parent().addClass("active");
		var page_path = $(this).parent().attr("_page_path");		
		getPage(page_path, ".main-content", homeCallBackEvents);
	});
	
	
});

function homeCallBackEvents() {	
	$("button.manage_add_patient").click(function() {
		getPage("patient/addPatientForm", ".patient_management_sub_content", registerPatientEvents);
	});
}

function registerPatientEvents() {
	$("form#register_patient .save").click(function(e) {
		e.preventDefault();
		var patient = $(this).closest("form").serialize();
		postData("patient/add", patient, function(result) {
			if (result.status != 200) {
				notify(result.message, "error");
			} else {
				notify(result.message, "success");				
				$(".main-sidebar ul.sidebar-menu li.active a").trigger("click");
			}
		});
	});
	
	$(".back_to_patient_management").click(function() {
		$(".main-sidebar ul.sidebar-menu").find("li.active a").click();
	});
}