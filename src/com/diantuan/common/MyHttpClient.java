package com.diantuan.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.taobao.api.internal.util.WebUtils;

public class MyHttpClient {
	public HashMap mHashMap = new HashMap();
	public String urlString = "";
	public MyHttpClient(HashMap mm,String url){
		this.mHashMap=mHashMap;
		this.urlString=url;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		HashMap mm = new HashMap();
		mm.put("code", "zr4pOsdfFXICk621ccaH3oVw1810");
		mm.put("state", "1");
		mm.put("grant_type", "authorization_code");
		mm.put("client_id", "123222773");
		mm.put("client_secret", "df459f5c22dee2318f2264a6b6caefa4");
		mm.put("redirect_uri", "http://www.shandiant.com/taobao/callback.jsp");
		
		String rr = doPost(mm,"test","");
		System.out.println(rr);
	}
	public  static String doPost(Map params, String session,String url) throws Exception {
		StringBuffer urlSb = new StringBuffer(url);
		try {
			String sysOptQuery = WebUtils.buildQuery(params, WebUtils.DEFAULT_CHARSET);

			urlSb.append("?");
			int count = 1;
			if (sysOptQuery != null & sysOptQuery.length() > 0) {
				if(count!=1){
					urlSb.append("&");
				}
				urlSb.append(sysOptQuery);
			}
		} catch (IOException e) {
			throw new Exception(e);
		}
		System.out.println("«Î«Ûµÿ÷∑£∫"+urlSb.toString());
		String rsp = WebUtils.doPost(urlSb.toString(), params, 1200, 1000);
		
		
		return rsp;
	}
}
