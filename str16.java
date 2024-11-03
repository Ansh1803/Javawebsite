public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}

/* Output:
Vowels: 3, Consonants: 7
*/
