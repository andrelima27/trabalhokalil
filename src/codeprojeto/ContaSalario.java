
package codeprojeto;


public class ContaSalario extends Conta {

    public void verSaldo() {
        Login lg = new Login();
        saldoSalario.get(lg.getIndexUser());

    }
}

