package codeprojeto;
import java.time.LocalDate;
import java.time.Period;

public class ContaPoupanca extends Conta implements Operacao {
     private double novoSaldo;

    public double getNovoSaldo() {
        return novoSaldo;
    }

    public void setNovoSaldo(double novoSaldo) {
        this.novoSaldo = novoSaldo;
    }

    
    @Override
    public void rendimento() {

        Login lg = new Login();

        LocalDate ldnow = LocalDate.now();
        LocalDate ldplus = ldnow.plusMonths(1);
        Period.between(ldnow, ldplus);

        setNovoSaldo(lg.getPopUser() * 1.015);

        lg.setPopUser(novoSaldo);
        saldoPoupanca.set(lg.getIndexUser(), novoSaldo);

    }


}
