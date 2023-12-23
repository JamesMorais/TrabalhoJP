package org.example;

import java.util.List;

public class Consultas {
    public static void main(String[] args) {
        Medico medico = new Medico("Gilberto Gil", "123456", "gilberto.gil", "123456");

        medico.logar();

        List<Consulta> consultas = medico.getConsultasAgendadas();

        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }
}