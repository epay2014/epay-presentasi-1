<%-- 
    Document   : OpenLogin
    Created on : Aug 24, 2016, 10:50:17 AM
    Author     : evan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>      
        <meta content="0;">
        <title>WRP - Login</title>
        <script>
            function delayer(){
                window.location = "showLogin.action?urlInstagramnew="+document.getElementById("urlInstagram").value+"&fburlnew="+document.getElementById("fburl").value;
            }

        </script>
    </head>
    <body onLoad="setTimeout('delayer()', 100)">
        <p>Loading Database...</p>
         <input style="display:none" type="hidden" value="<s:property value="urlInstagram"/>" id="urlInstagram" name="urlInstagram">
          <input style="display:none" type="hidden" value="<s:property value="fburl"/>" id="fburl" name="fburl">
    </body>
</html>