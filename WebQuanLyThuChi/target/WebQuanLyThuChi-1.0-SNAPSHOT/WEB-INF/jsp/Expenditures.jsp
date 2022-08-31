<%-- 
    Document   : Expenditures
    Created on : Aug 24, 2022, 8:11:55 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

  <div class="row">
        <div class="col-12">
            <div class="page-title-box">
                <h4 class="page-title">Quản lý thu nhập</h4>
                <div class="page-title-right">
                    <ol class="breadcrumb p-0 m-0">
                        <li class="breadcrumb-item"><a href="#">Trang Chủ</a></li>
                        <li class="breadcrumb-item"><a href="#">Quản lý thu nhập</a></li>
                        <li class="breadcrumb-item active">Thêm khoản thu</li>
                    </ol>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>

    <!-- end page title -->
    <div class="row">
        <div class="col-12">
            <div class="card">
                <div class="card-body table-responsive">
                    <h4 class="m-t-0 header-title mb-4"><b>Thêm thu nhập</b></h4>
                    <c:url value="/Expenditures" var="action" />
                    <form:form class="form-horizontal" method="post" action="${action}" modelAttribute="expenditures">
                       <form:errors path="*" element="div" cssClass="alert alert-danger" />
                       
                      
                       <div class="form-group row">
                           <label class="col-lg-2 col-form-label" for="createddate">Ngày thu tiền</label>
                           <div class="col-lg-10">
                               <input class="form-control" id="createddate" type="date"  />
                           </div>
                       </div>
                      
                          
                        <div class="form-group row">
                            <label for="totalMoney" class="col-lg-2 col-form-label">Số tiền <span class="text-danger">(bắt buộc)</span></label>
                            <div class="col-lg-10">
                                <form:input path="totalMoney" id="totalMoney" class="form-control" placeholder="Nhập vào số tiền"/>
                                <form:errors path="totalMoney" element="div" cssClass="invalid-feedback" />
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="typeExpenditureId" class="col-lg-2 col-form-label">Phân loại thu<span class="text-danger">(bắt buộc)</span></label>
                            <div class="col-lg-10">
                                <form:select path="typeExpenditureId" class="form-control" >
                                  
                                    <c:forEach items="${typeExpenditures}" var="c">
                                        <option value="${c.id}">${c.name}</option>
                                    </c:forEach>
                                       
                                </form:select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-2 col-form-label" for="note">Muc đích chi tiền <span class="text-danger">(bắt buộc)</span></label>
                            <div class="col-lg-10">
                                <form:textarea path ="note" class="form-control" rows="5" id="note"/>
                                <form:errors path="note" element="div" cssClass="invalid-feedback" />
                            </div>
                        </div>
                        <div class="form-floating">
                            <br>
                            <input type="submit" value="Thêm khoản thu" class="btn btn-danger" />
                        </div>
                    </form:form>
                </div> 
            </div>
        </div>
    </div>  
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-body">
                    <h4 class="header-title ">Lịch sử chi tiêu</h4>

                    <form>
                        <div class="form-row" >
                            <div class="form-group" style="width: 23%">
                                <label for="" class="col-form-label"> Thời gian tạo từ</label>
                                <div class="form-row">
                                    <div class="col-md-3">
                                        <input type="number" name="day"  class="form-control" id="" placeholder="dd">
                                    </div>
                                    <div class=" col-md-3">

                                        <input type="number" name ="month" class="form-control" id="" placeholder="mm">
                                    </div>
                                    <div class=" col-md-4">
                                        <input type="number" name="year" class="form-control" id="" placeholder="yyyy">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group" style="width: 23%">
                                <label for="" class="col-form-label"> Đến</label>
                                <div class="form-row">
                                    <div class=" col-md-3">
                                        <input type="number" name="day"  class="form-control" id="" placeholder="dd">
                                    </div>
                                    <div class="col-md-3">

                                        <input type="number" name ="month" class="form-control" id="" placeholder="mm">
                                    </div>
                                    <div class=" col-md-4">
                                        <input type="number" name="year" class="form-control" id="" placeholder="yyyy">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group" style="width: 23%">
                                <label for="inputAddress" class="col-form-label">Mục đích chi</label>
                                <div class=" col-md-9" >
                                    <input type="text" class="form-control" id="inputAddress" placeholder="">
                                </div>
                            </div>
                             <div class="form-group" style="width: 23%">
                                <label for="inputAddress" class="col-form-label">Số tiền chi</label>
                                 <div class=" col-md-9">
                                    <input type="text" class="form-control" id="inputAddress" placeholder="">
                                </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">Tìm kiếm</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- end row -->
    <div class="row">
        <div class="col-12">
            <div class="card">
                <div class="card-body table-responsive">
                    <h4 class="m-t-0 header-title mb-4"><b>Tổng tiền chi :</b></h4>

                    <table id="datatable" class="table table-bordered dt-responsive nowrap" style="border-collapse: collapse; border-spacing: 0; width: 100%;">
                        <thead>
                            <tr>
                                <th>STT</th>
                                <th>Ngày chi tiền</th>
                                <th>Số tiền</th>
                                <th>Mục đích chi</th>
                                <th>Diễn giải</th>
                            </tr>
                        </thead>

                        <tbody id="tbExpenditures">
                             
                        </tbody>
                    </table>
                    <nav>
                        <ul class="pagination pagination-split">
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Previous">
                                    <span aria-hidden="true">«</span>
                                    <span class="sr-only">Previous</span>
                                </a>
                            </li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item active"><a class="page-link" href="#">2</a></li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item"><a class="page-link" href="#">4</a></li>
                            <li class="page-item"><a class="page-link" href="#">5</a></li>
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Next">
                                    <span aria-hidden="true">»</span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                    
                </div>
            </div>
        </div>
    </div>
<script src="<c:url value="/js/Expenditures.js" />"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.4/moment.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.4/moment-with-locales.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
<script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>

<script>
    <c:url value="/api/Expenditures" var="endpoint" />

    window.onload = function () {
        loadExpenditures('${endpoint}');
    }
    
</script> 
 <script>
    var date = new Date();
    var year = date.getFullYear();
    var month = date.getMonth()+1;
    var m = String(month).padStart(2, '0');
    var day = String(date.getDate()).padStart(2, '0');
    var datePattern = day +"/" + m+"/"+year;
    document.getElementById("createddate").placeholder= datePattern;
    
 </script>
<script>
   config = {
        
        dateFormat: "Y-m-d",}
   flatpickr("input[type=date]", config);
</script>
