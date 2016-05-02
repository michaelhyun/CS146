<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>SEARCH</title>
<link rel="stylesheet"
	href="https://bootswatch.com/superhero/bootstrap.min.css">
<link rel="stylesheet" href="style.css">
<link href='https://fonts.googleapis.com/css?family=Lato:300'
	rel='stylesheet' type='text/css'>
</head>
<body>
	<%
		String message = (String) request.getAttribute("message");
	%>

	<div class="container search-wrap">
		<div class="outer-wrap">
			<div class="inner-wrap">
				<h2 class="search-head">SEARCH</h2>
				<form action="./searchresults.do" method="get">
					<div class="form-wrap">
						<div class="form-group">
							<input class="form-control input-lg" type="text" name="By Title"
								placeholder="By Title">
						</div>
						<div class="form-group">
							<input class="form-control input-lg" type="password" name="By Author"
								placeholder="By Author">
						</div>
						<div class="form-group">
							<input class="form-control input-lg" type="password" name="By ISBN"
								placeholder="By ISBN">
						</div>
						<button class="btn btn-default btn-lg submit-button" type="submit">SEARCH</button>
					</div>
				</form>
				<div class="donate">
					<a href="./donate.do"><h6>DONATE</h6></a>
				</div>
			</div>
			<!-- INNER WRAP - END -->
		</div>
		<!-- OUTER WRAP - END -->
	</div>
	<!-- CONTAINER - END -->
</body>
</html>



<style>
html, body {
	height: 100vh;
	width: 100vw;
	color: #fff;
	font-family: 'Verdana', sans-serif;
}

.search-wrap {
	display: table;
	text-align: center;
	vertical-align: middle;
	height: 100vh;
	width: 100vw;
}

.search-wrap .outer-wrap {
	background: rgba(0, 0, 0, 0.8);
	display: table;
	text-align: center;
	vertical-align: middle;
	height: 100vh;
	width: 100%;
}

.search-wrap .outer-wrap .inner-wrap {
	display: table-cell;
	vertical-align: middle;
	text-align: center;
	height: 100%;
	width: 100%;
}

.form-wrap {
	margin: 0 auto;
	max-width: 360px;
}

.form-wrap .submit-button {
	width: 100%;
}

.search-wrap .outer-wrap .inner-wrap .search-head {
	padding-bottom: 40px;
	letter-spacing: 0.5em;
}
</style>

</html>