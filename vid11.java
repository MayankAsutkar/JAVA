                                        //RELATIONAL OPERATORS IN JAVA
public class vid11 
{
    public static void main(String arg[])
    {
        System.out.println("hello");
        /*
         * we use '&' for  and operator.
         * we use '|' for or operator.
         * 
         * The vertical bar ( | ) -- also called the vertical line, vertical slash, pipe, pipe symbol or upright slash.
         * 
         * for not operator in java we use '!'.
         * 
         * note:we prefer '&&' over '&' and '||' over '|' cause:
         * ->it reduces the time complexity because it avoids to check both condition 
         * for ex:
         * in case of && if the first condition is false it will not go for second one.
         * in case of || if the first condition os true it will not go for second one.
         * 
         * A&&B||C ->> in this case we will prioritize && over ||. 
         * 
         */ 
        int a=12;
        int b=13;
        boolean result = b>a || b>a && a>b;
        System.out.println(result);
    }
}
