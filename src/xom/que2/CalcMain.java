package xom.que2;

public class CalcMain {
	public static void main(String[] args) {
		ICalculator cal = (x,y)->{
			System.out.println("sum is"+(x+y));
		};
		        cal.calculate(2.4,5.6);
	
	
	cal=(x,y)->{
	
		System.out.println("pro is"+(x*y));
	};
	        cal.calculate(2.4,5.6);
	        
	        
	        cal=(x,y)->{
	        	
	    		System.out.println("sqrt is"+Math.sqrt(x*y));
	    	};
	    	        cal.calculate(2.4,5.6);
	    	
	        
	        
	        
	
	}	

}
