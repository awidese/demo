<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>欢迎</title>
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/css/bootstrap-combined.min.css">
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/css/layoutit.css">
    <script src="/static/bootstrap/js/jquery-3.4.1.js"></script>
    <script src="/static/bootstrap/js/bootstrap.js"></script>
    <script src="/static/js/loginAndSignin.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <h3>
                你好，欢迎光临.
            </h3>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span12">
            <div class="alert">
                <button class="close" type="button" data-dismiss="alert">×</button>
                <h4>
                    提示!
                </h4> <strong>注意!</strong> 没有账号请先注册.
            </div>
            <div class="tabbable" id="tabs-931724">
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a href="#panel-634677" data-toggle="tab">登录</a>
                    </li>
                    <li>
                        <a href="#panel-840949" data-toggle="tab">注册</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="panel-634677">
                        <div class="form-horizontal">
                            <div class="control-group">
                                <label class="control-label">用户名</label>
                                <div class="controls">
                                    <input id="username1" name="username1" value="douwenzhou" type="text" />
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">密码</label>
                                <div class="controls">
                                    <input id="password1" name="password1" value="123456789" type="password" />
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="controls">
                                    <label class="checkbox"><input type="checkbox" /> Remember me</label> <button class="btn" id="login">登陆</button>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="tab-pane" id="panel-840949">
                        <div class="form-horizontal">
                            <div class="control-group">
                                <label class="control-label" for="username2">用户名</label>
                                <div class="controls">
                                    <input id="username2" type="text" />
                                </div>
                                <p id="un"></p>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="nickname">昵称</label>
                                <div class="controls">
                                    <input id="nickname" type="text" />
                                </div>
                                <p id="nn"></p>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="password2">密码</label>
                                <div class="controls">
                                    <input id="password2" type="password" />
                                </div>
                                <p id="pwd1"></p>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="password3">确认密码</label>
                                <div class="controls">
                                    <input id="password3" type="password" />
                                </div>
                                <p id="pwd2"></p>
                            </div>
                            <div class="control-group">
                                <div class="controls">
                                    <button class="btn" id="signin" >注册</button>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>