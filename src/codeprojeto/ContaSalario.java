public class ContaSalario extends Conta {

    

    public ContaSalario(double saldo, String[] vetChavePix) {
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
