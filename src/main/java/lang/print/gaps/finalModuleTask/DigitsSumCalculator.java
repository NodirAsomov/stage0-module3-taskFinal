package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    int sum=0;
    int i=0;
    public void calculateSum(int number) {
        while(i<4)
        {
            int x=number%10;
            sum=sum+x;
            number=number/10;
            i++;
        }
            System.out.println(sum);

    }

    public static void main(String[] args) {
        DigitsSumCalculator obj = new DigitsSumCalculator();
        obj.calculateSum(1255);
    }
}
