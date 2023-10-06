package pagamento;

public abstract  class CartaoDebito  extends Pagamento {

    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
    }


    public String getNumCartao() {

        return numCartao;
    }

    public void setNumCartao (String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

}
