 class DeepCopyStringExample {
    public static void main(String[] args) {
        
        String originalString = "Hello, World!";
        
        
        String deepCopiedString = new String(originalString);

       
        System.out.println("Original String: " + originalString);
        System.out.println("Deep Copied String: " + deepCopiedString);

        // Modify the original string
        originalString = "Goodbye, World!";
        
        
        System.out.println("After Modification:");
        System.out.println("Original String: " + originalString);
        System.out.println("Deep Copied String: " + deepCopiedString);
    }
}
