public class ContaCorrente extends Conta{

    protected String codigoCc = "04";

    public ContaCorrente(double saldo, String[] vetChavePix) {
        super(saldo, vetChavePix);
        
    }

    @Override
    public void transferir(String vetChavePix, double saldo) {
        
        super.transferir(vetChavePix, saldo);
    }

    @Override
    protected double extrato() {
        
        return super.extrato();
    }

    @Override
    protected void mostraChavePix() {
        
        super.mostraChavePix();
    }


    
}
