package com.shristi.factory;
//package com.shristi.figures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shristi.figures.assignment02.IShape;

@Component
public class ShapeFactory {

	@Autowired
	@Qualifier("rectanglr")
	IShape shape;
	
	public void printArea(String choice,int x,int y)
	{
		if(choice.equals("s"))
		{
			System.out.println("Square");
			shape.area(x, y);
		}
		else if(choice.equals("r"))
			{
			System.out.println("rec");
			shape.area(x, y);

			}
			else if(choice.equals("t"))
			{
				System.out.println("tri");
				shape.area(x, y);
				
				
			}
	}
	
	
}
