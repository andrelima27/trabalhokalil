public class Conta {

    protected double saldo;
    protected String vetChavePix[] = new String[5];

    public Conta(double saldo, String[] vetChavePix) {
        this.saldo = saldo;
        this.vetChavePix = vetChavePix;
    }

    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String[] getVetChavePix() {
        return vetChavePix;
    }

    public void setVetChavePix(String[] vetChavePix) {
        this.vetChavePix = vetChavePix;
    }

    
    public void transferir(String vetChavePix, double saldo){

        
    }

    protected double extrato(){
        return getSaldo();
    }

    protected void mostraChavePix(){

        System.out.println("Suas Chaves Pix: ");
        for(int i = 0; i<5;i++){

        System.out.println(getVetChavePix());
    }}



}
