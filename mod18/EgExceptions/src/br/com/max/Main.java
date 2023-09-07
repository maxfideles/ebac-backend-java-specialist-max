package br.com.max;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog(null,"Insert the customer ID","Query",JOptionPane.INFORMATION_MESSAGE);

   try{
       ClientService.queryClient(id);
   }catch (ClientNotFoundException e){
    JOptionPane.showMessageDialog(null,e.getMessage(),"Attention",JOptionPane.INFORMATION_MESSAGE);
   }

    }
}
