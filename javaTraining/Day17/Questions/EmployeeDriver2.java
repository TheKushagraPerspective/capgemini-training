package Day17.Questions;

import java.io.BufferedReader;
import java.io.FileReader;

public class EmployeeDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\capgemini-training\\Employee.txt";
		int file;
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			file = br.read();
			
			while(file != -1) {
				System.out.print((char)file);
				file = br.read();
			}
			
			br.close();
		}
		catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
