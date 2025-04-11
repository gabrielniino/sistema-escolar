package model;

/**
 * Representa um professor com um nome.
 */
public class Professor {
    private String nome;

    /**
     * Construtor do professor.
     * 
     * @param nome Nome do professor.
     */
    public Professor(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o nome do professor.
     * 
     * @return Nome do professor.
     */
    public String getNome() {
        return nome;
    }
}
