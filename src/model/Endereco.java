package model;

/**
 * Representa um endereço com rua, cidade e estado.
 */
public class Endereco {
    private String rua;
    private String cidade;
    private String estado;

    /**
     * Construtor do endereço.
     * 
     * @param rua    Nome da rua.
     * @param cidade Nome da cidade.
     * @param estado Nome do estado.
     */
    public Endereco(String rua, String cidade, String estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    /**
     * Retorna o endereço completo (rua, cidade e estado).
     * 
     * @return Endereço completo em formato "Rua, Cidade - Estado".
     */
    public String getEnderecoCompleto() {
        return rua + ", " + cidade + " - " + estado;
    }

    /**
     * Verifica se o endereço possui dados válidos.
     * 
     * @return true se todos os campos forem não nulos e não vazios.
     */
    public boolean isValido() {
        return rua != null && !rua.isEmpty() &&
               cidade != null && !cidade.isEmpty() &&
               estado != null && !estado.isEmpty();
    }
}
