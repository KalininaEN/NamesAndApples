public class NamesAndApples {
    public static void main(String[] args) {
        printInformation("Борис", 100);
    }

    public static void printInformation(String name, int number) {

        if (number < 0) {
            System.out.println("Количество яблок не может быть отрицательным.");

        } else if (number % 10 == 0 || number >= 5 && number <= 20) {
            System.out.println(name + " хранит " + number + " яблок.");

        } else if (number % 10 == 1) {
            System.out.println(name + " хранит " + number + " яблоко.");

        } else if (number % 10 <= 4) {
            System.out.println(name + " хранит " + number + " яблока.");

        } else {
            System.out.println(name + " хранит " + number + " яблок.");
        }
    }
}
