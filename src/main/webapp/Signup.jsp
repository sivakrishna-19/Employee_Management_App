<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up here</title>
</head>
<body>
<h3 style="text-align:center">SIGNUP</h3>
<form style="text-align:center" action="signupservlet" method="post">
	<label for="username">USERNAME: </label>
	<input type="text" name="username"  placeholder="Enter username"><br><br>
	<label for="password">PASSWORD: </label>
	<input type="text" name="password"  placeholder="Enter password"><br><br>
	<label for="comfirm-password">CONFIRM-PASSWORD: </label>
	<input type="password" name="confirm-password"  placeholder="Confirm your password"><br><br>
	<input type="submit" name="SIGNUP">
</form>

</body>
</html>