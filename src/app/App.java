package app;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Pessoa;
import model.Professor;

/**
 * Classe principal para execução do sistema.
 */
public class App {
    /**
     * Método principal que demonstra os conceitos de associação, agregação e composição.
     * 
     * @param args 
     */
    public static void main(String[] args) throws Exception {
        // Associação
        Professor prof = new Professor("Marcelo");
        Disciplina disc = new Disciplina("P.O.O", prof);
        disc.exibir();

        System.out.println();

        // Agregação
        Curso curso = new Curso("Engenharia de Software", 5);
        curso.adicionarAluno(new Aluno("Gabriel"));
        curso.adicionarAluno(new Aluno("Maria Luiza"));
        curso.listarAlunos();

        System.out.println();

        // Composição
        Pessoa p = new Pessoa("Juliana", "Rua G. Júlio", "Londrina");
        p.exibir();
    }
}

