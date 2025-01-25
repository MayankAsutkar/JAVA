class student
{
    String name;
    int marks;
    int roll_no;
}
public class vid30 {
    public static void main(String arg[]) {
        System.out.println("hello");
        /*
         * ARRAYS:
         * 
         * syntax:
         * int arr_name[] = {....};
         * 
         * what if we want to create an array without initializing its elements:
         * syntax:
         * int arr_name[] = new int[size];//in this case all the values will be zero
         * by-default.
         * 
         * To fetch a particular element from an array we use syntax:
         * int var = arr_name[index]; //we fetch value using its index.
         * 
         * //VID32: MULTIDIMENSIONAL ARRAY:
         * HOW TO Declare 2-D array:
         * int arr_name[][] = new int[size1][size2];
         * 
         * in Java we can use a method named Math.random() which returns a pseudorandom
         * double type number greater than or equal to 0.0 and less than 1.0.//note:
         * Math.random()takes double value.we can convert into int by type casting.
         * 
         * 
         * //ENHANCED FOR LOOP IN JAVA:
         * The enhanced for loop, also known as the for-each loop, is a streamlined way
         * to iterate over collections and arrays. It eliminates the need for managing
         * the loop’s counter or bounds manually.
         * 
         * 
         * //VID33: JAGGED AND 3D ARRAY IN JAVA:
         * 
         * jagged array:
         * 
         * In Java, Jagged array is an array of arrays such that member arrays can be of
         * different sizes, i.e., we can create a 2-D array but with a variable number
         * of columns in each row.
         * 
         * Example:
         * 
         * arr [][]= { {1,2}, {3,4,5,6},{7,8,9}};
         * 
         * we use nums.length to find size of array:
         * //syntax to define size of inner array differently:
         * 
         * first we declare main array:
         * 
         * int arr_name[][] = new int[3][];
         * 
         * second , we declare size of inner arrays as follows:
         * arr_name[0] = new int[3];
         * arr_name[0] = new int[4];
         * arr_name[0] = new int[2];
         * 
         * 
         * //VID34 : DRAWBACKS OF JAVA:
         * -> we cannot increase the size of an array in java after initialization or while deciding data(size is fixed).
         * ->it takes a lot of time as it goes through all the elemnets to fetch a specific data.
         * ->we cannot store diiferent type of data in a same array.
         * 
         * //VID35 : ARRAY OF OBJECTS IN JAVA:
         * we create array of objects does not mean we will store objects in array.
         * it means it will store the references of the class.
         * 
         */
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Using enhanced for loop in java:
        int nums1[][] = new int[4][3];

        for (int n1[] : nums1) {
            for (int n2 : n1) {
                n2 = (int) (Math.random() * 100);
                System.out.print(n2 + " ");
            }
            System.out.println();
        }
        System.out.println();

        // EXAMPLE OF JAGGED ARRAY:

        int nums2[][] = new int[3][];// here we mentioned only size of outter array.The size of inner array will be
                                     // decided seperately.

        nums2[0] = new int[3];
        nums2[1] = new int[4];
        nums2[2] = new int[2];

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                nums2[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int n1[] : nums2) {
            for (int n2 : n1) {
                System.out.print(n2 + " ");
            }
            System.out.println();
        }

        //EXAMPLE OF ARRAY OF OBJECT IN JAVA:
        //let's go step-by-step:
        //first we wiil create reference variables normally as we do.

        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.marks = 10;
        s1.name = "mayank";
        s1.roll_no = 101;

        s2.marks = 15;
        s2.name = "manu";
        s2.roll_no = 102;

        s3.marks = 12;
        s3.name = "ashu";
        s3.roll_no = 103;

        //now we will create an array of object:

        student students[] = new student[3];

        //we will initialize:

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + ":" + students[i].marks);
        }
 
    }
}
