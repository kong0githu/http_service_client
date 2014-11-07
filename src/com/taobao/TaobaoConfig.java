package com.taobao;

public class TaobaoConfig {
	//淘宝一站通KEY和密钥
	public static final String taobaoKey ="12328773";
	
	public static final String taobaoSecret ="df459f5c2fd862318f2264a6b6caefa4";
	
	//沙箱环境请求地址：
	//public static final String authurl = "https://oauth.tbsandbox.com/authorize";
	//正式环境请求地址：
	public static final String authurl ="https://oauth.taobao.com/authorize";
	//请求返回地址
	public static final String redirect_uri ="http://www.shandiant.com/taobao/callback.jsp";
	//沙箱环境请求地址：https://oauth.tbsandbox.com/token
	//正式环境请求地址：https://oauth.taobao.com/token 	
	public static final String tokenurl ="https://oauth.taobao.com/token";
	
}
