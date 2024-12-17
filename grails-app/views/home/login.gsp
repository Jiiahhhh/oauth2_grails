<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <style>
    body {
        font-family: 'Open Sans', sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        background-color: #f1f1f1;
    }
    .login-container {
        background: white;
        border-radius: 8px;
        padding: 30px;
        width: 300px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    .login-container h2 {
        text-align: center;
        margin-bottom: 20px;
    }
    .login-btn {
        background-color: #4285F4;
        color: white;
        padding: 12px;
        width: 100%;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        text-align: center;
    }
    .login-btn:hover {
        background-color: #357ae8;
    }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <a href="${createLink(controller: 'auth', action: 'google')}">
%{--    <a href="https://www.google.com/">--}%
        <button class="login-btn">Login with Google</button>
    </a>
</div>
</body>
</html>
