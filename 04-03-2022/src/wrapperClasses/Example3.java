package wrapperClasses;

public class Example3 {
	public static void main(String[] args)
	{
		
		char grade = 'A';
		
		//Character a1 = grade;
		Character a1 = Character.valueOf(grade);
		
		
		System.out.println(a1);
		
		System.out.println("=========================");
		
		Character b1 = new Character('4');
		
		//char rank = b1;
		char rank = b1.charValue();
		
		
		System.out.println(rank);

	}

}



