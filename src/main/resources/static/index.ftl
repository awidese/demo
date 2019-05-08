<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/css/bootstrap-combined.min.css">
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/css/layoutit.css">
    <script src="/static/bootstrap/js/jquery-3.4.1.js"></script>
    <script src="/static/bootstrap/js/bootstrap.js"></script>
    <script src="/static/js/index.js"></script>
    <title>首页</title>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span8">
            <h3>
                欢迎光临
            </h3>
        </div>
        <div class="span4">
            <div style="padding-right: 1px">
                <p id="now">你好，${user.nickname}</p>
                <p id="status"></p>
                <button class="btn" id="logout" type="button">登出</button>
                <button class="btn" id="connect" type="button">连接</button>
            </div>
        </div>
    </div>
    <div class="row-fluid" style="height: 500px">
        <div class="span2">
            <ul class="nav nav-list">
                <li class="active">
                    <a href="#">首页</a>
                </li>
                <li>
                    <a href="#">库</a>
                </li>
                <li>
                    <a href="#">应用</a>
                </li>
                <li>
                    <a href="#">资料</a>
                </li>
                <li>
                    <a href="#">设置</a>
                </li>
                <li class="divider">
                </li>
                <li>
                    <a href="#">帮助</a>
                </li>
            </ul>
        </div>
        <div class="span10" style="border-top:1px solid #000">
            <h3 id="talk">

            </h3>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span2">

        </div>
        <div  class="span10">
            <div  style="position: center" class="form-search">
                <input id="inputMessage" class="input-medium search-query" type="text" style="width: 400px"/> <button id="enter" class="btn">发送</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>