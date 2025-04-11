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
     * @param estado Estado do endereço.
     */
    public Pessoa(String nome, String rua, String cidade, String estado) {
        this.nome = nome;
        this.endereco = new Endereco(rua, cidade, estado);
    }

    /**
     * Retorna o endereço completo da pessoa.
     * 
     * @return Endereço completo como string.
     */
    public String getEnderecoCompleto() {
        return endereco.getEnderecoCompleto();
    }

    /**
     * Exibe o nome e o endereço completo da pessoa (se válidos).
     */
    public void exibir() {
        System.out.println("Pessoa: " + nome);
        if (endereco != null && endereco.isValido()) {
            System.out.println("Endereço: " + endereco.getEnderecoCompleto());
        } else {
            System.out.println("Endereço: dados inválidos ou incompletos.");
        }
    }
}
