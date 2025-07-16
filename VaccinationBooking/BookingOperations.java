import java.util.Scanner;

public class BookingOperations {

    public static void bookingslot(Scanner sc) {

        System.out.print("Enter name: ");

        String name = sc.nextLine();
        System.out.println("Hello " + name + "! Welcome to the Covid Vaccination Booking System.");
        System.out.println("Please provide your details to book a slot.");

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("❌ Booking failed. Age must be 18+.\n");
            return;
            // break;
            // return ,break , conti
        }

        String Slot1 = "9 AM";
        String Slot2 = "11 AM";
        String Slot3 = "2 PM";
        String Slot4 = "5 PM";
        System.out.print("Enter preferred slot ( "+Slot1+ " / "+Slot2+ " / "+Slot3+ " / "+Slot4+ " ): ");
        String slot = sc.next();

        BookingData.bookings[BookingData.count][0] = name;
        BookingData.bookings[BookingData.count][1] = slot;
        BookingData.ages[BookingData.count] = age;

        BookingData.count++;

        System.out.println("Congratulation "+name+ " Your Booking has been Confirmed ✅\n");
        System.out.println("Your Slot Timing is : "+slot+"\n");

    }

    public static void showBookings() {
        System.out.println("\n📋 All Bookings:");
        System.out.printf("%-10s %-5s %-10s\n", "Name", "Age", "Slot");

        for (int i = 0; i < BookingData.count; i++) {
            System.out.printf("%-10s %-5d %-10s\n",
                    BookingData.bookings[i][0],
                    BookingData.ages[i],
                    BookingData.bookings[i][1]);
        }

        System.out.println();
    }

    public static void searchBySlot(Scanner sc) {
        System.out.print("Enter slot to search: ");
        String target = sc.next();
        boolean found = false;
        System.out.println("Users in slot " + target + ":");

        for (int i = 0; i < BookingData.count; i++) {
            if (BookingData.bookings[i][1].equalsIgnoreCase(target)) {
                System.out.println("- " + BookingData.bookings[i][0] + " (" + BookingData.ages[i] + " yrs)");
                found = true;
            }
        }
        if (!found)
            System.out.println("No users found.\n");

    }

    // serarch name
    // emailid

}