import java.util.Scanner;

public class ContaPoupanca extends Conta{

    

    public ContaPoupanca(double saldo, String[] vetChavePix) {
        super(saldo, vetChavePix);
        
    }

    @Override
    public void transferir(String vetChavePix, double saldo) {
        double valor;

        Scanner scan = new Scanner(System.in);
        
            valor = scan.nextDouble();
            scan.close();

        if(valor<5000.00){
        
        super.transferir(vetChavePix, saldo);
    }
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
