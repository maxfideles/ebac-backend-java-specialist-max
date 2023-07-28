public class InstaFollower implements Observer {

    private String instaName;

    public InstaFollower(String instaName){
        this.instaName = instaName;
    }

    @Override
    public void update(String notification, String instaAccount) {
        System.out.println("\nInstagram Notification! [" +instaName+"]");
        System.out.println(instaAccount + " started a live video, come and join to it!");
        System.out.println(notification);
    }


    public String getInstaName() {
        return instaName;
    }

    public void setInstaName(String instaName) {
        this.instaName = instaName;
    }
}