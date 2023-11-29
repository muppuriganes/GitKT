public class Ex5 {
		 public static void main(String[] args) {
		   String str = "Radar";
		   int num = 3553;

		   // Check if str is a palindrome
		   String reverseStr = "";
		   int strLength = str.length();
		   for (int i = (strLength - 1); i >=0; --i) {
		     reverseStr = reverseStr + str.charAt(i);
		   }
		   if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		     System.out.println(str + " is a Palindrome String.");
		   }
		   else {
		     System.out.println(str + " is not a Palindrome String.");
		   }

		   // Check if num is a palindrome
		   int reversedNum = 0, remainder;
		   int originalNum = num;
		   while (num != 0) {
		     remainder = num % 10;
		     reversedNum = reversedNum * 10 + remainder;
		     num /= 10;
		   }
		   if (originalNum == reversedNum) {
		     System.out.println(originalNum + " is Palindrome.");
		   }
		   else {
		     System.out.println(originalNum + " is not Palindrome.");
		   }
		 }
		}