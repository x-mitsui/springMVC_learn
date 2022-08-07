<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2022/8/5
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#uploadBtn").click(function () {
                console.log();
                let photoFile = $("#photo")[0].files[0];
                if (!photoFile) {
                    alert("请先选一个文件")
                    return
                } else {
                    let formData = new FormData();
                    formData.append("nameToUseByController", photoFile);

                    $.ajax({
                        type: "post",
                        data: formData,
                        url: "fileUpload.do",
                        processData: false,//向后台提交对象
                        contentType: false,//二进制类型
                        success:function (result){
                            console.log(result);
                        }
                    })
                }
            })
        })
    </script>
    <form action="addPlayer.do" method="post">
        <p>账号<input type="text"></p>
        <p>密码<input type="text"></p>
        <p>昵称<input type="text"></p>
        <p>头像
            <br/>
            <input type="file" id="photo">
            <a href="javascript:;" id="uploadBtn">立即上传</a>
        </p>
        <p><input type="submit" value="注册"></p>
    </form>
</head>
<body>

</body>
</html>
