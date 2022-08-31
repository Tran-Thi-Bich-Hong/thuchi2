<%-- 
    Document   : header
    Created on : Aug 23, 2022, 3:27:50 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Topbar Start -->
<div class="navbar-custom">
    <ul class="list-unstyled topnav-menu float-right mb-0">

        <li class="dropdown notification-list">
            <a class="nav-link dropdown-toggle  waves-effect" data-toggle="dropdown" href="#" role="button" aria-haspopup="false" aria-expanded="false">
                <i class="far fa-bell"></i>
                <span class="badge badge-pink rounded-circle noti-icon-badge">0</span>
            </a>
            <div class="dropdown-menu dropdown-menu-right dropdown-lg">

                <!-- item-->
                <div class="dropdown-item noti-title">
                    <h5 class="font-16 m-0">
                        <span class="float-right">
                            <a href="" class="text-dark">
                                <small>Xóa tất cả</small>
                            </a>
                        </span>Thông báo
                    </h5>
                </div>

                <div class="slimscroll noti-scroll">

                    <!-- item-->
                    <a href="javascript:void(0);" class="dropdown-item notify-item">
                        <div class="notify-icon">
                            <i class="material-icons text-info">chat</i>
                        </div>
                        <p class="notify-details">Thông báo 1
                            <small class="noti-time">1 gi</small>
                        </p>
                    </a>

                </div>

                <!-- All-->
                <a href="javascript:void(0);" class="dropdown-item text-center notify-item notify-all">
                        Xem tất cả
                </a>

            </div>
        </li>

        <li class="dropdown notification-list">
            <a class="nav-link dropdown-toggle nav-user mr-0 waves-effect" data-toggle="dropdown" href="#" role="button" aria-haspopup="false" aria-expanded="false">
                <img src="images\1.jfif" alt="user-image" class="rounded-circle">
                <span class="pro-user-name ml-1">
                    Bích Hồng<i class="material-icons">settings</i>
                </span>
            </a>
            <div class="dropdown-menu dropdown-menu-right profile-dropdown ">
                <!-- item-->
                <div class="dropdown-header noti-title">
                    <h6 class="text-overflow m-0">Xin chào !</h6>
                </div>

                <!-- item-->
                <a href="javascript:void(0);" class="dropdown-item notify-item">
                    <i class="material-icons">person_outline</i>
                    <span>Tài Khoản</span>
                </a>


                <!-- item-->
                <a href="javascript:void(0);" class="dropdown-item notify-item">
                    <i class="fas fa-arrow-left"></i>
                    <span>Đăng xuất</span>
                </a>

            </div>
        </li>

        


    </ul>

    <!-- LOGO -->
    <div class="logo-box">
        <a href="<c:url value="/"/>" class="logo text-center logo-light">
            <span class="logo-lg">
                <img src="images\logo.PNG" alt="" height="80">
                <!-- <span class="logo-lg-text-dark">Velonic</span> -->
            </span>
            <span class="logo-sm">
                <!-- <span class="logo-lg-text-dark">V</span> -->
                <img src="images\logosmall.PNG" alt="" height="30">
            </span>
        </a>
    </div>

    <!-- LOGO -->

    <ul class="list-unstyled topnav-menu topnav-menu-left m-0">
        <li>
            <button class="button-menu-mobile waves-effect">
                <i class="fa fa-navicon" style="color: black"></i>
            </button>
        </li>

        <li class="d-none d-lg-block">
            <form class="app-search">
                <div class="app-search-box">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search...">
                        <div class="input-group-append">
                            <button class="btn" type="submit">
                                <i class="fas fa-search"></i>
                            </button>
                        </div>
                    </div>
                </div>
            </form>
        </li>
    </ul>
</div>
<!-- end Topbar --> <!-- ========== Left Sidebar Start ========== -->
<div class="left-side-menu">

    <div class="slimscroll-menu">

        <!--- Sidemenu -->
        <div id="sidebar-menu">
            <ul class="metismenu" id="side-menu">

                <li class="menu-title"></li>

                <li>
                    <a href="<c:url value="/Stats"/>"  class="waves-effect">
                        <i class="fas fa-chart-bar"></i>
                        <span>  Thống kê  </span>
                        
                    </a>

                </li>

                <li>
                    <a href="javascript: void(0);" class="waves-effect">
                        <i class="fas fa-shopping-basket"></i>
                        <span> Quản lý </span>
                        <i class="fas fa-angle-right float-right" ></i>
                    </a>
                    <ul class="nav-second-level" aria-expanded="false">

                        <li><a href="<c:url value="/earning"/>" >Chi tiêu</a></li>
                        <li><a href="<c:url value="/Expenditures"/>" >Thu nhập</a></li>

                    </ul>
                </li>

                <li>
                    <a href="javascript: void(0);" class="waves-effect">
                        <i class="far fa-address-book"></i>
                        <span> Phòng thu chi </span>
                        <i class="fas fa-angle-right float-right" ></i>
                    </a>
                    <ul class="nav-second-level" aria-expanded="false">
                        <li><a href="components-grid.html">Thêm Phòng</a></li>
                        <li><a href="components-portlets.html"></a></li>

                    </ul>
                </li>
            </ul>

        </div>
        <!-- End Sidebar -->

        <div class="clearfix"></div>

    </div>
    <!-- Sidebar -left -->

</div>
<!-- Left Sidebar End -->