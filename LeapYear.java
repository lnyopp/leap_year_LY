public class LeapYear {
	
	int year;
	
	// divide by 4
	public static boolean divideBy4(int year){
		if( (year%4) == 0) {
			return true;
		} else 
			
		{ return false;
		
		}
		
	}
	
	
	public static boolean hundredandfourhundred(int year){
		if( (year%100) == 0 && (year%400) == 0) {
			return true;
		} else 
			
		{ return false;
		
		}
		
	}
	
	String formatYear = String.valueOf(year); 
	
	public static boolean numberOfChar(String formatYear) {
		
		if(formatYear.length() == 4) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
		
	}
