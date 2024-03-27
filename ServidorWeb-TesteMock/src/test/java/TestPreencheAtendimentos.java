import org.example.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPreencheAtendimentos {

    ServidorRemoto servidorRemoto;
    PreencheAtendimentos preencheAtendimentos;

    @Before
    public void setup(){
        servidorRemoto = new ServidorRemotoMock();
        preencheAtendimentos = new PreencheAtendimentos(servidorRemoto);
    }
    // cenarios de sucesso

    @Test
    public void testeBuscaRetorno() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horario = preencheAtendimentos.buscaHorarios("Fernando");
        assertTrue(horario instanceof Horario);
    }

    @Test
    public void testeBuscaNomeFernando() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Fernando");
        assertEquals("Fernando Mota", horarioteste.getProfessor());
    }
    @Test
    public void testeBuscaNomeLidia() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Lidia");
        assertEquals("Lidia Andrade", horarioteste.getProfessor());
    }

    @Test
    public void testeBuscaPeriodoNoturno() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Marcelo");
        assertEquals("Noturno", horarioteste.getPeriodo());
    }

    @Test
    public void testeBuscaPeriodoIntegral() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Renzo");
        assertEquals("Integral", horarioteste.getPeriodo());
    }

    @Test
    public void testeBuscaPredioSeis() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Renzo");
        assertEquals(30, horarioteste.getSala());
        assertEquals("6",horarioteste.getPredio());
    }

    @Test
    public void testeBuscaPredioDois() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Marcelo");
        assertEquals(9, horarioteste.getSala());
        assertEquals("2",horarioteste.getPredio());
    }
    @Test
    public void testeBuscaPredioUm() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Felipe");
        assertEquals(3, horarioteste.getSala());
        assertEquals("1",horarioteste.getPredio());
    }
    @Test
    public void testeBuscaHorarioChris() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Christopher");
        assertEquals("19:30", horarioteste.getHorario());
    }
    @Test
    public void testeBuscaHorarioLidia() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Fernando");
        assertEquals("15:30", horarioteste.getHorario());
    }


    @Test
    public void testeBuscaNull() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Fernando");
        assertNotNull(horarioteste.getProfessor());
        assertNotNull(horarioteste.getHorario());
        assertNotNull(horarioteste.getPeriodo());
        assertNotNull(horarioteste.getPredio());
    }

    // cenarios de falha
//    @Test
//    public void testeBuscaNomeVazio(){
//        Assert.assertThrows(NomeVazioException.class, ()->
//                preencheAtendimentos.buscaHorarios(""));
//    }
//
//    @Test
//    public void testeBuscaNomeInvalido(){
//        Assert.assertThrows(NomeNaoEncontradoException.class, ()->
//                preencheAtendimentos.buscaHorarios("sadadsa"));
//    }
    @Test
    public void testeBuscaPredioErrado() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Felipe");
        assertEquals(3, horarioteste.getSala());
        assertNotEquals("5",horarioteste.getPredio());
    }

    @Test
    public void testeBuscaNomeErrado() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Renzo");
        assertNotEquals("Marcelo Cysneiros",horarioteste.getProfessor());
    }

    @Test
    public void testeBuscaHorarioErrado() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("Renzo");
        assertNotEquals("19:30",horarioteste.getHorario());
    }
    @Test
    public void testeBuscaDadoInvalidoHorario() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("invalido");
        assertEquals("30:30",horarioteste.getHorario());
    }

    @Test
    public void testeBuscaDadoInvalidoSala() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("invalido");
        assertEquals(-5,horarioteste.getSala());
    }
    @Test
    public void testeBuscaDadoInvalidoNome() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("invalido");
        assertEquals("invalido",horarioteste.getProfessor());
    }
    @Test
    public void testeBuscaDadoInvalidoPredio() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("invalido");
        assertEquals("230",horarioteste.getPredio());
    }
    @Test
    public void testeBuscaDadoInvalidoPeriodo() throws NomeNaoEncontradoException, NomeVazioException {
        Horario horarioteste = preencheAtendimentos.buscaHorarios("invalido");
        assertEquals("",horarioteste.getPeriodo());
    }

}
