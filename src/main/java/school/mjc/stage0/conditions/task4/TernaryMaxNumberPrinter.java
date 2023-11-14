package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        first = first > second ? first : second;
        first = first > third ? first : third;
        System.out.println(first);
    }
}
