package com.shristi.figures.assignment02;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape {

	public void area(int length, int breadth) {
		
		System.out.println("Triangle area is"+(length*breadth));
		
	}

}
