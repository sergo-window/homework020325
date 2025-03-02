public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int airTemperature = 13;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }

        int carSpeed = 70;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " км/ч, то придётся заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + carSpeed + " км/ч, то можно ездить спокойно");
        }

        int ageMan = 19;
        if (ageMan > 2 && ageMan < 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад");
        }
        if (ageMan > 7 && ageMan < 17) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то его место в университете");
        }
        if (ageMan > 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно пора ходить на работу");
        }

        int ageChild = 7;
        if (ageChild < 5) {
            System.out.println("Если возраст ребёнка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребёнка равен " + ageChild + ", то ему можно кататься на аттракционе только в сопровождении взрослого");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребёнка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int passenger = 15;
        if (passenger <= 60) {
            System.out.println("Есть сидячие места");
        }
        else if (passenger > 60 && passenger <= 102) {
            System.out.println("Есть только стоячие места");
        }
        else {
            System.out.println("Свободных мест нет");
        }

        int one = 11;
        int two = 22;
        int three = 33;
        if (one > two && one > three) {
            System.out.println("Число one большее");
        }
        else if (two > three) {
            System.out.println("Число two большее");
        }
        else {
            System.out.println("Число three большее");
        }
    }
}