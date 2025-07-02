package com.que1;

public class ShapeMain {
public static void main(String[] args) {
	
	IShape shap=(x,y)->{
		System.out.println("Area of rec is "+x*y);
	};
	shap.area(4,5);
	
	shap=(x,y)->{
		System.out.println("Area of tri is "+
	(0.5)*(x*y));

	};
	shap.area(4,5);
	
	shap=(x,y)->{
		System.out.println("Area of sq is "+x*x);

	};
	shap.area(4,1);

}
}
