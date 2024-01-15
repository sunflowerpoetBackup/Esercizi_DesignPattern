package Es_03;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Anna Simionato", 23);
        User user2 = new User("Alex Turley", 27);

        System.out.println("User 1 Info (Default):");
        user1.printInfo();

        System.out.println("\nUser 2 Info (Default):");
        user2.printInfo();

        user2.setName("Alice Fraticelli");
        user2.setAge(23);

        System.out.println("\nUser 2 Info (Updated):");
        user2.printInfo();
    }
}
