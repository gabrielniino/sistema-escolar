package model;

/**
 * Representa uma pessoa com endereço criado internamente (Composição).
 */
public class Pessoa {
    private String nome;
    private Endereco endereco;

    /**
     * Construtor da pessoa.
     * 
     * @param nome   Nome da pessoa.
     * @param rua    Rua do endereço.
     * @param cidade Cidade do endereço.
     */
    public Pessoa(String nome, String rua, String cidade) {
        this.nome = nome;
        this.endereco = new Endereco(rua, cidade);
    }

    /**
     * Exibe o nome e o endereço completo da pessoa.
     */
    public void exibir() {
        System.out.println("Pessoa: " + nome);
        System.out.println("Endereço: " + endereco.getEnderecoCompleto());
    }
}
