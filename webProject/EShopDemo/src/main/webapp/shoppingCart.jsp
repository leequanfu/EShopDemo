<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>shoppingCart</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta http-equiv="imagetoolbar" content="no"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet">
    <link href="resources/css/axure_rp_page.css" type="text/css" rel="stylesheet">
    <link href="shoppingCart_files/axurerp_pagespecificstyles.css" type="text/css" rel="stylesheet">
<!--[if IE 6]>
    <link href="shoppingCart_files/axurerp_pagespecificstyles_ie6.css" type="text/css" rel="stylesheet">
<![endif]-->
    <script src="data/sitemap.js"></script>
    <script src="resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="resources/scripts/axutils.js"></script>
    <script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="resources/scripts/axurerp_beforepagescript.js"></script>
    <script src="resources/scripts/messagecenter.js"></script>
<script src='shoppingCart_files/data.js'></script>
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
<DIV id="u20" style="border-style:dotted; border-color:red; visibility:hidden; position:absolute; left:200px; top:6px; width:1047px; height:83px;;" ></div>
<DIV id="u21" style="" data-label="Step`s">
<DIV id="pd2u21" style="visibility:hidden;" data-label="Order submit successfully">
<div id="u22" class="u22_container"   >
<div id="u22_img" class="u22_normal detectCanvas"></div>
<div id="u23" class="u23" style="visibility:hidden;"  >
<div id="u23_rtf"></div>
</div>
</div>
<div id="u24" class="u24_container"   >
<div id="u24_img" class="u24_normal detectCanvas"></div>
<div id="u25" class="u25" style="visibility:hidden;"  >
<div id="u25_rtf"></div>
</div>
</div>
<div id="u26" class="u26_container"   >
<div id="u26_img" class="u26_normal detectCanvas"></div>
<div id="u27" class="u27" style="visibility:hidden;"  >
<div id="u27_rtf"></div>
</div>
</div>
<div id="u28" class="u28_container"   >
<div id="u28_img" class="u28_normal detectCanvas"></div>
<div id="u29" class="u29" style="visibility:hidden;"  >
<div id="u29_rtf"></div>
</div>
</div>
<div id="u30" class="u30_container"   >
<div id="u30_img" class="u30_normal detectCanvas"></div>
<div id="u31" class="u31" style="visibility:hidden;"  >
<div id="u31_rtf"></div>
</div>
</div><div id="u32" class="u32" >
<DIV id="u32_line" class="u32_line" ></DIV>
</div><div id="u33" class="u33" >
<DIV id="u33_line" class="u33_line" ></DIV>
</div><div id="u34" class="u34" >
<DIV id="u34_line" class="u34_line" ></DIV>
</div>
<div id="u35" class="u35"  data-label="paragraph">
<div id="u35_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#999999;">My Shopping Cart</span></p></div>
</div>
<div id="u36" class="u36"  data-label="paragraph">
<div id="u36_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#999999;">Fill order</span></p></div>
</div>
<div id="u37" class="u37"  data-label="paragraph">
<div id="u37_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">Submit order</span></p></div>
</div>
<div id="u38" class="u38"  data-label="paragraph">
<div id="u38_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Sucessful</span></p></div>
</div>
<div id="u39" class="u39_container"   >
<div id="u39_img" class="u39_normal detectCanvas"></div>
<div id="u40" class="u40"  >
<div id="u40_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Previous</span></p></div>
</div>
</div>
<div id="u41" class="u41_container"   >
<div id="u41_img" class="u41_normal detectCanvas"></div>
<div id="u42" class="u42"  >
<div id="u42_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Done</span></p></div>
</div>
</div>
<div id="u43" class="u43_container"   >
<div id="u43_img" class="u43_normal detectCanvas"></div>
<div id="u44" class="u44" style="visibility:hidden;"  >
<div id="u44_rtf"></div>
</div>
</div>
</DIV>
<DIV id="pd1u21" style="visibility:hidden;" data-label="Confirm your order">
<div id="u45" class="u45_container"   >
<div id="u45_img" class="u45_normal detectCanvas"></div>
<div id="u46" class="u46" style="visibility:hidden;"  >
<div id="u46_rtf"></div>
</div>
</div>
<DIV id="u47" class="u47;" data-label="Table">

</DIV>

<DIV id="u47container" style="position:absolute; left:34px; top:134px; width:666px; height:586px; overflow:visible">

<div id="u48" class="u48_container"   >
<div id="u48_img" class="u48_normal detectCanvas"></div>
<div id="u49" class="u49"  >
<div id="u49_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">Address </span></p></div>
</div>
</div>
<div id="u50" class="u50_container"   >
<div id="u50_img" class="u50_normal detectCanvas"></div>
<div id="u51" class="u51"  >
<div id="u51_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Payment method</span></p></div>
</div>
</div>
<div id="u52" class="u52_container"   >
<div id="u52_img" class="u52_normal detectCanvas"></div>
<div id="u53" class="u53"  >
<div id="u53_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Product List</span></p></div>
</div>
</div>
<div id="u54" class="u54_container"   >
<div id="u54_img" class="u54_normal detectCanvas"></div>
<div id="u55" class="u55"  >
<div id="u55_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Order summary</span></p></div>
</div>
</div>
</DIV>
<div id="u56" class="u56_container"   >
<div id="u56_img" class="u56_normal detectCanvas"></div>
<div id="u57" class="u57" style="visibility:hidden;"  >
<div id="u57_rtf"></div>
</div>
</div>
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
</div><div id="u64" class="u64" >
<DIV id="u64_line" class="u64_line" ></DIV>
</div><div id="u65" class="u65" >
<DIV id="u65_line" class="u65_line" ></DIV>
</div><div id="u66" class="u66" >
<DIV id="u66_line" class="u66_line" ></DIV>
</div>
<div id="u67" class="u67"  data-label="paragraph">
<div id="u67_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#999999;">My Shopping Cart</span></p></div>
</div>
<div id="u68" class="u68"  data-label="paragraph">
<div id="u68_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">Fill order</span></p></div>
</div>
<div id="u69" class="u69"  data-label="paragraph">
<div id="u69_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Submit order</span></p></div>
</div>
<div id="u70" class="u70"  data-label="paragraph">
<div id="u70_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Successful</span></p></div>
</div>
<div id="u71" class="u71_container"   >
<div id="u71_img" class="u71_normal detectCanvas"></div>
<div id="u72" class="u72"  >
<div id="u72_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Previous</span></p></div>
</div>
</div>
<div id="u73" class="u73_container"   >
<div id="u73_img" class="u73_normal detectCanvas"></div>
<div id="u74" class="u74"  >
<div id="u74_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Done</span></p></div>
</div>
</div>
<INPUT id="u75" type=text value="" class="u75" data-label="Input Field"    >

<DIV id="u76container" style="position:absolute; left:173px; top:200px; width:170px; height:15px; ; ; ;" >
<LABEL for="u76">
<div id="u77" class="u77"  >
<div id="u77_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Cash on delivery</span></p></div>
</div>
</LABEL>
<INPUT id="u76" name="u76" style="position:absolute; left:-3px; top:-2px;" type="radio" value="radio" checked  data-label="Radio Button">
</DIV>
<DIV id="u78container" style="position:absolute; left:173px; top:235px; width:170px; height:15px; ; ; ;" >
<LABEL for="u78">
<div id="u79" class="u79"  >
<div id="u79_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Payed with credit card</span></p></div>
</div>
</LABEL>
<INPUT id="u78" name="u78" style="position:absolute; left:-3px; top:-2px;" type="radio" value="radio"   data-label="Radio Button">
</DIV>
<DIV id="u80container" style="position:absolute; left:173px; top:271px; width:170px; height:15px; ; ; ;" >
<LABEL for="u80">
<div id="u81" class="u81"  >
<div id="u81_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Payed online</span></p></div>
</div>
</LABEL>
<INPUT id="u80" name="u80" style="position:absolute; left:-3px; top:-2px;" type="radio" value="radio"   data-label="Radio Button">
</DIV>
<DIV id="u82" class="u82;" data-label="Table">

</DIV>

<DIV id="u82container" style="position:absolute; left:170px; top:578px; width:505px; height:125px; overflow:visible">

<div id="u83" class="u83_container"   >
<div id="u83_img" class="u83_normal detectCanvas"></div>
<div id="u84" class="u84" style="visibility:hidden;"  >
<div id="u84_rtf"></div>
</div>
</div>
<div id="u85" class="u85_container"   >
<div id="u85_img" class="u85_normal detectCanvas"></div>
<div id="u86" class="u86" style="visibility:hidden;"  >
<div id="u86_rtf"></div>
</div>
</div>
<div id="u87" class="u87_container"   >
<div id="u87_img" class="u87_normal detectCanvas"></div>
<div id="u88" class="u88" style="visibility:hidden;"  >
<div id="u88_rtf"></div>
</div>
</div>
<div id="u89" class="u89_container"   >
<div id="u89_img" class="u89_normal detectCanvas"></div>
<div id="u90" class="u90" style="visibility:hidden;"  >
<div id="u90_rtf"></div>
</div>
</div>
<div id="u91" class="u91_container"   >
<div id="u91_img" class="u91_normal detectCanvas"></div>
<div id="u92" class="u92" style="visibility:hidden;"  >
<div id="u92_rtf"></div>
</div>
</div>
<div id="u93" class="u93_container"   >
<div id="u93_img" class="u93_normal detectCanvas"></div>
<div id="u94" class="u94" style="visibility:hidden;"  >
<div id="u94_rtf"></div>
</div>
</div>
<div id="u95" class="u95_container"   >
<div id="u95_img" class="u95_normal detectCanvas"></div>
<div id="u96" class="u96" style="visibility:hidden;"  >
<div id="u96_rtf"></div>
</div>
</div>
<div id="u97" class="u97_container"   >
<div id="u97_img" class="u97_normal detectCanvas"></div>
<div id="u98" class="u98" style="visibility:hidden;"  >
<div id="u98_rtf"></div>
</div>
</div>
</DIV>
<DIV id="u99" class="u99;" data-label="Table">

</DIV>

<DIV id="u99container" style="position:absolute; left:170px; top:322px; width:505px; height:215px; overflow:visible">

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
<div id="u168" class="u168_container"   >
<div id="u168_img" class="u168_normal detectCanvas"></div>
<div id="u169" class="u169" style="visibility:hidden;"  >
<div id="u169_rtf"></div>
</div>
</div>
</DIV>
</DIV>
<DIV id="pd0u21" style="" data-label="My Shopping Cart">
<div id="u170" class="u170_container"   >
<div id="u170_img" class="u170_normal detectCanvas"></div>
<div id="u171" class="u171" style="visibility:hidden;"  >
<div id="u171_rtf"></div>
</div>
</div>
<div id="u172" class="u172_container"   >
<div id="u172_img" class="u172_normal detectCanvas"></div>
<div id="u173" class="u173" style="visibility:hidden;"  >
<div id="u173_rtf"></div>
</div>
</div>
<div id="u174" class="u174_container"   >
<div id="u174_img" class="u174_normal detectCanvas"></div>
<div id="u175" class="u175" style="visibility:hidden;"  >
<div id="u175_rtf"></div>
</div>
</div>
<div id="u176" class="u176_container"   >
<div id="u176_img" class="u176_normal detectCanvas"></div>
<div id="u177" class="u177" style="visibility:hidden;"  >
<div id="u177_rtf"></div>
</div>
</div><div id="u178" class="u178" >
<DIV id="u178_line" class="u178_line" ></DIV>
</div><div id="u179" class="u179" >
<DIV id="u179_line" class="u179_line" ></DIV>
</div>
<div id="u180" class="u180"  data-label="paragraph">
<div id="u180_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">My Shopping Cart</span></p></div>
</div>
<div id="u181" class="u181"  data-label="paragraph">
<div id="u181_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Fill order</span></p></div>
</div>
<div id="u182" class="u182"  data-label="paragraph">
<div id="u182_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Submit order</span></p></div>
</div>
<div id="u183" class="u183_container"   >
<div id="u183_img" class="u183_normal detectCanvas"></div>
<div id="u184" class="u184"  >
<div id="u184_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Done</span></p></div>
</div>
</div>
<DIV id="u185" style="" data-label="Item in Cart 1">
<DIV id="pd0u185" style="" data-label="State1">
<div id="u186" class="u186_container"   >
<div id="u186_img" class="u186_normal detectCanvas"></div>
<div id="u187" class="u187" style="visibility:hidden;"  >
<div id="u187_rtf"></div>
</div>
</div>
<div id="u188" class="u188_container"   >
<div id="u188_img" class="u188_normal detectCanvas"></div>
<div id="u189" class="u189"  >
<div id="u189_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">-</span></p></div>
</div>
</div>
<div id="u190" class="u190_container"   >
<div id="u190_img" class="u190_normal detectCanvas"></div>
<div id="u191" class="u191"  >
<div id="u191_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">+</span></p></div>
</div>
</div>
<div id="u192" class="u192_container"   >
<div id="u192_img" class="u192_normal detectCanvas"></div>
<div id="u193" class="u193"  >
<div id="u193_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">1</span></p></div>
</div>
</div>
<div id="u194" class="u194_container"   data-label="Link">
<div id="u194_img" class="u194_normal detectCanvas"></div>
<div id="u195" class="u195"  >
<div id="u195_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">Item Name</span></p></div>
</div>
</div>
<div id="u196" class="u196"  data-label="paragraph">
<div id="u196_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#666666;">$2 700</span></p></div>
</div>
<div id="u197" class="u197_container"   >
<div id="u197_img" class="u197_normal detectCanvas"></div>
<div id="u198" class="u198"  >
<div id="u198_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:9px;font-weight:bold;font-style:normal;text-decoration:none;color:#999999;">Item photo</span></p><p style="text-align:center;"><span style="font-family:Arial;font-size:9px;font-weight:bold;font-style:normal;text-decoration:none;color:#999999;">50*50</span></p></div>
</div>
</div>
<div id="u199" class="u199_container"   >
<div id="u199_img" class="u199_normal detectCanvas"></div>
<div id="u200" class="u200" style="visibility:hidden;"  >
<div id="u200_rtf"></div>
</div>
</div>
<div id="u201" class="u201"  data-label="paragraph">
<div id="u201_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#666666;">$2 700</span></p></div>
</div>
</DIV>
</DIV>
<div id="u202" class="u202_container"   >
<div id="u202_img" class="u202_normal detectCanvas"></div>
<div id="u203" class="u203" style="visibility:hidden;"  >
<div id="u203_rtf"></div>
</div>
</div>
<div id="u204" class="u204"  data-label="text - h2">
<div id="u204_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#FFFFFF;">Quantity</span></p></div>
</div>
<div id="u205" class="u205"  data-label="text - h2">
<div id="u205_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#FFFFFF;">Total</span></p></div>
</div>
<div id="u206" class="u206"  data-label="text - h2">
<div id="u206_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#FFFFFF;">Item Name</span></p></div>
</div>
<div id="u207" class="u207"  data-label="text - h2">
<div id="u207_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#FFFFFF;">Price</span></p></div>
</div>
<DIV id="u208" style="" data-label="Down Panel">
<DIV id="pd2u208" style="visibility:hidden;" data-label="0 Items in Cart"><div id="u209" class="u209" >
<DIV id="u209_line" class="u209_line" ></DIV>
</div>
<div id="u210" class="u210"  data-label="paragraph">
<div id="u210_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">$0</span></p></div>
</div>
<div id="u211" class="u211"  data-label="paragraph">
<div id="u211_rtf"><p style="text-align:right;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Cost before shipping =</span></p></div>
</div>
<div id="u212" class="u212_container"   data-label="Link">
<div id="u212_img" class="u212_normal detectCanvas"></div>
<div id="u213" class="u213"  >
<div id="u213_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">Continue shopping</span></p></div>
</div>
</div>
</DIV>
<DIV id="pd1u208" style="visibility:hidden;" data-label="1 Items in Cart">
<div id="u214" class="u214_container"   >
<div id="u214_img" class="u214_normal detectCanvas"></div>
<div id="u215" class="u215"  >
<div id="u215_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Go to Checout</span></p></div>
</div>
</div><div id="u216" class="u216" >
<DIV id="u216_line" class="u216_line" ></DIV>
</div>
<div id="u217" class="u217"  data-label="paragraph">
<div id="u217_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">$2 700</span></p></div>
</div>
<div id="u218" class="u218"  data-label="paragraph">
<div id="u218_rtf"><p style="text-align:right;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Cost before shipping =</span></p></div>
</div>
<div id="u219" class="u219_container"   data-label="Link">
<div id="u219_img" class="u219_normal detectCanvas"></div>
<div id="u220" class="u220"  >
<div id="u220_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">Continue shopping</span></p></div>
</div>
</div>
</DIV>
<DIV id="pd0u208" style="" data-label="2 Items in Cart">
<div id="u221" class="u221_container"   >
<div id="u221_img" class="u221_normal detectCanvas"></div>
<div id="u222" class="u222"  >
<div id="u222_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Go to Checout</span></p></div>
</div>
</div><div id="u223" class="u223" >
<DIV id="u223_line" class="u223_line" ></DIV>
</div>
<div id="u224" class="u224"  data-label="paragraph">
<div id="u224_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:16px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">$5 400</span></p></div>
</div>
<div id="u225" class="u225"  data-label="paragraph">
<div id="u225_rtf"><p style="text-align:right;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Cost before shipping =</span></p></div>
</div>
<div id="u226" class="u226_container"   data-label="Link">
<div id="u226_img" class="u226_normal detectCanvas"></div>
<div id="u227" class="u227"  >
<div id="u227_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#0099FF;">Continue shopping</span></p></div>
</div>
</div>
</DIV>
</DIV>
<DIV id="u228" style="" data-label="Item in Cart 2">
<DIV id="pd0u228" style="" data-label="State1">
<div id="u229" class="u229_container"   >
<div id="u229_img" class="u229_normal detectCanvas"></div>
<div id="u230" class="u230" style="visibility:hidden;"  >
<div id="u230_rtf"></div>
</div>
</div>
<div id="u231" class="u231_container"   >
<div id="u231_img" class="u231_normal detectCanvas"></div>
<div id="u232" class="u232"  >
<div id="u232_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">-</span></p></div>
</div>
</div>
<div id="u233" class="u233_container"   >
<div id="u233_img" class="u233_normal detectCanvas"></div>
<div id="u234" class="u234"  >
<div id="u234_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">+</span></p></div>
</div>
</div>
<div id="u235" class="u235_container"   >
<div id="u235_img" class="u235_normal detectCanvas"></div>
<div id="u236" class="u236"  >
<div id="u236_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">1</span></p></div>
</div>
</div>
<div id="u237" class="u237_container"   data-label="Link">
<div id="u237_img" class="u237_normal detectCanvas"></div>
<div id="u238" class="u238"  >
<div id="u238_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">Item Name</span></p></div>
</div>
</div>
<div id="u239" class="u239"  data-label="paragraph">
<div id="u239_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#666666;">$2 700</span></p></div>
</div>
<div id="u240" class="u240_container"   >
<div id="u240_img" class="u240_normal detectCanvas"></div>
<div id="u241" class="u241"  >
<div id="u241_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:9px;font-weight:bold;font-style:normal;text-decoration:none;color:#999999;">Item photo</span></p><p style="text-align:center;"><span style="font-family:Arial;font-size:9px;font-weight:bold;font-style:normal;text-decoration:none;color:#999999;">50*50</span></p></div>
</div>
</div>
<div id="u242" class="u242_container"   >
<div id="u242_img" class="u242_normal detectCanvas"></div>
<div id="u243" class="u243" style="visibility:hidden;"  >
<div id="u243_rtf"></div>
</div>
</div>
<div id="u244" class="u244"  data-label="paragraph">
<div id="u244_rtf"><p style="text-align:left;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#666666;">$2 700</span></p></div>
</div>
</DIV>
</DIV>
<div id="u245" class="u245_container"   >
<div id="u245_img" class="u245_normal detectCanvas"></div>
<div id="u246" class="u246" style="visibility:hidden;"  >
<div id="u246_rtf"></div>
</div>
</div>
<div id="u247" class="u247"  data-label="paragraph">
<div id="u247_rtf"><p style="text-align:center;"><span style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Successful</span></p></div>
</div><div id="u248" class="u248" >
<DIV id="u248_line" class="u248_line" ></DIV>
</div>
</DIV>
</DIV>
</div>
<div class="preload"><img src="Header_files/u0_normal.png" width="1" height="1"/><img src="Header_files/u3_line.png" width="1" height="1"/><img src="Header_files/u10_mouseOver.png" width="1" height="1"/><img src="Header_files/u10_normal.png" width="1" height="1"/><img src="Header_files/Rectangle_u12_normal.png" width="1" height="1"/><img src="Header_files/u15_normal.png" width="1" height="1"/><img src="Header_files/u17_normal.png" width="1" height="1"/><img src="shoppingCart_files/u22_normal.png" width="1" height="1"/><img src="shoppingCart_files/u24_normal.png" width="1" height="1"/><img src="shoppingCart_files/u28_normal.png" width="1" height="1"/><img src="shoppingCart_files/u30_normal.png" width="1" height="1"/><img src="shoppingCart_files/u32_line.png" width="1" height="1"/><img src="shoppingCart_files/u33_line.png" width="1" height="1"/><img src="shoppingCart_files/u34_line.png" width="1" height="1"/><img src="shoppingCart_files/u39_mouseOver.png" width="1" height="1"/><img src="shoppingCart_files/u39_normal.png" width="1" height="1"/><img src="shoppingCart_files/u41_mouseOver.png" width="1" height="1"/><img src="shoppingCart_files/u41_normal.png" width="1" height="1"/><img src="shoppingCart_files/u43_normal.png" width="1" height="1"/><img src="shoppingCart_files/u48_normal.png" width="1" height="1"/><img src="shoppingCart_files/u50_normal.png" width="1" height="1"/><img src="shoppingCart_files/u52_normal.png" width="1" height="1"/><img src="shoppingCart_files/u54_normal.png" width="1" height="1"/><img src="shoppingCart_files/u64_line.png" width="1" height="1"/><img src="shoppingCart_files/u65_line.png" width="1" height="1"/><img src="shoppingCart_files/u66_line.png" width="1" height="1"/><img src="shoppingCart_files/u83_normal.png" width="1" height="1"/><img src="shoppingCart_files/u85_normal.png" width="1" height="1"/><img src="shoppingCart_files/u87_normal.png" width="1" height="1"/><img src="shoppingCart_files/u89_normal.png" width="1" height="1"/><img src="shoppingCart_files/u91_normal.png" width="1" height="1"/><img src="shoppingCart_files/u93_normal.png" width="1" height="1"/><img src="shoppingCart_files/u100_normal.png" width="1" height="1"/><img src="shoppingCart_files/u110_normal.png" width="1" height="1"/><img src="shoppingCart_files/u120_normal.png" width="1" height="1"/><img src="shoppingCart_files/u170_normal.png" width="1" height="1"/><img src="shoppingCart_files/u178_line.png" width="1" height="1"/><img src="shoppingCart_files/u179_line.png" width="1" height="1"/><img src="shoppingCart_files/u186_normal.png" width="1" height="1"/><img src="shoppingCart_files/u188_normal.png" width="1" height="1"/><img src="shoppingCart_files/u190_normal.png" width="1" height="1"/><img src="shoppingCart_files/u192_normal.png" width="1" height="1"/><img src="shoppingCart_files/u197_normal.png" width="1" height="1"/><img src="shoppingCart_files/u199_normal.png" width="1" height="1"/><img src="shoppingCart_files/u202_normal.png" width="1" height="1"/><img src="shoppingCart_files/u209_line.png" width="1" height="1"/><img src="shoppingCart_files/u214_mouseOver.png" width="1" height="1"/><img src="shoppingCart_files/u214_normal.png" width="1" height="1"/><img src="shoppingCart_files/u216_line.png" width="1" height="1"/><img src="shoppingCart_files/u223_line.png" width="1" height="1"/><img src="shoppingCart_files/u229_normal.png" width="1" height="1"/><img src="shoppingCart_files/u248_line.png" width="1" height="1"/></div>
</body>
<script src="resources/scripts/axurerp_pagescript.js"></script>
<script src="shoppingCart_files/axurerp_pagespecificscript.js" charset="utf-8"></script>