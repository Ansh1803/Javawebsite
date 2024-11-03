enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumToString {
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        String dayString = day.toString();
        System.out.println("Enum to String: " + dayString);
    }
}

/* Output:
Enum to String: MONDAY
*/
