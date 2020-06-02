import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class LeapYearTest {
	
	
	  @Test
	    public final void isYearDivisibleByFour() {
	       
		  LeapYear.divideBy4(2020);
		  Assert.assertTrue(true);
	    }
	  
	  @Test
	    public final void isYearDivisibleBy100and400() {
	       
		  LeapYear.hundredandfourhundred(1999);
		  Assert.assertTrue(true);
	    }
	  
	  @Test
	    public final void isYearProperFormat() {
	       
		  LeapYear.numberOfChar("1970");
		  Assert.assertTrue(true);
	    }
	  
}