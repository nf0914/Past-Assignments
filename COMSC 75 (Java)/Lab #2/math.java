
public class math {
	
	public static void main(String[] args) {
        // Using Integer.valueOf()
        String strNumber = "11";
        int intValue1 = Integer.valueOf(strNumber);

        // Using Integer.parseInt()
        String anotherStrNumber = "11";
        int intValue2 = Integer.parseInt(anotherStrNumber);

        System.out.println("Original string value: " + strNumber);
        System.out.println("Converted int value using Integer.valueOf(): " + intValue1);
    }
}
