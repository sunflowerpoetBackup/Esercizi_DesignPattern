package Es_02;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Anna", "Simionato")
                .age(23)
                .address("Via Rossi 21")
                .build();

        Person person2 = new Person.Builder("Alex", "Turley")
                .age(27)
                .address("Via Aldo Moro 34")
                .build();

        System.out.println("Person 1 Details:");
        person1.printDetails();

        System.out.println("\nPerson 2 Details:");
        person2.printDetails();
    }
}
