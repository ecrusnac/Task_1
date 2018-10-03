package Task1_7;

public class Main {

    public static void main(String[] args) {
        Object[] obj = new Object[]{1, 2, 3, "abc", new Person("Olga", 20, "F"), "abc", 20, new Person("Ana", 19, "F")};
        Processor processor = new Processor();
        for (Object o : obj) processor.compute(o);

        System.out.println("Strings: " + processor.getStringsFromArgs());
        System.out.println("Sum: " + processor.getSumOfAllArgs());
        System.out.println("All people: ");
        for (Person person : processor.getPeople())
            System.out.println(person);

    }
}

