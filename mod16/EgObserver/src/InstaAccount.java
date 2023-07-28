import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class InstaAccount implements Subject{

    //Defining the list of  Subscribers (Observers)
    List<Observer> followers = new ArrayList<>();

    private String nameAccount;

    private String message;

    public InstaAccount(String nameAccount){
        this.nameAccount = nameAccount.replace(" ","");
    }

    public void setNameAccount(String nameAccount){
        this.nameAccount = nameAccount;
    }

    public String getNameAccount(){
        return this.nameAccount;
    }

    @Override
    public void addObserver(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);

    }

    @Override
    public void notifyObserver() {

        for (Observer obj: this.followers){
            obj.update(this.message,this.nameAccount);
        }

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
