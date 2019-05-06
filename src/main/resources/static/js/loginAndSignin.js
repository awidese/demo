$(document).ready(function(){
    $("#login").click(function () {
        var username=$("#username1").val();
        var password=$("#password1").val();
        $.ajax({
            url:'/login',
            async:true,
            crossDomain:true,
            type:"POST",
            data:{
                inputUsername:username,
                inputPassword:password
            },
            dataType:"json",
            success:function (result) {
                alert(result);
            },
            error:function () {
                alert("连接服务器失败");
            }
        })
    })

    $("#signin").click(function () {
        var username=$("#username2").val();
        var password1=$("#password2").val();
        var nickname=$("#nickname").val();
        var password2=$("#password3").val();
        var pass=true;
        if (username.length>20||username.length<=5){
            $("#un").html("<font color='red'>用户名要在5到20个字符</font>");
            pass=false;
        }
        else {
            $("#un").html("<font color='green'>√</font>");
        }
        if (nickname.length>20||nickname.length<=5){
            $("#nn").html("<font color='red'>用户名要在5到20个字符</font>");
            pass=false;
        }
        else {
            $("#nn").html("<font color='green'>√</font>");
        }
        if (password1.length>20||password1.length<=5) {
            $("#pwd1").html("<font color='red'>密码要在5到20个字符</font>");
            pass=false;
        }
        else {
            $("#pwd1").html("<font color='green'>√</font>");
        }
        if (password1!=password2||password1==""){
            $("#pwd2").html("<font color='red'>两次密码不一致或密码为空</font>");
            pass=false;
        }
        else {
            $("#pwd2").html("<font color='green'>√</font>");
        }

        if (pass==true){
            $.ajax({
                url:'/signin',
                async:true,
                dataType:"json",
                type:"POST",
                contentType: "application/json",
                data:JSON.stringify({
                    username:username,
                    nickname:nickname,
                    password1:password1,
                    password2:password2
                }),
                success:function (result) {
                  alert(result);
                },
                error:function () {
                    alert("连接服务器失败");
                }
            })
        }
    })

});