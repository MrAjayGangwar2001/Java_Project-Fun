import java.util.Scanner;

public class Booking_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String response = "yes";
        while (response.equalsIgnoreCase("yes")) {
            System.out.println("\n=== Covid Vaccination Booking ===");
            System.out.println("1. Book Slot");
            System.out.println("2. Show All Bookings");
            System.out.println("3. Search By Slot");
            System.out.println("4. Exit");
            System.out.print("Choose an Option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    BookingOperations.bookingslot(sc);
                    break;
                case 2:
                    BookingOperations.showBookings();
                    break;
                case 3:
                    BookingOperations.searchBySlot(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using the Covid Vaccination Booking System! Stay Safe.");
                    return;
                default:
                    System.out.println("Invalid input.");
            }

            System.out.println("Thank you for using the Covid Vaccination Booking System! Stay Safe.");
            sc.nextLine();
            System.out.println("Do you want to book/process another booking? (yes/no): ");
            response = sc.nextLine();
        }

    }
}
