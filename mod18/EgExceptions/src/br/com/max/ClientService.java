package br.com.max;

public class ClientService {
    public static void queryClient(String id) throws ClientNotFoundException{
        boolean isRegistred =  false;

        if(!isRegistred){
            throw new ClientNotFoundException("Client not found!");
        }
    }

}
