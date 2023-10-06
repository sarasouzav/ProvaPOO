package pagamento;

public class CartaoDebito extends Pagamento{
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Data e Hora: " + getDataHoraPagamento() +
               "\n Número Pagamento: " + getNumeroPagamento() +
               "\n Valor Pago: " + getValorPago() +
               "\n Número Cartão: " + getNumCartao() +
               "\n Titular Cartão: " + getTitularCartao();
    }

}
