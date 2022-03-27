package wrapperClasses;

public class Example2 {
	public static void main(String[] args) 
	{
		
		float price = 95.54f;
		
		//Float f = price;
		Float f = Float.valueOf(price);
		
		System.out.println(f);
		
		System.out.println("=====================");
		
		Float f2 = new Float(76.86f);
		
		//float value = f2;
		float value = f2.floatValue();		
		
		System.out.println(value);
		
		
	}

}
