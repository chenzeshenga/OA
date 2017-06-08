/**
 * Created by Administrator on 2017/6/3.
 */
$(document).ready(function(){
    $("[name='panel']").slideUp();
    $("[name='flip']").eq(0).click(function () {
        $("[name='panel']").eq(0).slideToggle("slow");
    });
    $("[name='flip']").eq(1).click(function () {
        $("[name='panel']").eq(1).slideToggle("slow");
    });
    $("[name='flip']").eq(2).click(function () {
        $("[name='panel']").eq(2).slideToggle("slow");
    });
});
