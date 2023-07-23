package br.com.maxfideles;

import br.com.maxfideles.DAO.ClienteMapDAO;
import br.com.maxfideles.DAO.IClienteDAO;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        IClienteDAO iClienteDAO = new ClienteMapDAO();

        String option = JOptionPane.showInputDialog(null, "Escolha uma opcao: \n1- Cadastrar \n2- Consultar \n3- Excluir \n4- Alterar \n5- Sair", "Projeto 1 - CRUD Clientes", JOptionPane.INFORMATION_MESSAGE);

        do{

           if(option.equals("1")){
               String dados = JOptionPane.showInputDialog(null, "Insira os dados para serem cadastrados como seguinda a ordem abaixo: \n(Nome, CPF, Telefone, Endereço, Número, Cidade, Estado)", "Projeto 1 - CRUD Clientes", JOptionPane.INFORMATION_MESSAGE);

               String[] dadosSplitted = dados.split(",");

               Cliente cliente = new Cliente(dadosSplitted[0],dadosSplitted[1],dadosSplitted[2],dadosSplitted[3],dadosSplitted[4],dadosSplitted[5],dadosSplitted[6]);

               if(iClienteDAO.cadastrar(cliente)){
                   JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!","Sucesso!",JOptionPane.INFORMATION_MESSAGE);
                    option = JOptionPane.showInputDialog(null, "Escolha uma opcao: \n1- Cadastrar \n2- Consultar \n3- Excluir \n4- Alterar \n5- Sair", "Projeto 1 - CRUD Clientes", JOptionPane.INFORMATION_MESSAGE);

               }else{
                   JOptionPane.showMessageDialog(null,"Cliente " +cliente.getNome()+ " já está cadastrado(a) com o CPF: " +cliente.getCpf()+ "!");
                   option = JOptionPane.showInputDialog(null, "Escolha uma opcao: \n1- Cadastrar \n2- Consultar \n3- Excluir \n4- Alterar \n5- Sair", "Projeto 1 - CRUD Clientes", JOptionPane.INFORMATION_MESSAGE);
               }

           }else if(option.equals("2")){
               String cpfCliente = JOptionPane.showInputDialog(null, "Insira apenas o número do cpf: ", "Consultar", JOptionPane.INFORMATION_MESSAGE);
               Cliente cliente = iClienteDAO.consultar(Long.parseLong(cpfCliente.trim()));
               if(cliente!=null){
                   JOptionPane.showMessageDialog(null,cliente.toString());
               }else{
                   JOptionPane.showMessageDialog(null,"Cliente não encontrado!");
               }
               option = JOptionPane.showInputDialog(null, "Escolha uma opcao: \n1- Cadastrar \n2- Consultar \n3- Excluir \n4- Alterar \n5- Sair", "Projeto 1 - CRUD Clientes", JOptionPane.INFORMATION_MESSAGE);

           } else if(option.equals("3")){
               String cpfCliente = JOptionPane.showInputDialog(null, "Insira apenas o número do cpf do cliente para excluir: ", "Excluir", JOptionPane.INFORMATION_MESSAGE);
               iClienteDAO.excluir(Long.parseLong(cpfCliente.trim()));
               JOptionPane.showMessageDialog(null,"Cliente Excluido!");
               option = JOptionPane.showInputDialog(null, "Escolha uma opcao: \n1- Cadastrar \n2- Consultar \n3- Excluir \n4- Alterar \n5- Sair", "Projeto 1 - CRUD Clientes", JOptionPane.INFORMATION_MESSAGE);


           } else if(option.equals("4")){
               String dados = JOptionPane.showInputDialog(null, "Insira os dados para serem alterados como seguinda a ordem abaixo: \n(Nome, CPF, Telefone, Endereço, Número, Cidade, Estado)", "Projeto 1 - CRUD Clientes", JOptionPane.INFORMATION_MESSAGE);

               String[] dadosSplitted = dados.split(",");

               Cliente cliente = new Cliente(dadosSplitted[0],dadosSplitted[1],dadosSplitted[2],dadosSplitted[3],dadosSplitted[4],dadosSplitted[5],dadosSplitted[6]);

               if(iClienteDAO.consultar(Long.parseLong(dadosSplitted[1].trim())) != null){
                   iClienteDAO.alterar(cliente);
                   JOptionPane.showMessageDialog(null,"Alterado as informacoes de " +cliente.getNome()+ " com sucesso!");
               }else{
                   JOptionPane.showMessageDialog(null,"Cliente Não Encontrado com estas informaçōes!");
               }

               option = JOptionPane.showInputDialog(null, "Escolha uma opcao: \n1- Cadastrar \n2- Consultar \n3- Excluir \n4- Alterar \n5- Sair", "Projeto 1 - CRUD Clientes", JOptionPane.INFORMATION_MESSAGE);


           }else if(option.equals("5")){
               System.exit(0);

           }else if(option.equals("")){
               System.exit(0);
           }
           else{
                do{
                    option = JOptionPane.showInputDialog(null, "Escolha uma opcao valida: \n1- Cadastrar \n2- Consultar \n3- Excluir \n4- Alterar \n5- Sair", "Projeto 1 - CRUD Clientes", JOptionPane.INFORMATION_MESSAGE);
                }while (!isValidOption(option));
            }
       }while(true);
    }
    private static boolean isValidOption(String dados) {
        return dados.equals("1") || dados.equals("2") || dados.equals("3") || dados.equals("4") || dados.equals("5");
    }
}
