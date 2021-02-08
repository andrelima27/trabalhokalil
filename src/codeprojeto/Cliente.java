package codeprojeto;


public class Cliente {

	public void CadastroCliente(String login, String email, String telefone, String senha) {

        String pix1, pix2, pix3;

        double saldoCorrente = 100.00, saldoPoupanca = 100.00, saldoSalario = 100.00;

        Banco_ct bc = new Banco_ct();

        bc.verificaCadastro(login, telefone, email);
        if (bc.isCheck() == true) {

            bc.GeraPix();
            pix1 = bc.pix;

            bc.GeraPix();
            pix2 = bc.pix;

            bc.GeraPix();
            pix3 = bc.pix;

            Conta.saldoCorrente.add(saldoCorrente);
            Conta.saldoPoupanca.add(saldoPoupanca);
            Conta.saldoSalario.add(saldoSalario);

            bc.addContas(login, senha, telefone, email, pix1, pix2, pix3);
        }
    }
}
