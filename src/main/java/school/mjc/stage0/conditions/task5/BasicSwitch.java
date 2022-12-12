package school.mjc.stage0.conditions.task5;

public class BasicSwitch {
    public static void main(String[] args) {
        int a = 5;
        switch (a) {
            default -> System.out.println("default");
            case 7 -> System.out.println("seven");
            case 10 -> System.out.println("ten");
            case 20 -> System.out.println("twenty");
        }
    }
}
