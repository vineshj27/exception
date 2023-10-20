package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filenotfoundexception {

	public static void main(String[] args) throws IOException  {

File f = new File("C:\\Users\\HP\\Desktop\\Myname.txt");

FileReader file = new FileReader(f);
int temp =0;
while((temp=file.read())!=-1) {
	System.out.println((char)(temp));
}
	
//while((temp=file.read())!=0) {
//	System.out.print(temp);
//}


	}

}
