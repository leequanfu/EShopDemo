<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>signIn</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta http-equiv="imagetoolbar" content="no"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet">
    <link href="resources/css/axure_rp_page.css" type="text/css" rel="stylesheet">
    <link href="signIn_files/axurerp_pagespecificstyles.css" type="text/css" rel="stylesheet">
<!--[if IE 6]>
    <link href="signIn_files/axurerp_pagespecificstyles_ie6.css" type="text/css" rel="stylesheet">
<![endif]-->
    <script src="data/sitemap.js"></script>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/axutils.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/axurerp_beforepagescript.js"></script>
    <script src="resources/scripts/messagecenter.js"></script>
<script src='signIn_files/data.js'></script>
</head>
<body>
<div id="main_container">

<div id="u0" class="u0_container"   >
<div id="u0_img" class="u0_normal detectCanvas"></div>
<div id="u1" class="u1" style="visibility:hidden;"  >
<div id="u1_rtf"></div>
</div>
</div>
<div id="u2" class="u2"  data-label="paragraph">
<div id="u2_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:24px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Log In or create new account</span></p></div>
</div>
<div id="u3" class="u3_container"   >
<div id="u3_img" class="u3_normal detectCanvas"></div>
<div id="u4" class="u4"  >
<div id="u4_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Connect with Facebook</span></p></div>
</div>
</div>
<div id="u5" class="u5_container"   >
<div id="u5_img" class="u5_normal detectCanvas"></div>
<div id="u6" class="u6"  >
<div id="u6_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Connect with Twitter</span></p></div>
</div>
</div>
<div id="u7" class="u7_container"   >
<div id="u7_img" class="u7_normal detectCanvas"></div>
<div id="u8" class="u8" style="visibility:hidden;"  >
<div id="u8_rtf"></div>
</div>
</div>
<div id="u9" class="u9_container"   >
<div id="u9_img" class="u9_normal detectCanvas"></div>
<div id="u10" class="u10" style="visibility:hidden;"  >
<div id="u10_rtf"></div>
</div>
</div>
<div id="u11" class="u11_container"   >
<div id="u11_img" class="u11_normal detectCanvas"></div>
<div id="u12" class="u12"  >
<div id="u12_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Sign Up</span></p></div>
</div>
</div>
<INPUT id="u13" type=text value="&nbsp; example@gmail.com" class="u13" data-label="Input Field"    >

<INPUT id="u14" type=text value="&nbsp; ******" class="u14" data-label="Input Field"    >

<div id="u15" class="u15_container"   >
<div id="u15_img" class="u15_normal detectCanvas"></div>
<div id="u16" class="u16"  >
<div id="u16_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Sign In</span></p></div>
</div>
</div>
<div id="u17" class="u17_container"   data-label="link">
<div id="u17_img" class="u17_normal detectCanvas"></div>
<div id="u18" class="u18"  >
<div id="u18_rtf"><p style="text-align:right;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">Forgot Password?</span></p></div>
</div>
</div>
<div id="u19" class="u19"  data-label="paragraph">
<div id="u19_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">Sign Up</span></p></div>
</div>
<div id="u20" class="u20"  data-label="paragraph">
<div id="u20_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">If you dont have account yet</span></p></div>
</div><div id="u21" class="u21" >
<DIV id="u21_line" class="u21_line" ></DIV>
</div>
<div id="u22" class="u22_container"   >
<div id="u22_img" class="u22_normal detectCanvas"></div>
<div id="u23" class="u23"  >
<div id="u23_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">or</span></p></div>
</div>
</div>
<div id="u24" class="u24_container"   >
<div id="u24_img" class="u24_normal detectCanvas"></div>
<div id="u25" class="u25" style="visibility:hidden;"  >
<div id="u25_rtf"></div>
</div>
</div>
<div id="u26" class="u26"  data-label="paragraph">
<div id="u26_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Welcome to EShopDemo</span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">! </span></p></div>
</div><div id="u27" class="u27" >
<DIV id="u27_line" class="u27_line" ></DIV>
</div>
<div id="u28" class="u28_container"   data-label="link">
<div id="u28_img" class="u28_normal detectCanvas"></div>
<div id="u29" class="u29"  >
<div id="u29_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">[Sign in]</span></p></div>
</div>
</div>
<div id="u30" class="u30_container"   data-label="link">
<div id="u30_img" class="u30_normal detectCanvas"></div>
<div id="u31" class="u31"  >
<div id="u31_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">[</span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">Sign up</span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;"> For Free</span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">]</span></p></div>
</div>
</div>
<div id="u32" class="u32_container"   data-label="link">
<div id="u32_img" class="u32_normal detectCanvas"></div>
<div id="u33" class="u33"  >
<div id="u33_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">My orders</span></p></div>
</div>
</div>
<div id="u34" class="u34_container"   >
<div id="u34_img" class="u34_normal detectCanvas"></div>
<div id="u35" class="u35"  >
<div id="u35_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Search</span></p></div>
</div>
</div>
<div id="u36" class="u36_container"   data-label="Rectangle">
<div id="u36_img" class="u36_normal detectCanvas"></div>
<div id="u37" class="u37" style="visibility:hidden;"  >
<div id="u37_rtf"></div>
</div>
</div>
<INPUT id="u38" type=text value="Search..." class="u38" data-label="Search Field"   maxlength=128 >

<div id="u39" class="u39_container"   >
<div id="u39_img" class="u39_normal detectCanvas"></div>
<div id="u40" class="u40" style="visibility:hidden;"  >
<div id="u40_rtf"></div>
</div>
</div>
<div id="u41" class="u41_container"   >
<div id="u41_img" class="u41_normal detectCanvas"></div>
<div id="u42" class="u42" style="visibility:hidden;"  >
<div id="u42_rtf"></div>
</div>
</div>
<div id="u43" class="u43"  data-label="TotalQuantity">
<div id="u43_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">0</span></p></div>
</div>
<DIV id="u44" style="border-style:dotted; border-color:red; visibility:hidden; position:absolute; left:200px; top:0px; width:1047px; height:83px;;" ></div>
<div id="u45" class="u45_container"   >
<div id="u45_img" class="u45_normal detectCanvas"></div>
<div id="u46" class="u46"  >
<div id="u46_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Copyright © 2013 </span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Quanfu Li </span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">All rights reserved&nbsp; </span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">email: leequanfu@gmail.com</span></p></div>
</div>
</div>
<DIV id="u47" style="border-style:dotted; border-color:red; visibility:hidden; position:absolute; left:200px; top:628px; width:996px; height:46px;;" ></div>
</div>
<div class="preload"><img src="signIn_files/u0_normal.png" width="1" height="1"/><img src="signIn_files/u3_mouseOver.png" width="1" height="1"/><img src="signIn_files/u3_normal.png" width="1" height="1"/><img src="signIn_files/u5_mouseOver.png" width="1" height="1"/><img src="signIn_files/u5_normal.png" width="1" height="1"/><img src="signIn_files/u7_normal.png" width="1" height="1"/><img src="signIn_files/u9_normal.png" width="1" height="1"/><img src="signIn_files/u11_mouseOver.png" width="1" height="1"/><img src="signIn_files/u11_normal.png" width="1" height="1"/><img src="signIn_files/u15_mouseOver.png" width="1" height="1"/><img src="signIn_files/u15_normal.png" width="1" height="1"/><img src="signIn_files/u21_line.png" width="1" height="1"/><img src="signIn_files/u22_normal.png" width="1" height="1"/><img src="Header_files/u0_normal.png" width="1" height="1"/><img src="Header_files/u3_line.png" width="1" height="1"/><img src="Header_files/u10_mouseOver.png" width="1" height="1"/><img src="Header_files/u10_normal.png" width="1" height="1"/><img src="Header_files/Rectangle_u12_normal.png" width="1" height="1"/><img src="Header_files/u15_normal.png" width="1" height="1"/><img src="Header_files/u17_normal.png" width="1" height="1"/><img src="Footer_files/u191_normal.png" width="1" height="1"/></div>
</body>
<script src="resources/scripts/axurerp_pagescript.js"></script>
<script src="signIn_files/axurerp_pagespecificscript.js" charset="utf-8"></script>