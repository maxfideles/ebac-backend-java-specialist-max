public class PrimeiraClasse {

    public static void main (String [] args){
        Cliente customer = new Cliente();
        customer.cadastrarEndereco("Rua X");
        customer.setNome("Max");
        System.out.println(customer.getNome());
        System.out.println(customer.getEndereco());

    }

}
