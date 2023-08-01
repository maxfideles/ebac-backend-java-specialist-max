public class Home extends Habitation{


   @Override
   void summary() {
      this.setType("Home");
      this.setAddress("Regent Street, W1B 4EA. London-Uk");
      this.setNumRooms(4);

      System.out.println("\nYou are renting a " +getType());
      System.out.println("This house is located at:");
      System.out.println(this.getAddress());
      System.out.println("Number of rooms: " +this.getNumRooms());
   }
}
