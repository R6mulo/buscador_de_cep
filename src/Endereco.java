public class Endereco {
    private String cep;
    private String logadouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    // Criação de Getters e Setters

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return String.format("""
                CEP: %S
                Logadouro: %s
                Bairro: %s
                Cidade: %s
                UF: %s
                Complemento: %s
                """, cep, logadouro, bairro, localidade, uf, complemento);
    }
}
