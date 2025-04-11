package model;

/**
 * Representa uma disciplina associada a um professor (Associação).
 */
public class Disciplina {
    private String nome;
    private Professor professor;

    /**
     * Construtor da disciplina.
     * 
     * @param nome      Nome da disciplina.
     * @param professor Professor responsável pela disciplina.
     */
    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    /**
     * Exibe o nome da disciplina e do professor responsável.
     */
    public void exibir() {
        System.out.println("Disciplina: " + nome + " | Professor: " + professor.getNome());
    }
}
