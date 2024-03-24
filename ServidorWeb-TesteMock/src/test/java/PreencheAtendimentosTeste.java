import org.example.PreencheAtendimentos;
import org.example.ServidorRemoto;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PreencheAtendimentosTeste {

    ServidorRemoto servidorRemoto;
    PreencheAtendimentos preencheAtendimentos;

    @Before
    public void setup(){
        servidorRemoto = new ServidorRemotoMock();
        preencheAtendimentos = new PreencheAtendimentos(servidorRemoto);
    }


}
