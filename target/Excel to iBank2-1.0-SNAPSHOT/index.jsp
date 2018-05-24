<%--<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<title>ExcelToiBank2</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%--<jsp:include page="./css/main.css"/>--%>
		<%--<link rel="stylesheet" href="css/main.css" type="text/css"/>--%>
        <style>
            <%@include file='css/main.css' %>
        </style>
		<%--<link href="<c:url value="D:/Java/ExceltoiBank2/src/main/webapp/css/main.css" />" rel="stylesheet">--%>
	</head>
	<body>
		<%--<h1>Hello World!</h1>--%>
		<%--<% System.out.println("Java is here!"); %>--%>
		<div class="wrap">
			<div class="sheet">
				<div class="block">
<!-- 					<div class="block__text">
						<ul class="text-list">
							<li class="list__item">Дата документа:</li>
							<li class="list__item">Номер документа:</li>
							<li class="list__item">Наименование клиента:</li>
							<li class="list__item">МФО банка клиента:</li>
							<li class="list__item">Наименование банка клиента:</li>
						</ul>
					</div> -->

					<div class="block__fields">
						<form name="Test" action="MyController" method="post">
							<ul class="text-list">
								<li class="list__item">Дата документа:<input value="2018-04-25" class="field" type="date"></li>
								<li class="list__item">Номер документа:<input value="0" size="16" class="field" type="text"></li>
								<li class="list__item">Наименование клиента:<input size="25" type="text"></li>
								<li class="list__item">МФО банка клиента:<input size="25" type="text"></li>
								<li class="list__item">Наименование банка клиента:<input size="25" type="text" name="MFO"></li>
							</ul>


							<div class="note">
								<span class="text-bold">Внимание!</span>
								<br>
								<span>Данные из етой секции будут применятся ко всем пользователям.</span>
							</div>
							<div class="test">
								<input type="file" name="file">
								<input value="Go" type="submit" name="Go">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>