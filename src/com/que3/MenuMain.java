package com.que3;

public class MenuMain {

	public static void main(String[] args) {
		
		String[] start= {"corn","soup","chilli potato"};
		IMenu main =( items)->{
			System.out.println("Startrers are=====");
			for(String x:items)
			{
				System.out.println(x);
			}
			
			
	};
	 
	main.printMenu(start);
	
	String[] mainCourse= {"Chole bature","Rice","Panner masala"};
	main=(items)->
	{
		System.out.println("maincourse items are====");

		for(String item:items)
		System.out.println(item);
	};
	main.printMenu(mainCourse);
	
	String[] dessert= {"pastry ","rasmalai","mishti dohi "};
	main=(items)->
	{
		System.out.println("dessert items are=======");

		for(String item:items)
		System.out.println(item);
	};
	main.printMenu(dessert);
	
	
	
	
	
	
	
	}}
	
	

