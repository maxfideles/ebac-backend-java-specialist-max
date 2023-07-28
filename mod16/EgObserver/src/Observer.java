public interface Observer {
    /**
     *
     * @param notification The message to be sent
     * @param instaAccount The account name which the follower(Observer) is following(Observing)
     * @author maxfideles
     */

    public void update(String notification,String instaAccount);


}
