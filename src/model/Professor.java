package model;

/**
 * Representa um professor com nome, especialidade e email.
 */
public class Professor {
    private String nome;
    private String especialidade;
    private String email;

    /**
     * Construtor do professor.
     * 
     * @param nome          Nome do professor.
     * @param especialidade Especialidade do professor.
     * @param email         Email do professor.
     */
    public Professor(String nome, String especialidade, String email) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.email = email;
    }

    /**
     * Retorna a especialidade do professor.
     * 
     * @return Especialidade do professor.
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * Retorna o email do professor.
     * 
     * @return Email do professor.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Retorna os dados completos do professor formatados.
     * 
     * @return Dados formatados do professor.
     */
    public String exibirDadosProfessor() {
        return nome + " - Especialidade: " + especialidade + " | Email: " + email;
    }
}
