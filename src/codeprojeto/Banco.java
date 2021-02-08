
package codeprojeto;

public class Banco {
     protected double bnc1;

    Agencia agc = new Agencia();

    public double getBnc1() {
        return bnc1;
    }

    public void setBnc1(double bnc1) {

        this.bnc1 = agc.getAgc11() + agc.getAgc12() + agc.getAgc13();
    }
}
