package com.shristi.factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShapeMain {

	public static void main(String[] args) {
//
		@SuppressWarnings("resource")
		ApplicationContext  context = new AnnotationConfigApplicationContext("com.shristi");
		 ShapeFactory shapeFactory = context.getBean("shapeFactory",ShapeFactory.class);
		 shapeFactory.printArea("r", 5, 6);
		 
		 
		 
		 
	
		
		
		
	}

}
