package org.example;

public class Horario {
    String professor;
    String horario;
    String periodo;
    int sala;
    String predio;

    public Horario() {
    }

    public Horario(String professor, String horario, String periodo, int sala, String predio) {
        this.professor = professor;
        this.horario = horario;
        this.periodo = periodo;
        this.sala = sala;
        this.predio = predio;
    }
}
