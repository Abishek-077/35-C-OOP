public class PrefixPostfix {
    public static void main(String[] args) {
        int preficValue = 10;
        System.out.println("prefix values changes here" + ++preficValue);
        System.out.println("prefix remains same " + preficValue);

        int postFixValue = 20;
        System.out.println("postfix value doestt change here" + postFixValue);
        System.err.println("it changes in necxt line" + postFixValue);

    }
}
