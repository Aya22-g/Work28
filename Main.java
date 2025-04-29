package kg.attractor.java.task1;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getBreed));
        System.out.println("Sorted by breed: ");
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));
        System.out.println("Sorted by name and age: ");
        Printer.print(cats);

        cats.removeIf(cat -> cat.getAge() == 5);
        System.out.println("After remove cats with age 5: ");
        Printer.print(cats);

        cats.removeIf(cat ->cat.getColor() == Cat.Color.SILVER);
        System.out.println("After remove cats with color SILVER: ");
        Printer.print(cats);
    }

}
