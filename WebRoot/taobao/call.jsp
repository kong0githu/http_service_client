<%@ page contentType="text/html;charset=utf-8" %>
<%@ page language="java" import="com.taobao.*" %>
<%
if("1".equals(request.getParameter("opt")))
{
	//开始拼链接,例如: https://oauth.taobao.com/authorize?response_type=code&client_id=12251541&redirect_uri=http://www.xx.org&state=1
	String url = TaobaoConfig.authurl+"?response_type=code&client_id="+TaobaoConfig.taobaoKey+"&redirect_uri="+TaobaoConfig.redirect_uri+"&state=1";
	
	//RequestToken resToken=weboauth.request("http://localhost:8080/weiboxl/weiboxl/callback.jsp");
	if(url!=null){
		//out.println(resToken.getToken());
		//out.println(resToken.getTokenSecret());
		//session.setAttribute("resToken",resToken);
		response.sendRedirect(url);

	}else{
		out.println("request error"); 
	}
}else{
%>
<a href="call.jsp?opt=1">请点击进行OAuth认证</a>   
<%}%>