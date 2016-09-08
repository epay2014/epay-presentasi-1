<%-- 
    Document   : showMenu
    Created on : Aug 31, 2016, 9:51:14 AM
    Author     : evan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Simple Sidebar - Start Bootstrap Template</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/simple-sidebar.css" rel="stylesheet">
</head>

<body>

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        Start Bootstrap
                    </a>
                </li>
                  <s:iterator id="tblmenu" value="menus" status="status1">
                     <s:set name="menus_menuid" value="id_menu"/>
                      <li><a href="#"><s:property value="name_menu"/></a>
<!--                      <ul class="nav nav-second-level">
                           <s:iterator id="tblmodul" value="moduls" status="status2">
                            <s:set name="moduls_moduleid" value="idmodul"/>
                                <s:if test="#menus_menuid==idmenu">
                                      <li> <a href="#"><s:property value="menu_modul"/></a> </li>
                                 </s:if>
                           </s:iterator>
                            </ul>-->
                      </li>                      
                    </s:iterator>
              </ul>
        </div>
        
        
             <div class="row">               
               <div class="col-lg-12">
                  <div class="panel panel-default">
                         //map
                    </div>
                </div>
              </div>
        
              <div class="col-lg-12">
                  <div class="panel panel-default">
                         //map
                    </div>
        </div>
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">                          
                      <h1><a href="#menu-toggle" class="btn btn-default" id="menu-toggle">X</a></h1>
                       <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                         <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                          <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                           <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                            <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                             <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                              <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                    </div>
                  </div>







            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>

</body>

</html>
