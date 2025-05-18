package com.que5;

public class ValidatorMain {

	
	public static void main(String[] args) {
		
		String[] names= {"Jaya","Rekh","JOhn","Heena"};
		
		IValidator val =(String name)->{
			
			
				for(String sampl :names)
				{
					if(name.equalsIgnoreCase(sampl))
					{
						return "You are already registered"+name;
					}
				}
				return"You are registered"+name;

					
		};
		System.out.println(val.validateUser("Heena"));
		
		val=(name)->{
			String[] names1= {"Jim","Preet"};
			System.out.println("For login");
			
			for(String reg: names1)
			{
				if(name.equalsIgnoreCase(reg))
				{
					return"you are logged in"+name;
				}

				
			}
			return"you cant logged in kindly register"+name;

			
		};
		System.out.println(val.validateUser("Jim"));
		System.out.println(val.validateUser("Siya"));


		
	}
	
	
}
