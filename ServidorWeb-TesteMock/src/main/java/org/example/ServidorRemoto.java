package org.example;

public interface ServidorRemoto {

    public String buscaAtendimento(String nome) throws NomeVazioException, NomeNaoEncontradoException;

}
