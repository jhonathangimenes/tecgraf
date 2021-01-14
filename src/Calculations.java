public class Calculations {
	public static String calculateHexdecimal(String cod) {
		int multiplier = 5;
		int total = 0;
		int divider = 16;
		
		for(int i = 0; i < 4; i++) {
			int subtractedMultiplier = multiplier - i;
			total = Character.getNumericValue(cod.charAt(i)) * subtractedMultiplier + total;
		}
		
		return Integer.toHexString((total % divider)).toUpperCase();
	}
}
