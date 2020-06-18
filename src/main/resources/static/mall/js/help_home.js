function doSome() {
    id=$("#fenlei option:selected").val();
    window.location.href   =   "/mall/help_home/select?id=" + id;
}

function GetQueryString(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}

$(document).ready(function(){
    id = GetQueryString("id")
    if(id=="5"){
        $('#o5').attr("selected","true")
    }
    if(id=="4"){
        $('#o4').attr("selected","true")
    }
    if(id=="3"){
        $('#o3').attr("selected","true")
    }
    if(id=="2"){
        $('#o2').attr("selected","true")
    }
    if(id=="1"){
        $('#o1').attr("selected","true")
    }
});
