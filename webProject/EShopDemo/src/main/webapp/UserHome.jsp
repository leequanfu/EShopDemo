<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>UserHome</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<link href="resources/css/jquery-ui-themes.css" type="text/css"
	rel="stylesheet">
<link href="resources/css/axure_rp_page.css" type="text/css"
	rel="stylesheet">
<link href="UserHome_files/axurerp_pagespecificstyles.css"
	type="text/css" rel="stylesheet">
<!--[if IE 6]>
    <link href="UserHome_files/axurerp_pagespecificstyles_ie6.css" type="text/css" rel="stylesheet">
<![endif]-->
<script src="data/sitemap.js"></script>
<script src="resources/scripts/jquery-1.7.1.min.js"></script>
<script src="resources/scripts/axutils.js"></script>
<script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
<script src="resources/scripts/axurerp_beforepagescript.js"></script>
<script src="resources/scripts/messagecenter.js"></script>
<script src='UserHome_files/data.js'></script>
</head>
<body>
	<div id="main_container">
		<div id="u0" class="u0_container">
			<div id="u0_img" class="u0_normal detectCanvas"></div>
			<div id="u1" class="u1" style="visibility:hidden;">
				<div id="u1_rtf"></div>
			</div>
		</div>
		<div id="u2" class="u2" data-label="paragraph">
			<div id="u2_rtf">
				<p style="text-align:left;">
					<span
						style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Welcome
						to EShopDemo</span><span
						style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">!
					</span>
				</p>
			</div>
		</div>
		<div id="u3" class="u3">
			<DIV id="u3_line" class="u3_line"></DIV>
		</div>
		<div id="u4" class="u4_container" data-label="link">
			<div id="u4_img" class="u4_normal detectCanvas"></div>
			<div id="u5" class="u5">
				<div id="u5_rtf">
					<p style="text-align:left;">
						<span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">[Sign
							in]</span>
					</p>
				</div>
			</div>
		</div>
		<div id="u6" class="u6_container" data-label="link">
			<div id="u6_img" class="u6_normal detectCanvas"></div>
			<div id="u7" class="u7">
				<div id="u7_rtf">
					<p style="text-align:left;">
						<span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">[</span><span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">Sign
							up</span><span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">
							For Free</span><span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">]</span>
					</p>
				</div>
			</div>
		</div>
		<div id="u8" class="u8_container" data-label="link">
			<div id="u8_img" class="u8_normal detectCanvas"></div>
			<div id="u9" class="u9">
				<div id="u9_rtf">
					<p style="text-align:left;">
						<span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#004080;">My
							orders</span>
					</p>
				</div>
			</div>
		</div>
		<div id="u10" class="u10_container">
			<div id="u10_img" class="u10_normal detectCanvas"></div>
			<div id="u11" class="u11">
				<div id="u11_rtf">
					<p style="text-align:center;">
						<span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FFFFFF;">Search</span>
					</p>
				</div>
			</div>
		</div>
		<div id="u12" class="u12_container" data-label="Rectangle">
			<div id="u12_img" class="u12_normal detectCanvas"></div>
			<div id="u13" class="u13" style="visibility:hidden;">
				<div id="u13_rtf"></div>
			</div>
		</div>
		<INPUT id="u14" type=text value="Search..." class="u14"
			data-label="Search Field" maxlength=128>

		<div id="u15" class="u15_container">
			<div id="u15_img" class="u15_normal detectCanvas"></div>
			<div id="u16" class="u16" style="visibility:hidden;">
				<div id="u16_rtf"></div>
			</div>
		</div>
		<div id="u17" class="u17_container">
			<div id="u17_img" class="u17_normal detectCanvas"></div>
			<div id="u18" class="u18" style="visibility:hidden;">
				<div id="u18_rtf"></div>
			</div>
		</div>
		<div id="u19" class="u19" data-label="TotalQuantity">
			<div id="u19_rtf">
				<p style="text-align:left;">
					<span
						style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">0</span>
				</p>
			</div>
		</div>
		<DIV id="u20"
			style="border-style:dotted; border-color:red; visibility:hidden; position:absolute; left:200px; top:0px; width:1047px; height:83px;;"></div>
		<div id="u21" class="u21_container" selectiongroup="ButtonBar"
			data-label="Option 1">
			<div id="u21_img" class="u21_normal detectCanvas"></div>
			<div id="u22" class="u22">
				<div id="u22_rtf">
					<p style="text-align:center;">
						<span
							style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Categories</span>
					</p>
				</div>
			</div>
		</div>
		<div id="u23" class="u23_container" selectiongroup="ButtonBar"
			data-label="Option 2">
			<div id="u23_img" class="u23_normal detectCanvas"></div>
			<div id="u24" class="u24">
				<div id="u24_rtf">
					<p style="text-align:center;">
						<span
							style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Main</span>
					</p>
				</div>
			</div>
		</div>
		<div id="u25" class="u25_container" selectiongroup="ButtonBar"
			data-label="Option 3">
			<div id="u25_img" class="u25_normal detectCanvas"></div>
			<div id="u26" class="u26">
				<div id="u26_rtf">
					<p style="text-align:center;">
						<span
							style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Special
							Offer</span>
					</p>
				</div>
			</div>
		</div>
		<div id="u27" class="u27_container" selectiongroup="ButtonBar"
			data-label="Option 4">
			<div id="u27_img" class="u27_normal detectCanvas"></div>
			<div id="u28" class="u28">
				<div id="u28_rtf">
					<p style="text-align:center;">
						<span
							style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Auction</span>
					</p>
				</div>
			</div>
		</div>
		<div id="u29" class="u29_container" selectiongroup="ButtonBar"
			data-label="Option 5">
			<div id="u29_img" class="u29_normal detectCanvas"></div>
			<div id="u30" class="u30" style="visibility:hidden;">
				<div id="u30_rtf"></div>
			</div>
		</div>
		<DIV id="u31container"
			style="position:absolute; left:207px; top:141px; width:276px; height:225px;; overflow:visible">

			<DIV id="u31_menu" class="u31_menu data-label="menu" detectCanvas"></DIV>

			<DIV id="u32" class="u32;" data-label="Menu Vertical"></DIV>

			<DIV id="u32container"
				style="position:absolute; left:0px; top:0px; width:281px; height:230px; overflow:visible">

				<div id="u33" class="u33_container">
					<div id="u33_img" class="u33_normal detectCanvas"></div>
					<div id="u34" class="u34">
						<div id="u34_rtf">
							<p style="text-align:center;">
								<span
									style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Books
									&amp; Magazines</span>
							</p>
						</div>
					</div>
				</div>
				<div id="u35" class="u35_container">
					<div id="u35_img" class="u35_normal detectCanvas"></div>
					<div id="u36" class="u36">
						<div id="u36_rtf">
							<p style="text-align:center;">
								<span
									style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Movies,
									Music &amp; Games</span>
							</p>
						</div>
					</div>
				</div>
				<div id="u37" class="u37_container">
					<div id="u37_img" class="u37_normal detectCanvas"></div>
					<div id="u38" class="u38">
						<div id="u38_rtf">
							<p style="text-align:center;">
								<span
									style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Cell
									Phones &amp; Accessories</span>
							</p>
						</div>
					</div>
				</div>
			</DIV>
		</DIV>
		<DIV id="sm0u31"
			style="position:absolute; left:207px; top:141px; width:276px; height:225px; visibility:hidden; width:1px; height:1px;"
			data-label="menu">
			<DIV id="u39container"
				style="position:absolute; left:276px; top:0px; width:120px; height:114px;; overflow:visible">

				<DIV id="u39_menu" class="u39_menu  detectCanvas"></DIV>

				<DIV id="u40" class="u40;"></DIV>

				<DIV id="u40container"
					style="position:absolute; left:0px; top:0px; width:125px; height:119px; overflow:visible">

					<div id="u41" class="u41_container">
						<div id="u41_img" class="u41_normal detectCanvas"></div>
						<div id="u42" class="u42">
							<div id="u42_rtf">
								<p style="text-align:center;">
									<span
										style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Books</span>
								</p>
							</div>
						</div>
					</div>
					<div id="u43" class="u43_container">
						<div id="u43_img" class="u43_normal detectCanvas"></div>
						<div id="u44" class="u44">
							<div id="u44_rtf">
								<p style="text-align:center;">
									<span
										style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Children
										Books</span>
								</p>
							</div>
						</div>
					</div>
					<div id="u45" class="u45_container">
						<div id="u45_img" class="u45_normal detectCanvas"></div>
						<div id="u46" class="u46">
							<div id="u46_rtf">
								<p style="text-align:center;">
									<span
										style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Text
										Books</span>
								</p>
							</div>
						</div>
					</div>
				</DIV>
			</DIV>
		</DIV>
		<script type="text/javascript">
			InitializeSubmenu('sm0u31', 'u33');
		</script>
		<DIV id="sm1u31"
			style="position:absolute; left:207px; top:141px; width:276px; height:225px; visibility:hidden; width:1px; height:1px;"
			data-label="menu">
			<DIV id="u47container"
				style="position:absolute; left:276px; top:150px; width:120px; height:116px;; overflow:visible">

				<DIV id="u47_menu" class="u47_menu  detectCanvas"></DIV>

				<DIV id="u48" class="u48;"></DIV>

				<DIV id="u48container"
					style="position:absolute; left:0px; top:0px; width:125px; height:123px; overflow:visible">

					<div id="u49" class="u49_container">
						<div id="u49_img" class="u49_normal detectCanvas"></div>
						<div id="u50" class="u50">
							<div id="u50_rtf">
								<p style="text-align:center;">
									<span
										style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Cell
										Phones</span>
								</p>
							</div>
						</div>
					</div>
					<div id="u51" class="u51_container">
						<div id="u51_img" class="u51_normal detectCanvas"></div>
						<div id="u52" class="u52">
							<div id="u52_rtf">
								<p style="text-align:center;">
									<span
										style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Accessories</span>
								</p>
							</div>
						</div>
					</div>
					<div id="u53" class="u53_container">
						<div id="u53_img" class="u53_normal detectCanvas"></div>
						<div id="u54" class="u54">
							<div id="u54_rtf">
								<p style="text-align:center;">
									<span
										style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Mobile
										Broadband</span>
								</p>
							</div>
						</div>
					</div>
				</DIV>
			</DIV>
		</DIV>
		<script type="text/javascript">
			InitializeSubmenu('sm1u31', 'u37');
		</script>
		<DIV id="sm2u31"
			style="position:absolute; left:207px; top:141px; width:276px; height:225px; visibility:hidden; width:1px; height:1px;"
			data-label="menu">
			<DIV id="u55container"
				style="position:absolute; left:276px; top:75px; width:120px; height:114px;; overflow:visible">

				<DIV id="u55_menu" class="u55_menu  detectCanvas"></DIV>

				<DIV id="u56" class="u56;"></DIV>

				<DIV id="u56container"
					style="position:absolute; left:0px; top:0px; width:125px; height:119px; overflow:visible">

					<div id="u57" class="u57_container">
						<div id="u57_img" class="u57_normal detectCanvas"></div>
						<div id="u58" class="u58">
							<div id="u58_rtf">
								<p style="text-align:center;">
									<span
										style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Movie
										&amp; Tv</span>
								</p>
							</div>
						</div>
					</div>
					<div id="u59" class="u59_container">
						<div id="u59_img" class="u59_normal detectCanvas"></div>
						<div id="u60" class="u60">
							<div id="u60_rtf">
								<p style="text-align:center;">
									<span
										style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Blu-ray</span>
								</p>
							</div>
						</div>
					</div>
					<div id="u61" class="u61_container">
						<div id="u61_img" class="u61_normal detectCanvas"></div>
						<div id="u62" class="u62">
							<div id="u62_rtf">
								<p style="text-align:center;">
									<span
										style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Music</span>
								</p>
							</div>
						</div>
					</div>
				</DIV>
			</DIV>
		</DIV>
		<script type="text/javascript">
			InitializeSubmenu('sm2u31', 'u35');
		</script>
		<DIV id="u63" style="" data-label="Fade In / Out Slider">
			<DIV id="pd4u63" style="visibility:hidden;" data-label="Slide 5">
				<div id="u64" class="u64_container">
					<div id="u64_img" class="u64_normal detectCanvas"></div>
					<div id="u65" class="u65" style="visibility:hidden;">
						<div id="u65_rtf"></div>
					</div>
				</div>
				<div id="u66" class="u66_container">
					<div id="u66_img" class="u66_normal detectCanvas"></div>
					<div id="u67" class="u67" style="visibility:hidden;">
						<div id="u67_rtf"></div>
					</div>
				</div>
				<div id="u68" class="u68">
					<div id="u68_rtf">
						<p style="text-align:center;">
							<span
								style="font-family:League Gothic;font-size:100px;font-weight:bold;font-style:normal;text-decoration:none;color:#D7D7D7;">SLIDE
								#5</span>
						</p>
					</div>
				</div>
				<div id="u69" class="u69_container">
					<div id="u69_img" class="u69_normal detectCanvas"></div>
					<div id="u70" class="u70" style="visibility:hidden;">
						<div id="u70_rtf"></div>
					</div>
				</div>
				<DIV id="u71" style="" data-label="Left Right Slide 5">
					<DIV id="pd1u71" style="visibility:hidden;" data-label="Shown">
						<div id="u72" class="u72_container" data-label="left arrow">
							<div id="u72_img" class="u72_normal detectCanvas"></div>
							<div id="u73" class="u73" style="visibility:hidden;">
								<div id="u73_rtf"></div>
							</div>
						</div>
						<div id="u74" class="u74_container" data-label="right arrow">
							<div id="u74_img" class="u74_normal detectCanvas"></div>
							<div id="u75" class="u75" style="visibility:hidden;">
								<div id="u75_rtf"></div>
							</div>
						</div>
					</DIV>
					<DIV id="pd0u71" style="" data-label="Hidden"></DIV>
				</DIV>
				<div id="u76" class="u76_container">
					<div id="u76_img">
						<img src="UserHome_files/u76_normal.jpg" class="raw_image">
					</div>
					<div id="u77" class="u77" style="visibility:hidden;">
						<div id="u77_rtf"></div>
					</div>
				</div>
			</DIV>
			<DIV id="pd3u63" style="visibility:hidden;" data-label="Slide 4">
				<div id="u78" class="u78_container">
					<div id="u78_img" class="u78_normal detectCanvas"></div>
					<div id="u79" class="u79" style="visibility:hidden;">
						<div id="u79_rtf"></div>
					</div>
				</div>
				<div id="u80" class="u80_container">
					<div id="u80_img" class="u80_normal detectCanvas"></div>
					<div id="u81" class="u81" style="visibility:hidden;">
						<div id="u81_rtf"></div>
					</div>
				</div>
				<div id="u82" class="u82">
					<div id="u82_rtf">
						<p style="text-align:center;">
							<span
								style="font-family:League Gothic;font-size:100px;font-weight:bold;font-style:normal;text-decoration:none;color:#D7D7D7;">SLIDE
								#4</span>
						</p>
					</div>
				</div>
				<div id="u83" class="u83_container">
					<div id="u83_img" class="u83_normal detectCanvas"></div>
					<div id="u84" class="u84" style="visibility:hidden;">
						<div id="u84_rtf"></div>
					</div>
				</div>
				<DIV id="u85" style="" data-label="Left Right Slide 4">
					<DIV id="pd1u85" style="visibility:hidden;" data-label="Shown">
						<div id="u86" class="u86_container" data-label="left arrow">
							<div id="u86_img" class="u86_normal detectCanvas"></div>
							<div id="u87" class="u87" style="visibility:hidden;">
								<div id="u87_rtf"></div>
							</div>
						</div>
						<div id="u88" class="u88_container" data-label="right arrow">
							<div id="u88_img" class="u88_normal detectCanvas"></div>
							<div id="u89" class="u89" style="visibility:hidden;">
								<div id="u89_rtf"></div>
							</div>
						</div>
					</DIV>
					<DIV id="pd0u85" style="" data-label="Hidden"></DIV>
				</DIV>
				<div id="u90" class="u90_container">
					<div id="u90_img">
						<img src="UserHome_files/u90_normal.jpg" class="raw_image">
					</div>
					<div id="u91" class="u91" style="visibility:hidden;">
						<div id="u91_rtf"></div>
					</div>
				</div>
			</DIV>
			<DIV id="pd2u63" style="visibility:hidden;" data-label="Slide 3">
				<div id="u92" class="u92_container">
					<div id="u92_img" class="u92_normal detectCanvas"></div>
					<div id="u93" class="u93" style="visibility:hidden;">
						<div id="u93_rtf"></div>
					</div>
				</div>
				<div id="u94" class="u94_container">
					<div id="u94_img" class="u94_normal detectCanvas"></div>
					<div id="u95" class="u95" style="visibility:hidden;">
						<div id="u95_rtf"></div>
					</div>
				</div>
				<div id="u96" class="u96">
					<div id="u96_rtf">
						<p style="text-align:center;">
							<span
								style="font-family:League Gothic;font-size:100px;font-weight:bold;font-style:normal;text-decoration:none;color:#D7D7D7;">SLIDE
								#3</span>
						</p>
					</div>
				</div>
				<div id="u97" class="u97_container">
					<div id="u97_img" class="u97_normal detectCanvas"></div>
					<div id="u98" class="u98" style="visibility:hidden;">
						<div id="u98_rtf"></div>
					</div>
				</div>
				<DIV id="u99" style="" data-label="Left Right Slide 3">
					<DIV id="pd1u99" style="visibility:hidden;" data-label="Shown">
						<div id="u100" class="u100_container" data-label="left arrow">
							<div id="u100_img" class="u100_normal detectCanvas"></div>
							<div id="u101" class="u101" style="visibility:hidden;">
								<div id="u101_rtf"></div>
							</div>
						</div>
						<div id="u102" class="u102_container" data-label="right arrow">
							<div id="u102_img" class="u102_normal detectCanvas"></div>
							<div id="u103" class="u103" style="visibility:hidden;">
								<div id="u103_rtf"></div>
							</div>
						</div>
					</DIV>
					<DIV id="pd0u99" style="" data-label="Hidden"></DIV>
				</DIV>
				<div id="u104" class="u104_container">
					<div id="u104_img">
						<img src="UserHome_files/u104_normal.jpg" class="raw_image">
					</div>
					<div id="u105" class="u105" style="visibility:hidden;">
						<div id="u105_rtf"></div>
					</div>
				</div>
			</DIV>
			<DIV id="pd1u63" style="visibility:hidden;" data-label="Slide 2">
				<div id="u106" class="u106_container">
					<div id="u106_img" class="u106_normal detectCanvas"></div>
					<div id="u107" class="u107" style="visibility:hidden;">
						<div id="u107_rtf"></div>
					</div>
				</div>
				<div id="u108" class="u108_container">
					<div id="u108_img" class="u108_normal detectCanvas"></div>
					<div id="u109" class="u109" style="visibility:hidden;">
						<div id="u109_rtf"></div>
					</div>
				</div>
				<div id="u110" class="u110">
					<div id="u110_rtf">
						<p style="text-align:center;">
							<span
								style="font-family:League Gothic;font-size:100px;font-weight:bold;font-style:normal;text-decoration:none;color:#D7D7D7;">SLIDE
								#2</span>
						</p>
					</div>
				</div>
				<div id="u111" class="u111_container">
					<div id="u111_img" class="u111_normal detectCanvas"></div>
					<div id="u112" class="u112" style="visibility:hidden;">
						<div id="u112_rtf"></div>
					</div>
				</div>
				<DIV id="u113" style="" data-label="Left Right Slide 2">
					<DIV id="pd1u113" style="visibility:hidden;" data-label="Shown">
						<div id="u114" class="u114_container" data-label="left arrow">
							<div id="u114_img" class="u114_normal detectCanvas"></div>
							<div id="u115" class="u115" style="visibility:hidden;">
								<div id="u115_rtf"></div>
							</div>
						</div>
						<div id="u116" class="u116_container" data-label="right arrow">
							<div id="u116_img" class="u116_normal detectCanvas"></div>
							<div id="u117" class="u117" style="visibility:hidden;">
								<div id="u117_rtf"></div>
							</div>
						</div>
					</DIV>
					<DIV id="pd0u113" style="" data-label="Hidden"></DIV>
				</DIV>
				<div id="u118" class="u118_container">
					<div id="u118_img">
						<img src="UserHome_files/u118_normal.jpg" class="raw_image">
					</div>
					<div id="u119" class="u119" style="visibility:hidden;">
						<div id="u119_rtf"></div>
					</div>
				</div>
			</DIV>
			<DIV id="pd0u63" style="" data-label="Slide 1">
				<div id="u120" class="u120_container">
					<div id="u120_img" class="u120_normal detectCanvas"></div>
					<div id="u121" class="u121" style="visibility:hidden;">
						<div id="u121_rtf"></div>
					</div>
				</div>
				<div id="u122" class="u122_container">
					<div id="u122_img" class="u122_normal detectCanvas"></div>
					<div id="u123" class="u123" style="visibility:hidden;">
						<div id="u123_rtf"></div>
					</div>
				</div>
				<div id="u124" class="u124" style="visibility:hidden;">
					<div id="u124_rtf"></div>
				</div>
				<div id="u125" class="u125_container">
					<div id="u125_img" class="u125_normal detectCanvas"></div>
					<div id="u126" class="u126" style="visibility:hidden;">
						<div id="u126_rtf"></div>
					</div>
				</div>
				<div id="u127" class="u127_container" data-label="image">
					<div id="u127_img">
						<img src="UserHome_files/image_u127_normal.jpg" class="raw_image">
					</div>
					<div id="u128" class="u128" style="visibility:hidden;">
						<div id="u128_rtf"></div>
					</div>
				</div>
				<DIV id="u129" style="" data-label="Left / Right - Slide 1">
					<DIV id="pd1u129" style="visibility:hidden;" data-label="Shown">
						<div id="u130" class="u130_container" data-label="left arrow">
							<div id="u130_img" class="u130_normal detectCanvas"></div>
							<div id="u131" class="u131" style="visibility:hidden;">
								<div id="u131_rtf"></div>
							</div>
						</div>
						<div id="u132" class="u132_container" data-label="right arrow">
							<div id="u132_img" class="u132_normal detectCanvas"></div>
							<div id="u133" class="u133" style="visibility:hidden;">
								<div id="u133_rtf"></div>
							</div>
						</div>
					</DIV>
					<DIV id="pd0u129" style="" data-label="Hidden"></DIV>
				</DIV>
			</DIV>
		</DIV>
		<DIV id="u134" style="" data-label="Dots Nav">
			<DIV id="pd4u134" style="visibility:hidden;" data-label="Dot 5">
				<div id="u135" class="u135_container">
					<div id="u135_img" class="u135_normal detectCanvas"></div>
					<div id="u136" class="u136" style="visibility:hidden;">
						<div id="u136_rtf"></div>
					</div>
				</div>
				<div id="u137" class="u137_container">
					<div id="u137_img" class="u137_normal detectCanvas"></div>
					<div id="u138" class="u138" style="visibility:hidden;">
						<div id="u138_rtf"></div>
					</div>
				</div>
				<div id="u139" class="u139_container">
					<div id="u139_img" class="u139_normal detectCanvas"></div>
					<div id="u140" class="u140" style="visibility:hidden;">
						<div id="u140_rtf"></div>
					</div>
				</div>
				<div id="u141" class="u141_container">
					<div id="u141_img" class="u141_normal detectCanvas"></div>
					<div id="u142" class="u142" style="visibility:hidden;">
						<div id="u142_rtf"></div>
					</div>
				</div>
				<div id="u143" class="u143_container">
					<div id="u143_img" class="u143_normal detectCanvas"></div>
					<div id="u144" class="u144" style="visibility:hidden;">
						<div id="u144_rtf"></div>
					</div>
				</div>
			</DIV>
			<DIV id="pd3u134" style="visibility:hidden;" data-label="Dot 4">
				<div id="u145" class="u145_container">
					<div id="u145_img" class="u145_normal detectCanvas"></div>
					<div id="u146" class="u146" style="visibility:hidden;">
						<div id="u146_rtf"></div>
					</div>
				</div>
				<div id="u147" class="u147_container">
					<div id="u147_img" class="u147_normal detectCanvas"></div>
					<div id="u148" class="u148" style="visibility:hidden;">
						<div id="u148_rtf"></div>
					</div>
				</div>
				<div id="u149" class="u149_container">
					<div id="u149_img" class="u149_normal detectCanvas"></div>
					<div id="u150" class="u150" style="visibility:hidden;">
						<div id="u150_rtf"></div>
					</div>
				</div>
				<div id="u151" class="u151_container">
					<div id="u151_img" class="u151_normal detectCanvas"></div>
					<div id="u152" class="u152" style="visibility:hidden;">
						<div id="u152_rtf"></div>
					</div>
				</div>
				<div id="u153" class="u153_container">
					<div id="u153_img" class="u153_normal detectCanvas"></div>
					<div id="u154" class="u154" style="visibility:hidden;">
						<div id="u154_rtf"></div>
					</div>
				</div>
			</DIV>
			<DIV id="pd2u134" style="visibility:hidden;" data-label="Dot 3">
				<div id="u155" class="u155_container">
					<div id="u155_img" class="u155_normal detectCanvas"></div>
					<div id="u156" class="u156" style="visibility:hidden;">
						<div id="u156_rtf"></div>
					</div>
				</div>
				<div id="u157" class="u157_container">
					<div id="u157_img" class="u157_normal detectCanvas"></div>
					<div id="u158" class="u158" style="visibility:hidden;">
						<div id="u158_rtf"></div>
					</div>
				</div>
				<div id="u159" class="u159_container">
					<div id="u159_img" class="u159_normal detectCanvas"></div>
					<div id="u160" class="u160" style="visibility:hidden;">
						<div id="u160_rtf"></div>
					</div>
				</div>
				<div id="u161" class="u161_container">
					<div id="u161_img" class="u161_normal detectCanvas"></div>
					<div id="u162" class="u162" style="visibility:hidden;">
						<div id="u162_rtf"></div>
					</div>
				</div>
				<div id="u163" class="u163_container">
					<div id="u163_img" class="u163_normal detectCanvas"></div>
					<div id="u164" class="u164" style="visibility:hidden;">
						<div id="u164_rtf"></div>
					</div>
				</div>
			</DIV>
			<DIV id="pd1u134" style="visibility:hidden;" data-label="Dot 2">
				<div id="u165" class="u165_container">
					<div id="u165_img" class="u165_normal detectCanvas"></div>
					<div id="u166" class="u166" style="visibility:hidden;">
						<div id="u166_rtf"></div>
					</div>
				</div>
				<div id="u167" class="u167_container">
					<div id="u167_img" class="u167_normal detectCanvas"></div>
					<div id="u168" class="u168" style="visibility:hidden;">
						<div id="u168_rtf"></div>
					</div>
				</div>
				<div id="u169" class="u169_container">
					<div id="u169_img" class="u169_normal detectCanvas"></div>
					<div id="u170" class="u170" style="visibility:hidden;">
						<div id="u170_rtf"></div>
					</div>
				</div>
				<div id="u171" class="u171_container">
					<div id="u171_img" class="u171_normal detectCanvas"></div>
					<div id="u172" class="u172" style="visibility:hidden;">
						<div id="u172_rtf"></div>
					</div>
				</div>
				<div id="u173" class="u173_container">
					<div id="u173_img" class="u173_normal detectCanvas"></div>
					<div id="u174" class="u174" style="visibility:hidden;">
						<div id="u174_rtf"></div>
					</div>
				</div>
			</DIV>
			<DIV id="pd0u134" style="" data-label="Dot 1">
				<div id="u175" class="u175_container">
					<div id="u175_img" class="u175_normal detectCanvas"></div>
					<div id="u176" class="u176" style="visibility:hidden;">
						<div id="u176_rtf"></div>
					</div>
				</div>
				<div id="u177" class="u177_container">
					<div id="u177_img" class="u177_normal detectCanvas"></div>
					<div id="u178" class="u178" style="visibility:hidden;">
						<div id="u178_rtf"></div>
					</div>
				</div>
				<div id="u179" class="u179_container">
					<div id="u179_img" class="u179_normal detectCanvas"></div>
					<div id="u180" class="u180" style="visibility:hidden;">
						<div id="u180_rtf"></div>
					</div>
				</div>
				<div id="u181" class="u181_container">
					<div id="u181_img" class="u181_normal detectCanvas"></div>
					<div id="u182" class="u182" style="visibility:hidden;">
						<div id="u182_rtf"></div>
					</div>
				</div>
				<div id="u183" class="u183_container">
					<div id="u183_img" class="u183_normal detectCanvas"></div>
					<div id="u184" class="u184" style="visibility:hidden;">
						<div id="u184_rtf"></div>
					</div>
				</div>
			</DIV>
		</DIV>
		<div id="u185" class="u185" data-label="Line Horizontal">
			<DIV id="u185_line" class="u185_line" data-label="Line Horizontal"></DIV>
		</div>
		<div id="u186" class="u186" data-label="Header 1">
			<div id="u186_rtf">
				<p style="text-align:center;">
					<span
						style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Books
						&amp; Magazines</span>
				</p>
			</div>
		</div>
		<div id="u187" class="u187" data-label="Line Horizontal">
			<DIV id="u187_line" class="u187_line" data-label="Line Horizontal"></DIV>
		</div>
		<div id="u188" class="u188" data-label="Header 1">
			<div id="u188_rtf">
				<p style="text-align:center;">
					<span
						style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Movies,
						Music &amp; Games</span>
				</p>
			</div>
		</div>
		<div id="u189" class="u189" data-label="Line Horizontal">
			<DIV id="u189_line" class="u189_line" data-label="Line Horizontal"></DIV>
		</div>
		<div id="u190" class="u190" data-label="Header 1">
			<div id="u190_rtf">
				<p style="text-align:center;">
					<span
						style="font-family:Arial;font-size:16px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Cell
						Phones &amp; Accessories</span>
				</p>
			</div>
		</div>
		<div id="u191" class="u191_container">
			<div id="u191_img" class="u191_normal detectCanvas"></div>
			<div id="u192" class="u192">
				<div id="u192_rtf">
					<p style="text-align:center;">
						<span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Copyright
							© 2013 </span><span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">Quanfu
							Li </span><span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">All
							rights reserved&nbsp; </span><span
							style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">email:
							leequanfu@gmail.com</span>
					</p>
				</div>
			</div>
		</div>
		<DIV id="u193"
			style="border-style:dotted; border-color:red; visibility:hidden; position:absolute; left:211px; top:1267px; width:996px; height:46px;;"></div>
		<!-- list books -->			
		<div style="position: absolute; 
					left: 567px; top:439px;
				    width:600px;
				    height:228px;">
				    <c:forEach var="book" items="${bookList}">
					    <div style="float: left;
								    width:150px;
								    height:100%;
								    text-align:center;">
								    <div style="width:112px; 
								    			height:160px; 
								    			padding-left: 19px;
								    			margin-bottom: 10px;">
										<a href="productDetail?id=${book.id}"><img src="images/${book.id}/main.jpg" class="raw_image"/></a>
									</div>
									<div style="margin-bottom: 10px;">
										<p>
											<span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">${book.title}</span>
										</p>
									</div>
									<div style="margin-bottom: 10px;">
										<p>
											<span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">$${book.price}</span>
										</p>
									</div>
					    </div>
				    </c:forEach>
		</div>
		
		<!-- list movies -->			
		<div style="position: absolute; 
					left: 567px; top:724px;
				    width:600px;
				    height:228px;">
				    <c:forEach var="movie" items="${movieList}">
					    <div style="float: left;
								    width:150px;
								    height:100%;
								    text-align:center;">
								    <div style="width:112px; 
								    			height:160px; 
								    			padding-left: 19px;
								    			margin-bottom: 10px;">
										<a href="productDetail?id=${movie.id}"><img src="images/${movie.id}/main.jpg" class="raw_image"/></a>
									</div>
									<div style="margin-bottom: 10px;">
										<p>
											<span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">${movie.title}</span>
										</p>
									</div>
									<div style="margin-bottom: 10px;">
										<p>
											<span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">$${movie.price}</span>
										</p>
									</div>
					    </div>
				    </c:forEach>
		</div>
		
		<!-- list phones -->			
		<div style="position: absolute; 
					left: 567px; top:1021px;
				    width:600px;
				    height:228px;">
				    <c:forEach var="phone" items="${phoneList}">
					    <div style="float: left;
								    width:150px;
								    height:100%;
								    text-align:center;">
								    <div style="width:112px; 
								    			height:160px; 
								    			padding-left: 19px;">
										<a href="productDetail?id=${phone.id}"><img src="images/${phone.id}/main.jpg" style="height: 80%"/></a>
									</div>
									<div style="margin-bottom: 10px;">
										<p>
											<span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">${phone.title}</span>
										</p>
									</div>
									<div style="margin-bottom: 10px;">
										<p>
											<span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">$${phone.price}</span>
										</p>
									</div>
					    </div>
				    </c:forEach>
		</div>
		
		<div id="u290" class="u290_container">
			<div id="u290_img">
				<img src="UserHome_files/u290_normal.jpg" class="raw_image">
			</div>
			<div id="u291" class="u291" style="visibility:hidden;">
				<div id="u291_rtf"></div>
			</div>
		</div>
		<div id="u292" class="u292_container">
			<div id="u292_img">
				<img src="UserHome_files/u292_normal.jpg" class="raw_image">
			</div>
			<div id="u293" class="u293" style="visibility:hidden;">
				<div id="u293_rtf"></div>
			</div>
		</div>
		<div id="u294" class="u294_container">
			<div id="u294_img">
				<img src="UserHome_files/u294_normal.jpg" class="raw_image">
			</div>
			<div id="u295" class="u295" style="visibility:hidden;">
				<div id="u295_rtf"></div>
			</div>
		</div>
		<DIV id="u296" style="visibility:hidden;" data-label="Dynamic Panel">
			<DIV id="pd0u296" style="" data-label="State1"></DIV>
		</DIV>
	</div>
	<div class="preload">
		<img src="Header_files/u0_normal.png" width="1" height="1" /><img
			src="Header_files/u3_line.png" width="1" height="1" /><img
			src="Header_files/u10_mouseOver.png" width="1" height="1" /><img
			src="Header_files/u10_normal.png" width="1" height="1" /><img
			src="Header_files/Rectangle_u12_normal.png" width="1" height="1" /><img
			src="Header_files/u15_normal.png" width="1" height="1" /><img
			src="Header_files/u17_normal.png" width="1" height="1" /><img
			src="UserHome_files/Option_1_u21_mouseOver.png" width="1" height="1" /><img
			src="UserHome_files/Option_1_u21_mouseDown.png" width="1" height="1" /><img
			src="UserHome_files/Option_1_u21_selected.png" width="1" height="1" /><img
			src="UserHome_files/Option_1_u21_normal.png" width="1" height="1" /><img
			src="UserHome_files/Option_2_u23_mouseOver.png" width="1" height="1" /><img
			src="UserHome_files/Option_2_u23_mouseDown.png" width="1" height="1" /><img
			src="UserHome_files/Option_2_u23_selected.png" width="1" height="1" /><img
			src="UserHome_files/Option_2_u23_normal.png" width="1" height="1" /><img
			src="UserHome_files/Option_3_u25_mouseOver.png" width="1" height="1" /><img
			src="UserHome_files/Option_3_u25_mouseDown.png" width="1" height="1" /><img
			src="UserHome_files/Option_3_u25_selected.png" width="1" height="1" /><img
			src="UserHome_files/Option_3_u25_normal.png" width="1" height="1" /><img
			src="UserHome_files/Option_4_u27_mouseOver.png" width="1" height="1" /><img
			src="UserHome_files/Option_4_u27_mouseDown.png" width="1" height="1" /><img
			src="UserHome_files/Option_4_u27_selected.png" width="1" height="1" /><img
			src="UserHome_files/Option_4_u27_normal.png" width="1" height="1" /><img
			src="UserHome_files/Option_5_u29_mouseOver.png" width="1" height="1" /><img
			src="UserHome_files/Option_5_u29_mouseDown.png" width="1" height="1" /><img
			src="UserHome_files/Option_5_u29_selected.png" width="1" height="1" /><img
			src="UserHome_files/Option_5_u29_normal.png" width="1" height="1" /><img
			src="UserHome_files/menu_u31_menu.png" width="1" height="1" /><img
			src="UserHome_files/u33_mouseOver.png" width="1" height="1" /><img
			src="UserHome_files/u33_selected.png" width="1" height="1" /><img
			src="UserHome_files/u33_normal.png" width="1" height="1" /><img
			src="UserHome_files/u39_menu.png" width="1" height="1" /><img
			src="UserHome_files/u41_mouseOver.png" width="1" height="1" /><img
			src="UserHome_files/u41_selected.png" width="1" height="1" /><img
			src="UserHome_files/u41_normal.png" width="1" height="1" /><img
			src="UserHome_files/u47_menu.png" width="1" height="1" /><img
			src="UserHome_files/u49_normal.png" width="1" height="1" /><img
			src="UserHome_files/u53_mouseOver.png" width="1" height="1" /><img
			src="UserHome_files/u53_selected.png" width="1" height="1" /><img
			src="UserHome_files/u53_normal.png" width="1" height="1" /><img
			src="UserHome_files/u55_menu.png" width="1" height="1" /><img
			src="UserHome_files/u64_normal.png" width="1" height="1" /><img
			src="UserHome_files/u66_normal.png" width="1" height="1" /><img
			src="UserHome_files/u69_normal.png" width="1" height="1" /><img
			src="UserHome_files/left_arrow_u72_normal.png" width="1" height="1" /><img
			src="UserHome_files/right_arrow_u74_normal.png" width="1" height="1" /><img
			src="UserHome_files/u76_normal.jpg" width="1" height="1" /><img
			src="UserHome_files/u90_normal.jpg" width="1" height="1" /><img
			src="UserHome_files/u104_normal.jpg" width="1" height="1" /><img
			src="UserHome_files/u118_normal.jpg" width="1" height="1" /><img
			src="UserHome_files/u120_normal.png" width="1" height="1" /><img
			src="UserHome_files/image_u127_normal.jpg" width="1" height="1" /><img
			src="UserHome_files/u135_normal.png" width="1" height="1" /><img
			src="UserHome_files/u139_normal.png" width="1" height="1" /><img
			src="UserHome_files/u143_normal.png" width="1" height="1" /><img
			src="UserHome_files/u151_normal.png" width="1" height="1" /><img
			src="UserHome_files/u175_normal.png" width="1" height="1" /><img
			src="UserHome_files/Line_Horizontal_u185_line.png" width="1"
			height="1" /><img src="UserHome_files/Line_Horizontal_u187_line.png"
			width="1" height="1" /><img
			src="UserHome_files/Line_Horizontal_u189_line.png" width="1"
			height="1" /><img src="Footer_files/u191_normal.png" width="1"
			height="1" /><img src="UserHome_files/u194_normal.png" width="1"
			height="1" /><img src="UserHome_files/u196_normal.jpg" width="1"
			height="1" /><img src="UserHome_files/u198_normal.png" width="1"
			height="1" /><img src="UserHome_files/u200_normal.png" width="1"
			height="1" /><img src="UserHome_files/u290_normal.jpg" width="1"
			height="1" /><img src="UserHome_files/u292_normal.jpg" width="1"
			height="1" /><img src="UserHome_files/u294_normal.jpg" width="1"
			height="1" />
	</div>
</body>
<script src="resources/scripts/axurerp_pagescript.js"></script>
<script src="UserHome_files/axurerp_pagespecificscript.js"
	charset="utf-8"></script>