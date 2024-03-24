import org.example.NomeNaoEncontradoException;
import org.example.NomeVazioException;
import org.example.ServidorRemoto;

public class ServidorRemotoMock implements ServidorRemoto {

    @Override
    public String buscaAtendimento(String nome) throws NomeVazioException, NomeNaoEncontradoException {
            switch (nome){
                case "":
                    throw new NomeVazioException();
                case "Christopher":
                    return HorarioConst.CHRIS;
                case "Renzo":
                    return HorarioConst.RENZO;
                case "Marcelo":
                    return HorarioConst.MARCELO;
                case "Fernando":
                    return HorarioConst.DJU;
                case "Lidia":
                    return HorarioConst.LIDIA;
                case "Felipe":
                    return HorarioConst.FELIPE;
                default:
                    throw new NomeNaoEncontradoException();

            }
    }
}
