package part3.se.day04.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFIleDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		
		//获取指针位置
		long pos = raf.getFilePointer();
		System.out.println("pos1:" + pos);
		
		//向文件中写入int最大值
		int max = Integer.MAX_VALUE;
		
		/**							  vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 * max>>>24
		 * 00000000 00000000 00000000 01111111
		 */
		raf.write(max>>>24);
		System.out.println("pos2:"+raf.getFilePointer());
		raf.write(max>>>16);
		System.out.println("pos3:"+raf.getFilePointer());
		raf.write(max>>>8);
		System.out.println("pos4:"+raf.getFilePointer());
		raf.write(max);
		System.out.println("pos5:"+raf.getFilePointer());
		
		/**
		 * RAF提供了方便我们写出基本类型的相关方法
		 */
		//一次性将给定的int值4个字节全部写出
		raf.writeInt(max);  //Alt查看源码理解，和上面的方法一样
		System.out.println("pos6:"+raf.getFilePointer());
		
		System.out.println("写入完毕！");
		
		//void seek(long pos) 指正移动回指定位置
		raf.seek(0);
		System.out.println("pos移回去："+raf.getFilePointer());
		
		int d = raf.readInt();
		System.out.println(d);
		
		
		raf.close();

	}

}
