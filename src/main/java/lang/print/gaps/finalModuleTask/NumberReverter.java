package lang.print.gaps.finalModuleTask;

public class NumberReverter {


    public void revert(int number) {
        int fd,md,ld,rev;
        fd=number/100;
        md=(number/10)%10;
        ld=number%10;
        rev=ld*100+md*10+fd;
        System.out.print("Reverse=" + rev);

    }

    public static void main(String[] args) {
        NumberReverter obj = new NumberReverter();
        obj.revert(123);
    }
}
