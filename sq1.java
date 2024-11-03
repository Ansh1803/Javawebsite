 class DigitCheck { 
 public static boolean isAllDigits(String str) {
  if (str == null) {
  return false;
  }

 for (char c : str.toCharArray()) {
            
if (!Character.isDigit(c)) {
return false;
}
}
return true;
    }
public static void main(String[] args) {
        String input = "123456b"; 
      if (isAllDigits(input)){
           System.out.println(input + " contains only digits.");
        } else {
  System.out.println(input + " does not contain only digits.");
}
}
}
/*OUTPUT
123456b does not contain only digits.
*/
