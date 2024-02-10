class Room {
    private int roomNumber;
    private int floorNumber;
    public Room(int roomNumber, int floorNumber) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
    @Override
    public String toString() {
        return "Room Number: " + roomNumber + ", Floor Number: " + floorNumber;
    }
}

class CustomerBooking extends Room {
    private String customerName;
    private String checkInDate;
    private String checkOutDate;

    public CustomerBooking(int roomNumber, int floorNumber, String customerName, String checkInDate, String checkOutDate) {
        super(roomNumber, floorNumber);
        this.customerName = customerName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + ", " + super.toString() +
               ", Check-in: " + checkInDate + ", Check-out: " + checkOutDate;
    }
}


public class Main {
    public static void main(String[] args) {
        Room room = new Room(101, 1);
        System.out.println("Room Details: " + room);

        
        CustomerBooking booking = new CustomerBooking(201, 2, "John Doe", "2024-02-10", "2024-02-15");
        System.out.println("Booking Details: " + booking);
    }
}

