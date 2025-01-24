//SWITCH STATEMENT IN JAVA:
public class vid16 {
    public static void main(String arg[]) {
        System.out.println("hello");
        int n = 5;
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not a valid number");
        }
        // the above code is the old version of the switch case:

        // NEW WAY OF SWITCH CASE:
        /*
         * In old way we have to put break after ever statement.
         * in new version we can replace ':' with -> to avoid putting break statement .
         */
        String day = "monday";
        switch (day) {
            case "sunday", "saturday" -> System.out.println("6 am"); // we can put multiple cases in one line.

            case "monday" -> System.out.println("8 am");

            default -> System.out.println("7 am");
        }

        // THERE IS ANOTHER GOOD UPDATE IN SWITCH STATEMNET IN JAVA:

        String result;
        result = switch (day) {
            case "sunday", "saturday" -> "6 am"; // we can put multiple cases in one line.

            case "monday" -> "8 am";

            default -> "7 am";
        };

        System.out.println("the result is:" + result);

        //in above example if we want to use ':' instead of '->' we will use special keyword called 'yield'.

        String res;
        res = switch (day) {
            case "sunday", "saturday" : yield "6 am"; // we can put multiple cases in one line.

            case "monday" : yield "8 am";

            default : yield "7 am";
        };
        System.out.println("the res is:" + res);
    }
}
