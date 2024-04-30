import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("pleae eneter a positive number ");
        int invalue = myobj.nextInt();

        while (invalue < 0) {
            System.out.println("the number is positive" + invalue);
            invalue = myobj.nextInt();
            invalue++;

        }
        System.out.println("your number is posituve" + invalue);
        myobj.close();

    }
}
