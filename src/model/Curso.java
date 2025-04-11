package model;

/**
 * Representa um curso que agrega alunos (Agregação).
 */
public class Curso {
    private String nome;
    private Aluno[] alunos;
    private int quantidade;

    /**
     * Construtor do curso.
     * 
     * @param nome       Nome do curso.
     * @param capacidade Número máximo de alunos.
     */
    public Curso(String nome, int capacidade) {
        this.nome = nome;
        this.alunos = new Aluno[capacidade];
        this.quantidade = 0;
    }

    /**
     * Adiciona um aluno ao curso.
     * 
     * @param aluno Aluno a ser adicionado.
     */
    public void adicionarAluno(Aluno aluno) {
        if (quantidade < alunos.length) {
            alunos[quantidade] = aluno;
            quantidade++;
        }
    }

    /**
     * Lista os alunos atualmente matriculados no curso.
     */
    public void listarAlunos() {
        System.out.println("Curso: " + nome);
        for (int i = 0; i < quantidade; i++) {
            alunos[i].exibirDados();
        }
    }
}
