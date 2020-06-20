// 当页面加载完毕
$(function(){
    $.post({
        url:'/user/getAll',
        success: function(data){

            for(var i = 0; i < data.length; i++){
                var text = "<tr>\n" +
                    "                    <td>"+data[i].username+"</td>\n" +
                    "                    <td>"+data[i].password+"</td>\n" +
                    "                    <td>\n" +
                    "                        <a href=\"/user/delById?id="+data[i].id+"\" class=\"btn btn-danger\">删除</a>\n" +
                    "                        <a href=\"#\" class=\"btn btn-success\">修改</a>\n" +
                    "                    </td>\n" +
                    "                </tr>"

                var obj = $(".pool");
                obj.append(text);
            }
        }
    });
});