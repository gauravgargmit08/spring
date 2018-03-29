<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Welcome</title>
</head>
<body>
	<h1>Insurance Bazar</h1>
	<hr>

	<div class="form">
		<form action="quotes" method="post" >
			<table style="with: 50%">
				<tr>
					<td>Enter Your Age</td>
					<td><input id="age" name="age"></td>
				</tr>
				<!-- <tr>
					<td>Enter Your Location</td>
					<td><input id="location" name="location"></td>
				</tr> -->
				<tr>
					<td>Enter Your Amount</td>
					<td><input id="amount" name="amount"></td>
				</tr>
	<!-- 			<tr>
					<td>Enter End Time for Insurance</td>
					<td><input id="time" name="time"></td>
				</tr>
 -->
				<tr>
					<td><INPUT TYPE="radio" NAME="tobacco" checked value="smoker">
						Smoker <BR> <INPUT TYPE="radio" NAME="tobacco"
						value="nonsmoker"> Non Smoker <BR></td>
				</tr>

			</table>
			<!-- 
					<td><input id="type" name="type"></td> -->
			<td>Select Type of Insurance</td> <select name="insurance_type">
				<option value="1">Level Term</option>
				<option value="2">Decreasing Term</option>
			</select>


			<br>
			<td>Select Location</td> <select name="location">
				<option value="Delhi">Delhi</option>
				<option value="Haryana">Haryana</option>
			</select>
			</br>
			<br>
			<td>Select Time for Insurance</td> <select name="tenure">
				<option value="10">10</option>
				<option value="15">15</option>
				<option value="20">20</option>
			</select>
			</br>

			<td><input type="submit" value="Submit"></td>
		</form>
	</div>

</body>
</html>	