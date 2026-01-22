package Day17.Questions;

import java.io.FileInputStream;

public class FoodDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "D:\\capgemini-training\\food.txt";
		
		// way 1 to read the content from the file (char by char)
		System.out.println("=== Way 1 ===\n");
		try {
			
			FileInputStream fis = new FileInputStream(path);
			int byteRead = fis.read();
			
			while(byteRead != -1) {
				System.out.print((char) byteRead);
				byteRead = fis.read();
			}
			
			fis.close();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("\n\n\n");
		
		System.out.println("=== Way 2 ===\n");
		// way 2 to read the content from the file (all content at once)
		try {
			
			FileInputStream fis2 = new FileInputStream(path);
			
			int size = fis2.available();
			System.out.println("Size: " + size);
			byte[] byteArr = new byte[size];
			
			fis2.read(byteArr);
			
			System.out.println(byteArr);
			
			String s=new String(byteArr);
			
			System.out.println(s);
			
			fis2.close();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("\n\n\n");
		
		System.out.println("=== Way 3 ===\n");
		// way 3 to read the content from the file (all content at once)
		try {
			
			FileInputStream fis3 = new FileInputStream(path);
			
			byte[] byteArr2 = fis3.readAllBytes();
			
			System.out.println(byteArr2);
			
			String s=new String(byteArr2);
			
			System.out.println(s);
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("\n\n\n");
		
		System.out.println("=== Way 4 ===\n");
		// way 4 to read the content from the file (some content at once)
		try {
			
			FileInputStream fis4 = new FileInputStream(path);
			
			int size = fis4.available();
			byte[] byteArr3 = new byte[1024];    // 1kb at a time
			int byteRead;
			
			while((byteRead = fis4.read(byteArr3)) != -1) {
//				System.out.println("ByteRead: " + byteRead);
				System.out.print(new String(byteArr3 , 0 , byteRead));
			}
			
			fis4.close();			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
