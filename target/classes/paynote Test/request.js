function findAllUser() {
    //创建XMLHttpRequest对象,用于与后台服务器应用交互
    var xmlhttp;
    
    //console.log(window.xmlHttpRequest);
    if (window.XMLHttpRequest) {
        //IE7+,chrome,firefox,Sifari 浏览器执行代码
        xmlhttp = new XMLHttpRequest;
    } else {
        //低版本IE执行代码
        xmlhttp = new ActiveXObject(Microsoft.XMLHTTP);
    }
    // new XMLHttpRequest;

    //向后台应用发送请求
    xmlhttp.open("POST","http://localhost:8080/user/findAllUser",true);
    xmlhttp.send();
    document.getElementById("data").innerHTML= xmlhttp.responseText;

}