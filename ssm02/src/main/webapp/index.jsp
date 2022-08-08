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
                        success: function (result) {
                            console.log(result.message);
                            // let img = new Image(200, 200);
                            // console.log("upload/" + result.filename);
                            // img.src = "upload/" + result.filename;
                            // document.body.append(img)
                            $("#pic").attr("src", "upload/" + result.filename);
                        },
                        xhr: function () {
                            let xhr = new XMLHttpRequest();
                            xhr.upload.addEventListener("progress", function (e) {
                                let progressRate = (e.loaded / e.total) * 100 + "%";
                                $(".progress > div").css("width", progressRate);
                            })
                            return xhr;
                        },
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
        <img alt="图片未上传" style="width: 200px;height: 100px;" id="pic">
        <div class="progress"
             style="width: 200px;height: 20px;box-sizing: content-box;border: 2px solid red;position: relative;border-radius: 20px;overflow: hidden;">
            <div style="position: absolute;left: 0;top: 0;width: 0%;height: 100%;transition: width .3s ease;background-color:#0ff;"></div>
        </div>
        <p><input type="submit" value="注册"></p>
    </form>
</head>
<body>

</body>
</html>
