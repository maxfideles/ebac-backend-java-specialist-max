public class Apartment extends Habitation{


    @Override
    void summary() {
        this.setType("Apartment");
        this.setAddress("Oxford Street, W1C 1DH. London-Uk");
        this.setNumRooms(2);

        System.out.println("\nYou are renting an " +getType());
        System.out.println("This apartment is located at:");
        System.out.println(this.getAddress());
        System.out.println("Number of rooms: " +this.getNumRooms());
    }
}
