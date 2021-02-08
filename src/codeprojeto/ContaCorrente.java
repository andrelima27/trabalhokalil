package codeprojeto;

public class ContaCorrente extends Conta implements Acao{
/*
    public void transferencia() {

        Login lg = new Login();
        double origem;
        double valor;
        double destino;
        for (int i = 0; i < Banco_ct.Contas.size(); i++) {
            if(pegar a pix.equals(Banco_ct.Contas.size())) {
                origem = saldoCorrente.get(lg.getIndexUser());
                if(origem - valor < 0) {
                    saldo insuficiente
                }else {
                    origem -= valor;
                    int idx = i/7;
                    destino += valor;
                    saldoCorrente.set(idx, destino);
                }
            }else {
                 pix nao encontrada
            }
        }

    }

*/
    @Override
    public void verSaldo() {
        Login lg = new Login();
        saldoCorrente.get(lg.getIndexUser());

    }

    @Override
    public void transferencia() {
        
    }

}
