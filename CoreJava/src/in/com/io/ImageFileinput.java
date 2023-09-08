package in.com.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ImageFileinput {
public static void main(String[] args)throws Exception {
	FileInputStream in=new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\prachi\\tom.jpg");
	FileOutputStream out=new FileOutputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\prachi\\cat.jpg");
	
	int ch=in.read();
  while (ch!=-1) {
	  out.write(ch);
	  ch=in.read();
  }
  in.close();
  out.close();
  System.out.println("data copy successfully");
}
}

