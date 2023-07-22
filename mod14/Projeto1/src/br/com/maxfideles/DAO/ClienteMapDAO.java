package br.com.maxfideles.DAO;

import br.com.maxfideles.Cliente;

import javax.swing.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO{


    private Map<Long,Cliente> map;

    public ClienteMapDAO(){

        this.map = new HashMap<>();
    }



    @Override
    public Boolean cadastrar(Cliente cliente) {
         if (!this.map.containsKey(cliente.getCpf())){
             this.map.put(cliente.getCpf(),cliente);
             return true;
         }
         return false;
    }


    @Override
    public void excluir(Long cpf) {
        this.map.remove(cpf);
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteFound = map.get(cliente.getCpf());
        if(clienteFound!=null){
            clienteFound.setNome(cliente.getNome());
            clienteFound.setCpf(cliente.getCpf());
            clienteFound.setTel(cliente.getTel());
            clienteFound.setCidade(cliente.getCidade());
            clienteFound.setEnd(cliente.getEnd());
            clienteFound.setNumero(cliente.getNumero());
            clienteFound.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }


}
