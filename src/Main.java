public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int ageMan1 = 67;
        int ageMan2 = 14;
        if (ageMan1 > 18) {
            System.out.println("Если возраст человека равен " + ageMan1 + ", то он совершеннолетний");
        }
        if (ageMan2 < 18) {
            System.out.println("Если возраст человека равен " + ageMan2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int t = 12;
        if (t < 5) {
            System.out.println("На улице " + t + ", нужно надеть шапку");
        } else {
            System.out.println("На улице " + t + ", можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short V= 55;
        short police = 60;
        if (V > police) {
            System.out.println("Если скорость " + V + ", придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + V + ", можно ездить спокойно");
        }
    }
}