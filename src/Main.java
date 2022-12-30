public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        task6();
        //task7();
    }

    public static void task1() {
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

    public static void task2() {
        System.out.println("Задача 2");
        int t = 12;
        if (t < 5) {
            System.out.println("На улице " + t + ", нужно надеть шапку");
        } else {
            System.out.println("На улице " + t + ", можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short V = 55;
        short police = 60;
        if (V > police) {
            System.out.println("Если скорость " + V + ", придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + V + ", можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int ageA = 4;
        byte ageB = 14;
        byte ageC = 18;
        byte ageD = 35;
        if (ageA >= 2 && ageA <= 6) {
            System.out.println("Если возраст человека равен " + ageA + ", то ему нужно ходить в детский сад");
        }
        if (ageB >= 7 && ageB <= 18) {
            System.out.println("Если возраст человека равен " + ageB + ", то ему нужно ходить в школу");
        }
        if (ageC >= 18 && ageC <= 24) {
            System.out.println("Если возраст человека равен " + ageC + ", то ему нужно ходить в университет");
        }
        if (ageD < 24) {
            System.out.println("Если возраст человека равен " + ageD + ", то ему не нужно работать");
        } else {
            System.out.println("Если возраст человека равен " + ageD + ", то ему нужно ходить на работу");

        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 8;
        boolean adultHere = ageChild > 5 && ageChild < 14;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то можно кататься на аттракционе в сопровождении взрослого");
        }
        if (adultHere) {
            System.out.println("Взрослый есть, можно кататься");
        } else if (ageChild < 14) {
            System.out.println("Взрослого нет, нельзя кататься");
        }
        if (ageChild >= 14 && ageChild < 18) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого");
        }

    }
    public static void task6() {
        System.out.println("Задача 6");
        int fullCapacity = 102;
        int seatPlace = 60;
        int standPlace = 52;
        int people = 7;
        int standPlaceLast = fullCapacity - people;
        int seatPlaceLast = seatPlace - people;
        if (people < fullCapacity) {
            System.out.println("В вагоне есть места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        if (people >= seatPlace && people < fullCapacity) {
            System.out.println("В вагоне остались только стоячие места " + standPlaceLast + " мест");
        } else {
            System.out.println("В вагоне есть сидячие места " + seatPlaceLast + " мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 8;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        }
        if (two > one && two > three) {
            System.out.println("Наибольшее число " + two);
        }
        if (three > one && three > two) {
            System.out.println("Наибольшее число " + three);
        }
    }
}