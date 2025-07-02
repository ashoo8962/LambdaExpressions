package com.que6;

public class MainCourses {
	public static void main(String[] args) {
		ICourses coursefront =(type)->{
			// 
			System.out.println("Front end cpurses");
			if(type.equals("frontend"))
				return new String[] {"HTML","CSS","React"};
			return new String[] {"Enter valid"};
		};
		String[]val= coursefront.printCourses("frontend");
		for(String name:val)
			System.out.println(name);
	
	
	coursefront =(type)->{
		// 
		System.out.println("back end cpurses======>");
		if(type.equals("backend"))
			return new String[] {"Spring","Spring boot","micro services"};
		return new String[] {"Enter valid course name"};
	};
	String[]val2= coursefront.printCourses("backend");
	for(String name:val2)
		System.out.println(name);
	
	
	
	
	coursefront =(type)->{
		// 
		System.out.println("database cpurses======>");
		if(type.equals("database"))
			return new String[] {"oracle","mysql","mongo db "};
		return new String[] {"Enter valid course name"};
	};
	String[]val3= coursefront.printCourses("database");
	for(String name:val3)
		System.out.println(name);
	
	}

}
	


