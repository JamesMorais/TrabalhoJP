package org.example;

import java.util.List;

public class Medico {
    private String nome;
    private String crm;
    private String usuario;
    private String senha;

    public Medico(String nome, String crm, String usuario, String senha) {
        this.nome = nome;
        this.crm = crm;
        this.usuario = usuario;
        this.senha = senha;
    }

    public void logar() {
        // Implementação do método logar()
    }

    public List<Consulta> getConsultasAgendadas() {
        // Implementação do método getConsultasAgendadas()
        return null;
    }
}
