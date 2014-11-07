package com.sea.file;
import java.io.*;
/**
 * 更改文件编码格式
 * @author yuhaiming
 * @creation 2011-8-8 下午01:45:14
 * @project_name：test
 * @absolute_name:com.sea.file.ChangeFileEncode.java
 * @desc：
 * @version：1.0
 */
public class ChangeFileEncode {
	//源文件夹
	public static final String srcpath ="douban";
	//目标文件夹
	public static final String despath ="douban_result";
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		changepathfile(srcpath,despath, "utf-8","gbk");

	}
	/**
	 * 将源文件夹下的所有文件转换成指定编码格式的文件
	 * @param src
	 * @param des
	 * @param srcenc
	 * @param desenc
	 * @throws Exception
	 */
	public static void changepathfile(String src,String des,String srcenc,String desenc)throws Exception{
		File srcpath = new File(src);
		File[] list = srcpath.listFiles();
		for(int i=0;i<list.length;i++){
			File curFile = list[i];
			if(curFile.isFile()){
				disposalfile(curFile,des, srcenc, desenc);
			}else if(curFile.isDirectory()){
				System.out.println("--目录--"+curFile.getAbsolutePath());
				//目录则递归
				changepathfile(curFile.getAbsolutePath(), des, srcenc, desenc);
			}
		}
	}
	/**
	 * 处理该文件
	 * @param des
	 * @param srcenc
	 * @param desenc
	 * @throws Exception
	 */
	public static void disposalfile(File cur,String des,String srcenc,String desenc)throws Exception{
		String filename = cur.getAbsolutePath();
		System.out.println("--处理--"+filename);
		String aa = "\\"+srcpath+"\\";
		String newfilename =filename.substring(0,filename.indexOf(aa)+1)+des+filename.substring(filename.indexOf(aa)+aa.length()-1);
		System.out.println("--新文件名--"+newfilename);
		
		File nFile = new File(newfilename.substring(0,newfilename.lastIndexOf("\\")));
		System.out.println("--需要创建的文件夹名--"+nFile.getAbsolutePath());

		if(!nFile.exists()){
			System.out.println("--需要创建的文件夹名--"+nFile.getAbsolutePath());

			//创建新文件名
			nFile.mkdirs();
		}
		
		FileInputStream is = new FileInputStream(cur);
		InputStreamReader isr = new InputStreamReader(is,srcenc);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream(newfilename);
		OutputStreamWriter osw = new OutputStreamWriter(fos,desenc);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String curline="";
		while((curline=br.readLine())!=null){
			bw.write(curline+System.getProperty("line.separator"));
		}
		br.close();
		isr.close();
		is.close();
		bw.close();
		osw.close();
		fos.close();
	}
}
