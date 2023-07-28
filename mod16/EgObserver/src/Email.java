public class Email implements Observer{

    private String emailAddress;

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(String notification,String instaAccount) {

        System.out.println("\nE-mail Received at " +emailAddress);
        System.out.println(instaAccount + " started a live video on Instagran, Check it out!");
        System.out.println(notification);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
