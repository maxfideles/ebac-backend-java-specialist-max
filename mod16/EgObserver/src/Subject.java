public interface Subject {

    /**
     *
     * @param observer The follower (Observer) that will be notified
     * @author maxfideles
     */
    void addObserver(Observer observer);

    /**
     *
     * @param observer The follower (Observer) that will stop to receive notifications
     * @author maxfideles
     */
    void removeObserver(Observer observer);

    /**
     *
     * //@param observer The follower (Observer) that will be notified about the update
     * @author maxfideles
     */

    void notifyObserver();

}
