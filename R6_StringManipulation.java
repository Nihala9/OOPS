public class StringManipulation {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("World");

        int length = str1.length();
        System.out.println("Length of str1: " + length);

        String str3 = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + str3);

        char ch = str1.charAt(1); 
        System.out.println("Character at index 1 in str1: " + ch);

        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2? " + isEqual);

        int comparison = str1.compareTo(str2);
        System.out.println("str1 compared to str2: " + comparison); 

        int index = str3.indexOf("World");
        System.out.println("Index of 'World' in str3: " + index);

        boolean contains = str3.contains("lo Wo");
        System.out.println("str3 contains 'lo Wo'? " + contains);

        String replaced = str3.replace("World", "Java");
        System.out.println("After replace: " + replaced);

        String upper = str3.toUpperCase();
        System.out.println("Uppercase: " + upper);

        int number = 2025;
        String strNumber = String.valueOf(number);
        System.out.println("Converted integer to string: " + strNumber);
    }
}
