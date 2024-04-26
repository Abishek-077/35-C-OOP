public class IfStatement {
    public static void main(String[] args) {
        if (true) {
            System.out.println("true statement");
        }
        if (false) {
            System.out.println("sikppped statment");
        }
        int num1 = 10, num2 = 20;
        if (num1 > num2) {
            System.out.println("num1 is graater");

        } else {
            System.err.println("num 2 is grater");

        }
        int Num1 = 10, Num2 = 10;
        if (Num1 == Num2) {
            System.err.println("the number is equal");
        } else if (Num1 > Num2) {
            System.err.println(("incorrecy"));
        } else if (Num1 < Num2) {
            System.err.println(("Num1 is grater"));
        } else if (Num1 >= Num2) {
            System.err.println("num is garater");

        } else {
            System.err.println("soory stop learning java");
        } /* nested loop */
        int nNum1 = -10, nNum2 = 20;
        if (nNum1 < 0) {
            if (nNum1 > nNum2) {
                System.out.println("nMun is negative and grater");
            } else {
                System.out.println("nNum1 is negative a lesser");

            }
        } else {
            if (nNum1 > num2) {
                System.out.println("nNum1 is positive and grater");
            } else {
                System.err.println("nNum2 is positive a nad lesser");
            }
        }
        int math = 38, science = 60, english = 35;

        // Calculate total and average
        int total = math + science + english;
        double average = total / 3.0;

        String result;

        // Check for any mark less than 35
        if (math < 35 || science < 35 || english < 35) {
            result = "Fail";
        } else {
            // Determine the division based on the average
            if (average >= 80) {
                result = "Distinction";
            } else if (average < 80 && average >= 70) {
                result = "1st div";
            } else if (average < 70 && average >= 60) {
                result = "2nd div";
            } else {
                result = "3rd div";
            }
        }

        // Print the result and the average
        System.out.println(result);
        System.out.printf("Average: %.2f", average);

    }

}

/*
 * Task
 * o Given the value below, add the total and take the average
 * o if any of the marking is less than 35, print "Fail"
 * o if average is less than 60, print "3rd div",
 * o if average is less than 70, print "2nd div"
 * o if average is less than 80, print "1st div"
 * o if average is greater than or equal to 80, print "distintion"
 * o /
 * int math = 38, science = 60, english = 35;
 * /* make total variable and average variable
 */
