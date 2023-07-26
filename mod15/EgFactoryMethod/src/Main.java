import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        BaseComponentsFactory componentsFactory = new ComponentsFactory();


        Scanner s = new Scanner(System.in);

        System.out.println("Write your mobile OS (Android or iOS)");
        String os = s.nextLine();

        UIComponents uiComponents = componentsFactory.createComponents(os);

        uiComponents.label();
        uiComponents.button();
        uiComponents.comboBox();
        uiComponents.textField();
    }
}
