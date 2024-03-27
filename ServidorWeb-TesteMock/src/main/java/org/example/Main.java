package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NomeNaoEncontradoException, NomeVazioException {

        PreencheAtendimentos preencheAtendimentos = new PreencheAtendimentos(new Servidor());
        Horario horariodju = preencheAtendimentos.buscaHorarios("dju");

    }
}