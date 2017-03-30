<%--
  Created by IntelliJ IDEA.
  User: chenyuming
  Date: 2017/3/30
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() +
            ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>客户信息列表</title>
    <!-- Bootstrap Core CSS -->
    <link href="<%=basePath%>common/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<%=basePath%>common/css/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="<%=basePath%>common/css/dataTables.bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=basePath%>common/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=basePath%>common/css/font-awesome.min.css" rel="stylesheet"
          type="text/css">
    <link href="<%=basePath%>common/css/boot-crm.css" rel="stylesheet"
          type="text/css">
</head>
<body>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">客户管理</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="panel panel-default" style="font-size:18px;font-family: 'Calibri Light';font-style: normal">
        <div class="panel-body">
            <form class="form-inline" action="${pageContext.request.contextPath }/client/toClientList.action"
                  method="get">
                <div class="form-group">
                    <label for="customerName">客户名称</label>
                    <input type="text" class="form-control" id="customerName"
                           value="${clientQueryVo.clientCustom.clientName}" name="clientCustom.clientName">
                </div>
                <%--            <div class="form-group">
                                <label for="customerFrom">客户来源</label>
                                <select class="form-control" id="customerFrom" placeholder="客户来源" name="custSource">
                                    <option value="">--请选择--</option>
                                    <c:forEach items="${fromType}" var="item">
                                        <option value="${item.dict_id}"<c:if
                                                test="${item.dict_id == custSource}"> selected</c:if>>${item.dict_item_name }</option>
                                    </c:forEach>
                                </select>
                            </div>--%>
                <div class="form-group">
                    <label for="custIndustry">所属行业</label>
                    <select class="form-control" id="custIndustry" name="clientCustom.clientBusiness">
                        <option value="" style="font-size: 17px">--请选择--</option>
                        <c:forEach items="${BusinessList}" var="item">
                            <option value="${item}"<c:if
                                    test="${item eq clientQueryVo.clientCustom.clientBusiness}"> selected</c:if>>${item}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label for="custLevel">客户级别</label>
                    <select class="form-control" id="custLevel" name="clientCustom.clientType">
                        <option value="" tyle="font-size: 17px">--请选择--</option>
                        <c:forEach items="${TypeList}" var="item">
                            <option value="${item}"<c:if
                                    test="${item eq clientQueryVo.clientCustom.clientType }"> selected</c:if>>${item}</option>
                        </c:forEach>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">查询</button>
            </form>
        </div>
    </div>


    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">客户信息列表</div>
                <!-- /.panel-heading -->
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                    <tr style="font-size: 17px">
                        <th>ID</th>
                        <th>客户名称</th>
                        <th>客户所属行业</th>
                        <th>客户级别</th>
                        <th>固定电话</th>
                        <th>移动电话</th>
                        <th>邮箱</th>
                        <th>性别</th>
                        <th>地址</th>
                        <th>添加时间</th>
                        <th>操作</th>
                    </tr>

                    </thead>
                    <tbody style="font-size: 17px; text-align: center">
                    <c:forEach items="${clientList}" var="row">
                        <tr>
                            <td>${row.id}</td>
                            <td>${row.clientName}</td>
                            <td>${row.clientBusiness}</td>
                            <td>${row.clientType}</td>
                            <td>${row.clientTel}</td>
                            <td>${row.clientMobile}</td>
                            <td>${row.clientEmail}</td>
                            <td>${row.clientSex}</td>
                            <td>${row.clientAddress}</td>
                            <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss"
                                                value="${row.clientAddtime}"></fmt:formatDate></td>
                            <td>
                                <a href="#" class="btn btn-primary btn-xs" data-toggle="modal"
                                   data-target="#customerEditDialog" onclick="editCustomer(${row.id})">修改</a>
                                <a href="#" class="btn btn-danger btn-xs"
                                   onclick="deleteCustomer(${row.id})">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>


                <div class="col-md-12 text-right">
                    <itcast:page url="${pageContext.request.contextPath }/customer/list.action"/>
                </div>
                <!-- /.panel-body -->
            </div>
            <%--如果没找到内容，智能提示--%>
            <c:if test="${clientList.size()<1}">
                <div class="alert alert-block">
                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                    <h4>SORRY!</h4>
                    <h3>没有找到与之相符合的内容。。。。。。</h3>
                </div>
            </c:if>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->
    </div>
</div>
<%--END OF CLIENT LIST--%>
<!-- 客户编辑对话框 -->
<div class="modal fade" id="customerEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改客户信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_customer_form">
                    <input type="hidden" id="edit_clientId" name="id"/>
                    <div class="form-group">
                        <label for="edit_clientName" class="col-sm-2 control-label">客户名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_clientName" placeholder="客户名称"
                                   name="clientName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_clientBusiness" style="float:left;padding:7px 15px 0 27px;">所属行业</label>
                        <div class="col-sm-10">
                            <select class="form-control" id="edit_clientBusiness" placeholder="客户来源"
                                    name="clientBusiness">
                                <option value="">--请选择--</option>
                                <c:forEach items="${BusinessList}" var="item">
                                    <option value="${item}"<c:if
                                            test="${item == clientBusiness}"> selected</c:if>>${item}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_clientType" style="float:left;padding:7px 15px 0 27px;">客户级别</label>
                        <div class="col-sm-10">
                            <select class="form-control" id="edit_clientType" name="clientType">
                                <option value="">--请选择--</option>
                                <c:forEach items="${TypeList}" var="item">
                                    <option value="${item}"<c:if
                                            test="${item == clientType}"> selected</c:if>>${item}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_clientMobile" class="col-sm-2 control-label">移动电话</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_clientMobile" placeholder="移动电话"
                                   name="clientMobile">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_clientTel" class="col-sm-2 control-label">固定电话</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_clientTel" placeholder="固定电话"
                                   name="clientTel">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_clientEmail" class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_clientEmail" placeholder="邮箱"
                                   name="clientEmail">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_clientSex" class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_clientSex" placeholder="性别"
                                   name="clientSex">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit_clientAddress" class="col-sm-2 control-label">联系地址</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="edit_clientAddress" placeholder="联系地址"
                                   name="clientAddress">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updateCustomer()">保存修改</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="<%=basePath%>common/js/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="<%=basePath%>common/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="<%=basePath%>common/js/metisMenu.min.js"></script>

<!-- DataTables JavaScript -->
<script src="<%=basePath%>common/js/jquery.dataTables.min.js"></script>
<script src="<%=basePath%>common/js/dataTables.bootstrap.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="<%=basePath%>common/js/sb-admin-2.js"></script>

<script type="text/javascript">
    function editCustomer(id) {
        $.ajax({
            type: "get",
            url: "<%=basePath%>client/detail.action",
            data: {"id": id},
            success: function (data) {
                $("#edit_clientId").val(data.id);
                $("#edit_clientName").val(data.clientName);
                $("#edit_clientBusiness").val(data.clientBusiness);
                $("#edit_clientType").val(data.clientType);
                $("#edit_clientMobile").val(data.clientMobile);
                $("#edit_clientTel").val(data.clientTel);
                $("#edit_clientEmail").val(data.clientEmail);
                $("#edit_clientSex").val(data.clientSex);
                $("#edit_clientAddress").val(data.clientAddress);
            }
        });
    }
    function updateCustomer() {
        $.post("<%=basePath%>client/update.action", $("#edit_customer_form").serialize(), function (data) {
            alert("客户信息更新成功！");
            window.location.reload();
        });
    }

    function deleteCustomer(id) {
        if (confirm('确实要删除该客户吗?')) {
            $.post("<%=basePath%>customer/delete.action", {"id": id}, function (data) {
                alert("客户删除更新成功！");
                window.location.reload();
            });
        }
    }
</script>
</body>
</html>
