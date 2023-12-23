package org.example;

public class Consulta {

    private int id;
    private String paciente;
    private String data;
    private String hora;

    public Consulta(int id, String paciente, String data, String hora) {
        this.id = id;
        this.paciente = paciente;
        this.data = data;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", paciente='" + paciente + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
