package codeprojeto;

import static codeprojeto.Banco_ct.Contas;


public class Login extends Banco_ct{
    
    private String loginUser;
    private String emailUser;
    private String foneUser;
    private String pix1User;
    private String pix2User;
    private String pix3User;
    private double crrUser;
    private double slrUser;
    private double popUser;

    private int indexUser;

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getFoneUser() {
        return foneUser;
    }

    public void setFoneUser(String foneUser) {
        this.foneUser = foneUser;
    }

    public String getPix1User() {
        return pix1User;
    }

    public void setPix1User(String pix1User) {
        this.pix1User = pix1User;
    }

    public String getPix2User() {
        return pix2User;
    }

    public void setPix2User(String pix2User) {
        this.pix2User = pix2User;
    }

    public String getPix3User() {
        return pix3User;
    }

    public void setPix3User(String pix3User) {
        this.pix3User = pix3User;
    }

    public double getCrrUser() {
        return crrUser;
    }

    public void setCrrUser(double crrUser) {
        this.crrUser = crrUser;
    }

    public double getSlrUser() {
        return slrUser;
    }

    public void setSlrUser(double slrUser) {
        this.slrUser = slrUser;
    }

    public double getPopUser() {
        return popUser;
    }

    public void setPopUser(double popUser) {
        this.popUser = popUser;
    }

    public int getIndexUser() {
        return indexUser;
    }

    public void setIndexUser(int indexUser) {
        this.indexUser = indexUser;
    }
public void validaLogin(String login, String senha) {

        boolean check = false;
        for (int i = 0; i < Banco_ct.Contas.size(); i++)
            if (login.equals(Banco_ct.Contas.get(i))) {
                if (senha.equals(Banco_ct.Contas.get(i + 1))) {

                    loginUser = Banco_ct.Contas.get(i);
                    emailUser = Banco_ct.Contas.get(i + 2);
                    foneUser = Banco_ct.Contas.get(i + 3);
                    pix1User = Banco_ct.Contas.get(i + 4);
                    pix2User = Banco_ct.Contas.get(i + 5);
                    pix3User = Banco_ct.Contas.get(i + 6);
                    crrUser = Conta.saldoCorrente.get(7 / i);
                    slrUser = Conta.saldoSalario.get(7 / i);
                    popUser = Conta.saldoPoupanca.get(7 / i);

                    setIndexUser(7/i);

                    check = true;
                }
            }


    }
    
    
    
}
