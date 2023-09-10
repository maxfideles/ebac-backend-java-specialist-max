import javax.swing.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean opt = true;
        ArrayList<Person> people = new ArrayList<>();

        do{
            System.out.println("Insira o nome: ");
            String name = s.nextLine();
            System.out.println("Insira o gênero de " + name + " (Feminino/Masculino)");
            String gender = s.nextLine().toLowerCase();

            people.add(new Person(name,gender));
            System.out.println("Deseja adicionar outra pessoa? (s/n)");
            String op = s.nextLine().toLowerCase();

            if(op.equalsIgnoreCase("n")){
                opt = false;
            }

        }while(opt);

            Stream<Person> female = people.stream()
                .filter(p -> p.getGender().equals("feminino"));

        System.out.println("Lista das pessoas do gênero feminino: \n");
        female.forEach(p-> System.out.println(p.getName()));
    }


}
