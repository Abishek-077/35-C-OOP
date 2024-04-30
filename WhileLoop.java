import java.util.Scanner;;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 5) {
            System.out.println("while cout " + 2 * count);
            count++;
        }
        Scanner myobj = new Scanner(System.in);
        System.out.println("pleae eneter a number ");
        int invalue = myobj.nextInt();
        while (invalue < 0 || invalue > 100) {
            System.out.println("please enetr a number betwween 0-100");
            invalue = myobj.nextInt();

        }
        System.out.println("corrent condition" + invalue);
        myobj.close();

    }
}
