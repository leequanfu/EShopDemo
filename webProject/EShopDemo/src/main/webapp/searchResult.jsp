<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>searchResult</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta http-equiv="imagetoolbar" content="no"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet">
    <link href="resources/css/axure_rp_page.css" type="text/css" rel="stylesheet">
    <link href="searchResult_files/axurerp_pagespecificstyles.css" type="text/css" rel="stylesheet">
<!--[if IE 6]>
    <link href="searchResult_files/axurerp_pagespecificstyles_ie6.css" type="text/css" rel="stylesheet">
<![endif]-->
    <script src="data/sitemap.js"></script>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/axutils.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/axurerp_beforepagescript.js"></script>
    <script src="resources/scripts/messagecenter.js"></script>
<script src='searchResult_files/data.js'></script>
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
<div id="u2_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Welcome to EShopDemo</span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">! </span></p></div>
</div><div id="u3" class="u3" >
<DIV id="u3_line" class="u3_line" ></DIV>
</div>
<div id="u4" class="u4_container"   data-label="link">
<div id="u4_img" class="u4_normal detectCanvas"></div>
<div id="u5" class="u5"  >
<div id="u5_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">[Sign in]</span></p></div>
</div>
</div>
<div id="u6" class="u6_container"   data-label="link">
<div id="u6_img" class="u6_normal detectCanvas"></div>
<div id="u7" class="u7"  >
<div id="u7_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">[</span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">Sign up</span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;"> For Free</span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">]</span></p></div>
</div>
</div>
<div id="u8" class="u8_container"   data-label="link">
<div id="u8_img" class="u8_normal detectCanvas"></div>
<div id="u9" class="u9"  >
<div id="u9_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">My orders</span></p></div>
</div>
</div>
<div id="u10" class="u10_container"   >
<div id="u10_img" class="u10_normal detectCanvas"></div>
<div id="u11" class="u11"  >
<div id="u11_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Search</span></p></div>
</div>
</div>
<div id="u12" class="u12_container"   data-label="Rectangle">
<div id="u12_img" class="u12_normal detectCanvas"></div>
<div id="u13" class="u13" style="visibility:hidden;"  >
<div id="u13_rtf"></div>
</div>
</div>
<INPUT id="u14" type=text value="Search..." class="u14" data-label="Search Field"   maxlength=128 >

<div id="u15" class="u15_container"   >
<div id="u15_img" class="u15_normal detectCanvas"></div>
<div id="u16" class="u16" style="visibility:hidden;"  >
<div id="u16_rtf"></div>
</div>
</div>
<div id="u17" class="u17_container"   >
<div id="u17_img" class="u17_normal detectCanvas"></div>
<div id="u18" class="u18" style="visibility:hidden;"  >
<div id="u18_rtf"></div>
</div>
</div>
<div id="u19" class="u19"  data-label="TotalQuantity">
<div id="u19_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">0</span></p></div>
</div>
<DIV id="u20" style="border-style:dotted; border-color:red; visibility:hidden; position:absolute; left:199px; top:0px; width:1047px; height:83px;;" ></div><div id="u21" class="u21" >
<DIV id="u21_line" class="u21_line" ></DIV>
</div>
<div id="u22" class="u22_container"   data-label="button">
<div id="u22_img" class="u22_normal detectCanvas"></div>
<div id="u23" class="u23"  >
<div id="u23_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">1</span></p></div>
</div>
</div>
<div id="u24" class="u24_container"   data-label="button">
<div id="u24_img" class="u24_normal detectCanvas"></div>
<div id="u25" class="u25"  >
<div id="u25_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">2</span></p></div>
</div>
</div>
<div id="u26" class="u26_container"   data-label="button">
<div id="u26_img" class="u26_normal detectCanvas"></div>
<div id="u27" class="u27"  >
<div id="u27_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">3</span></p></div>
</div>
</div>
<div id="u28" class="u28_container"   data-label="button">
<div id="u28_img" class="u28_normal detectCanvas"></div>
<div id="u29" class="u29"  >
<div id="u29_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">4</span></p></div>
</div>
</div>
<div id="u30" class="u30_container"   data-label="button">
<div id="u30_img" class="u30_normal detectCanvas"></div>
<div id="u31" class="u31"  >
<div id="u31_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">5</span></p></div>
</div>
</div>
<div id="u32" class="u32_container"   data-label="button">
<div id="u32_img" class="u32_normal detectCanvas"></div>
<div id="u33" class="u33"  >
<div id="u33_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#F2F2F2;">previus</span></p></div>
</div>
</div>
<div id="u34" class="u34_container"   data-label="button">
<div id="u34_img" class="u34_normal detectCanvas"></div>
<div id="u35" class="u35"  >
<div id="u35_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">6</span></p></div>
</div>
</div>
<div id="u36" class="u36_container"   data-label="button">
<div id="u36_img" class="u36_normal detectCanvas"></div>
<div id="u37" class="u37"  >
<div id="u37_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">7</span></p></div>
</div>
</div>
<div id="u38" class="u38_container"   data-label="button">
<div id="u38_img" class="u38_normal detectCanvas"></div>
<div id="u39" class="u39"  >
<div id="u39_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">8</span></p></div>
</div>
</div>
<div id="u40" class="u40_container"   data-label="button">
<div id="u40_img" class="u40_normal detectCanvas"></div>
<div id="u41" class="u41"  >
<div id="u41_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">9</span></p></div>
</div>
</div>
<div id="u42" class="u42_container"   data-label="button">
<div id="u42_img" class="u42_normal detectCanvas"></div>
<div id="u43" class="u43"  >
<div id="u43_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">10</span></p></div>
</div>
</div>
<div id="u44" class="u44_container"   data-label="button">
<div id="u44_img" class="u44_normal detectCanvas"></div>
<div id="u45" class="u45"  >
<div id="u45_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">next</span></p></div>
</div>
</div>
<div id="u46" class="u46_container"   data-label="Rectangle">
<div id="u46_img" class="u46_normal detectCanvas"></div>
<div id="u47" class="u47" style="visibility:hidden;"  >
<div id="u47_rtf"></div>
</div>
</div>
<div id="u48" class="u48_container"   data-label="Image">
<div id="u48_img" >
<img src="searchResult_files/Image_u48_normal.jpg"  class="raw_image"></div>
<div id="u49" class="u49" style="visibility:hidden;"  >
<div id="u49_rtf"></div>
</div>
</div>
<div id="u50" class="u50_container"   data-label="Rectangle">
<div id="u50_img" class="u50_normal detectCanvas"></div>
<div id="u51" class="u51" style="visibility:hidden;"  >
<div id="u51_rtf"></div>
</div>
</div>
<div id="u52" class="u52_container"   data-label="Rectangle">
<div id="u52_img" class="u52_normal detectCanvas"></div>
<div id="u53" class="u53"  >
<div id="u53_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Price: $12950</span></p></div>
</div>
</div>
<div id="u54" class="u54_container"   data-label="Button">
<div id="u54_img" class="u54_normal detectCanvas"></div>
<div id="u55" class="u55"  >
<div id="u55_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Add to cart</span></p></div>
</div>
</div>
<div id="u56" class="u56"  data-label="link">
<div id="u56_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Publication Manual of the American Psychological Association, 6th Edition [Paperback]</span></p></div>
</div>
<DIV id="u57" style="" data-label="Star ratings">
<DIV id="pd10u57" style="visibility:hidden;" data-label="5.set">
<div id="u58" class="u58_container"   >
<div id="u58_img" class="u58_normal detectCanvas"></div>
<div id="u59" class="u59" style="visibility:hidden;"  >
<div id="u59_rtf"></div>
</div>
</div>
<div id="u60" class="u60_container"   >
<div id="u60_img" class="u60_normal detectCanvas"></div>
<div id="u61" class="u61" style="visibility:hidden;"  >
<div id="u61_rtf"></div>
</div>
</div>
<div id="u62" class="u62_container"   >
<div id="u62_img" class="u62_normal detectCanvas"></div>
<div id="u63" class="u63" style="visibility:hidden;"  >
<div id="u63_rtf"></div>
</div>
</div>
<div id="u64" class="u64_container"   >
<div id="u64_img" class="u64_normal detectCanvas"></div>
<div id="u65" class="u65" style="visibility:hidden;"  >
<div id="u65_rtf"></div>
</div>
</div>
<div id="u66" class="u66_container"   >
<div id="u66_img" class="u66_normal detectCanvas"></div>
<div id="u67" class="u67" style="visibility:hidden;"  >
<div id="u67_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd9u57" style="visibility:hidden;" data-label="4.set">
<div id="u68" class="u68_container"   >
<div id="u68_img" class="u68_normal detectCanvas"></div>
<div id="u69" class="u69" style="visibility:hidden;"  >
<div id="u69_rtf"></div>
</div>
</div>
<div id="u70" class="u70_container"   >
<div id="u70_img" class="u70_normal detectCanvas"></div>
<div id="u71" class="u71" style="visibility:hidden;"  >
<div id="u71_rtf"></div>
</div>
</div>
<div id="u72" class="u72_container"   >
<div id="u72_img" class="u72_normal detectCanvas"></div>
<div id="u73" class="u73" style="visibility:hidden;"  >
<div id="u73_rtf"></div>
</div>
</div>
<div id="u74" class="u74_container"   >
<div id="u74_img" class="u74_normal detectCanvas"></div>
<div id="u75" class="u75" style="visibility:hidden;"  >
<div id="u75_rtf"></div>
</div>
</div>
<div id="u76" class="u76_container"   >
<div id="u76_img" class="u76_normal detectCanvas"></div>
<div id="u77" class="u77" style="visibility:hidden;"  >
<div id="u77_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd8u57" style="visibility:hidden;" data-label="3.set">
<div id="u78" class="u78_container"   >
<div id="u78_img" class="u78_normal detectCanvas"></div>
<div id="u79" class="u79" style="visibility:hidden;"  >
<div id="u79_rtf"></div>
</div>
</div>
<div id="u80" class="u80_container"   >
<div id="u80_img" class="u80_normal detectCanvas"></div>
<div id="u81" class="u81" style="visibility:hidden;"  >
<div id="u81_rtf"></div>
</div>
</div>
<div id="u82" class="u82_container"   >
<div id="u82_img" class="u82_normal detectCanvas"></div>
<div id="u83" class="u83" style="visibility:hidden;"  >
<div id="u83_rtf"></div>
</div>
</div>
<div id="u84" class="u84_container"   >
<div id="u84_img" class="u84_normal detectCanvas"></div>
<div id="u85" class="u85" style="visibility:hidden;"  >
<div id="u85_rtf"></div>
</div>
</div>
<div id="u86" class="u86_container"   >
<div id="u86_img" class="u86_normal detectCanvas"></div>
<div id="u87" class="u87" style="visibility:hidden;"  >
<div id="u87_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd7u57" style="visibility:hidden;" data-label="2.set">
<div id="u88" class="u88_container"   >
<div id="u88_img" class="u88_normal detectCanvas"></div>
<div id="u89" class="u89" style="visibility:hidden;"  >
<div id="u89_rtf"></div>
</div>
</div>
<div id="u90" class="u90_container"   >
<div id="u90_img" class="u90_normal detectCanvas"></div>
<div id="u91" class="u91" style="visibility:hidden;"  >
<div id="u91_rtf"></div>
</div>
</div>
<div id="u92" class="u92_container"   >
<div id="u92_img" class="u92_normal detectCanvas"></div>
<div id="u93" class="u93" style="visibility:hidden;"  >
<div id="u93_rtf"></div>
</div>
</div>
<div id="u94" class="u94_container"   >
<div id="u94_img" class="u94_normal detectCanvas"></div>
<div id="u95" class="u95" style="visibility:hidden;"  >
<div id="u95_rtf"></div>
</div>
</div>
<div id="u96" class="u96_container"   >
<div id="u96_img" class="u96_normal detectCanvas"></div>
<div id="u97" class="u97" style="visibility:hidden;"  >
<div id="u97_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd6u57" style="visibility:hidden;" data-label="1.set">
<div id="u98" class="u98_container"   >
<div id="u98_img" class="u98_normal detectCanvas"></div>
<div id="u99" class="u99" style="visibility:hidden;"  >
<div id="u99_rtf"></div>
</div>
</div>
<div id="u100" class="u100_container"   >
<div id="u100_img" class="u100_normal detectCanvas"></div>
<div id="u101" class="u101" style="visibility:hidden;"  >
<div id="u101_rtf"></div>
</div>
</div>
<div id="u102" class="u102_container"   >
<div id="u102_img" class="u102_normal detectCanvas"></div>
<div id="u103" class="u103" style="visibility:hidden;"  >
<div id="u103_rtf"></div>
</div>
</div>
<div id="u104" class="u104_container"   >
<div id="u104_img" class="u104_normal detectCanvas"></div>
<div id="u105" class="u105" style="visibility:hidden;"  >
<div id="u105_rtf"></div>
</div>
</div>
<div id="u106" class="u106_container"   >
<div id="u106_img" class="u106_normal detectCanvas"></div>
<div id="u107" class="u107" style="visibility:hidden;"  >
<div id="u107_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd5u57" style="visibility:hidden;" data-label="5">
<div id="u108" class="u108_container"   >
<div id="u108_img" class="u108_normal detectCanvas"></div>
<div id="u109" class="u109" style="visibility:hidden;"  >
<div id="u109_rtf"></div>
</div>
</div>
<div id="u110" class="u110_container"   >
<div id="u110_img" class="u110_normal detectCanvas"></div>
<div id="u111" class="u111" style="visibility:hidden;"  >
<div id="u111_rtf"></div>
</div>
</div>
<div id="u112" class="u112_container"   >
<div id="u112_img" class="u112_normal detectCanvas"></div>
<div id="u113" class="u113" style="visibility:hidden;"  >
<div id="u113_rtf"></div>
</div>
</div>
<div id="u114" class="u114_container"   >
<div id="u114_img" class="u114_normal detectCanvas"></div>
<div id="u115" class="u115" style="visibility:hidden;"  >
<div id="u115_rtf"></div>
</div>
</div>
<div id="u116" class="u116_container"   >
<div id="u116_img" class="u116_normal detectCanvas"></div>
<div id="u117" class="u117" style="visibility:hidden;"  >
<div id="u117_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd4u57" style="visibility:hidden;" data-label="4">
<div id="u118" class="u118_container"   >
<div id="u118_img" class="u118_normal detectCanvas"></div>
<div id="u119" class="u119" style="visibility:hidden;"  >
<div id="u119_rtf"></div>
</div>
</div>
<div id="u120" class="u120_container"   >
<div id="u120_img" class="u120_normal detectCanvas"></div>
<div id="u121" class="u121" style="visibility:hidden;"  >
<div id="u121_rtf"></div>
</div>
</div>
<div id="u122" class="u122_container"   >
<div id="u122_img" class="u122_normal detectCanvas"></div>
<div id="u123" class="u123" style="visibility:hidden;"  >
<div id="u123_rtf"></div>
</div>
</div>
<div id="u124" class="u124_container"   >
<div id="u124_img" class="u124_normal detectCanvas"></div>
<div id="u125" class="u125" style="visibility:hidden;"  >
<div id="u125_rtf"></div>
</div>
</div>
<div id="u126" class="u126_container"   >
<div id="u126_img" class="u126_normal detectCanvas"></div>
<div id="u127" class="u127" style="visibility:hidden;"  >
<div id="u127_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd3u57" style="visibility:hidden;" data-label="3">
<div id="u128" class="u128_container"   >
<div id="u128_img" class="u128_normal detectCanvas"></div>
<div id="u129" class="u129" style="visibility:hidden;"  >
<div id="u129_rtf"></div>
</div>
</div>
<div id="u130" class="u130_container"   >
<div id="u130_img" class="u130_normal detectCanvas"></div>
<div id="u131" class="u131" style="visibility:hidden;"  >
<div id="u131_rtf"></div>
</div>
</div>
<div id="u132" class="u132_container"   >
<div id="u132_img" class="u132_normal detectCanvas"></div>
<div id="u133" class="u133" style="visibility:hidden;"  >
<div id="u133_rtf"></div>
</div>
</div>
<div id="u134" class="u134_container"   >
<div id="u134_img" class="u134_normal detectCanvas"></div>
<div id="u135" class="u135" style="visibility:hidden;"  >
<div id="u135_rtf"></div>
</div>
</div>
<div id="u136" class="u136_container"   >
<div id="u136_img" class="u136_normal detectCanvas"></div>
<div id="u137" class="u137" style="visibility:hidden;"  >
<div id="u137_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd2u57" style="visibility:hidden;" data-label="2">
<div id="u138" class="u138_container"   >
<div id="u138_img" class="u138_normal detectCanvas"></div>
<div id="u139" class="u139" style="visibility:hidden;"  >
<div id="u139_rtf"></div>
</div>
</div>
<div id="u140" class="u140_container"   >
<div id="u140_img" class="u140_normal detectCanvas"></div>
<div id="u141" class="u141" style="visibility:hidden;"  >
<div id="u141_rtf"></div>
</div>
</div>
<div id="u142" class="u142_container"   >
<div id="u142_img" class="u142_normal detectCanvas"></div>
<div id="u143" class="u143" style="visibility:hidden;"  >
<div id="u143_rtf"></div>
</div>
</div>
<div id="u144" class="u144_container"   >
<div id="u144_img" class="u144_normal detectCanvas"></div>
<div id="u145" class="u145" style="visibility:hidden;"  >
<div id="u145_rtf"></div>
</div>
</div>
<div id="u146" class="u146_container"   >
<div id="u146_img" class="u146_normal detectCanvas"></div>
<div id="u147" class="u147" style="visibility:hidden;"  >
<div id="u147_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd1u57" style="visibility:hidden;" data-label="1">
<div id="u148" class="u148_container"   >
<div id="u148_img" class="u148_normal detectCanvas"></div>
<div id="u149" class="u149" style="visibility:hidden;"  >
<div id="u149_rtf"></div>
</div>
</div>
<div id="u150" class="u150_container"   >
<div id="u150_img" class="u150_normal detectCanvas"></div>
<div id="u151" class="u151" style="visibility:hidden;"  >
<div id="u151_rtf"></div>
</div>
</div>
<div id="u152" class="u152_container"   >
<div id="u152_img" class="u152_normal detectCanvas"></div>
<div id="u153" class="u153" style="visibility:hidden;"  >
<div id="u153_rtf"></div>
</div>
</div>
<div id="u154" class="u154_container"   >
<div id="u154_img" class="u154_normal detectCanvas"></div>
<div id="u155" class="u155" style="visibility:hidden;"  >
<div id="u155_rtf"></div>
</div>
</div>
<div id="u156" class="u156_container"   >
<div id="u156_img" class="u156_normal detectCanvas"></div>
<div id="u157" class="u157" style="visibility:hidden;"  >
<div id="u157_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd0u57" style="" data-label="0">
<div id="u158" class="u158_container"   >
<div id="u158_img" class="u158_normal detectCanvas"></div>
<div id="u159" class="u159" style="visibility:hidden;"  >
<div id="u159_rtf"></div>
</div>
</div>
<div id="u160" class="u160_container"   >
<div id="u160_img" class="u160_normal detectCanvas"></div>
<div id="u161" class="u161" style="visibility:hidden;"  >
<div id="u161_rtf"></div>
</div>
</div>
<div id="u162" class="u162_container"   >
<div id="u162_img" class="u162_normal detectCanvas"></div>
<div id="u163" class="u163" style="visibility:hidden;"  >
<div id="u163_rtf"></div>
</div>
</div>
<div id="u164" class="u164_container"   >
<div id="u164_img" class="u164_normal detectCanvas"></div>
<div id="u165" class="u165" style="visibility:hidden;"  >
<div id="u165_rtf"></div>
</div>
</div>
<div id="u166" class="u166_container"   >
<div id="u166_img" class="u166_normal detectCanvas"></div>
<div id="u167" class="u167" style="visibility:hidden;"  >
<div id="u167_rtf"></div>
</div>
</div>
</DIV>
</DIV>
<div id="u168" class="u168"  data-label="text - h3">
<div id="u168_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#424242;">rating: </span></p></div>
</div>
<div id="u169" class="u169_container"   >
<div id="u169_img" class="u169_normal detectCanvas"></div>
<div id="u170" class="u170"  >
<div id="u170_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Order</span></p></div>
</div>
</div>
<div id="u171" class="u171_container"   >
<div id="u171_img" class="u171_normal detectCanvas"></div>
<div id="u172" class="u172"  >
<div id="u172_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">By price</span></p></div>
</div>
</div>
<div id="u173" class="u173_container"   >
<div id="u173_img" class="u173_normal detectCanvas"></div>
<div id="u174" class="u174"  >
<div id="u174_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">By rate</span></p></div>
</div>
</div>
<div id="u175" class="u175_container"   >
<div id="u175_img" class="u175_normal detectCanvas"></div>
<div id="u176" class="u176"  >
<div id="u176_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">By date</span></p></div>
</div>
</div><div id="u177" class="u177" >
<DIV id="u177_line" class="u177_line" ></DIV>
</div>
<div id="u178" class="u178_container"   >
<div id="u178_img" class="u178_normal detectCanvas"></div>
<div id="u179" class="u179" style="visibility:hidden;"  >
<div id="u179_rtf"></div>
</div>
</div>
<div id="u180" class="u180_container"   >
<div id="u180_img" class="u180_normal detectCanvas"></div>
<div id="u181" class="u181"  >
<div id="u181_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Auckland</span></p></div>
</div>
</div>
<div id="u182" class="u182_container"   data-label="Rectangle">
<div id="u182_img" class="u182_normal detectCanvas"></div>
<div id="u183" class="u183" style="visibility:hidden;"  >
<div id="u183_rtf"></div>
</div>
</div>
<div id="u184" class="u184_container"   data-label="Image">
<div id="u184_img" >
<img src="searchResult_files/Image_u48_normal.jpg"  class="raw_image"></div>
<div id="u185" class="u185" style="visibility:hidden;"  >
<div id="u185_rtf"></div>
</div>
</div>
<div id="u186" class="u186_container"   data-label="Rectangle">
<div id="u186_img" class="u186_normal detectCanvas"></div>
<div id="u187" class="u187" style="visibility:hidden;"  >
<div id="u187_rtf"></div>
</div>
</div>
<div id="u188" class="u188_container"   data-label="Rectangle">
<div id="u188_img" class="u188_normal detectCanvas"></div>
<div id="u189" class="u189"  >
<div id="u189_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Price: $12950</span></p></div>
</div>
</div>
<div id="u190" class="u190_container"   data-label="Button">
<div id="u190_img" class="u190_normal detectCanvas"></div>
<div id="u191" class="u191"  >
<div id="u191_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Add to cart</span></p></div>
</div>
</div>
<div id="u192" class="u192"  data-label="link">
<div id="u192_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Publication Manual of the American Psychological Association, 6th Edition [Paperback]</span></p></div>
</div>
<DIV id="u193" style="" data-label="Star ratings">
<DIV id="pd10u193" style="visibility:hidden;" data-label="5.set">
<div id="u194" class="u194_container"   >
<div id="u194_img" class="u194_normal detectCanvas"></div>
<div id="u195" class="u195" style="visibility:hidden;"  >
<div id="u195_rtf"></div>
</div>
</div>
<div id="u196" class="u196_container"   >
<div id="u196_img" class="u196_normal detectCanvas"></div>
<div id="u197" class="u197" style="visibility:hidden;"  >
<div id="u197_rtf"></div>
</div>
</div>
<div id="u198" class="u198_container"   >
<div id="u198_img" class="u198_normal detectCanvas"></div>
<div id="u199" class="u199" style="visibility:hidden;"  >
<div id="u199_rtf"></div>
</div>
</div>
<div id="u200" class="u200_container"   >
<div id="u200_img" class="u200_normal detectCanvas"></div>
<div id="u201" class="u201" style="visibility:hidden;"  >
<div id="u201_rtf"></div>
</div>
</div>
<div id="u202" class="u202_container"   >
<div id="u202_img" class="u202_normal detectCanvas"></div>
<div id="u203" class="u203" style="visibility:hidden;"  >
<div id="u203_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd9u193" style="visibility:hidden;" data-label="4.set">
<div id="u204" class="u204_container"   >
<div id="u204_img" class="u204_normal detectCanvas"></div>
<div id="u205" class="u205" style="visibility:hidden;"  >
<div id="u205_rtf"></div>
</div>
</div>
<div id="u206" class="u206_container"   >
<div id="u206_img" class="u206_normal detectCanvas"></div>
<div id="u207" class="u207" style="visibility:hidden;"  >
<div id="u207_rtf"></div>
</div>
</div>
<div id="u208" class="u208_container"   >
<div id="u208_img" class="u208_normal detectCanvas"></div>
<div id="u209" class="u209" style="visibility:hidden;"  >
<div id="u209_rtf"></div>
</div>
</div>
<div id="u210" class="u210_container"   >
<div id="u210_img" class="u210_normal detectCanvas"></div>
<div id="u211" class="u211" style="visibility:hidden;"  >
<div id="u211_rtf"></div>
</div>
</div>
<div id="u212" class="u212_container"   >
<div id="u212_img" class="u212_normal detectCanvas"></div>
<div id="u213" class="u213" style="visibility:hidden;"  >
<div id="u213_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd8u193" style="visibility:hidden;" data-label="3.set">
<div id="u214" class="u214_container"   >
<div id="u214_img" class="u214_normal detectCanvas"></div>
<div id="u215" class="u215" style="visibility:hidden;"  >
<div id="u215_rtf"></div>
</div>
</div>
<div id="u216" class="u216_container"   >
<div id="u216_img" class="u216_normal detectCanvas"></div>
<div id="u217" class="u217" style="visibility:hidden;"  >
<div id="u217_rtf"></div>
</div>
</div>
<div id="u218" class="u218_container"   >
<div id="u218_img" class="u218_normal detectCanvas"></div>
<div id="u219" class="u219" style="visibility:hidden;"  >
<div id="u219_rtf"></div>
</div>
</div>
<div id="u220" class="u220_container"   >
<div id="u220_img" class="u220_normal detectCanvas"></div>
<div id="u221" class="u221" style="visibility:hidden;"  >
<div id="u221_rtf"></div>
</div>
</div>
<div id="u222" class="u222_container"   >
<div id="u222_img" class="u222_normal detectCanvas"></div>
<div id="u223" class="u223" style="visibility:hidden;"  >
<div id="u223_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd7u193" style="visibility:hidden;" data-label="2.set">
<div id="u224" class="u224_container"   >
<div id="u224_img" class="u224_normal detectCanvas"></div>
<div id="u225" class="u225" style="visibility:hidden;"  >
<div id="u225_rtf"></div>
</div>
</div>
<div id="u226" class="u226_container"   >
<div id="u226_img" class="u226_normal detectCanvas"></div>
<div id="u227" class="u227" style="visibility:hidden;"  >
<div id="u227_rtf"></div>
</div>
</div>
<div id="u228" class="u228_container"   >
<div id="u228_img" class="u228_normal detectCanvas"></div>
<div id="u229" class="u229" style="visibility:hidden;"  >
<div id="u229_rtf"></div>
</div>
</div>
<div id="u230" class="u230_container"   >
<div id="u230_img" class="u230_normal detectCanvas"></div>
<div id="u231" class="u231" style="visibility:hidden;"  >
<div id="u231_rtf"></div>
</div>
</div>
<div id="u232" class="u232_container"   >
<div id="u232_img" class="u232_normal detectCanvas"></div>
<div id="u233" class="u233" style="visibility:hidden;"  >
<div id="u233_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd6u193" style="visibility:hidden;" data-label="1.set">
<div id="u234" class="u234_container"   >
<div id="u234_img" class="u234_normal detectCanvas"></div>
<div id="u235" class="u235" style="visibility:hidden;"  >
<div id="u235_rtf"></div>
</div>
</div>
<div id="u236" class="u236_container"   >
<div id="u236_img" class="u236_normal detectCanvas"></div>
<div id="u237" class="u237" style="visibility:hidden;"  >
<div id="u237_rtf"></div>
</div>
</div>
<div id="u238" class="u238_container"   >
<div id="u238_img" class="u238_normal detectCanvas"></div>
<div id="u239" class="u239" style="visibility:hidden;"  >
<div id="u239_rtf"></div>
</div>
</div>
<div id="u240" class="u240_container"   >
<div id="u240_img" class="u240_normal detectCanvas"></div>
<div id="u241" class="u241" style="visibility:hidden;"  >
<div id="u241_rtf"></div>
</div>
</div>
<div id="u242" class="u242_container"   >
<div id="u242_img" class="u242_normal detectCanvas"></div>
<div id="u243" class="u243" style="visibility:hidden;"  >
<div id="u243_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd5u193" style="visibility:hidden;" data-label="5">
<div id="u244" class="u244_container"   >
<div id="u244_img" class="u244_normal detectCanvas"></div>
<div id="u245" class="u245" style="visibility:hidden;"  >
<div id="u245_rtf"></div>
</div>
</div>
<div id="u246" class="u246_container"   >
<div id="u246_img" class="u246_normal detectCanvas"></div>
<div id="u247" class="u247" style="visibility:hidden;"  >
<div id="u247_rtf"></div>
</div>
</div>
<div id="u248" class="u248_container"   >
<div id="u248_img" class="u248_normal detectCanvas"></div>
<div id="u249" class="u249" style="visibility:hidden;"  >
<div id="u249_rtf"></div>
</div>
</div>
<div id="u250" class="u250_container"   >
<div id="u250_img" class="u250_normal detectCanvas"></div>
<div id="u251" class="u251" style="visibility:hidden;"  >
<div id="u251_rtf"></div>
</div>
</div>
<div id="u252" class="u252_container"   >
<div id="u252_img" class="u252_normal detectCanvas"></div>
<div id="u253" class="u253" style="visibility:hidden;"  >
<div id="u253_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd4u193" style="visibility:hidden;" data-label="4">
<div id="u254" class="u254_container"   >
<div id="u254_img" class="u254_normal detectCanvas"></div>
<div id="u255" class="u255" style="visibility:hidden;"  >
<div id="u255_rtf"></div>
</div>
</div>
<div id="u256" class="u256_container"   >
<div id="u256_img" class="u256_normal detectCanvas"></div>
<div id="u257" class="u257" style="visibility:hidden;"  >
<div id="u257_rtf"></div>
</div>
</div>
<div id="u258" class="u258_container"   >
<div id="u258_img" class="u258_normal detectCanvas"></div>
<div id="u259" class="u259" style="visibility:hidden;"  >
<div id="u259_rtf"></div>
</div>
</div>
<div id="u260" class="u260_container"   >
<div id="u260_img" class="u260_normal detectCanvas"></div>
<div id="u261" class="u261" style="visibility:hidden;"  >
<div id="u261_rtf"></div>
</div>
</div>
<div id="u262" class="u262_container"   >
<div id="u262_img" class="u262_normal detectCanvas"></div>
<div id="u263" class="u263" style="visibility:hidden;"  >
<div id="u263_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd3u193" style="visibility:hidden;" data-label="3">
<div id="u264" class="u264_container"   >
<div id="u264_img" class="u264_normal detectCanvas"></div>
<div id="u265" class="u265" style="visibility:hidden;"  >
<div id="u265_rtf"></div>
</div>
</div>
<div id="u266" class="u266_container"   >
<div id="u266_img" class="u266_normal detectCanvas"></div>
<div id="u267" class="u267" style="visibility:hidden;"  >
<div id="u267_rtf"></div>
</div>
</div>
<div id="u268" class="u268_container"   >
<div id="u268_img" class="u268_normal detectCanvas"></div>
<div id="u269" class="u269" style="visibility:hidden;"  >
<div id="u269_rtf"></div>
</div>
</div>
<div id="u270" class="u270_container"   >
<div id="u270_img" class="u270_normal detectCanvas"></div>
<div id="u271" class="u271" style="visibility:hidden;"  >
<div id="u271_rtf"></div>
</div>
</div>
<div id="u272" class="u272_container"   >
<div id="u272_img" class="u272_normal detectCanvas"></div>
<div id="u273" class="u273" style="visibility:hidden;"  >
<div id="u273_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd2u193" style="visibility:hidden;" data-label="2">
<div id="u274" class="u274_container"   >
<div id="u274_img" class="u274_normal detectCanvas"></div>
<div id="u275" class="u275" style="visibility:hidden;"  >
<div id="u275_rtf"></div>
</div>
</div>
<div id="u276" class="u276_container"   >
<div id="u276_img" class="u276_normal detectCanvas"></div>
<div id="u277" class="u277" style="visibility:hidden;"  >
<div id="u277_rtf"></div>
</div>
</div>
<div id="u278" class="u278_container"   >
<div id="u278_img" class="u278_normal detectCanvas"></div>
<div id="u279" class="u279" style="visibility:hidden;"  >
<div id="u279_rtf"></div>
</div>
</div>
<div id="u280" class="u280_container"   >
<div id="u280_img" class="u280_normal detectCanvas"></div>
<div id="u281" class="u281" style="visibility:hidden;"  >
<div id="u281_rtf"></div>
</div>
</div>
<div id="u282" class="u282_container"   >
<div id="u282_img" class="u282_normal detectCanvas"></div>
<div id="u283" class="u283" style="visibility:hidden;"  >
<div id="u283_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd1u193" style="visibility:hidden;" data-label="1">
<div id="u284" class="u284_container"   >
<div id="u284_img" class="u284_normal detectCanvas"></div>
<div id="u285" class="u285" style="visibility:hidden;"  >
<div id="u285_rtf"></div>
</div>
</div>
<div id="u286" class="u286_container"   >
<div id="u286_img" class="u286_normal detectCanvas"></div>
<div id="u287" class="u287" style="visibility:hidden;"  >
<div id="u287_rtf"></div>
</div>
</div>
<div id="u288" class="u288_container"   >
<div id="u288_img" class="u288_normal detectCanvas"></div>
<div id="u289" class="u289" style="visibility:hidden;"  >
<div id="u289_rtf"></div>
</div>
</div>
<div id="u290" class="u290_container"   >
<div id="u290_img" class="u290_normal detectCanvas"></div>
<div id="u291" class="u291" style="visibility:hidden;"  >
<div id="u291_rtf"></div>
</div>
</div>
<div id="u292" class="u292_container"   >
<div id="u292_img" class="u292_normal detectCanvas"></div>
<div id="u293" class="u293" style="visibility:hidden;"  >
<div id="u293_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd0u193" style="" data-label="0">
<div id="u294" class="u294_container"   >
<div id="u294_img" class="u294_normal detectCanvas"></div>
<div id="u295" class="u295" style="visibility:hidden;"  >
<div id="u295_rtf"></div>
</div>
</div>
<div id="u296" class="u296_container"   >
<div id="u296_img" class="u296_normal detectCanvas"></div>
<div id="u297" class="u297" style="visibility:hidden;"  >
<div id="u297_rtf"></div>
</div>
</div>
<div id="u298" class="u298_container"   >
<div id="u298_img" class="u298_normal detectCanvas"></div>
<div id="u299" class="u299" style="visibility:hidden;"  >
<div id="u299_rtf"></div>
</div>
</div>
<div id="u300" class="u300_container"   >
<div id="u300_img" class="u300_normal detectCanvas"></div>
<div id="u301" class="u301" style="visibility:hidden;"  >
<div id="u301_rtf"></div>
</div>
</div>
<div id="u302" class="u302_container"   >
<div id="u302_img" class="u302_normal detectCanvas"></div>
<div id="u303" class="u303" style="visibility:hidden;"  >
<div id="u303_rtf"></div>
</div>
</div>
</DIV>
</DIV>
<div id="u304" class="u304"  data-label="text - h3">
<div id="u304_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#424242;">rating: </span></p></div>
</div><div id="u305" class="u305" >
<DIV id="u305_line" class="u305_line" ></DIV>
</div>
<div id="u306" class="u306_container"   >
<div id="u306_img" class="u306_normal detectCanvas"></div>
<div id="u307" class="u307" style="visibility:hidden;"  >
<div id="u307_rtf"></div>
</div>
</div>
<div id="u308" class="u308_container"   >
<div id="u308_img" class="u308_normal detectCanvas"></div>
<div id="u309" class="u309"  >
<div id="u309_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Auckland</span></p></div>
</div>
</div>
<div id="u310" class="u310_container"   data-label="Rectangle">
<div id="u310_img" class="u310_normal detectCanvas"></div>
<div id="u311" class="u311" style="visibility:hidden;"  >
<div id="u311_rtf"></div>
</div>
</div>
<div id="u312" class="u312_container"   data-label="Image">
<div id="u312_img" >
<img src="searchResult_files/Image_u48_normal.jpg"  class="raw_image"></div>
<div id="u313" class="u313" style="visibility:hidden;"  >
<div id="u313_rtf"></div>
</div>
</div>
<div id="u314" class="u314_container"   data-label="Rectangle">
<div id="u314_img" class="u314_normal detectCanvas"></div>
<div id="u315" class="u315" style="visibility:hidden;"  >
<div id="u315_rtf"></div>
</div>
</div>
<div id="u316" class="u316_container"   data-label="Rectangle">
<div id="u316_img" class="u316_normal detectCanvas"></div>
<div id="u317" class="u317"  >
<div id="u317_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Price: $12950</span></p></div>
</div>
</div>
<div id="u318" class="u318_container"   data-label="Button">
<div id="u318_img" class="u318_normal detectCanvas"></div>
<div id="u319" class="u319"  >
<div id="u319_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Add to cart</span></p></div>
</div>
</div>
<div id="u320" class="u320"  data-label="link">
<div id="u320_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Publication Manual of the American Psychological Association, 6th Edition [Paperback]</span></p></div>
</div>
<DIV id="u321" style="" data-label="Star ratings">
<DIV id="pd10u321" style="visibility:hidden;" data-label="5.set">
<div id="u322" class="u322_container"   >
<div id="u322_img" class="u322_normal detectCanvas"></div>
<div id="u323" class="u323" style="visibility:hidden;"  >
<div id="u323_rtf"></div>
</div>
</div>
<div id="u324" class="u324_container"   >
<div id="u324_img" class="u324_normal detectCanvas"></div>
<div id="u325" class="u325" style="visibility:hidden;"  >
<div id="u325_rtf"></div>
</div>
</div>
<div id="u326" class="u326_container"   >
<div id="u326_img" class="u326_normal detectCanvas"></div>
<div id="u327" class="u327" style="visibility:hidden;"  >
<div id="u327_rtf"></div>
</div>
</div>
<div id="u328" class="u328_container"   >
<div id="u328_img" class="u328_normal detectCanvas"></div>
<div id="u329" class="u329" style="visibility:hidden;"  >
<div id="u329_rtf"></div>
</div>
</div>
<div id="u330" class="u330_container"   >
<div id="u330_img" class="u330_normal detectCanvas"></div>
<div id="u331" class="u331" style="visibility:hidden;"  >
<div id="u331_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd9u321" style="visibility:hidden;" data-label="4.set">
<div id="u332" class="u332_container"   >
<div id="u332_img" class="u332_normal detectCanvas"></div>
<div id="u333" class="u333" style="visibility:hidden;"  >
<div id="u333_rtf"></div>
</div>
</div>
<div id="u334" class="u334_container"   >
<div id="u334_img" class="u334_normal detectCanvas"></div>
<div id="u335" class="u335" style="visibility:hidden;"  >
<div id="u335_rtf"></div>
</div>
</div>
<div id="u336" class="u336_container"   >
<div id="u336_img" class="u336_normal detectCanvas"></div>
<div id="u337" class="u337" style="visibility:hidden;"  >
<div id="u337_rtf"></div>
</div>
</div>
<div id="u338" class="u338_container"   >
<div id="u338_img" class="u338_normal detectCanvas"></div>
<div id="u339" class="u339" style="visibility:hidden;"  >
<div id="u339_rtf"></div>
</div>
</div>
<div id="u340" class="u340_container"   >
<div id="u340_img" class="u340_normal detectCanvas"></div>
<div id="u341" class="u341" style="visibility:hidden;"  >
<div id="u341_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd8u321" style="visibility:hidden;" data-label="3.set">
<div id="u342" class="u342_container"   >
<div id="u342_img" class="u342_normal detectCanvas"></div>
<div id="u343" class="u343" style="visibility:hidden;"  >
<div id="u343_rtf"></div>
</div>
</div>
<div id="u344" class="u344_container"   >
<div id="u344_img" class="u344_normal detectCanvas"></div>
<div id="u345" class="u345" style="visibility:hidden;"  >
<div id="u345_rtf"></div>
</div>
</div>
<div id="u346" class="u346_container"   >
<div id="u346_img" class="u346_normal detectCanvas"></div>
<div id="u347" class="u347" style="visibility:hidden;"  >
<div id="u347_rtf"></div>
</div>
</div>
<div id="u348" class="u348_container"   >
<div id="u348_img" class="u348_normal detectCanvas"></div>
<div id="u349" class="u349" style="visibility:hidden;"  >
<div id="u349_rtf"></div>
</div>
</div>
<div id="u350" class="u350_container"   >
<div id="u350_img" class="u350_normal detectCanvas"></div>
<div id="u351" class="u351" style="visibility:hidden;"  >
<div id="u351_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd7u321" style="visibility:hidden;" data-label="2.set">
<div id="u352" class="u352_container"   >
<div id="u352_img" class="u352_normal detectCanvas"></div>
<div id="u353" class="u353" style="visibility:hidden;"  >
<div id="u353_rtf"></div>
</div>
</div>
<div id="u354" class="u354_container"   >
<div id="u354_img" class="u354_normal detectCanvas"></div>
<div id="u355" class="u355" style="visibility:hidden;"  >
<div id="u355_rtf"></div>
</div>
</div>
<div id="u356" class="u356_container"   >
<div id="u356_img" class="u356_normal detectCanvas"></div>
<div id="u357" class="u357" style="visibility:hidden;"  >
<div id="u357_rtf"></div>
</div>
</div>
<div id="u358" class="u358_container"   >
<div id="u358_img" class="u358_normal detectCanvas"></div>
<div id="u359" class="u359" style="visibility:hidden;"  >
<div id="u359_rtf"></div>
</div>
</div>
<div id="u360" class="u360_container"   >
<div id="u360_img" class="u360_normal detectCanvas"></div>
<div id="u361" class="u361" style="visibility:hidden;"  >
<div id="u361_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd6u321" style="visibility:hidden;" data-label="1.set">
<div id="u362" class="u362_container"   >
<div id="u362_img" class="u362_normal detectCanvas"></div>
<div id="u363" class="u363" style="visibility:hidden;"  >
<div id="u363_rtf"></div>
</div>
</div>
<div id="u364" class="u364_container"   >
<div id="u364_img" class="u364_normal detectCanvas"></div>
<div id="u365" class="u365" style="visibility:hidden;"  >
<div id="u365_rtf"></div>
</div>
</div>
<div id="u366" class="u366_container"   >
<div id="u366_img" class="u366_normal detectCanvas"></div>
<div id="u367" class="u367" style="visibility:hidden;"  >
<div id="u367_rtf"></div>
</div>
</div>
<div id="u368" class="u368_container"   >
<div id="u368_img" class="u368_normal detectCanvas"></div>
<div id="u369" class="u369" style="visibility:hidden;"  >
<div id="u369_rtf"></div>
</div>
</div>
<div id="u370" class="u370_container"   >
<div id="u370_img" class="u370_normal detectCanvas"></div>
<div id="u371" class="u371" style="visibility:hidden;"  >
<div id="u371_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd5u321" style="visibility:hidden;" data-label="5">
<div id="u372" class="u372_container"   >
<div id="u372_img" class="u372_normal detectCanvas"></div>
<div id="u373" class="u373" style="visibility:hidden;"  >
<div id="u373_rtf"></div>
</div>
</div>
<div id="u374" class="u374_container"   >
<div id="u374_img" class="u374_normal detectCanvas"></div>
<div id="u375" class="u375" style="visibility:hidden;"  >
<div id="u375_rtf"></div>
</div>
</div>
<div id="u376" class="u376_container"   >
<div id="u376_img" class="u376_normal detectCanvas"></div>
<div id="u377" class="u377" style="visibility:hidden;"  >
<div id="u377_rtf"></div>
</div>
</div>
<div id="u378" class="u378_container"   >
<div id="u378_img" class="u378_normal detectCanvas"></div>
<div id="u379" class="u379" style="visibility:hidden;"  >
<div id="u379_rtf"></div>
</div>
</div>
<div id="u380" class="u380_container"   >
<div id="u380_img" class="u380_normal detectCanvas"></div>
<div id="u381" class="u381" style="visibility:hidden;"  >
<div id="u381_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd4u321" style="visibility:hidden;" data-label="4">
<div id="u382" class="u382_container"   >
<div id="u382_img" class="u382_normal detectCanvas"></div>
<div id="u383" class="u383" style="visibility:hidden;"  >
<div id="u383_rtf"></div>
</div>
</div>
<div id="u384" class="u384_container"   >
<div id="u384_img" class="u384_normal detectCanvas"></div>
<div id="u385" class="u385" style="visibility:hidden;"  >
<div id="u385_rtf"></div>
</div>
</div>
<div id="u386" class="u386_container"   >
<div id="u386_img" class="u386_normal detectCanvas"></div>
<div id="u387" class="u387" style="visibility:hidden;"  >
<div id="u387_rtf"></div>
</div>
</div>
<div id="u388" class="u388_container"   >
<div id="u388_img" class="u388_normal detectCanvas"></div>
<div id="u389" class="u389" style="visibility:hidden;"  >
<div id="u389_rtf"></div>
</div>
</div>
<div id="u390" class="u390_container"   >
<div id="u390_img" class="u390_normal detectCanvas"></div>
<div id="u391" class="u391" style="visibility:hidden;"  >
<div id="u391_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd3u321" style="visibility:hidden;" data-label="3">
<div id="u392" class="u392_container"   >
<div id="u392_img" class="u392_normal detectCanvas"></div>
<div id="u393" class="u393" style="visibility:hidden;"  >
<div id="u393_rtf"></div>
</div>
</div>
<div id="u394" class="u394_container"   >
<div id="u394_img" class="u394_normal detectCanvas"></div>
<div id="u395" class="u395" style="visibility:hidden;"  >
<div id="u395_rtf"></div>
</div>
</div>
<div id="u396" class="u396_container"   >
<div id="u396_img" class="u396_normal detectCanvas"></div>
<div id="u397" class="u397" style="visibility:hidden;"  >
<div id="u397_rtf"></div>
</div>
</div>
<div id="u398" class="u398_container"   >
<div id="u398_img" class="u398_normal detectCanvas"></div>
<div id="u399" class="u399" style="visibility:hidden;"  >
<div id="u399_rtf"></div>
</div>
</div>
<div id="u400" class="u400_container"   >
<div id="u400_img" class="u400_normal detectCanvas"></div>
<div id="u401" class="u401" style="visibility:hidden;"  >
<div id="u401_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd2u321" style="visibility:hidden;" data-label="2">
<div id="u402" class="u402_container"   >
<div id="u402_img" class="u402_normal detectCanvas"></div>
<div id="u403" class="u403" style="visibility:hidden;"  >
<div id="u403_rtf"></div>
</div>
</div>
<div id="u404" class="u404_container"   >
<div id="u404_img" class="u404_normal detectCanvas"></div>
<div id="u405" class="u405" style="visibility:hidden;"  >
<div id="u405_rtf"></div>
</div>
</div>
<div id="u406" class="u406_container"   >
<div id="u406_img" class="u406_normal detectCanvas"></div>
<div id="u407" class="u407" style="visibility:hidden;"  >
<div id="u407_rtf"></div>
</div>
</div>
<div id="u408" class="u408_container"   >
<div id="u408_img" class="u408_normal detectCanvas"></div>
<div id="u409" class="u409" style="visibility:hidden;"  >
<div id="u409_rtf"></div>
</div>
</div>
<div id="u410" class="u410_container"   >
<div id="u410_img" class="u410_normal detectCanvas"></div>
<div id="u411" class="u411" style="visibility:hidden;"  >
<div id="u411_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd1u321" style="visibility:hidden;" data-label="1">
<div id="u412" class="u412_container"   >
<div id="u412_img" class="u412_normal detectCanvas"></div>
<div id="u413" class="u413" style="visibility:hidden;"  >
<div id="u413_rtf"></div>
</div>
</div>
<div id="u414" class="u414_container"   >
<div id="u414_img" class="u414_normal detectCanvas"></div>
<div id="u415" class="u415" style="visibility:hidden;"  >
<div id="u415_rtf"></div>
</div>
</div>
<div id="u416" class="u416_container"   >
<div id="u416_img" class="u416_normal detectCanvas"></div>
<div id="u417" class="u417" style="visibility:hidden;"  >
<div id="u417_rtf"></div>
</div>
</div>
<div id="u418" class="u418_container"   >
<div id="u418_img" class="u418_normal detectCanvas"></div>
<div id="u419" class="u419" style="visibility:hidden;"  >
<div id="u419_rtf"></div>
</div>
</div>
<div id="u420" class="u420_container"   >
<div id="u420_img" class="u420_normal detectCanvas"></div>
<div id="u421" class="u421" style="visibility:hidden;"  >
<div id="u421_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd0u321" style="" data-label="0">
<div id="u422" class="u422_container"   >
<div id="u422_img" class="u422_normal detectCanvas"></div>
<div id="u423" class="u423" style="visibility:hidden;"  >
<div id="u423_rtf"></div>
</div>
</div>
<div id="u424" class="u424_container"   >
<div id="u424_img" class="u424_normal detectCanvas"></div>
<div id="u425" class="u425" style="visibility:hidden;"  >
<div id="u425_rtf"></div>
</div>
</div>
<div id="u426" class="u426_container"   >
<div id="u426_img" class="u426_normal detectCanvas"></div>
<div id="u427" class="u427" style="visibility:hidden;"  >
<div id="u427_rtf"></div>
</div>
</div>
<div id="u428" class="u428_container"   >
<div id="u428_img" class="u428_normal detectCanvas"></div>
<div id="u429" class="u429" style="visibility:hidden;"  >
<div id="u429_rtf"></div>
</div>
</div>
<div id="u430" class="u430_container"   >
<div id="u430_img" class="u430_normal detectCanvas"></div>
<div id="u431" class="u431" style="visibility:hidden;"  >
<div id="u431_rtf"></div>
</div>
</div>
</DIV>
</DIV>
<div id="u432" class="u432"  data-label="text - h3">
<div id="u432_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#424242;">rating: </span></p></div>
</div><div id="u433" class="u433" >
<DIV id="u433_line" class="u433_line" ></DIV>
</div>
<div id="u434" class="u434_container"   >
<div id="u434_img" class="u434_normal detectCanvas"></div>
<div id="u435" class="u435" style="visibility:hidden;"  >
<div id="u435_rtf"></div>
</div>
</div>
<div id="u436" class="u436_container"   >
<div id="u436_img" class="u436_normal detectCanvas"></div>
<div id="u437" class="u437"  >
<div id="u437_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Auckland</span></p></div>
</div>
</div>
<div id="u438" class="u438_container"   data-label="Rectangle">
<div id="u438_img" class="u438_normal detectCanvas"></div>
<div id="u439" class="u439" style="visibility:hidden;"  >
<div id="u439_rtf"></div>
</div>
</div>
<div id="u440" class="u440_container"   data-label="Image">
<div id="u440_img" >
<img src="searchResult_files/Image_u48_normal.jpg"  class="raw_image"></div>
<div id="u441" class="u441" style="visibility:hidden;"  >
<div id="u441_rtf"></div>
</div>
</div>
<div id="u442" class="u442_container"   data-label="Rectangle">
<div id="u442_img" class="u442_normal detectCanvas"></div>
<div id="u443" class="u443" style="visibility:hidden;"  >
<div id="u443_rtf"></div>
</div>
</div>
<div id="u444" class="u444_container"   data-label="Rectangle">
<div id="u444_img" class="u444_normal detectCanvas"></div>
<div id="u445" class="u445"  >
<div id="u445_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Price: $12950</span></p></div>
</div>
</div>
<div id="u446" class="u446_container"   data-label="Button">
<div id="u446_img" class="u446_normal detectCanvas"></div>
<div id="u447" class="u447"  >
<div id="u447_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Add to cart</span></p></div>
</div>
</div>
<div id="u448" class="u448"  data-label="link">
<div id="u448_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Publication Manual of the American Psychological Association, 6th Edition [Paperback]</span></p></div>
</div>
<DIV id="u449" style="" data-label="Star ratings">
<DIV id="pd10u449" style="visibility:hidden;" data-label="5.set">
<div id="u450" class="u450_container"   >
<div id="u450_img" class="u450_normal detectCanvas"></div>
<div id="u451" class="u451" style="visibility:hidden;"  >
<div id="u451_rtf"></div>
</div>
</div>
<div id="u452" class="u452_container"   >
<div id="u452_img" class="u452_normal detectCanvas"></div>
<div id="u453" class="u453" style="visibility:hidden;"  >
<div id="u453_rtf"></div>
</div>
</div>
<div id="u454" class="u454_container"   >
<div id="u454_img" class="u454_normal detectCanvas"></div>
<div id="u455" class="u455" style="visibility:hidden;"  >
<div id="u455_rtf"></div>
</div>
</div>
<div id="u456" class="u456_container"   >
<div id="u456_img" class="u456_normal detectCanvas"></div>
<div id="u457" class="u457" style="visibility:hidden;"  >
<div id="u457_rtf"></div>
</div>
</div>
<div id="u458" class="u458_container"   >
<div id="u458_img" class="u458_normal detectCanvas"></div>
<div id="u459" class="u459" style="visibility:hidden;"  >
<div id="u459_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd9u449" style="visibility:hidden;" data-label="4.set">
<div id="u460" class="u460_container"   >
<div id="u460_img" class="u460_normal detectCanvas"></div>
<div id="u461" class="u461" style="visibility:hidden;"  >
<div id="u461_rtf"></div>
</div>
</div>
<div id="u462" class="u462_container"   >
<div id="u462_img" class="u462_normal detectCanvas"></div>
<div id="u463" class="u463" style="visibility:hidden;"  >
<div id="u463_rtf"></div>
</div>
</div>
<div id="u464" class="u464_container"   >
<div id="u464_img" class="u464_normal detectCanvas"></div>
<div id="u465" class="u465" style="visibility:hidden;"  >
<div id="u465_rtf"></div>
</div>
</div>
<div id="u466" class="u466_container"   >
<div id="u466_img" class="u466_normal detectCanvas"></div>
<div id="u467" class="u467" style="visibility:hidden;"  >
<div id="u467_rtf"></div>
</div>
</div>
<div id="u468" class="u468_container"   >
<div id="u468_img" class="u468_normal detectCanvas"></div>
<div id="u469" class="u469" style="visibility:hidden;"  >
<div id="u469_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd8u449" style="visibility:hidden;" data-label="3.set">
<div id="u470" class="u470_container"   >
<div id="u470_img" class="u470_normal detectCanvas"></div>
<div id="u471" class="u471" style="visibility:hidden;"  >
<div id="u471_rtf"></div>
</div>
</div>
<div id="u472" class="u472_container"   >
<div id="u472_img" class="u472_normal detectCanvas"></div>
<div id="u473" class="u473" style="visibility:hidden;"  >
<div id="u473_rtf"></div>
</div>
</div>
<div id="u474" class="u474_container"   >
<div id="u474_img" class="u474_normal detectCanvas"></div>
<div id="u475" class="u475" style="visibility:hidden;"  >
<div id="u475_rtf"></div>
</div>
</div>
<div id="u476" class="u476_container"   >
<div id="u476_img" class="u476_normal detectCanvas"></div>
<div id="u477" class="u477" style="visibility:hidden;"  >
<div id="u477_rtf"></div>
</div>
</div>
<div id="u478" class="u478_container"   >
<div id="u478_img" class="u478_normal detectCanvas"></div>
<div id="u479" class="u479" style="visibility:hidden;"  >
<div id="u479_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd7u449" style="visibility:hidden;" data-label="2.set">
<div id="u480" class="u480_container"   >
<div id="u480_img" class="u480_normal detectCanvas"></div>
<div id="u481" class="u481" style="visibility:hidden;"  >
<div id="u481_rtf"></div>
</div>
</div>
<div id="u482" class="u482_container"   >
<div id="u482_img" class="u482_normal detectCanvas"></div>
<div id="u483" class="u483" style="visibility:hidden;"  >
<div id="u483_rtf"></div>
</div>
</div>
<div id="u484" class="u484_container"   >
<div id="u484_img" class="u484_normal detectCanvas"></div>
<div id="u485" class="u485" style="visibility:hidden;"  >
<div id="u485_rtf"></div>
</div>
</div>
<div id="u486" class="u486_container"   >
<div id="u486_img" class="u486_normal detectCanvas"></div>
<div id="u487" class="u487" style="visibility:hidden;"  >
<div id="u487_rtf"></div>
</div>
</div>
<div id="u488" class="u488_container"   >
<div id="u488_img" class="u488_normal detectCanvas"></div>
<div id="u489" class="u489" style="visibility:hidden;"  >
<div id="u489_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd6u449" style="visibility:hidden;" data-label="1.set">
<div id="u490" class="u490_container"   >
<div id="u490_img" class="u490_normal detectCanvas"></div>
<div id="u491" class="u491" style="visibility:hidden;"  >
<div id="u491_rtf"></div>
</div>
</div>
<div id="u492" class="u492_container"   >
<div id="u492_img" class="u492_normal detectCanvas"></div>
<div id="u493" class="u493" style="visibility:hidden;"  >
<div id="u493_rtf"></div>
</div>
</div>
<div id="u494" class="u494_container"   >
<div id="u494_img" class="u494_normal detectCanvas"></div>
<div id="u495" class="u495" style="visibility:hidden;"  >
<div id="u495_rtf"></div>
</div>
</div>
<div id="u496" class="u496_container"   >
<div id="u496_img" class="u496_normal detectCanvas"></div>
<div id="u497" class="u497" style="visibility:hidden;"  >
<div id="u497_rtf"></div>
</div>
</div>
<div id="u498" class="u498_container"   >
<div id="u498_img" class="u498_normal detectCanvas"></div>
<div id="u499" class="u499" style="visibility:hidden;"  >
<div id="u499_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd5u449" style="visibility:hidden;" data-label="5">
<div id="u500" class="u500_container"   >
<div id="u500_img" class="u500_normal detectCanvas"></div>
<div id="u501" class="u501" style="visibility:hidden;"  >
<div id="u501_rtf"></div>
</div>
</div>
<div id="u502" class="u502_container"   >
<div id="u502_img" class="u502_normal detectCanvas"></div>
<div id="u503" class="u503" style="visibility:hidden;"  >
<div id="u503_rtf"></div>
</div>
</div>
<div id="u504" class="u504_container"   >
<div id="u504_img" class="u504_normal detectCanvas"></div>
<div id="u505" class="u505" style="visibility:hidden;"  >
<div id="u505_rtf"></div>
</div>
</div>
<div id="u506" class="u506_container"   >
<div id="u506_img" class="u506_normal detectCanvas"></div>
<div id="u507" class="u507" style="visibility:hidden;"  >
<div id="u507_rtf"></div>
</div>
</div>
<div id="u508" class="u508_container"   >
<div id="u508_img" class="u508_normal detectCanvas"></div>
<div id="u509" class="u509" style="visibility:hidden;"  >
<div id="u509_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd4u449" style="visibility:hidden;" data-label="4">
<div id="u510" class="u510_container"   >
<div id="u510_img" class="u510_normal detectCanvas"></div>
<div id="u511" class="u511" style="visibility:hidden;"  >
<div id="u511_rtf"></div>
</div>
</div>
<div id="u512" class="u512_container"   >
<div id="u512_img" class="u512_normal detectCanvas"></div>
<div id="u513" class="u513" style="visibility:hidden;"  >
<div id="u513_rtf"></div>
</div>
</div>
<div id="u514" class="u514_container"   >
<div id="u514_img" class="u514_normal detectCanvas"></div>
<div id="u515" class="u515" style="visibility:hidden;"  >
<div id="u515_rtf"></div>
</div>
</div>
<div id="u516" class="u516_container"   >
<div id="u516_img" class="u516_normal detectCanvas"></div>
<div id="u517" class="u517" style="visibility:hidden;"  >
<div id="u517_rtf"></div>
</div>
</div>
<div id="u518" class="u518_container"   >
<div id="u518_img" class="u518_normal detectCanvas"></div>
<div id="u519" class="u519" style="visibility:hidden;"  >
<div id="u519_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd3u449" style="visibility:hidden;" data-label="3">
<div id="u520" class="u520_container"   >
<div id="u520_img" class="u520_normal detectCanvas"></div>
<div id="u521" class="u521" style="visibility:hidden;"  >
<div id="u521_rtf"></div>
</div>
</div>
<div id="u522" class="u522_container"   >
<div id="u522_img" class="u522_normal detectCanvas"></div>
<div id="u523" class="u523" style="visibility:hidden;"  >
<div id="u523_rtf"></div>
</div>
</div>
<div id="u524" class="u524_container"   >
<div id="u524_img" class="u524_normal detectCanvas"></div>
<div id="u525" class="u525" style="visibility:hidden;"  >
<div id="u525_rtf"></div>
</div>
</div>
<div id="u526" class="u526_container"   >
<div id="u526_img" class="u526_normal detectCanvas"></div>
<div id="u527" class="u527" style="visibility:hidden;"  >
<div id="u527_rtf"></div>
</div>
</div>
<div id="u528" class="u528_container"   >
<div id="u528_img" class="u528_normal detectCanvas"></div>
<div id="u529" class="u529" style="visibility:hidden;"  >
<div id="u529_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd2u449" style="visibility:hidden;" data-label="2">
<div id="u530" class="u530_container"   >
<div id="u530_img" class="u530_normal detectCanvas"></div>
<div id="u531" class="u531" style="visibility:hidden;"  >
<div id="u531_rtf"></div>
</div>
</div>
<div id="u532" class="u532_container"   >
<div id="u532_img" class="u532_normal detectCanvas"></div>
<div id="u533" class="u533" style="visibility:hidden;"  >
<div id="u533_rtf"></div>
</div>
</div>
<div id="u534" class="u534_container"   >
<div id="u534_img" class="u534_normal detectCanvas"></div>
<div id="u535" class="u535" style="visibility:hidden;"  >
<div id="u535_rtf"></div>
</div>
</div>
<div id="u536" class="u536_container"   >
<div id="u536_img" class="u536_normal detectCanvas"></div>
<div id="u537" class="u537" style="visibility:hidden;"  >
<div id="u537_rtf"></div>
</div>
</div>
<div id="u538" class="u538_container"   >
<div id="u538_img" class="u538_normal detectCanvas"></div>
<div id="u539" class="u539" style="visibility:hidden;"  >
<div id="u539_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd1u449" style="visibility:hidden;" data-label="1">
<div id="u540" class="u540_container"   >
<div id="u540_img" class="u540_normal detectCanvas"></div>
<div id="u541" class="u541" style="visibility:hidden;"  >
<div id="u541_rtf"></div>
</div>
</div>
<div id="u542" class="u542_container"   >
<div id="u542_img" class="u542_normal detectCanvas"></div>
<div id="u543" class="u543" style="visibility:hidden;"  >
<div id="u543_rtf"></div>
</div>
</div>
<div id="u544" class="u544_container"   >
<div id="u544_img" class="u544_normal detectCanvas"></div>
<div id="u545" class="u545" style="visibility:hidden;"  >
<div id="u545_rtf"></div>
</div>
</div>
<div id="u546" class="u546_container"   >
<div id="u546_img" class="u546_normal detectCanvas"></div>
<div id="u547" class="u547" style="visibility:hidden;"  >
<div id="u547_rtf"></div>
</div>
</div>
<div id="u548" class="u548_container"   >
<div id="u548_img" class="u548_normal detectCanvas"></div>
<div id="u549" class="u549" style="visibility:hidden;"  >
<div id="u549_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd0u449" style="" data-label="0">
<div id="u550" class="u550_container"   >
<div id="u550_img" class="u550_normal detectCanvas"></div>
<div id="u551" class="u551" style="visibility:hidden;"  >
<div id="u551_rtf"></div>
</div>
</div>
<div id="u552" class="u552_container"   >
<div id="u552_img" class="u552_normal detectCanvas"></div>
<div id="u553" class="u553" style="visibility:hidden;"  >
<div id="u553_rtf"></div>
</div>
</div>
<div id="u554" class="u554_container"   >
<div id="u554_img" class="u554_normal detectCanvas"></div>
<div id="u555" class="u555" style="visibility:hidden;"  >
<div id="u555_rtf"></div>
</div>
</div>
<div id="u556" class="u556_container"   >
<div id="u556_img" class="u556_normal detectCanvas"></div>
<div id="u557" class="u557" style="visibility:hidden;"  >
<div id="u557_rtf"></div>
</div>
</div>
<div id="u558" class="u558_container"   >
<div id="u558_img" class="u558_normal detectCanvas"></div>
<div id="u559" class="u559" style="visibility:hidden;"  >
<div id="u559_rtf"></div>
</div>
</div>
</DIV>
</DIV>
<div id="u560" class="u560"  data-label="text - h3">
<div id="u560_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#424242;">rating: </span></p></div>
</div><div id="u561" class="u561" >
<DIV id="u561_line" class="u561_line" ></DIV>
</div>
<div id="u562" class="u562_container"   >
<div id="u562_img" class="u562_normal detectCanvas"></div>
<div id="u563" class="u563" style="visibility:hidden;"  >
<div id="u563_rtf"></div>
</div>
</div>
<div id="u564" class="u564_container"   >
<div id="u564_img" class="u564_normal detectCanvas"></div>
<div id="u565" class="u565"  >
<div id="u565_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Auckland</span></p></div>
</div>
</div>
<div id="u566" class="u566_container"   data-label="Rectangle">
<div id="u566_img" class="u566_normal detectCanvas"></div>
<div id="u567" class="u567" style="visibility:hidden;"  >
<div id="u567_rtf"></div>
</div>
</div>
<div id="u568" class="u568_container"   data-label="Image">
<div id="u568_img" >
<img src="searchResult_files/Image_u48_normal.jpg"  class="raw_image"></div>
<div id="u569" class="u569" style="visibility:hidden;"  >
<div id="u569_rtf"></div>
</div>
</div>
<div id="u570" class="u570_container"   data-label="Rectangle">
<div id="u570_img" class="u570_normal detectCanvas"></div>
<div id="u571" class="u571" style="visibility:hidden;"  >
<div id="u571_rtf"></div>
</div>
</div>
<div id="u572" class="u572_container"   data-label="Rectangle">
<div id="u572_img" class="u572_normal detectCanvas"></div>
<div id="u573" class="u573"  >
<div id="u573_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Price: $12950</span></p></div>
</div>
</div>
<div id="u574" class="u574_container"   data-label="Button">
<div id="u574_img" class="u574_normal detectCanvas"></div>
<div id="u575" class="u575"  >
<div id="u575_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Add to cart</span></p></div>
</div>
</div>
<div id="u576" class="u576"  data-label="link">
<div id="u576_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Publication Manual of the American Psychological Association, 6th Edition [Paperback]</span></p></div>
</div>
<DIV id="u577" style="" data-label="Star ratings">
<DIV id="pd10u577" style="visibility:hidden;" data-label="5.set">
<div id="u578" class="u578_container"   >
<div id="u578_img" class="u578_normal detectCanvas"></div>
<div id="u579" class="u579" style="visibility:hidden;"  >
<div id="u579_rtf"></div>
</div>
</div>
<div id="u580" class="u580_container"   >
<div id="u580_img" class="u580_normal detectCanvas"></div>
<div id="u581" class="u581" style="visibility:hidden;"  >
<div id="u581_rtf"></div>
</div>
</div>
<div id="u582" class="u582_container"   >
<div id="u582_img" class="u582_normal detectCanvas"></div>
<div id="u583" class="u583" style="visibility:hidden;"  >
<div id="u583_rtf"></div>
</div>
</div>
<div id="u584" class="u584_container"   >
<div id="u584_img" class="u584_normal detectCanvas"></div>
<div id="u585" class="u585" style="visibility:hidden;"  >
<div id="u585_rtf"></div>
</div>
</div>
<div id="u586" class="u586_container"   >
<div id="u586_img" class="u586_normal detectCanvas"></div>
<div id="u587" class="u587" style="visibility:hidden;"  >
<div id="u587_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd9u577" style="visibility:hidden;" data-label="4.set">
<div id="u588" class="u588_container"   >
<div id="u588_img" class="u588_normal detectCanvas"></div>
<div id="u589" class="u589" style="visibility:hidden;"  >
<div id="u589_rtf"></div>
</div>
</div>
<div id="u590" class="u590_container"   >
<div id="u590_img" class="u590_normal detectCanvas"></div>
<div id="u591" class="u591" style="visibility:hidden;"  >
<div id="u591_rtf"></div>
</div>
</div>
<div id="u592" class="u592_container"   >
<div id="u592_img" class="u592_normal detectCanvas"></div>
<div id="u593" class="u593" style="visibility:hidden;"  >
<div id="u593_rtf"></div>
</div>
</div>
<div id="u594" class="u594_container"   >
<div id="u594_img" class="u594_normal detectCanvas"></div>
<div id="u595" class="u595" style="visibility:hidden;"  >
<div id="u595_rtf"></div>
</div>
</div>
<div id="u596" class="u596_container"   >
<div id="u596_img" class="u596_normal detectCanvas"></div>
<div id="u597" class="u597" style="visibility:hidden;"  >
<div id="u597_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd8u577" style="visibility:hidden;" data-label="3.set">
<div id="u598" class="u598_container"   >
<div id="u598_img" class="u598_normal detectCanvas"></div>
<div id="u599" class="u599" style="visibility:hidden;"  >
<div id="u599_rtf"></div>
</div>
</div>
<div id="u600" class="u600_container"   >
<div id="u600_img" class="u600_normal detectCanvas"></div>
<div id="u601" class="u601" style="visibility:hidden;"  >
<div id="u601_rtf"></div>
</div>
</div>
<div id="u602" class="u602_container"   >
<div id="u602_img" class="u602_normal detectCanvas"></div>
<div id="u603" class="u603" style="visibility:hidden;"  >
<div id="u603_rtf"></div>
</div>
</div>
<div id="u604" class="u604_container"   >
<div id="u604_img" class="u604_normal detectCanvas"></div>
<div id="u605" class="u605" style="visibility:hidden;"  >
<div id="u605_rtf"></div>
</div>
</div>
<div id="u606" class="u606_container"   >
<div id="u606_img" class="u606_normal detectCanvas"></div>
<div id="u607" class="u607" style="visibility:hidden;"  >
<div id="u607_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd7u577" style="visibility:hidden;" data-label="2.set">
<div id="u608" class="u608_container"   >
<div id="u608_img" class="u608_normal detectCanvas"></div>
<div id="u609" class="u609" style="visibility:hidden;"  >
<div id="u609_rtf"></div>
</div>
</div>
<div id="u610" class="u610_container"   >
<div id="u610_img" class="u610_normal detectCanvas"></div>
<div id="u611" class="u611" style="visibility:hidden;"  >
<div id="u611_rtf"></div>
</div>
</div>
<div id="u612" class="u612_container"   >
<div id="u612_img" class="u612_normal detectCanvas"></div>
<div id="u613" class="u613" style="visibility:hidden;"  >
<div id="u613_rtf"></div>
</div>
</div>
<div id="u614" class="u614_container"   >
<div id="u614_img" class="u614_normal detectCanvas"></div>
<div id="u615" class="u615" style="visibility:hidden;"  >
<div id="u615_rtf"></div>
</div>
</div>
<div id="u616" class="u616_container"   >
<div id="u616_img" class="u616_normal detectCanvas"></div>
<div id="u617" class="u617" style="visibility:hidden;"  >
<div id="u617_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd6u577" style="visibility:hidden;" data-label="1.set">
<div id="u618" class="u618_container"   >
<div id="u618_img" class="u618_normal detectCanvas"></div>
<div id="u619" class="u619" style="visibility:hidden;"  >
<div id="u619_rtf"></div>
</div>
</div>
<div id="u620" class="u620_container"   >
<div id="u620_img" class="u620_normal detectCanvas"></div>
<div id="u621" class="u621" style="visibility:hidden;"  >
<div id="u621_rtf"></div>
</div>
</div>
<div id="u622" class="u622_container"   >
<div id="u622_img" class="u622_normal detectCanvas"></div>
<div id="u623" class="u623" style="visibility:hidden;"  >
<div id="u623_rtf"></div>
</div>
</div>
<div id="u624" class="u624_container"   >
<div id="u624_img" class="u624_normal detectCanvas"></div>
<div id="u625" class="u625" style="visibility:hidden;"  >
<div id="u625_rtf"></div>
</div>
</div>
<div id="u626" class="u626_container"   >
<div id="u626_img" class="u626_normal detectCanvas"></div>
<div id="u627" class="u627" style="visibility:hidden;"  >
<div id="u627_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd5u577" style="visibility:hidden;" data-label="5">
<div id="u628" class="u628_container"   >
<div id="u628_img" class="u628_normal detectCanvas"></div>
<div id="u629" class="u629" style="visibility:hidden;"  >
<div id="u629_rtf"></div>
</div>
</div>
<div id="u630" class="u630_container"   >
<div id="u630_img" class="u630_normal detectCanvas"></div>
<div id="u631" class="u631" style="visibility:hidden;"  >
<div id="u631_rtf"></div>
</div>
</div>
<div id="u632" class="u632_container"   >
<div id="u632_img" class="u632_normal detectCanvas"></div>
<div id="u633" class="u633" style="visibility:hidden;"  >
<div id="u633_rtf"></div>
</div>
</div>
<div id="u634" class="u634_container"   >
<div id="u634_img" class="u634_normal detectCanvas"></div>
<div id="u635" class="u635" style="visibility:hidden;"  >
<div id="u635_rtf"></div>
</div>
</div>
<div id="u636" class="u636_container"   >
<div id="u636_img" class="u636_normal detectCanvas"></div>
<div id="u637" class="u637" style="visibility:hidden;"  >
<div id="u637_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd4u577" style="visibility:hidden;" data-label="4">
<div id="u638" class="u638_container"   >
<div id="u638_img" class="u638_normal detectCanvas"></div>
<div id="u639" class="u639" style="visibility:hidden;"  >
<div id="u639_rtf"></div>
</div>
</div>
<div id="u640" class="u640_container"   >
<div id="u640_img" class="u640_normal detectCanvas"></div>
<div id="u641" class="u641" style="visibility:hidden;"  >
<div id="u641_rtf"></div>
</div>
</div>
<div id="u642" class="u642_container"   >
<div id="u642_img" class="u642_normal detectCanvas"></div>
<div id="u643" class="u643" style="visibility:hidden;"  >
<div id="u643_rtf"></div>
</div>
</div>
<div id="u644" class="u644_container"   >
<div id="u644_img" class="u644_normal detectCanvas"></div>
<div id="u645" class="u645" style="visibility:hidden;"  >
<div id="u645_rtf"></div>
</div>
</div>
<div id="u646" class="u646_container"   >
<div id="u646_img" class="u646_normal detectCanvas"></div>
<div id="u647" class="u647" style="visibility:hidden;"  >
<div id="u647_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd3u577" style="visibility:hidden;" data-label="3">
<div id="u648" class="u648_container"   >
<div id="u648_img" class="u648_normal detectCanvas"></div>
<div id="u649" class="u649" style="visibility:hidden;"  >
<div id="u649_rtf"></div>
</div>
</div>
<div id="u650" class="u650_container"   >
<div id="u650_img" class="u650_normal detectCanvas"></div>
<div id="u651" class="u651" style="visibility:hidden;"  >
<div id="u651_rtf"></div>
</div>
</div>
<div id="u652" class="u652_container"   >
<div id="u652_img" class="u652_normal detectCanvas"></div>
<div id="u653" class="u653" style="visibility:hidden;"  >
<div id="u653_rtf"></div>
</div>
</div>
<div id="u654" class="u654_container"   >
<div id="u654_img" class="u654_normal detectCanvas"></div>
<div id="u655" class="u655" style="visibility:hidden;"  >
<div id="u655_rtf"></div>
</div>
</div>
<div id="u656" class="u656_container"   >
<div id="u656_img" class="u656_normal detectCanvas"></div>
<div id="u657" class="u657" style="visibility:hidden;"  >
<div id="u657_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd2u577" style="visibility:hidden;" data-label="2">
<div id="u658" class="u658_container"   >
<div id="u658_img" class="u658_normal detectCanvas"></div>
<div id="u659" class="u659" style="visibility:hidden;"  >
<div id="u659_rtf"></div>
</div>
</div>
<div id="u660" class="u660_container"   >
<div id="u660_img" class="u660_normal detectCanvas"></div>
<div id="u661" class="u661" style="visibility:hidden;"  >
<div id="u661_rtf"></div>
</div>
</div>
<div id="u662" class="u662_container"   >
<div id="u662_img" class="u662_normal detectCanvas"></div>
<div id="u663" class="u663" style="visibility:hidden;"  >
<div id="u663_rtf"></div>
</div>
</div>
<div id="u664" class="u664_container"   >
<div id="u664_img" class="u664_normal detectCanvas"></div>
<div id="u665" class="u665" style="visibility:hidden;"  >
<div id="u665_rtf"></div>
</div>
</div>
<div id="u666" class="u666_container"   >
<div id="u666_img" class="u666_normal detectCanvas"></div>
<div id="u667" class="u667" style="visibility:hidden;"  >
<div id="u667_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd1u577" style="visibility:hidden;" data-label="1">
<div id="u668" class="u668_container"   >
<div id="u668_img" class="u668_normal detectCanvas"></div>
<div id="u669" class="u669" style="visibility:hidden;"  >
<div id="u669_rtf"></div>
</div>
</div>
<div id="u670" class="u670_container"   >
<div id="u670_img" class="u670_normal detectCanvas"></div>
<div id="u671" class="u671" style="visibility:hidden;"  >
<div id="u671_rtf"></div>
</div>
</div>
<div id="u672" class="u672_container"   >
<div id="u672_img" class="u672_normal detectCanvas"></div>
<div id="u673" class="u673" style="visibility:hidden;"  >
<div id="u673_rtf"></div>
</div>
</div>
<div id="u674" class="u674_container"   >
<div id="u674_img" class="u674_normal detectCanvas"></div>
<div id="u675" class="u675" style="visibility:hidden;"  >
<div id="u675_rtf"></div>
</div>
</div>
<div id="u676" class="u676_container"   >
<div id="u676_img" class="u676_normal detectCanvas"></div>
<div id="u677" class="u677" style="visibility:hidden;"  >
<div id="u677_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd0u577" style="" data-label="0">
<div id="u678" class="u678_container"   >
<div id="u678_img" class="u678_normal detectCanvas"></div>
<div id="u679" class="u679" style="visibility:hidden;"  >
<div id="u679_rtf"></div>
</div>
</div>
<div id="u680" class="u680_container"   >
<div id="u680_img" class="u680_normal detectCanvas"></div>
<div id="u681" class="u681" style="visibility:hidden;"  >
<div id="u681_rtf"></div>
</div>
</div>
<div id="u682" class="u682_container"   >
<div id="u682_img" class="u682_normal detectCanvas"></div>
<div id="u683" class="u683" style="visibility:hidden;"  >
<div id="u683_rtf"></div>
</div>
</div>
<div id="u684" class="u684_container"   >
<div id="u684_img" class="u684_normal detectCanvas"></div>
<div id="u685" class="u685" style="visibility:hidden;"  >
<div id="u685_rtf"></div>
</div>
</div>
<div id="u686" class="u686_container"   >
<div id="u686_img" class="u686_normal detectCanvas"></div>
<div id="u687" class="u687" style="visibility:hidden;"  >
<div id="u687_rtf"></div>
</div>
</div>
</DIV>
</DIV>
<div id="u688" class="u688"  data-label="text - h3">
<div id="u688_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#424242;">rating: </span></p></div>
</div>
<div id="u689" class="u689_container"   >
<div id="u689_img" class="u689_normal detectCanvas"></div>
<div id="u690" class="u690" style="visibility:hidden;"  >
<div id="u690_rtf"></div>
</div>
</div>
<div id="u691" class="u691_container"   >
<div id="u691_img" class="u691_normal detectCanvas"></div>
<div id="u692" class="u692"  >
<div id="u692_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Auckland</span></p></div>
</div>
</div>
<div id="u693" class="u693_container"   data-label="Rectangle">
<div id="u693_img" class="u693_normal detectCanvas"></div>
<div id="u694" class="u694" style="visibility:hidden;"  >
<div id="u694_rtf"></div>
</div>
</div>
<div id="u695" class="u695_container"   data-label="Image">
<div id="u695_img" >
<img src="searchResult_files/Image_u48_normal.jpg"  class="raw_image"></div>
<div id="u696" class="u696" style="visibility:hidden;"  >
<div id="u696_rtf"></div>
</div>
</div>
<div id="u697" class="u697_container"   data-label="Rectangle">
<div id="u697_img" class="u697_normal detectCanvas"></div>
<div id="u698" class="u698" style="visibility:hidden;"  >
<div id="u698_rtf"></div>
</div>
</div>
<div id="u699" class="u699_container"   data-label="Rectangle">
<div id="u699_img" class="u699_normal detectCanvas"></div>
<div id="u700" class="u700"  >
<div id="u700_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Price: $12950</span></p></div>
</div>
</div>
<div id="u701" class="u701_container"   data-label="Button">
<div id="u701_img" class="u701_normal detectCanvas"></div>
<div id="u702" class="u702"  >
<div id="u702_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Add to cart</span></p></div>
</div>
</div>
<div id="u703" class="u703"  data-label="link">
<div id="u703_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Publication Manual of the American Psychological Association, 6th Edition [Paperback]</span></p></div>
</div>
<DIV id="u704" style="" data-label="Star ratings">
<DIV id="pd10u704" style="visibility:hidden;" data-label="5.set">
<div id="u705" class="u705_container"   >
<div id="u705_img" class="u705_normal detectCanvas"></div>
<div id="u706" class="u706" style="visibility:hidden;"  >
<div id="u706_rtf"></div>
</div>
</div>
<div id="u707" class="u707_container"   >
<div id="u707_img" class="u707_normal detectCanvas"></div>
<div id="u708" class="u708" style="visibility:hidden;"  >
<div id="u708_rtf"></div>
</div>
</div>
<div id="u709" class="u709_container"   >
<div id="u709_img" class="u709_normal detectCanvas"></div>
<div id="u710" class="u710" style="visibility:hidden;"  >
<div id="u710_rtf"></div>
</div>
</div>
<div id="u711" class="u711_container"   >
<div id="u711_img" class="u711_normal detectCanvas"></div>
<div id="u712" class="u712" style="visibility:hidden;"  >
<div id="u712_rtf"></div>
</div>
</div>
<div id="u713" class="u713_container"   >
<div id="u713_img" class="u713_normal detectCanvas"></div>
<div id="u714" class="u714" style="visibility:hidden;"  >
<div id="u714_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd9u704" style="visibility:hidden;" data-label="4.set">
<div id="u715" class="u715_container"   >
<div id="u715_img" class="u715_normal detectCanvas"></div>
<div id="u716" class="u716" style="visibility:hidden;"  >
<div id="u716_rtf"></div>
</div>
</div>
<div id="u717" class="u717_container"   >
<div id="u717_img" class="u717_normal detectCanvas"></div>
<div id="u718" class="u718" style="visibility:hidden;"  >
<div id="u718_rtf"></div>
</div>
</div>
<div id="u719" class="u719_container"   >
<div id="u719_img" class="u719_normal detectCanvas"></div>
<div id="u720" class="u720" style="visibility:hidden;"  >
<div id="u720_rtf"></div>
</div>
</div>
<div id="u721" class="u721_container"   >
<div id="u721_img" class="u721_normal detectCanvas"></div>
<div id="u722" class="u722" style="visibility:hidden;"  >
<div id="u722_rtf"></div>
</div>
</div>
<div id="u723" class="u723_container"   >
<div id="u723_img" class="u723_normal detectCanvas"></div>
<div id="u724" class="u724" style="visibility:hidden;"  >
<div id="u724_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd8u704" style="visibility:hidden;" data-label="3.set">
<div id="u725" class="u725_container"   >
<div id="u725_img" class="u725_normal detectCanvas"></div>
<div id="u726" class="u726" style="visibility:hidden;"  >
<div id="u726_rtf"></div>
</div>
</div>
<div id="u727" class="u727_container"   >
<div id="u727_img" class="u727_normal detectCanvas"></div>
<div id="u728" class="u728" style="visibility:hidden;"  >
<div id="u728_rtf"></div>
</div>
</div>
<div id="u729" class="u729_container"   >
<div id="u729_img" class="u729_normal detectCanvas"></div>
<div id="u730" class="u730" style="visibility:hidden;"  >
<div id="u730_rtf"></div>
</div>
</div>
<div id="u731" class="u731_container"   >
<div id="u731_img" class="u731_normal detectCanvas"></div>
<div id="u732" class="u732" style="visibility:hidden;"  >
<div id="u732_rtf"></div>
</div>
</div>
<div id="u733" class="u733_container"   >
<div id="u733_img" class="u733_normal detectCanvas"></div>
<div id="u734" class="u734" style="visibility:hidden;"  >
<div id="u734_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd7u704" style="visibility:hidden;" data-label="2.set">
<div id="u735" class="u735_container"   >
<div id="u735_img" class="u735_normal detectCanvas"></div>
<div id="u736" class="u736" style="visibility:hidden;"  >
<div id="u736_rtf"></div>
</div>
</div>
<div id="u737" class="u737_container"   >
<div id="u737_img" class="u737_normal detectCanvas"></div>
<div id="u738" class="u738" style="visibility:hidden;"  >
<div id="u738_rtf"></div>
</div>
</div>
<div id="u739" class="u739_container"   >
<div id="u739_img" class="u739_normal detectCanvas"></div>
<div id="u740" class="u740" style="visibility:hidden;"  >
<div id="u740_rtf"></div>
</div>
</div>
<div id="u741" class="u741_container"   >
<div id="u741_img" class="u741_normal detectCanvas"></div>
<div id="u742" class="u742" style="visibility:hidden;"  >
<div id="u742_rtf"></div>
</div>
</div>
<div id="u743" class="u743_container"   >
<div id="u743_img" class="u743_normal detectCanvas"></div>
<div id="u744" class="u744" style="visibility:hidden;"  >
<div id="u744_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd6u704" style="visibility:hidden;" data-label="1.set">
<div id="u745" class="u745_container"   >
<div id="u745_img" class="u745_normal detectCanvas"></div>
<div id="u746" class="u746" style="visibility:hidden;"  >
<div id="u746_rtf"></div>
</div>
</div>
<div id="u747" class="u747_container"   >
<div id="u747_img" class="u747_normal detectCanvas"></div>
<div id="u748" class="u748" style="visibility:hidden;"  >
<div id="u748_rtf"></div>
</div>
</div>
<div id="u749" class="u749_container"   >
<div id="u749_img" class="u749_normal detectCanvas"></div>
<div id="u750" class="u750" style="visibility:hidden;"  >
<div id="u750_rtf"></div>
</div>
</div>
<div id="u751" class="u751_container"   >
<div id="u751_img" class="u751_normal detectCanvas"></div>
<div id="u752" class="u752" style="visibility:hidden;"  >
<div id="u752_rtf"></div>
</div>
</div>
<div id="u753" class="u753_container"   >
<div id="u753_img" class="u753_normal detectCanvas"></div>
<div id="u754" class="u754" style="visibility:hidden;"  >
<div id="u754_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd5u704" style="visibility:hidden;" data-label="5">
<div id="u755" class="u755_container"   >
<div id="u755_img" class="u755_normal detectCanvas"></div>
<div id="u756" class="u756" style="visibility:hidden;"  >
<div id="u756_rtf"></div>
</div>
</div>
<div id="u757" class="u757_container"   >
<div id="u757_img" class="u757_normal detectCanvas"></div>
<div id="u758" class="u758" style="visibility:hidden;"  >
<div id="u758_rtf"></div>
</div>
</div>
<div id="u759" class="u759_container"   >
<div id="u759_img" class="u759_normal detectCanvas"></div>
<div id="u760" class="u760" style="visibility:hidden;"  >
<div id="u760_rtf"></div>
</div>
</div>
<div id="u761" class="u761_container"   >
<div id="u761_img" class="u761_normal detectCanvas"></div>
<div id="u762" class="u762" style="visibility:hidden;"  >
<div id="u762_rtf"></div>
</div>
</div>
<div id="u763" class="u763_container"   >
<div id="u763_img" class="u763_normal detectCanvas"></div>
<div id="u764" class="u764" style="visibility:hidden;"  >
<div id="u764_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd4u704" style="visibility:hidden;" data-label="4">
<div id="u765" class="u765_container"   >
<div id="u765_img" class="u765_normal detectCanvas"></div>
<div id="u766" class="u766" style="visibility:hidden;"  >
<div id="u766_rtf"></div>
</div>
</div>
<div id="u767" class="u767_container"   >
<div id="u767_img" class="u767_normal detectCanvas"></div>
<div id="u768" class="u768" style="visibility:hidden;"  >
<div id="u768_rtf"></div>
</div>
</div>
<div id="u769" class="u769_container"   >
<div id="u769_img" class="u769_normal detectCanvas"></div>
<div id="u770" class="u770" style="visibility:hidden;"  >
<div id="u770_rtf"></div>
</div>
</div>
<div id="u771" class="u771_container"   >
<div id="u771_img" class="u771_normal detectCanvas"></div>
<div id="u772" class="u772" style="visibility:hidden;"  >
<div id="u772_rtf"></div>
</div>
</div>
<div id="u773" class="u773_container"   >
<div id="u773_img" class="u773_normal detectCanvas"></div>
<div id="u774" class="u774" style="visibility:hidden;"  >
<div id="u774_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd3u704" style="visibility:hidden;" data-label="3">
<div id="u775" class="u775_container"   >
<div id="u775_img" class="u775_normal detectCanvas"></div>
<div id="u776" class="u776" style="visibility:hidden;"  >
<div id="u776_rtf"></div>
</div>
</div>
<div id="u777" class="u777_container"   >
<div id="u777_img" class="u777_normal detectCanvas"></div>
<div id="u778" class="u778" style="visibility:hidden;"  >
<div id="u778_rtf"></div>
</div>
</div>
<div id="u779" class="u779_container"   >
<div id="u779_img" class="u779_normal detectCanvas"></div>
<div id="u780" class="u780" style="visibility:hidden;"  >
<div id="u780_rtf"></div>
</div>
</div>
<div id="u781" class="u781_container"   >
<div id="u781_img" class="u781_normal detectCanvas"></div>
<div id="u782" class="u782" style="visibility:hidden;"  >
<div id="u782_rtf"></div>
</div>
</div>
<div id="u783" class="u783_container"   >
<div id="u783_img" class="u783_normal detectCanvas"></div>
<div id="u784" class="u784" style="visibility:hidden;"  >
<div id="u784_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd2u704" style="visibility:hidden;" data-label="2">
<div id="u785" class="u785_container"   >
<div id="u785_img" class="u785_normal detectCanvas"></div>
<div id="u786" class="u786" style="visibility:hidden;"  >
<div id="u786_rtf"></div>
</div>
</div>
<div id="u787" class="u787_container"   >
<div id="u787_img" class="u787_normal detectCanvas"></div>
<div id="u788" class="u788" style="visibility:hidden;"  >
<div id="u788_rtf"></div>
</div>
</div>
<div id="u789" class="u789_container"   >
<div id="u789_img" class="u789_normal detectCanvas"></div>
<div id="u790" class="u790" style="visibility:hidden;"  >
<div id="u790_rtf"></div>
</div>
</div>
<div id="u791" class="u791_container"   >
<div id="u791_img" class="u791_normal detectCanvas"></div>
<div id="u792" class="u792" style="visibility:hidden;"  >
<div id="u792_rtf"></div>
</div>
</div>
<div id="u793" class="u793_container"   >
<div id="u793_img" class="u793_normal detectCanvas"></div>
<div id="u794" class="u794" style="visibility:hidden;"  >
<div id="u794_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd1u704" style="visibility:hidden;" data-label="1">
<div id="u795" class="u795_container"   >
<div id="u795_img" class="u795_normal detectCanvas"></div>
<div id="u796" class="u796" style="visibility:hidden;"  >
<div id="u796_rtf"></div>
</div>
</div>
<div id="u797" class="u797_container"   >
<div id="u797_img" class="u797_normal detectCanvas"></div>
<div id="u798" class="u798" style="visibility:hidden;"  >
<div id="u798_rtf"></div>
</div>
</div>
<div id="u799" class="u799_container"   >
<div id="u799_img" class="u799_normal detectCanvas"></div>
<div id="u800" class="u800" style="visibility:hidden;"  >
<div id="u800_rtf"></div>
</div>
</div>
<div id="u801" class="u801_container"   >
<div id="u801_img" class="u801_normal detectCanvas"></div>
<div id="u802" class="u802" style="visibility:hidden;"  >
<div id="u802_rtf"></div>
</div>
</div>
<div id="u803" class="u803_container"   >
<div id="u803_img" class="u803_normal detectCanvas"></div>
<div id="u804" class="u804" style="visibility:hidden;"  >
<div id="u804_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd0u704" style="" data-label="0">
<div id="u805" class="u805_container"   >
<div id="u805_img" class="u805_normal detectCanvas"></div>
<div id="u806" class="u806" style="visibility:hidden;"  >
<div id="u806_rtf"></div>
</div>
</div>
<div id="u807" class="u807_container"   >
<div id="u807_img" class="u807_normal detectCanvas"></div>
<div id="u808" class="u808" style="visibility:hidden;"  >
<div id="u808_rtf"></div>
</div>
</div>
<div id="u809" class="u809_container"   >
<div id="u809_img" class="u809_normal detectCanvas"></div>
<div id="u810" class="u810" style="visibility:hidden;"  >
<div id="u810_rtf"></div>
</div>
</div>
<div id="u811" class="u811_container"   >
<div id="u811_img" class="u811_normal detectCanvas"></div>
<div id="u812" class="u812" style="visibility:hidden;"  >
<div id="u812_rtf"></div>
</div>
</div>
<div id="u813" class="u813_container"   >
<div id="u813_img" class="u813_normal detectCanvas"></div>
<div id="u814" class="u814" style="visibility:hidden;"  >
<div id="u814_rtf"></div>
</div>
</div>
</DIV>
</DIV>
<div id="u815" class="u815"  data-label="text - h3">
<div id="u815_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#424242;">rating: </span></p></div>
</div><div id="u816" class="u816" >
<DIV id="u816_line" class="u816_line" ></DIV>
</div>
<div id="u817" class="u817_container"   >
<div id="u817_img" class="u817_normal detectCanvas"></div>
<div id="u818" class="u818" style="visibility:hidden;"  >
<div id="u818_rtf"></div>
</div>
</div>
<div id="u819" class="u819_container"   >
<div id="u819_img" class="u819_normal detectCanvas"></div>
<div id="u820" class="u820"  >
<div id="u820_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Auckland</span></p></div>
</div>
</div>
<div id="u821" class="u821_container"   data-label="Rectangle">
<div id="u821_img" class="u821_normal detectCanvas"></div>
<div id="u822" class="u822" style="visibility:hidden;"  >
<div id="u822_rtf"></div>
</div>
</div>
<div id="u823" class="u823_container"   data-label="Image">
<div id="u823_img" >
<img src="searchResult_files/Image_u48_normal.jpg"  class="raw_image"></div>
<div id="u824" class="u824" style="visibility:hidden;"  >
<div id="u824_rtf"></div>
</div>
</div>
<div id="u825" class="u825_container"   data-label="Rectangle">
<div id="u825_img" class="u825_normal detectCanvas"></div>
<div id="u826" class="u826" style="visibility:hidden;"  >
<div id="u826_rtf"></div>
</div>
</div>
<div id="u827" class="u827_container"   data-label="Rectangle">
<div id="u827_img" class="u827_normal detectCanvas"></div>
<div id="u828" class="u828"  >
<div id="u828_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Price: $12950</span></p></div>
</div>
</div>
<div id="u829" class="u829_container"   data-label="Button">
<div id="u829_img" class="u829_normal detectCanvas"></div>
<div id="u830" class="u830"  >
<div id="u830_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Add to cart</span></p></div>
</div>
</div>
<div id="u831" class="u831"  data-label="link">
<div id="u831_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Publication Manual of the American Psychological Association, 6th Edition [Paperback]</span></p></div>
</div>
<DIV id="u832" style="" data-label="Star ratings">
<DIV id="pd10u832" style="visibility:hidden;" data-label="5.set">
<div id="u833" class="u833_container"   >
<div id="u833_img" class="u833_normal detectCanvas"></div>
<div id="u834" class="u834" style="visibility:hidden;"  >
<div id="u834_rtf"></div>
</div>
</div>
<div id="u835" class="u835_container"   >
<div id="u835_img" class="u835_normal detectCanvas"></div>
<div id="u836" class="u836" style="visibility:hidden;"  >
<div id="u836_rtf"></div>
</div>
</div>
<div id="u837" class="u837_container"   >
<div id="u837_img" class="u837_normal detectCanvas"></div>
<div id="u838" class="u838" style="visibility:hidden;"  >
<div id="u838_rtf"></div>
</div>
</div>
<div id="u839" class="u839_container"   >
<div id="u839_img" class="u839_normal detectCanvas"></div>
<div id="u840" class="u840" style="visibility:hidden;"  >
<div id="u840_rtf"></div>
</div>
</div>
<div id="u841" class="u841_container"   >
<div id="u841_img" class="u841_normal detectCanvas"></div>
<div id="u842" class="u842" style="visibility:hidden;"  >
<div id="u842_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd9u832" style="visibility:hidden;" data-label="4.set">
<div id="u843" class="u843_container"   >
<div id="u843_img" class="u843_normal detectCanvas"></div>
<div id="u844" class="u844" style="visibility:hidden;"  >
<div id="u844_rtf"></div>
</div>
</div>
<div id="u845" class="u845_container"   >
<div id="u845_img" class="u845_normal detectCanvas"></div>
<div id="u846" class="u846" style="visibility:hidden;"  >
<div id="u846_rtf"></div>
</div>
</div>
<div id="u847" class="u847_container"   >
<div id="u847_img" class="u847_normal detectCanvas"></div>
<div id="u848" class="u848" style="visibility:hidden;"  >
<div id="u848_rtf"></div>
</div>
</div>
<div id="u849" class="u849_container"   >
<div id="u849_img" class="u849_normal detectCanvas"></div>
<div id="u850" class="u850" style="visibility:hidden;"  >
<div id="u850_rtf"></div>
</div>
</div>
<div id="u851" class="u851_container"   >
<div id="u851_img" class="u851_normal detectCanvas"></div>
<div id="u852" class="u852" style="visibility:hidden;"  >
<div id="u852_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd8u832" style="visibility:hidden;" data-label="3.set">
<div id="u853" class="u853_container"   >
<div id="u853_img" class="u853_normal detectCanvas"></div>
<div id="u854" class="u854" style="visibility:hidden;"  >
<div id="u854_rtf"></div>
</div>
</div>
<div id="u855" class="u855_container"   >
<div id="u855_img" class="u855_normal detectCanvas"></div>
<div id="u856" class="u856" style="visibility:hidden;"  >
<div id="u856_rtf"></div>
</div>
</div>
<div id="u857" class="u857_container"   >
<div id="u857_img" class="u857_normal detectCanvas"></div>
<div id="u858" class="u858" style="visibility:hidden;"  >
<div id="u858_rtf"></div>
</div>
</div>
<div id="u859" class="u859_container"   >
<div id="u859_img" class="u859_normal detectCanvas"></div>
<div id="u860" class="u860" style="visibility:hidden;"  >
<div id="u860_rtf"></div>
</div>
</div>
<div id="u861" class="u861_container"   >
<div id="u861_img" class="u861_normal detectCanvas"></div>
<div id="u862" class="u862" style="visibility:hidden;"  >
<div id="u862_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd7u832" style="visibility:hidden;" data-label="2.set">
<div id="u863" class="u863_container"   >
<div id="u863_img" class="u863_normal detectCanvas"></div>
<div id="u864" class="u864" style="visibility:hidden;"  >
<div id="u864_rtf"></div>
</div>
</div>
<div id="u865" class="u865_container"   >
<div id="u865_img" class="u865_normal detectCanvas"></div>
<div id="u866" class="u866" style="visibility:hidden;"  >
<div id="u866_rtf"></div>
</div>
</div>
<div id="u867" class="u867_container"   >
<div id="u867_img" class="u867_normal detectCanvas"></div>
<div id="u868" class="u868" style="visibility:hidden;"  >
<div id="u868_rtf"></div>
</div>
</div>
<div id="u869" class="u869_container"   >
<div id="u869_img" class="u869_normal detectCanvas"></div>
<div id="u870" class="u870" style="visibility:hidden;"  >
<div id="u870_rtf"></div>
</div>
</div>
<div id="u871" class="u871_container"   >
<div id="u871_img" class="u871_normal detectCanvas"></div>
<div id="u872" class="u872" style="visibility:hidden;"  >
<div id="u872_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd6u832" style="visibility:hidden;" data-label="1.set">
<div id="u873" class="u873_container"   >
<div id="u873_img" class="u873_normal detectCanvas"></div>
<div id="u874" class="u874" style="visibility:hidden;"  >
<div id="u874_rtf"></div>
</div>
</div>
<div id="u875" class="u875_container"   >
<div id="u875_img" class="u875_normal detectCanvas"></div>
<div id="u876" class="u876" style="visibility:hidden;"  >
<div id="u876_rtf"></div>
</div>
</div>
<div id="u877" class="u877_container"   >
<div id="u877_img" class="u877_normal detectCanvas"></div>
<div id="u878" class="u878" style="visibility:hidden;"  >
<div id="u878_rtf"></div>
</div>
</div>
<div id="u879" class="u879_container"   >
<div id="u879_img" class="u879_normal detectCanvas"></div>
<div id="u880" class="u880" style="visibility:hidden;"  >
<div id="u880_rtf"></div>
</div>
</div>
<div id="u881" class="u881_container"   >
<div id="u881_img" class="u881_normal detectCanvas"></div>
<div id="u882" class="u882" style="visibility:hidden;"  >
<div id="u882_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd5u832" style="visibility:hidden;" data-label="5">
<div id="u883" class="u883_container"   >
<div id="u883_img" class="u883_normal detectCanvas"></div>
<div id="u884" class="u884" style="visibility:hidden;"  >
<div id="u884_rtf"></div>
</div>
</div>
<div id="u885" class="u885_container"   >
<div id="u885_img" class="u885_normal detectCanvas"></div>
<div id="u886" class="u886" style="visibility:hidden;"  >
<div id="u886_rtf"></div>
</div>
</div>
<div id="u887" class="u887_container"   >
<div id="u887_img" class="u887_normal detectCanvas"></div>
<div id="u888" class="u888" style="visibility:hidden;"  >
<div id="u888_rtf"></div>
</div>
</div>
<div id="u889" class="u889_container"   >
<div id="u889_img" class="u889_normal detectCanvas"></div>
<div id="u890" class="u890" style="visibility:hidden;"  >
<div id="u890_rtf"></div>
</div>
</div>
<div id="u891" class="u891_container"   >
<div id="u891_img" class="u891_normal detectCanvas"></div>
<div id="u892" class="u892" style="visibility:hidden;"  >
<div id="u892_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd4u832" style="visibility:hidden;" data-label="4">
<div id="u893" class="u893_container"   >
<div id="u893_img" class="u893_normal detectCanvas"></div>
<div id="u894" class="u894" style="visibility:hidden;"  >
<div id="u894_rtf"></div>
</div>
</div>
<div id="u895" class="u895_container"   >
<div id="u895_img" class="u895_normal detectCanvas"></div>
<div id="u896" class="u896" style="visibility:hidden;"  >
<div id="u896_rtf"></div>
</div>
</div>
<div id="u897" class="u897_container"   >
<div id="u897_img" class="u897_normal detectCanvas"></div>
<div id="u898" class="u898" style="visibility:hidden;"  >
<div id="u898_rtf"></div>
</div>
</div>
<div id="u899" class="u899_container"   >
<div id="u899_img" class="u899_normal detectCanvas"></div>
<div id="u900" class="u900" style="visibility:hidden;"  >
<div id="u900_rtf"></div>
</div>
</div>
<div id="u901" class="u901_container"   >
<div id="u901_img" class="u901_normal detectCanvas"></div>
<div id="u902" class="u902" style="visibility:hidden;"  >
<div id="u902_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd3u832" style="visibility:hidden;" data-label="3">
<div id="u903" class="u903_container"   >
<div id="u903_img" class="u903_normal detectCanvas"></div>
<div id="u904" class="u904" style="visibility:hidden;"  >
<div id="u904_rtf"></div>
</div>
</div>
<div id="u905" class="u905_container"   >
<div id="u905_img" class="u905_normal detectCanvas"></div>
<div id="u906" class="u906" style="visibility:hidden;"  >
<div id="u906_rtf"></div>
</div>
</div>
<div id="u907" class="u907_container"   >
<div id="u907_img" class="u907_normal detectCanvas"></div>
<div id="u908" class="u908" style="visibility:hidden;"  >
<div id="u908_rtf"></div>
</div>
</div>
<div id="u909" class="u909_container"   >
<div id="u909_img" class="u909_normal detectCanvas"></div>
<div id="u910" class="u910" style="visibility:hidden;"  >
<div id="u910_rtf"></div>
</div>
</div>
<div id="u911" class="u911_container"   >
<div id="u911_img" class="u911_normal detectCanvas"></div>
<div id="u912" class="u912" style="visibility:hidden;"  >
<div id="u912_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd2u832" style="visibility:hidden;" data-label="2">
<div id="u913" class="u913_container"   >
<div id="u913_img" class="u913_normal detectCanvas"></div>
<div id="u914" class="u914" style="visibility:hidden;"  >
<div id="u914_rtf"></div>
</div>
</div>
<div id="u915" class="u915_container"   >
<div id="u915_img" class="u915_normal detectCanvas"></div>
<div id="u916" class="u916" style="visibility:hidden;"  >
<div id="u916_rtf"></div>
</div>
</div>
<div id="u917" class="u917_container"   >
<div id="u917_img" class="u917_normal detectCanvas"></div>
<div id="u918" class="u918" style="visibility:hidden;"  >
<div id="u918_rtf"></div>
</div>
</div>
<div id="u919" class="u919_container"   >
<div id="u919_img" class="u919_normal detectCanvas"></div>
<div id="u920" class="u920" style="visibility:hidden;"  >
<div id="u920_rtf"></div>
</div>
</div>
<div id="u921" class="u921_container"   >
<div id="u921_img" class="u921_normal detectCanvas"></div>
<div id="u922" class="u922" style="visibility:hidden;"  >
<div id="u922_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd1u832" style="visibility:hidden;" data-label="1">
<div id="u923" class="u923_container"   >
<div id="u923_img" class="u923_normal detectCanvas"></div>
<div id="u924" class="u924" style="visibility:hidden;"  >
<div id="u924_rtf"></div>
</div>
</div>
<div id="u925" class="u925_container"   >
<div id="u925_img" class="u925_normal detectCanvas"></div>
<div id="u926" class="u926" style="visibility:hidden;"  >
<div id="u926_rtf"></div>
</div>
</div>
<div id="u927" class="u927_container"   >
<div id="u927_img" class="u927_normal detectCanvas"></div>
<div id="u928" class="u928" style="visibility:hidden;"  >
<div id="u928_rtf"></div>
</div>
</div>
<div id="u929" class="u929_container"   >
<div id="u929_img" class="u929_normal detectCanvas"></div>
<div id="u930" class="u930" style="visibility:hidden;"  >
<div id="u930_rtf"></div>
</div>
</div>
<div id="u931" class="u931_container"   >
<div id="u931_img" class="u931_normal detectCanvas"></div>
<div id="u932" class="u932" style="visibility:hidden;"  >
<div id="u932_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd0u832" style="" data-label="0">
<div id="u933" class="u933_container"   >
<div id="u933_img" class="u933_normal detectCanvas"></div>
<div id="u934" class="u934" style="visibility:hidden;"  >
<div id="u934_rtf"></div>
</div>
</div>
<div id="u935" class="u935_container"   >
<div id="u935_img" class="u935_normal detectCanvas"></div>
<div id="u936" class="u936" style="visibility:hidden;"  >
<div id="u936_rtf"></div>
</div>
</div>
<div id="u937" class="u937_container"   >
<div id="u937_img" class="u937_normal detectCanvas"></div>
<div id="u938" class="u938" style="visibility:hidden;"  >
<div id="u938_rtf"></div>
</div>
</div>
<div id="u939" class="u939_container"   >
<div id="u939_img" class="u939_normal detectCanvas"></div>
<div id="u940" class="u940" style="visibility:hidden;"  >
<div id="u940_rtf"></div>
</div>
</div>
<div id="u941" class="u941_container"   >
<div id="u941_img" class="u941_normal detectCanvas"></div>
<div id="u942" class="u942" style="visibility:hidden;"  >
<div id="u942_rtf"></div>
</div>
</div>
</DIV>
</DIV>
<div id="u943" class="u943"  data-label="text - h3">
<div id="u943_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#424242;">rating: </span></p></div>
</div><div id="u944" class="u944" >
<DIV id="u944_line" class="u944_line" ></DIV>
</div>
<div id="u945" class="u945_container"   >
<div id="u945_img" class="u945_normal detectCanvas"></div>
<div id="u946" class="u946" style="visibility:hidden;"  >
<div id="u946_rtf"></div>
</div>
</div>
<div id="u947" class="u947_container"   >
<div id="u947_img" class="u947_normal detectCanvas"></div>
<div id="u948" class="u948"  >
<div id="u948_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Auckland</span></p></div>
</div>
</div>
<div id="u949" class="u949_container"   data-label="Rectangle">
<div id="u949_img" class="u949_normal detectCanvas"></div>
<div id="u950" class="u950" style="visibility:hidden;"  >
<div id="u950_rtf"></div>
</div>
</div>
<div id="u951" class="u951_container"   data-label="Image">
<div id="u951_img" >
<img src="searchResult_files/Image_u48_normal.jpg"  class="raw_image"></div>
<div id="u952" class="u952" style="visibility:hidden;"  >
<div id="u952_rtf"></div>
</div>
</div>
<div id="u953" class="u953_container"   data-label="Rectangle">
<div id="u953_img" class="u953_normal detectCanvas"></div>
<div id="u954" class="u954" style="visibility:hidden;"  >
<div id="u954_rtf"></div>
</div>
</div>
<div id="u955" class="u955_container"   data-label="Rectangle">
<div id="u955_img" class="u955_normal detectCanvas"></div>
<div id="u956" class="u956"  >
<div id="u956_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Price: $12950</span></p></div>
</div>
</div>
<div id="u957" class="u957_container"   data-label="Button">
<div id="u957_img" class="u957_normal detectCanvas"></div>
<div id="u958" class="u958"  >
<div id="u958_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Add to cart</span></p></div>
</div>
</div>
<div id="u959" class="u959"  data-label="link">
<div id="u959_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Publication Manual of the American Psychological Association, 6th Edition [Paperback]</span></p></div>
</div>
<DIV id="u960" style="" data-label="Star ratings">
<DIV id="pd10u960" style="visibility:hidden;" data-label="5.set">
<div id="u961" class="u961_container"   >
<div id="u961_img" class="u961_normal detectCanvas"></div>
<div id="u962" class="u962" style="visibility:hidden;"  >
<div id="u962_rtf"></div>
</div>
</div>
<div id="u963" class="u963_container"   >
<div id="u963_img" class="u963_normal detectCanvas"></div>
<div id="u964" class="u964" style="visibility:hidden;"  >
<div id="u964_rtf"></div>
</div>
</div>
<div id="u965" class="u965_container"   >
<div id="u965_img" class="u965_normal detectCanvas"></div>
<div id="u966" class="u966" style="visibility:hidden;"  >
<div id="u966_rtf"></div>
</div>
</div>
<div id="u967" class="u967_container"   >
<div id="u967_img" class="u967_normal detectCanvas"></div>
<div id="u968" class="u968" style="visibility:hidden;"  >
<div id="u968_rtf"></div>
</div>
</div>
<div id="u969" class="u969_container"   >
<div id="u969_img" class="u969_normal detectCanvas"></div>
<div id="u970" class="u970" style="visibility:hidden;"  >
<div id="u970_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd9u960" style="visibility:hidden;" data-label="4.set">
<div id="u971" class="u971_container"   >
<div id="u971_img" class="u971_normal detectCanvas"></div>
<div id="u972" class="u972" style="visibility:hidden;"  >
<div id="u972_rtf"></div>
</div>
</div>
<div id="u973" class="u973_container"   >
<div id="u973_img" class="u973_normal detectCanvas"></div>
<div id="u974" class="u974" style="visibility:hidden;"  >
<div id="u974_rtf"></div>
</div>
</div>
<div id="u975" class="u975_container"   >
<div id="u975_img" class="u975_normal detectCanvas"></div>
<div id="u976" class="u976" style="visibility:hidden;"  >
<div id="u976_rtf"></div>
</div>
</div>
<div id="u977" class="u977_container"   >
<div id="u977_img" class="u977_normal detectCanvas"></div>
<div id="u978" class="u978" style="visibility:hidden;"  >
<div id="u978_rtf"></div>
</div>
</div>
<div id="u979" class="u979_container"   >
<div id="u979_img" class="u979_normal detectCanvas"></div>
<div id="u980" class="u980" style="visibility:hidden;"  >
<div id="u980_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd8u960" style="visibility:hidden;" data-label="3.set">
<div id="u981" class="u981_container"   >
<div id="u981_img" class="u981_normal detectCanvas"></div>
<div id="u982" class="u982" style="visibility:hidden;"  >
<div id="u982_rtf"></div>
</div>
</div>
<div id="u983" class="u983_container"   >
<div id="u983_img" class="u983_normal detectCanvas"></div>
<div id="u984" class="u984" style="visibility:hidden;"  >
<div id="u984_rtf"></div>
</div>
</div>
<div id="u985" class="u985_container"   >
<div id="u985_img" class="u985_normal detectCanvas"></div>
<div id="u986" class="u986" style="visibility:hidden;"  >
<div id="u986_rtf"></div>
</div>
</div>
<div id="u987" class="u987_container"   >
<div id="u987_img" class="u987_normal detectCanvas"></div>
<div id="u988" class="u988" style="visibility:hidden;"  >
<div id="u988_rtf"></div>
</div>
</div>
<div id="u989" class="u989_container"   >
<div id="u989_img" class="u989_normal detectCanvas"></div>
<div id="u990" class="u990" style="visibility:hidden;"  >
<div id="u990_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd7u960" style="visibility:hidden;" data-label="2.set">
<div id="u991" class="u991_container"   >
<div id="u991_img" class="u991_normal detectCanvas"></div>
<div id="u992" class="u992" style="visibility:hidden;"  >
<div id="u992_rtf"></div>
</div>
</div>
<div id="u993" class="u993_container"   >
<div id="u993_img" class="u993_normal detectCanvas"></div>
<div id="u994" class="u994" style="visibility:hidden;"  >
<div id="u994_rtf"></div>
</div>
</div>
<div id="u995" class="u995_container"   >
<div id="u995_img" class="u995_normal detectCanvas"></div>
<div id="u996" class="u996" style="visibility:hidden;"  >
<div id="u996_rtf"></div>
</div>
</div>
<div id="u997" class="u997_container"   >
<div id="u997_img" class="u997_normal detectCanvas"></div>
<div id="u998" class="u998" style="visibility:hidden;"  >
<div id="u998_rtf"></div>
</div>
</div>
<div id="u999" class="u999_container"   >
<div id="u999_img" class="u999_normal detectCanvas"></div>
<div id="u1000" class="u1000" style="visibility:hidden;"  >
<div id="u1000_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd6u960" style="visibility:hidden;" data-label="1.set">
<div id="u1001" class="u1001_container"   >
<div id="u1001_img" class="u1001_normal detectCanvas"></div>
<div id="u1002" class="u1002" style="visibility:hidden;"  >
<div id="u1002_rtf"></div>
</div>
</div>
<div id="u1003" class="u1003_container"   >
<div id="u1003_img" class="u1003_normal detectCanvas"></div>
<div id="u1004" class="u1004" style="visibility:hidden;"  >
<div id="u1004_rtf"></div>
</div>
</div>
<div id="u1005" class="u1005_container"   >
<div id="u1005_img" class="u1005_normal detectCanvas"></div>
<div id="u1006" class="u1006" style="visibility:hidden;"  >
<div id="u1006_rtf"></div>
</div>
</div>
<div id="u1007" class="u1007_container"   >
<div id="u1007_img" class="u1007_normal detectCanvas"></div>
<div id="u1008" class="u1008" style="visibility:hidden;"  >
<div id="u1008_rtf"></div>
</div>
</div>
<div id="u1009" class="u1009_container"   >
<div id="u1009_img" class="u1009_normal detectCanvas"></div>
<div id="u1010" class="u1010" style="visibility:hidden;"  >
<div id="u1010_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd5u960" style="visibility:hidden;" data-label="5">
<div id="u1011" class="u1011_container"   >
<div id="u1011_img" class="u1011_normal detectCanvas"></div>
<div id="u1012" class="u1012" style="visibility:hidden;"  >
<div id="u1012_rtf"></div>
</div>
</div>
<div id="u1013" class="u1013_container"   >
<div id="u1013_img" class="u1013_normal detectCanvas"></div>
<div id="u1014" class="u1014" style="visibility:hidden;"  >
<div id="u1014_rtf"></div>
</div>
</div>
<div id="u1015" class="u1015_container"   >
<div id="u1015_img" class="u1015_normal detectCanvas"></div>
<div id="u1016" class="u1016" style="visibility:hidden;"  >
<div id="u1016_rtf"></div>
</div>
</div>
<div id="u1017" class="u1017_container"   >
<div id="u1017_img" class="u1017_normal detectCanvas"></div>
<div id="u1018" class="u1018" style="visibility:hidden;"  >
<div id="u1018_rtf"></div>
</div>
</div>
<div id="u1019" class="u1019_container"   >
<div id="u1019_img" class="u1019_normal detectCanvas"></div>
<div id="u1020" class="u1020" style="visibility:hidden;"  >
<div id="u1020_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd4u960" style="visibility:hidden;" data-label="4">
<div id="u1021" class="u1021_container"   >
<div id="u1021_img" class="u1021_normal detectCanvas"></div>
<div id="u1022" class="u1022" style="visibility:hidden;"  >
<div id="u1022_rtf"></div>
</div>
</div>
<div id="u1023" class="u1023_container"   >
<div id="u1023_img" class="u1023_normal detectCanvas"></div>
<div id="u1024" class="u1024" style="visibility:hidden;"  >
<div id="u1024_rtf"></div>
</div>
</div>
<div id="u1025" class="u1025_container"   >
<div id="u1025_img" class="u1025_normal detectCanvas"></div>
<div id="u1026" class="u1026" style="visibility:hidden;"  >
<div id="u1026_rtf"></div>
</div>
</div>
<div id="u1027" class="u1027_container"   >
<div id="u1027_img" class="u1027_normal detectCanvas"></div>
<div id="u1028" class="u1028" style="visibility:hidden;"  >
<div id="u1028_rtf"></div>
</div>
</div>
<div id="u1029" class="u1029_container"   >
<div id="u1029_img" class="u1029_normal detectCanvas"></div>
<div id="u1030" class="u1030" style="visibility:hidden;"  >
<div id="u1030_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd3u960" style="visibility:hidden;" data-label="3">
<div id="u1031" class="u1031_container"   >
<div id="u1031_img" class="u1031_normal detectCanvas"></div>
<div id="u1032" class="u1032" style="visibility:hidden;"  >
<div id="u1032_rtf"></div>
</div>
</div>
<div id="u1033" class="u1033_container"   >
<div id="u1033_img" class="u1033_normal detectCanvas"></div>
<div id="u1034" class="u1034" style="visibility:hidden;"  >
<div id="u1034_rtf"></div>
</div>
</div>
<div id="u1035" class="u1035_container"   >
<div id="u1035_img" class="u1035_normal detectCanvas"></div>
<div id="u1036" class="u1036" style="visibility:hidden;"  >
<div id="u1036_rtf"></div>
</div>
</div>
<div id="u1037" class="u1037_container"   >
<div id="u1037_img" class="u1037_normal detectCanvas"></div>
<div id="u1038" class="u1038" style="visibility:hidden;"  >
<div id="u1038_rtf"></div>
</div>
</div>
<div id="u1039" class="u1039_container"   >
<div id="u1039_img" class="u1039_normal detectCanvas"></div>
<div id="u1040" class="u1040" style="visibility:hidden;"  >
<div id="u1040_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd2u960" style="visibility:hidden;" data-label="2">
<div id="u1041" class="u1041_container"   >
<div id="u1041_img" class="u1041_normal detectCanvas"></div>
<div id="u1042" class="u1042" style="visibility:hidden;"  >
<div id="u1042_rtf"></div>
</div>
</div>
<div id="u1043" class="u1043_container"   >
<div id="u1043_img" class="u1043_normal detectCanvas"></div>
<div id="u1044" class="u1044" style="visibility:hidden;"  >
<div id="u1044_rtf"></div>
</div>
</div>
<div id="u1045" class="u1045_container"   >
<div id="u1045_img" class="u1045_normal detectCanvas"></div>
<div id="u1046" class="u1046" style="visibility:hidden;"  >
<div id="u1046_rtf"></div>
</div>
</div>
<div id="u1047" class="u1047_container"   >
<div id="u1047_img" class="u1047_normal detectCanvas"></div>
<div id="u1048" class="u1048" style="visibility:hidden;"  >
<div id="u1048_rtf"></div>
</div>
</div>
<div id="u1049" class="u1049_container"   >
<div id="u1049_img" class="u1049_normal detectCanvas"></div>
<div id="u1050" class="u1050" style="visibility:hidden;"  >
<div id="u1050_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd1u960" style="visibility:hidden;" data-label="1">
<div id="u1051" class="u1051_container"   >
<div id="u1051_img" class="u1051_normal detectCanvas"></div>
<div id="u1052" class="u1052" style="visibility:hidden;"  >
<div id="u1052_rtf"></div>
</div>
</div>
<div id="u1053" class="u1053_container"   >
<div id="u1053_img" class="u1053_normal detectCanvas"></div>
<div id="u1054" class="u1054" style="visibility:hidden;"  >
<div id="u1054_rtf"></div>
</div>
</div>
<div id="u1055" class="u1055_container"   >
<div id="u1055_img" class="u1055_normal detectCanvas"></div>
<div id="u1056" class="u1056" style="visibility:hidden;"  >
<div id="u1056_rtf"></div>
</div>
</div>
<div id="u1057" class="u1057_container"   >
<div id="u1057_img" class="u1057_normal detectCanvas"></div>
<div id="u1058" class="u1058" style="visibility:hidden;"  >
<div id="u1058_rtf"></div>
</div>
</div>
<div id="u1059" class="u1059_container"   >
<div id="u1059_img" class="u1059_normal detectCanvas"></div>
<div id="u1060" class="u1060" style="visibility:hidden;"  >
<div id="u1060_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd0u960" style="" data-label="0">
<div id="u1061" class="u1061_container"   >
<div id="u1061_img" class="u1061_normal detectCanvas"></div>
<div id="u1062" class="u1062" style="visibility:hidden;"  >
<div id="u1062_rtf"></div>
</div>
</div>
<div id="u1063" class="u1063_container"   >
<div id="u1063_img" class="u1063_normal detectCanvas"></div>
<div id="u1064" class="u1064" style="visibility:hidden;"  >
<div id="u1064_rtf"></div>
</div>
</div>
<div id="u1065" class="u1065_container"   >
<div id="u1065_img" class="u1065_normal detectCanvas"></div>
<div id="u1066" class="u1066" style="visibility:hidden;"  >
<div id="u1066_rtf"></div>
</div>
</div>
<div id="u1067" class="u1067_container"   >
<div id="u1067_img" class="u1067_normal detectCanvas"></div>
<div id="u1068" class="u1068" style="visibility:hidden;"  >
<div id="u1068_rtf"></div>
</div>
</div>
<div id="u1069" class="u1069_container"   >
<div id="u1069_img" class="u1069_normal detectCanvas"></div>
<div id="u1070" class="u1070" style="visibility:hidden;"  >
<div id="u1070_rtf"></div>
</div>
</div>
</DIV>
</DIV>
<div id="u1071" class="u1071"  data-label="text - h3">
<div id="u1071_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#424242;">rating: </span></p></div>
</div><div id="u1072" class="u1072" >
<DIV id="u1072_line" class="u1072_line" ></DIV>
</div>
<div id="u1073" class="u1073_container"   >
<div id="u1073_img" class="u1073_normal detectCanvas"></div>
<div id="u1074" class="u1074" style="visibility:hidden;"  >
<div id="u1074_rtf"></div>
</div>
</div>
<div id="u1075" class="u1075_container"   >
<div id="u1075_img" class="u1075_normal detectCanvas"></div>
<div id="u1076" class="u1076"  >
<div id="u1076_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Auckland</span></p></div>
</div>
</div><div id="u1077" class="u1077" >
<DIV id="u1077_line" class="u1077_line" ></DIV>
</div><div id="u1078" class="u1078" >
<DIV id="u1078_line" class="u1078_line" ></DIV>
</div>
<div id="u1079" class="u1079_container"   data-label="button">
<div id="u1079_img" class="u1079_normal detectCanvas"></div>
<div id="u1080" class="u1080"  >
<div id="u1080_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">1</span></p></div>
</div>
</div>
<div id="u1081" class="u1081_container"   data-label="button">
<div id="u1081_img" class="u1081_normal detectCanvas"></div>
<div id="u1082" class="u1082"  >
<div id="u1082_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">2</span></p></div>
</div>
</div>
<div id="u1083" class="u1083_container"   data-label="button">
<div id="u1083_img" class="u1083_normal detectCanvas"></div>
<div id="u1084" class="u1084"  >
<div id="u1084_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">3</span></p></div>
</div>
</div>
<div id="u1085" class="u1085_container"   data-label="button">
<div id="u1085_img" class="u1085_normal detectCanvas"></div>
<div id="u1086" class="u1086"  >
<div id="u1086_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">4</span></p></div>
</div>
</div>
<div id="u1087" class="u1087_container"   data-label="button">
<div id="u1087_img" class="u1087_normal detectCanvas"></div>
<div id="u1088" class="u1088"  >
<div id="u1088_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">5</span></p></div>
</div>
</div>
<div id="u1089" class="u1089_container"   data-label="button">
<div id="u1089_img" class="u1089_normal detectCanvas"></div>
<div id="u1090" class="u1090"  >
<div id="u1090_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#F2F2F2;">previus</span></p></div>
</div>
</div>
<div id="u1091" class="u1091_container"   data-label="button">
<div id="u1091_img" class="u1091_normal detectCanvas"></div>
<div id="u1092" class="u1092"  >
<div id="u1092_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">6</span></p></div>
</div>
</div>
<div id="u1093" class="u1093_container"   data-label="button">
<div id="u1093_img" class="u1093_normal detectCanvas"></div>
<div id="u1094" class="u1094"  >
<div id="u1094_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">7</span></p></div>
</div>
</div>
<div id="u1095" class="u1095_container"   data-label="button">
<div id="u1095_img" class="u1095_normal detectCanvas"></div>
<div id="u1096" class="u1096"  >
<div id="u1096_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">8</span></p></div>
</div>
</div>
<div id="u1097" class="u1097_container"   data-label="button">
<div id="u1097_img" class="u1097_normal detectCanvas"></div>
<div id="u1098" class="u1098"  >
<div id="u1098_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">9</span></p></div>
</div>
</div>
<div id="u1099" class="u1099_container"   data-label="button">
<div id="u1099_img" class="u1099_normal detectCanvas"></div>
<div id="u1100" class="u1100"  >
<div id="u1100_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">10</span></p></div>
</div>
</div>
<div id="u1101" class="u1101_container"   data-label="button">
<div id="u1101_img" class="u1101_normal detectCanvas"></div>
<div id="u1102" class="u1102"  >
<div id="u1102_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">next</span></p></div>
</div>
</div>
<div id="u1103" class="u1103_container"   >
<div id="u1103_img" class="u1103_normal detectCanvas"></div>
<div id="u1104" class="u1104"  >
<div id="u1104_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Copyright © 2013 </span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Quanfu Li </span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">All rights reserved&nbsp; </span><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">email: leequanfu@gmail.com</span></p></div>
</div>
</div>
<DIV id="u1105" style="border-style:dotted; border-color:red; visibility:hidden; position:absolute; left:199px; top:2019px; width:996px; height:46px;;" ></div>
</div>
<div class="preload"><img src="Header_files/u0_normal.png" width="1" height="1"/><img src="Header_files/u3_line.png" width="1" height="1"/><img src="Header_files/u10_mouseOver.png" width="1" height="1"/><img src="Header_files/u10_normal.png" width="1" height="1"/><img src="Header_files/Rectangle_u12_normal.png" width="1" height="1"/><img src="Header_files/u15_normal.png" width="1" height="1"/><img src="Header_files/u17_normal.png" width="1" height="1"/><img src="searchResult_files/u21_line.png" width="1" height="1"/><img src="searchResult_files/button_u22_mouseOver.png" width="1" height="1"/><img src="searchResult_files/button_u22_disabled.png" width="1" height="1"/><img src="searchResult_files/button_u24_normal.png" width="1" height="1"/><img src="searchResult_files/button_u32_disabled.png" width="1" height="1"/><img src="searchResult_files/button_u32_normal.png" width="1" height="1"/><img src="searchResult_files/button_u44_mouseOver.png" width="1" height="1"/><img src="searchResult_files/button_u44_disabled.png" width="1" height="1"/><img src="searchResult_files/button_u44_normal.png" width="1" height="1"/><img src="searchResult_files/Rectangle_u46_normal.png" width="1" height="1"/><img src="searchResult_files/Image_u48_normal.jpg" width="1" height="1"/><img src="searchResult_files/Rectangle_u50_normal.png" width="1" height="1"/><img src="searchResult_files/Rectangle_u52_normal.png" width="1" height="1"/><img src="searchResult_files/Button_u54_mouseOver.png" width="1" height="1"/><img src="searchResult_files/Button_u54_normal.png" width="1" height="1"/><img src="searchResult_files/u58_normal.png" width="1" height="1"/><img src="searchResult_files/u76_normal.png" width="1" height="1"/><img src="searchResult_files/u108_normal.png" width="1" height="1"/><img src="searchResult_files/u169_normal.png" width="1" height="1"/><img src="searchResult_files/u171_normal.png" width="1" height="1"/><img src="searchResult_files/u177_line.png" width="1" height="1"/><img src="searchResult_files/u178_normal.png" width="1" height="1"/><img src="searchResult_files/u180_normal.png" width="1" height="1"/><img src="searchResult_files/u305_line.png" width="1" height="1"/><img src="searchResult_files/u433_line.png" width="1" height="1"/><img src="searchResult_files/u561_line.png" width="1" height="1"/><img src="searchResult_files/u816_line.png" width="1" height="1"/><img src="searchResult_files/u944_line.png" width="1" height="1"/><img src="searchResult_files/u1072_line.png" width="1" height="1"/><img src="searchResult_files/u1077_line.png" width="1" height="1"/><img src="searchResult_files/u1078_line.png" width="1" height="1"/><img src="Footer_files/u191_normal.png" width="1" height="1"/></div>
</body>
<script src="resources/scripts/axurerp_pagescript.js"></script>
<script src="searchResult_files/axurerp_pagespecificscript.js" charset="utf-8"></script>