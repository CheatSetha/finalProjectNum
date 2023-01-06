$(document).ready(function() {

	$(".btnnew").on('click', function(event) {
		$(".myFormCreate #createModal").modal();
	});
	$("#datepicker").on('click',function(){
		$("#datepicker").datepicker();
	});
	
});