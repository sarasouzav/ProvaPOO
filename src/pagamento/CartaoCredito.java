package pagamento;

public abstract class CartaoCredito {

    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;

    public CartaoCredito(  String numCartao,  String bandeiraCartao , String titularCartao) {

        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;

    }

    public String getNumCartao() {

        return numCartao;
    }

    public void setNumCartao (String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }


}
