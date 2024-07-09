import com.max.dao.ContractDao;
import com.max.dao.ContractDaoMock;
import com.max.dao.IContractDao;
import com.max.service.ContractService;
import com.max.service.IContractService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContractServiceTest {

    @Test
    public void saveTest(){
        IContractDao contractDao = new ContractDao();
        IContractService service = new ContractService(contractDao);
        Assertions.assertEquals("Success",service.salvar());
    }

    @Test
    public void saveExceptionTest(){
        IContractDao dao = new ContractDaoMock();
        IContractService service = new ContractService(dao);
        try{
            String response = service.salvar();
        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class,ex.getClass());
        }
    }

    @Test
    public void searchTest(){
        IContractDao contractDao = new ContractDao();
        IContractService service = new ContractService(contractDao);
        Assertions.assertEquals("Success",service.search(1));
    }

    @Test
    public void searchExceptionTest(){
        IContractDao dao = new ContractDaoMock();
        IContractService service = new ContractService(dao);
        try{
            String response = service.search(1);
        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class,ex.getClass());
        }
    }

    @Test
    public void updateTest(){
        IContractDao contractDao = new ContractDao();
        IContractService service = new ContractService(contractDao);
        Assertions.assertEquals("Success",service.update(1));
    }

    @Test
    public void updateExceptionTest(){
        IContractDao dao = new ContractDaoMock();
        IContractService service = new ContractService(dao);
        try{
            String response = service.update(1);
        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class,ex.getClass());
        }
    }

    @Test
    public void deleteTest(){
        IContractDao contractDao = new ContractDao();
        IContractService service = new ContractService(contractDao);
        Assertions.assertEquals("Success",service.delete(1));
    }

    @Test
    public void deleteExceptionTest(){
        IContractDao dao = new ContractDaoMock();
        IContractService service = new ContractService(dao);
        try{
            String response = service.delete(1);
        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class,ex.getClass());
        }
    }
}
