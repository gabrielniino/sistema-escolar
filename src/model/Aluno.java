package model;

/**
 * Representa um aluno com um nome.
 */
public class Aluno {
    private String nome;

    /**
     * Construtor do aluno.
     * 
     * @param nome Nome do aluno.
     */
    public Aluno(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o nome do aluno.
     * 
     * @return Nome do aluno.
     */
    public String getNome() {
        return nome;
    }
}
