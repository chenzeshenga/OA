<%--
  Created by IntelliJ IDEA.
  User: Someday
  Date: 2017/6/7
  Time: 下午 2:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>D_edit</title>

    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="vendor/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <link rel="stylesheet" href="css/bootstrap-datetimepicker.css">

</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading text-center">
        <h4>报销申请</h4>
    </div>
    <!-- /.panel-heading -->
    <div class="panel-body">
        <div class="row">
            <div class="">
                <form role="form" action="/doEdit" method="post">
                    <div class="form-group col-lg-6 col-lg-offset-3">
                        <div class="form-group">
                            <label>报销类型</label>
                            <select class="form-control" name="type">
                                <option value="电话费">电话费</option>
                                <option value="办公费">办公费</option>
                                <option value="培训费">培训费</option>
                                <option value="差旅费">差旅费</option>
                                <option value="燃料费">燃料费</option>
                                <option value="招待费">招待费</option>
                                <option value="补贴">补贴</option>
                                <option value="其他">其他</option>
                            </select>
                        </div>
                    </div>
                    <input type="hidden" name="id" value="${user.id}" />
                    <div class="form-group col-lg-6 col-lg-offset-3">
                        <label>报销金额</label>
                        <input name="reason" class="form-control" ></input>
                    </div>
                    <div class="col-lg-6 col-lg-offset-5">
                        <button type="submit" class="btn btn-default">提交</button>
                        <button type="reset" class="btn btn-default">重置</button>
                    </div>

                </form>
            </div>
            <!-- /.col-lg-6 (nested) -->
        </div>
    </div>
</div>


<script src="vendor/jquery/jquery.min.js"></script>

<script src="js/bootstrap-datetimepicker.js"></script>

<script src="js/bootstrap-datetimepicker.zh-CN.js"></script>

<script type="text/javascript">
    $('.form_datetime').datetimepicker({
        language:'zh-CN',
        weekStart: 1,
        todayBtn:  1,
        autoclose: 1,
        startDate: new Date(),
        todayHighlight: 1,
        startView: 2,
        forceParse: 0,
        showMeridian: 1,
        format:'yyyy-mm-dd hh:ii:00'
    });
</script>
</body>

</html>
