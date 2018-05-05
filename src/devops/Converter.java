package devops;

import org.hamcrest.core.Is;
import org.junit.*;

public class Converter {
    
	public static String Convert(int i) {
		
		if (i==2)
		return "Two";
	
		return "One";
	}
}
