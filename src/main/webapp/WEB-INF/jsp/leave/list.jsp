<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/7
  Time: 上午 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="vendor/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>
<body>
        <div class="panel panel-default">
            <div class="panel-heading text-center">
                <h4>请假列表</h4>
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                        <tr>
                            <th>#</th>
                            <th>请假理由</th>
                            <th>请假时间</th>
                            <th>结束时间</th>
                            <th>申请人</th>
                            <th>处理结果</th>
                            <shiro:hasRole name="leader">
                                <th>处理</th>
                            </shiro:hasRole>
                        </tr>
                        </thead>
                        <tbody>
                            <shiro:hasRole name="teacher">
                                <c:forEach items="${list}" var="item" varStatus="status">
                                    <td>${item.id}</td>
                                    <td>${item.reason}</td>
                                    <td>${item.starttime}</td>
                                    <td>${item.endtime}</td>
                                    <td>${item.applicantid}</td>
                                    <td>${item.applicationstatus}</td>
                                </c:forEach>
                            </shiro:hasRole>
                            <shiro:hasRole name="leader">
                                <c:forEach items="${list}" var="item" varStatus="status">
                                    <td>${item.id}</td>
                                    <td>${item.reason}</td>
                                    <td>${item.starttime}</td>
                                    <td>${item.endtime}</td>
                                    <td>${item.applicantid}</td>
                                    <td>${item.applicationstatus}</td>
                                    <td><a href="#"
                                           onclick="window.location.href='/edit?oid=${item.id}&status=1'">批准</a>
                                        <a href="#"
                                           onclick="window.location.href='/edit?oid=${item.id}&status=0'">不批准</a>
                                    </td>
                                </c:forEach>
                            </shiro:hasRole>
                        </tbody>
                    </table>
                </div>
                <!-- /.table-responsive -->
            </div>
            <!-- /.panel-body -->
        </div>


    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="vendor/metisMenu/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="vendor/datatables-responsive/dataTables.responsive.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
        $(document).ready(function() {
            $('#dataTables-example').DataTable({
                responsive: true
            });
        });
    </script>
</body>
</html>
