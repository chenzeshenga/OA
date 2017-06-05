/**
 * Created by Administrator on 2017/6/3.
 */
$(document).ready(function(){
    $("#panel").slideUp();
    $("#flip").click(function(){
        $("#panel").slideToggle("slow");
    });
});
