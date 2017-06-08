<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/7
  Time: 上午 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit</title>

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
        <h4>请假条</h4>
    </div>
    <!-- /.panel-heading -->
    <div class="panel-body">
        <div class="row">
            <div class="">
                <form role="form" action="/doEdit" method="post">

                    <div class="form-group col-lg-6 col-lg-offset-3">
                        <label>开始日期</label>
                        <div class="input-group date form_datetime col-md-12" date-date="" data-date-format="dd MM yyyy - HH:ii" data-link-field="dtp_input1">
                            <input name="ApplicantStartTime" class="form-control" size="16" type="text" value="" readonly>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                        </div>
                    </div>

                    <input type="hidden" name="id" value="${user.id}" />

                    <div class="form-group col-lg-6 col-lg-offset-3">
                        <label>结束日期</label>
                        <div class="input-group date form_datetime col-md-12" data-date-format="dd MM yyyy - HH:ii" data-link-field="dtp_input1">
                            <input name="ApplicantEndTime" class="form-control" size="16" type="text" value="" readonly>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                        </div>
                    </div>

                    <div class="form-group col-lg-6 col-lg-offset-3">
                        <label>申请请假理由</label>
                        <textarea name="reason" class="form-control" rows="3"></textarea>
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
