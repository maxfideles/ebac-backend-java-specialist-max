public class Manager extends Worker{
    @Override
    void work() {
        System.out.println("Work as a Manager");

    }

    @Override
    public void relax() {
        System.out.println("As a manager I don't relax when I reach home.");
    }
}
