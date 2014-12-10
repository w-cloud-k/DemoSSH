$("document").ready(function(){
	var fm = $("form:eq(0)");
	var path = $("base").attr("href");
	
	$("#btn-sub").click(function(){
		var data = fm.serialize();
		console.log(data);
		
		//forbiden form submit
		fm.submit(function(){
			return false;
		});
		//show error info

		var ajaxObj = {
				url:path+"/umg/login",
				type:"post",
				dataType:"json",
				data:data,
				success:function(str){
					console.log(str);
					console.log(str.result);
					if(str.result){
						//success
						window.location.href = path+"/umg/list";
						
					}else{
						$("input[name='username']").attr("title","用户名或密码错误！");
						$("input[name='username']").attr("data-original-title","用户名或密码错误");
						$("input[name='username']").tooltip("toggle");
						
						setTimeout(function(){
							$("input[name='username']").tooltip("toggle");
							$("input[name='username']").removeAttr("data-original-title");
							$("input[name='username']").removeAttr("title");
						},1000);
					}
				}
		};
		$.ajax(ajaxObj);
	});
	
	
});
