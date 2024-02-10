import java.util.Scanner;

public class hotelbooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter the Dob");
        String customerDob = scanner.nextLine();
        System.out.print("Enter room name: ");
        String roomName = scanner.nextLine();
        System.out.println("\nBooking Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Room Name: " + roomName);
        scanner.close();
    }
}
