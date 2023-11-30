
public class RomanToInt {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println("Testing " + s + " = " + romanToInt(s));

	}
	
	//Convert Int to Roman (LV: medium)
	public static String intToRoman(int num) {
		String ans = "";
		return ans;
	}
	
	
	
	
	
	// Convert Roman to Int (LV: easy)
	public static int romanToInt(String s) {
		int result = 0;
		int curVal = 0;
		int nextVal = 0;
		
		for(int i = 0; i < s.length(); i++) {
			curVal = getValue(s.charAt(i));
			
			while((i+1) < s.length()) {
				nextVal = getValue(s.charAt(i+1));
				break;
			}
			
			if(curVal < nextVal) {
				curVal = curVal*(-1);
			}
			result = result + curVal;
			
		}
		return result;
	}

	public static int getValue(char symbol) {
		int value = 0;
		
		switch(symbol) {
			case 'I':
				value = 1;
				break;
			case 'V':
				value = 5;
				break;
			case 'X':
				value = 10;
				break;
			case 'L':
				value = 50;
				break;
			case 'C':
				value = 100;
				break;
			case 'D':
				value = 500;
				break;
			case 'M':
				value = 1000;
				break;
		}
		return value;
	}
}
