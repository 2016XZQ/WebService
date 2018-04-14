<%--
  Created by IntelliJ IDEA.
  User: xuzq
  Date: 2018/4/14 0014
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>手机归属地查询</title>
    <style>
      body,div,input{margin:0;padding:0;}
      .main{
        position: relative;
        top: 0px;
        left: 0px;
        width: 100%;
        height: 100%;
        background-color: dimgrey;
      }
      .main .input{
        width: 400px;
        height: 200px;
        position: absolute;
        top: 0; left: 0; bottom: 0; right: 0;
        margin: auto;
        background-color: honeydew;
      }
      .main .input .butt
      {
        width: 400px;
        height: 50px;
        text-align: center;
        padding-top: 20px;
      }
      .main .input .phone{
        width: 400px;
        height: 50px;
        text-align: center;
        padding-top: 20px;
      }
      .main .input .result{
        width: 360px;
        height: 60px;
        margin: 0 10px;
        padding: 10px;
        background-color: lightgrey;
        font-size: 16px;
        font-family: "SimSun";
        color: GrayText;
      }
      .main .input .result span{
        color: black;
      }
    </style>
  </head>
  <body>
    <div class="main">
      <div class="input">
        <form action="queryMobile.action" method="post">
          <div class="phone">
            手机号<input type="text" name="phoneNum" id="phoneNum" size="40">
          </div>
          <div class="result">
            查询结果：<span>${result }</span>
          </div>
          <div class="butt">
            <input type="submit" name="查询"></input>
          </div>
        </form>
      </div>
    </div>
  </body>
</html>
