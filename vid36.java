class student
{
    String name;
    int marks;
    int roll_no;
}
public class vid36 {
    public static void main(String arg[]) 
    {
        /*
         * Enhanced for loop in java:
         * basic syntax:(for normal array)
         * 
         * data_type arr_name[] = new data_type[]; //add the number square brackets according to the dimensions of array you want.
         * 
         * //now i want to use enhanced for loop to access the data of arr.
         * 
         * for(data_type var : arr_name)
         * {
         *     //operations
         * }  
         * 
         * HOW TO APPLY ENHANCED FOR LOOP IN CASE OF CLASS:
         * suppose we create a class of name class_name
         * now we create an array of objects of name class_arr[size]
         * 
         * now we want to use for loop to access elements of array:
         * syntax:
         * for(class_name var : class_arr)
         * {
         *      //operations
         * }
         */
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

        //we will use enhanced for loop here:
        for(student num : students)
        {
            System.out.println(num.name + ":" + num.marks);
        }
    }
    
}
