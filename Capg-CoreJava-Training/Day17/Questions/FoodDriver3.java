package Day17.Questions;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FoodDriver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Food> foodList = new ArrayList<>();
				
		foodList.add(new Food("Butter Chicken" , 1 , 380.0));
		foodList.add(new Food("Chole Bhature" , 2 , 150.0));
		foodList.add(new Food("Butter Naan" , 4 , 30.0));
		
		System.out.println("=== Punjabi Dhaba , Ludhiana ===\n\n");
		double grandTotal = 0.0;
		
		for(Food food : foodList) {
			System.out.println(food);
			grandTotal += food.getTotal();
		}
		
		System.out.println("\n==============================================================\n");
		System.out.println("Grand Total = " + grandTotal);
		
		
		
		
		// writing into a file
		String path = "D:\\capgemini-training\\food2.txt";
		double grandTotal2 = 0.0;
		
		try {
			
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(foodList);
			
			oos.close();
			fos.close();
			
			System.out.println("Object serialized successfully");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
