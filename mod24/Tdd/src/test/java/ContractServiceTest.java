import com.max.dao.ContractDao;
import com.max.dao.IContractDao;
import com.max.service.ContractService;
import com.max.service.IContractService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContractServiceTest {

    @Test
    public void saveTest(){
        IContractService service = new ContractService();
        Assertions.assertEquals("Success",service.salvar());
    }

    @Test
    public void saveExceptionTest(){
        IContractDao dao = new ContractDao();
        IContractService service = new ContractService();
        try{
            String response = service.salvar();
        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class,ex.getClass());
        }
    }
}
