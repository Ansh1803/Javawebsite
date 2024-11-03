import java.util.ArrayList;
import java.util.List;

 class tq {

    public static void main(String[] args) {
        List<int[]> twinPrimes = findTwinPrimesLessThan(100);
        for (int[] pair : twinPrimes) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }

    public static List<int[]> findTwinPrimesLessThan(int limit) {
        List<int[]> twinPrimes = new ArrayList<>();
        
        for (int i = 2; i < limit - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                twinPrimes.add(new int[]{i, i + 2});
            }
        }
        
        return twinPrimes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
