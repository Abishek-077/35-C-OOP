public class OperationClass {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("the sub is " + (a - b));
        System.out.println("the div is " + (a / b));
        System.out.println("the mul is " + (a * b));
        System.out.println("the div is " + (a % b));
        System.out.println("the sum is " + sum);

        int number1 = 10;
        int number2;
        number2 = 20;
        System.out.println("Number2 after using +=is " + (number2 += 10));
        number2 += 100;
        System.out.println("number two after usig += is" + number2);

        // relational operators
        int rNumber1 = 9, rNumber2 = 20;
        System.out.println("is rnumber equal to rnumber2?" + (rNumber1 == rNumber2));
        System.out.println("is rnumber equal to rnumber2?" + (rNumber1 >= rNumber2));
        System.out.println("is rnumber equal to rnumber2?" + (rNumber1 < rNumber2));
        System.out.println("is rnumber equal to rnumber2?" + (rNumber1 != rNumber2));

        // relational operators
        int lNumber1 = 20, lNumber2 = 22;
        boolean expresssion1 = lNumber1 == lNumber2;
        boolean expresssion2 = lNumber1 > lNumber2;
        System.out.println("AND expression" + (expresssion1 && expresssion1));
        System.out.println("OR exprseeion" + (expresssion1 || expresssion2));
        System.err.println("NOT expression" + !(expresssion1));
        int uNumber1 = 10;
        uNumber1++;
        System.out.println("Unary operator usig ++" + uNumber1);
        uNumber1--;
        System.out.println("unary operator using --" + uNumber1);

        // tinaty operators
        int tNumber1 = 20, tNumber2 = 20;
        Boolean tExpression1 = tNumber1 == tNumber2;
        String output = tExpression1 ? "True Condition" : "False Condition";
        int numberOutput = tNumber1 > tNumber2 ? 10 : 20;
        System.out.println(output);

        int variable = 20;

        String result = (variable >= 18) ? "The variable is greater than or equal to 18."
                : "The variable is less than 18.";
        System.out.println(result);
    }
}
