package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        if (power == 0){
            System.out.println(1);
        }else {
            int num = numberToPrint;
            for (int i = 1; i < power; i++) {
                numberToPrint *= num;
            }
            System.out.println(numberToPrint);
        }
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
