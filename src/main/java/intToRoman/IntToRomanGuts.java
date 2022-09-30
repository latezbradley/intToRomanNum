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

	
	
	public static String convertToRoman(int num) {
		//Floorkey Returns closest (lower) associated Key in map
		String roman="";
		do {
			String s;
			int l = map.floorKey(num);
			//System.out.println("joining: "+roman +map.get(l));
			roman = roman+map.get(l);
			//System.out.println("IN LOOP: Roman: "+roman);
			//System.out.println(map.get(l));
			num = num-l;
			//System.out.println("Num Mod:"+num);
			
			System.out.println("Num = "+num);
			System.out.println(l);
			
			
		}while(num>0);
		System.out.println("Roman:" +roman);
		
		return roman;
	}
	

}
