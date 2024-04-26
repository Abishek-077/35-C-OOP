
// public class Variables {
//     int instancevariable=  10;
//     static int shortVariable=100;
//     public static void main(String[] args) {
//         byte byteVariable = 100;
//         short shortVariable = 100;
//         int intVariable1 = 10;
//         int intVariable2 = -10;
//         long longVariable1 = 10000L;
//         long longVariable2 = -199999L;
//         float floatVariable = 1.81f;
//         double doubleVariable = 189.89234;
//         char charVariable = 'c';
//         boolean booleanVariable = true;
//         String stringVariable1 = "this is a string ";
//         String stringVariable2 = new String("string using class");
//     }
// }

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        // int a = 10, b = 30;
        // System.out.println("the addidtion" + (a +b));
        // System.out.println("the sub is " + (b - a));
        // System.out.println("the dvision is " + (a / b));
        // }
        // }
        // int a = 100;
        // int var;
        // var = a;
        // System.out.println("the value of+=" + var);
        // var -= a;
        // System.out.println("the value of -=" + var);
        // var *= a;
        // System.out.println("the value of *=" + var);
        Scanner scanner = new Scanner(System.in);
        System.out.println("eneter your age");
        int age = scanner.nextInt();
        String result = (age >= 16) ? " you are eligible to buy products."
                : "sorry, you must be at leaast 16 years old to buy products  ";
        System.out.println(result);
        System.out.println(("enter your siblingd names"));

        String name = scanner.nextLine();

        System.out.println("hello," + name);
        scanner.close();

    }

}
