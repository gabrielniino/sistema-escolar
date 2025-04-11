package model;

/**
 * Representa um endereço com rua e cidade.
 */
public class Endereco {
    private String rua;
    private String cidade;

    /**
     * Construtor do endereço.
     * 
     * @param rua    Nome da rua.
     * @param cidade Nome da cidade.
     */
    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    /**
     * Retorna o endereço completo (rua e cidade).
     * 
     * @return Endereço completo em formato de string.
     */
    public String getEnderecoCompleto() {
        return rua + ", " + cidade;
    }
}
