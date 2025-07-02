package com.shristi.figures.assignment02;

import org.springframework.stereotype.Component;

@Component
public class Rectanglr implements IShape {

	public void area(int length, int breadth) {
		// TODO Auto-generated method stub

		System.out.println("Area of rec is "+length*breadth);
	}

}
