<%--
  Created by IntelliJ IDEA.
  User: OY
  Date: 2020/4/26
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <%--http://localhost:8088/atcrowdfunding02adminwebui_war_exploded/test/ssm.html--%>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
    <script src="webjars/jquery/3.2.1/dist/jquery.min.js"></script>
    <script src="layer/layer.js"></script>
    <script>
        $(function () {
            $("#btn1").click(function () {
                $.ajax({
                    "url": "send/array/one.html",
                    "type": "post",
                    "data": {
                        "array": [5, 8, 12]
                    },
                    "dataType": "text",
                    "success": function (response) {
                        alert(response);
                    },
                    "error": function (response) {
                        alert(response);
                    }
                });
            });
            $("#btn2").click(function () {
                $.ajax({
                    "url": "send/array/two.html",
                    "type": "post",
                    "data": {
                        "array[0]": 8,
                        "array[1]": 5,
                        "array[2]": 13
                    },
                    "dataType": "text",
                    "success": function (response) {
                        alert(response);
                    },
                    "error": function (response) {
                        alert(response);
                    }
                });
            });
            $("#btn3").click(function () {
                //准备好要发送到服务器端的数组
                var array = [5, 8, 12];
                console.log(array.length);
                //将JSON数组转换为JSON字符串
                var requestBody = JSON.stringify(array);
                console.log(requestBody.length);
                $.ajax({
                    "url": "send/array/three.html",
                    "type": "post",
                    "contentType": 'application/json;charset=utf-8',//设置请求体的内容类型，告诉服务器端本次请求的请求体是JSON数据
                    "data": requestBody,
                    "dataType": "text",
                    "success": function (response) {
                        alert(response);
                    },
                    "error": function (response) {
                        alert(response);
                    }
                });
            });
            $("#btn4").click(function () {
                //准备好要发送到服务器端的数据
                var student = {
                    stuId: 5,
                    stuName: "tom",
                    address: {
                        province:"广东",
                        city:"深圳",
                        street:"后瑞"
                    },
                    subjects: [
                        {
                            subjectName: "JavaSE",
                            subjectScore: 100
                        }, {
                            subjectName: "SSM",
                            subjectScore: 99
                        }
                    ],
                    "map": {
                        k1: "v1",
                        k2: "v2"
                    }
                };
                //将JSON数组转换为JSON字符串
                var requestBody = JSON.stringify(student);
                $.ajax({
                    url: "send/compose/object.json",
                    type: "post",
                    contentType: "application/json;charset=utf-8",
                    dataType: "json",
                    data: requestBody,
                    success: function (response) {
                        console.log(response);
                        alert("成功");
                    },
                    error: function (response) {
                        console.log(response);
                        alert("失败");
                    }
                });
            });
            $("#btn5").click(function () {
               layer.msg("aaa");
            });
        });

    </script>
</head>
<body>
<a href="test/ssm.html">测试SSM整合环境</a>
<button id="btn1">Send [5,8,12] ONE</button>
<button id="btn2">Send [5,8,12] ONE</button>
<button id="btn3">Send [5,8,12] ONE</button>
<button id="btn4">Send Compose Object</button>
<button id="btn5">点我弹框</button>
</body>
</html>
