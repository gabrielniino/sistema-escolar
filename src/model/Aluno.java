package model;

/**
 * Representa um aluno com nome, idade e email.
 */
public class Aluno {
    private String nome;
    private int idade;
    private String email;

    /**
     * Construtor do aluno.
     * 
     * @param nome  Nome do aluno.
     * @param idade Idade do aluno.
     * @param email Email do aluno.
     */
    public Aluno(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    /**
     * Retorna o nome do aluno.
     * 
     * @return Nome do aluno.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Exibe os dados completos do aluno.
     */
    public void exibirDados() {
        System.out.println("Aluno: " + nome + " | Idade: " + idade + " | Email: " + email);
    }
}
