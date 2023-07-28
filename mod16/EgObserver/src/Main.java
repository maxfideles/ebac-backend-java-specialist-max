import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean aux = true;

        System.out.println("Hello! Let's set your Instagram username:");
        String username = s.nextLine();

        InstaAccount instaAccount = new InstaAccount("@"+username.toLowerCase());
        System.out.println("Welcome to Instagram " + username);
        System.out.println("This is your username: "+instaAccount.getNameAccount());

        System.out.println("\nOkay, let's set some followers to you on Instagram.");
        registerFollowers(instaAccount);

        System.out.println("\nNow, let's set some followers that will receive the notification by email.");
        registerEmailNotification(instaAccount);


        System.out.println("\nGreat! Everything is configured.");
        System.out.println("You're in a live video now on Instagram, send a message as notification to your followers");
        String message = s.nextLine();

        instaAccount.setMessage(message);

        instaAccount.notifyObserver();


    }

    private static void registerEmailNotification(InstaAccount instaAccount) {

        Scanner s = new Scanner(System.in);
        Boolean aux= true;
        do{

            System.out.println("Type below the email to receive notification.");
            String email = s.nextLine();

            instaAccount.addObserver(new Email(email));

            System.out.println("Would like to add more followers to receive notification by email? (y/n)");
            String opt = s.nextLine();

            if(opt.equals("n")){
                System.out.println("\nThe emails were registred!");
                aux=false;
            }

        }while(aux);

    }

    public static void registerFollowers(InstaAccount instaAccount){
        Scanner s = new Scanner(System.in);
        Boolean aux= true;
        do{

            System.out.println("Type below the username to receive notification from Instagram: (Eg. @maria)");
            String follower = s.nextLine();

            instaAccount.addObserver(new InstaFollower(follower));

            System.out.println("Would like to add more followers to receive notification from Instagram? (y/n)");
            String opt = s.nextLine();

            if(opt.equals("n")){
                System.out.println("\nThe followers were registred!");
                aux=false;
            }

        }while(aux);
    }

}
