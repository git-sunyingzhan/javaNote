package se02.day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	归档和解归档
	归档：将多个文件合并成一个文件
		规则：
			1）先写入文件名长度4个字节
			2）写入文件名
			3）写入文件内容字节数的四个字节
			4）写入文件内容
			5）按照上面的4个步骤写入相应的步骤
	解归档：将归档后的文件还原成多个文件
 */

class Arichiveier{
	/**
	 * 将多个文件进行归档
	 * @param destFile	归档后的文件
	 * @param srcFiles	需要归档文件构成的数组名称
	 * @throws IOException 
	 */
	public static void arichive(File destFile,File... srcFiles) throws IOException {
		//获取所有需要归档的文件
		for (File srcFile : srcFiles) {
			appendFile(srcFile,destFile);
		}
	}
	
	/**
	 * @param destFile 归档后的文件
	 * @param srcFolder	需要归档文件所在的文件夹名称
	 * @throws IOException
	 */
	public static void arichive(File destFile,File srcFolder) throws IOException{
		for (File file : srcFolder.listFiles()) {
			appendFile(file, destFile);
		}
	}

	/**
	 * 将srcFile追加写入到destFile中
	 * @param srcFile
	 * @throws IOException 
	 */
	private static void appendFile(File srcFile,File destFile) throws IOException {
		//字节流
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile,true);
		
		//1）先写入文件名长度4个字节
		String fn = srcFile.getName();
		byte[] fnlenBys = toBys(fn.length());
		fos.write(fnlenBys);
		
		//2）写入文件名
		fos.write(fn.getBytes());
		
		//3）写入文件内容长度字节数的四个字节
		int flen = fis.available();
		fos.write(toBys(flen));
		
		//4）写入文件内容
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys, 0, len);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}

	/**
	 * 将一个整形转成一个长度为4的字节数组
	 * @param value
	 * @return
	 */
	private static byte[] toBys(int value) {
		byte[] bys = new byte[4];
		bys[0] = (byte)(value>>>24);
		bys[1] = (byte)(value>>>16);
		bys[2] = (byte)(value>>>8);
		bys[3] = (byte)(value>>>0);
		return bys;
	}
	
	/**
	 * 将归档文件还原成多个文件
	 * @param srcFile	归档文件
	 * @param destFolder	解归档操作还原文件的储存目录
	 * @throws IOException 
	 */
	public static void solutionArchive(File srcFile,File destFolder) throws IOException {
		//字节流
		FileInputStream fis = new FileInputStream(srcFile);
		
		//1）读文件名长度的四个字节
		byte[] lenBuf = new byte[4];
		
		//如果读出-1，文件读完了
		while((fis.read(lenBuf))!=-1) {
			
			//计算文件名长度
			int fnlen = toInt(lenBuf);
			
			//2)读文件名
			byte[] flenBuf = new byte[fnlen];
			
			//获取文件名
			fis.read(flenBuf);
			String fileName = new String(flenBuf);
			
			//字节输出流
			FileOutputStream fos = new FileOutputStream(new File(destFolder,fileName));
			
			//3)读文件内容长度四个字节
			fis.read(flenBuf);
			
			//计算文件内容长度
			int flen = toInt(flenBuf);
			
			//4)读文件内容
			byte[] buf = new byte[1024];
			int count = 0;//读写次数
			if(flen%buf.length==0) {
				count = flen/buf.length;
			}else {
				count = flen/buf.length+1;
			}
			
			//读写
			for(int i=0;i<count;i++) {
				//最后一次
				if(i==count-1) {
					int len = flen%buf.length==0?buf.length:flen%buf.length;
					fis.read(buf, 0, len);
					fos.write(buf, 0, len);
					
				}else {
					fis.read(buf);
					fos.write(buf);
				}
			}
			
			//关闭输出流
			fos.close();
		}
		
		//关闭输入流
		fis.close();
	}

	/**
	 * 将一个长度为四的字节数组转成int值
	 * @param bys 
	 * @return
	 */
	private static int toInt(byte[] bys) {
		// TODO Auto-generated method stub
		return ((bys[0]&0xff)<<24)|
				((bys[1]&0xff)<<16)|
				((bys[2]&0xff)<<8)|
				((bys[3]&0xff)<<0);
	}
}
public class Test01 {

	public static void main(String[] args) throws IOException {
//		File f1 = new File("place");
		File df = new File("placeFile/new.war");
//		System.out.println(df.getName());
//		Arichiveier.arichive(df, f1);
		
		Arichiveier.solutionArchive(df, new File("placeFile"));
	}

}
