<%-- 
    Document   : index
    Created on : Aug 18, 2022, 3:29:19 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- start page title -->

<div class="row">
    <div class="col-12">
        <div class="page-title-box">
            <h4 class="page-title">Danh sách nhóm chi tiêu của bạn</h4>
            <div class="page-title-right">
                <ol class="breadcrumb p-0 m-0">
                    <li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
                    <li class="breadcrumb-item"><a href="#">Thống kê</a></li>
                    <li class="breadcrumb-item active">Thống kê</li>
                </ol>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!-- end page title -->

<div class="row">
    <c:forEach items="${room}" var="t">
        <div class="col-xl-3 col-sm-6">
            <div class="card bg-pink">
                <div class="card-body widget-style-2">
                    <div class="text-white media">
                        <div class="media-body align-self-center">
                            <h2 class="my-0 text-white"><span data-plugin="counterup">${t[2]+1}</span></h2>
                            <p class="mb-0">${t[1]}</p>
                        </div>
                        <i class="fa fa-group"></i>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
</div>


<div class="row">
    <div class="col-xl-8">
        <div class="card">
            <div class="card-header py-3 bg-transparent">
                <div class="card-widgets">
                    <a href="javascript:;" data-toggle="reload"><i class="material-icons">refresh</i></a>
                    <a data-toggle="collapse" href="#cardCollpase1" role="button" aria-expanded="false" aria-controls="cardCollpase2"><i class="fas fa-minus"></i></a>

                </div>
                <h5 class="header-title mb-0">Thống kê chi tiêu theo từng tháng</h5>
            </div>
            <div id="cardCollpase1" class="collapse show">
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-12">
                            <div id="morris-bar-example" class="morris-charts" dir="ltr" style="height: 320px;"></div>
                            <div class="row text-center mt-4 mb-4">
                                <div class="col-sm-3 col-6">
                                    <h5></h5>
                                    <small class="text-muted"> </small>
                                </div>
                                <div class="col-sm-3 col-6">
                                    <h5></h5>
                                    <small class="text-muted"></small>
                                </div>
                                <div class="col-sm-3 col-6">
                                    <h5></h5>
                                    <small class="text-muted"></small>
                                </div>
                                <div class="col-sm-3 col-6">
                                    <h5></h5>
                                    <small class="text-muted"></small>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <!-- end card-->

    </div>
    <!-- end col -->

    <div class="col-xl-4">
        <div class="card">
            <div class="card-header py-3 bg-transparent">
                <div class="card-widgets">
                    <a href="javascript:;" data-toggle="reload"><i class="material-icons">refresh</i></a>
                    <a data-toggle="collapse" href="#cardCollpase2" role="button" aria-expanded="false" aria-controls="cardCollpase2"><i class="fas fa-minus"></i></a>

                </div>
                <h5 class="header-title mb-0"> Thống kê chi tiêu theo từng năm</h5>
            </div>
            <div id="cardCollpase2" class="collapse show">
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-12">
                            <div id="morris-line-example" class="morris-charts" dir="ltr" style="height: 200px;"></div>
                            <div class="row text-center mt-4">
                                <div class="col-sm-4">
                                    <h5></h5>
                                    <small class="text-muted"> </small>
                                </div>
                                <div class="col-sm-4">
                                    <h5></h5>
                                    <small class="text-muted"></small>
                                </div>
                                <div class="col-sm-4">
                                    <h5></h5>
                                    <small class="text-muted"></small>
                                </div>

                            </div>

                        </div>
                    </div>

                </div>
            </div>
        </div>
        <!-- end card-->

        <div class="card">
            <div class="card-body">
                <div class="row">
                    <div class="col-sm-8">
                        <div class="status">
                            <h3 class="mt-2">61.5%</h3>
                            <p class="mb-1"></p>
                        </div>
                    </div>
                    <div class="col-sm-4 mt-3">
                        <span class="sparkpie-big"><canvas width="98" height="50" style="display: inline-block; width: 98px; height: 50px; vertical-align: top;"></canvas></span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
