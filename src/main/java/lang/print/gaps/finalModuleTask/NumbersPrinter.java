package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {






    public void printIsPositive(int number) {

        boolean result = number>0;
        System.out.println(result);




    }

    public static void main(String[] args) {
    NumbersPrinter obj = new NumbersPrinter();
    obj.printIsPositive(-19);

    }
}
