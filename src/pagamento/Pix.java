package pagamento;

public abstract class Pix extends Pagamento
{

    private boolean comprovanteTransacaoPix;

    public Pix (boolean comprovanteTransacaoPix) {
        super(comprovanteTransacaoPix);


    }

    public boolean getcomprovanteTransacaoPix() {

        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }




}
