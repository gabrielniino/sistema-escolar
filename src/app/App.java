package app;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Pessoa;
import model.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        // Associação
        Professor prof = new Professor("Marcelo", "Programação Orientada a Objetos", "marcelo@unifil.br");
        Disciplina disc = new Disciplina("P.O.O", prof);
        disc.exibir();

        System.out.println();

        // Agregação
        Curso curso = new Curso("Engenharia de Software", 5);
        curso.adicionarAluno(new Aluno("Gabriel", 20, "gabrielnino@edu.unifil.br"));
        curso.adicionarAluno(new Aluno("Maria Luiza", 22, "malu@edu.unifil.br"));
        curso.listarAlunos();

        System.out.println();

        // Composição
        Pessoa p = new Pessoa("Juliana", "Rua G. Júlio", "Londrina", "PR");
        p.exibir();
    }
}
