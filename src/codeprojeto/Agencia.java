package codeprojeto;


public class Agencia {
   protected double agc11;
    protected double agc12;
    protected double agc13;



    public double getAgc11() {
        return agc11;
    }

    public void setAgc11(double agc11) {

        double soma = 0;
        for(int i = 0; i < Conta.saldoCorrente.size();i++) {
            soma += Conta.saldoCorrente.get(i);
        }

        this.agc11 = soma;
    }

    public double getAgc12() {
        return agc12;
    }

    public void setAgc12(double agc12) {

        double soma = 0;
        for(int i = 0; i < Conta.saldoCorrente.size();i++) {
            soma += Conta.saldoPoupanca.get(i);
        }

        this.agc12 = soma;
    }

    public double getAgc13() {
        return agc13;
    }

    public void setAgc13(double agc13) {

        double soma = 0;
        for(int i = 0; i < Conta.saldoSalario.size();i++) {
            soma += Conta.saldoSalario.get(i);
        }

        this.agc13 = soma;
    } 
}
