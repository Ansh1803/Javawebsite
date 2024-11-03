public class SwapPairs {
    public static void main(String[] args) {
        String input = "Hello World";
        char char1 = 'H';
        char char2 = 'W';
        String output = input.replace(char1, '#').replace(char2, char1).replace('#', char2);
        System.out.println(output);
    }
}
Output 
Wello Horld