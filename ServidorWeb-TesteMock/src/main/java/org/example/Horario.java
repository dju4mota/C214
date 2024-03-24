package org.example;

public class Horario {
    private String professor;
    private String horario;
    private String periodo;
    private int sala;
    private String predio;

    public Horario() {
    }

    public Horario(String professor, String horario, String periodo, int sala, String predio) {
        this.professor = professor;
        this.horario = horario;
        this.periodo = periodo;
        this.sala = sala;
        this.predio = predio;
    }

    public String getProfessor() {
        return professor;
    }

    public String getHorario() {
        return horario;
    }

    public String getPeriodo() {
        return periodo;
    }

    public int getSala() {
        return sala;
    }

    public String getPredio() {
        return predio;
    }
}
