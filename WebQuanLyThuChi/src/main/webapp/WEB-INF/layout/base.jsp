<%-- 
    Document   : base
    Created on : Aug 23, 2022, 3:22:51 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <tiles:insertAttribute name="title" />
        </title>
        <link href="css\sweetalert2.css" rel="stylesheet" type="text/css">
        <link href="css\icon.min.css" rel="stylesheet" type="text/css">
        <link href="css\app.min.css" rel="stylesheet" type="text/css" id="app-stylesheet">
        <link href="css\boostrap.min.css" rel="stylesheet" type="text/css" id="bootstrap-stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    </head>
    <body>
        <div id="wrapper">
            <tiles:insertAttribute name="header" />
            <div class="content-page">
                <div class="content">
                    <div class="container-fluid">
                        <tiles:insertAttribute name="content" />
                    </div>
                </div>
            </div>
            <tiles:insertAttribute name="footer" />
            <script src="js\vendor.min.js"></script>
            <script src="js\app.min.js"></script>
        </div>
    </body>
</html>
