<%@ page contentType="text/html;charset=utf-8" %>
<%@page import="com.diantuan.common.MyHttpClient"%>
<%@page import="com.taobao.api.*"%>
<%@page import="com.taobao.api.request.*"%>
<%@page import="com.taobao.api.response.*"%>

<%@page import="java.util.*"%>
<%@page import="com.taobao.TaobaoConfig"%>

<%
	//返回样例：http://www.shandiant.com/taobao/callback.jsp?code=zr4pOsdfFXICk621ccaH3oVw1810&state=1
	String returncode=request.getParameter("code");
	String access_token = request.getParameter("access_token");
	out.println("code="+returncode+",access_token="+access_token);
	String flag = "0";
	String username = "";
	String userid = "";
	if(access_token==null||!"".equals(access_token)){
	//得到一个授权码returncode
	if(returncode!=null)
	{
		//out.println("returncode:"+returncode);
		HashMap<String, String> mm = new HashMap<String, String>();
		mm.put("code", returncode);
		mm.put("state", "1");
		mm.put("grant_type", "authorization_code");
		mm.put("client_id", "12328773");
		mm.put("client_secret", "df459f5c2fd862318f2264a6b6caefa4");
		mm.put("redirect_uri", "http://www.shandiant.com/taobao/callback.jsp");
		String rr = MyHttpClient.doPost(mm,"","https://oauth.taobao.com/token");
		//out.println("服务器返回："+rr+"<br>");
		if(rr.indexOf("access_token")>0){
			//out.println("返回成功了access token<br>");
			int start  = rr.indexOf("access_token")+"access_token".length()+4;
			//out.println("start="+start+"<br>");

			String accesstoken = rr.substring(start,rr.lastIndexOf("\""));
			//out.println("accesstoken="+accesstoken+"<br>");
			
			//现在可以调用户了
			TaobaoClient client=new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", TaobaoConfig.taobaoKey, TaobaoConfig.taobaoSecret);
			UserGetRequest req=new UserGetRequest();
			req.setFields("user_id,nick,seller_credit");
			//req.setNick("hz0799");
			UserGetResponse userresult = client.execute(req , accesstoken);
			//out.println(userresult.getBody()+"<br>");
			if(userresult.getUser()!=null){
				username=userresult.getUser().getNick();
				userid = ""+userresult.getUser().getUserId();
			}
		}
	}
	else
		{
		out.println("返回码有误，请重新授权处理");
		}
	}else{
		//进行访问授权处理
		out.println("访问授权处理<br>");
	}
%>   
<form action="<%=request.getContextPath()%>/servlet/LoginTaobaoServlet"
	method="post" name="logintaobaoForm">
<table width="860px" cellspacing="0" cellpadding="0" align="center">
	<tr>
		<td><input type='hidden' value='<%=username %>' name='username' id='username'><br>
		<input type='hidden' value='<%=userid %>' name='qid' id='qid'><br>
		<input type="button" value="登陆处理中..." onclick="submitthis()" readonly/>
		</td>
	</tr>
	<tr>
		<td></td>
	</tr>
</table>
</form>
<script type="text/javascript">
	window.onload=submitthis();
	function submitthis(){
		//alert("fdsa");
		//自动提交
		document.all.logintaobaoForm.submit();
		//alert("22");
	}
</script>