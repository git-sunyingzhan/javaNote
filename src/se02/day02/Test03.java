package se02.day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 将io目录复制到io2目录下
 */
public class Test03 {

	public static void main(String[] args) throws IOException {
		//封装源端根目录
		File srcFolder = new File("io");
		//封装目的根目录
		File destFolder = new File("io3");
		copyFolder(srcFolder,destFolder);
	}

	//复制目录：将srcFolder内端所有文件复制到destFolder中
	private static void copyFolder(File srcFolder, File destFolder) throws IOException {
		
		//如果目的端根目录不存在，需要创建
		if(!destFolder.exists()) {
			destFolder.mkdirs();
		}
		
		File[] files = srcFolder.listFiles();
		//判断源端目录是否为空
		if(files!=null) {
			//获取远端目录下所有端Files对象
			for (File file : files) {
				File dext = new File(destFolder,file.getName());
				if(file.isDirectory()) {
					dext.mkdir();
					copyFolder(file, dext);
				}else {
					copyFile(file,dext);
				}
			}
		}
		
	}

	private static void copyFile(File src, File dext) throws IOException {
		//不知道类型，采用字节流
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dext);
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fis.read())!=-1) {
			fos.write(buf,0,len);
		}
		
		//释放资源
		fos.close();
		fis.close();
		
	}

}
