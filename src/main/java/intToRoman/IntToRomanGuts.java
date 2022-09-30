package intToRoman;

import java.util.TreeMap;

public class IntToRomanGuts {
	
	static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	
	static {
	map.put(1000,"M");
	map.put(900, "CM");
	map.put(500, "D");
	map.put(400, "CD");
	map.put(100, "C");
	map.put(90, "XC");
	map.put(50, "L");
	map.put(40, "XL");
	map.put(10, "X");
	map.put(9, "IX");
	map.put(5, "V");
	map.put(4, "IV");
	map.put(1, "I");
	
	}

	
	/**This method takes an int value and converts it to a Roman Numeral String using the above Map
	 * 
	 * @param num takes a number from user
	 * @return returns int converted to String roman
	 */
	public static String convertToRoman(int num) {
		String roman="";
		do {
			int digit = map.floorKey(num);
			roman = roman+map.get(digit);
			num = num-digit;			
		}while(num>0);
		System.out.println("Roman:" +roman);		
		return roman;
	}
	

}
