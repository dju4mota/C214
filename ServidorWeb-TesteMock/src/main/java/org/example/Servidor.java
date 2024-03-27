package org.example;

public class Servidor  implements ServidorRemoto{
    @Override
    public String buscaAtendimento(String nome) throws NomeVazioException, NomeNaoEncontradoException {
        return nome + " buscado!";
    }
}
