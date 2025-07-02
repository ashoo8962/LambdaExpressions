package com.shristi.figures.assignment02;

import org.springframework.stereotype.Component;

@Component
public class Square implements IShape {

	public void area(int length, int breadth) {
		System.out.println("Area of square is "+length*length);
		
	}

}
