class OddNumberExceptionDemo {

   
    static class OddNumberException extends Exception {
        public OddNumberException(String message) {
            super(message);
        }
    }

    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, 7, 10, 15, 20}; 

        for (int number : numbers) {
            try {
                checkEven(number);
            } catch (OddNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
