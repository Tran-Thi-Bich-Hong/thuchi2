<%--
    Document   : Stats
    Created on : Aug 29, 2022, 12:14:33 AM
    Author     : Administrator
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="row" style="margin-top: 10px">
    <div class="col-xl-6">
        <div class="card">
            <div class="card-body">
                <div class="tile-stats">
                    <div class="row">
                        <div class="col-sm-6 mt-3">
                            <h5 class="header-title mb-2"> Thống kê khoản chi tiêu</h5>
                            <table id="datatable" class="table table-bordered dt-responsive nowrap" style="border-collapse: collapse; border-spacing: 0; width: 100%;">
                                <thead>
                                    <tr>
                                        <th>Mã</th>
                                        <th>Phân loại chi tiêu</th>
                                        <th>Tổng tiền đã chi</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${statsEarning}" var="s">
                                        <tr>
                                            <td>${s[0]}</td>
                                            <td>${s[1]}</td>
                                            <td><fmt:formatNumber type="number" value="${s[2]}" maxFractionDigits="3" /> VND</td>
                                        </tr>
                                        
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <div class="col-sm-6" >
                            <div>
                                <canvas id="myChart"></canvas>
                            </div>
<!--                            <span class="sparkpie-big"><canvas ></canvas></span>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
      <div class="col-xl-6">
        <div class="card">
            <div class="card-body">
                <div class="tile-stats">
                    <div class="row">
                        <div class="col-sm-6 mt-3">
                            <h5 class="header-title mb-2"> Thống kê khoản thu</h5>
                            <table id="datatable" class="table table-bordered dt-responsive nowrap" style="border-collapse: collapse; border-spacing: 0; width: 100%;">
                                <thead>
                                    <tr>
                                        <th>Mã</th>
                                        <th>Phân loại thu</th>
                                        <th>Tổng tiền đã thu</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${statsExpenditures}" var="s">
                                        <tr>
                                            <td>${s[0]}</td>
                                            <td>${s[1]}</td>
                                            <td><fmt:formatNumber type="number" value="${s[2]}" maxFractionDigits="3" /> VND</td>
                                        </tr>
                                        
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <div class="col-sm-6" >
                            <div>
                                <canvas id="myChart2"></canvas>
                            </div>
<!--                            <span class="sparkpie-big"><canvas ></canvas></span>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<script src="<c:url value="/js/stats.js" />"></script>
<script>
    window.onload = function () {
        let data = [];
        let labels = [];
        let data2 = [];
        let label2 = [];
    <c:forEach items="${statsEarning}" var="s">
        data.push(${s[2]});
        labels.push('${s[1]}');
    </c:forEach>
    <c:forEach items="${statsExpenditures}" var="s">
       data2.push(${s[2]});
       label2.push('${s[1]}');
    </c:forEach>
    statsEarnings(labels, data);
    statsExpenditures(label2, data2);
}
</script>