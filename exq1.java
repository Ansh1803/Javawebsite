 class q1Exception {

    
    public static void mayThrowException() throws Exception {
        throw new Exception("This is a custom exception message.");
    }

    public static void main(String[] args) {
          try {
            
            mayThrowException();
        } catch (Exception e) {
          
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
   
}
 
