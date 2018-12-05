<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="<%=path%>/js/bootstrap3/css/bootstrap.css" />
    <link rel="stylesheet" href="<%=path%>/js/bootstrap3/css/bootstrap-theme.css" />
    <link rel="stylesheet" href="<%=path%>/js/bootstrap-treeview/bootstrap-treeview.min.css"/>
    <link rel="stylesheet" href="<%=path%>/js/bootStrap-addTabs/bootstrap.addtabs.css"/>

    <script src="<%=path%>/js/jquery.min.js"></script>
    <script src="<%=path%>/js/bootstrap3/js/bootstrap.js"></script>
    <script src="<%=path%>/js/bootstrap-treeview/bootstrap-treeview.min.js"></script>
    <script src="<%=path%>/js/bootStrap-addTabs/bootstrap.addtabs.min.js"></script>
</head>
<body>
<!-- 导航头 -->
<nav class="navbar navbar-inverse navbar-static-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">
                金科教育
            </a>
        </div>
    </div>
</nav>
<!-- 布局中心 -->
<div class="container-fluid">
    <div class="row">
        <div class="col-md-3">
            <div id="myTree"></div>
        </div>
        <div class="col-md-9">
            <div class="myTabs">
                <!-- 新选项卡 -->
                <ul class="nav nav-tabs" id="tablist">
                    <li role = "presentation" class="active">
                        <a href="#home" role="tab" data-toggle="tab">欢迎</a>
                    </li>
                </ul>

                <!-- 选项卡下内容 -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="home">

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">

    $(function(){
        initTree();
    });

    function initTree(){
        $.ajax({
            type:"GET",
            url:"http://127.0.0.1:8093/user/user/getNavTree", //访问的链接
            dataType:"jsonp",  //数据格式设置为jsonp
            jsonp:"callback",  //Jquery生成验证参数的名称
            success:function(result){
                $('#myTree').treeview({
                    data:result,
                    onNodeSelected:function(e,node){
                        $.addtabs({iframeHeight:650});
                        $.addtabs.add({
                            id:node.id,
                            title:node.text,
                            url:node.href
                        });
                    }
                })
            }
        })
    }
</script>
</body>
</html>
