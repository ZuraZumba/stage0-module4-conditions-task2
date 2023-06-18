package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first > second){
            System.out.println(first);
        }
        else if (first < second){
            System.out.println(second);
        }
        else {
            System.out.println(first);
            System.out.println(second);
        }
    }
    public static void main (String[] args){
        GreatestNumberPrinter greatestNumberPrinter = new GreatestNumberPrinter();
        int first = 1;
        int second = 2;
        greatestNumberPrinter.printGreatest(first, second);
    }
}
