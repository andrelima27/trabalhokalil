package codeprojeto;
import java.util.ArrayList;
import java.util.Random;

public class Banco_ct {
private boolean check = true;
    protected String pix;
    public static ArrayList<String> Contas = new ArrayList<String>();
    protected static ArrayList<String> chaves = new ArrayList<String>();

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public static ArrayList<String> getContas() {
        return Contas;
    }

    public static void setContas(ArrayList<String> contas) {
        Contas = contas;
    }


    public static ArrayList<String> getChaves() {
        return chaves;
    }

    public static void setChaves(ArrayList<String> chaves) {
        Banco_ct.chaves = chaves;
    }
public void GeraPix() {
        int j = 0;
        String gerada;
        Random r = new Random();
        String key = "";
        boolean s = true;
        while (s = true) {
            // Gerar a chave
            for (int i = 0; i < 4; i++) {
                gerada = Integer.toString(Math.abs(r.nextInt()), 36).substring(0, 5);

                key += gerada;
            }

            // Verificar se a chave gerada é igual a alguma chave pix existente
            if (j == 0) {
                pix = key;
                j++;
                s = false;
            } else {

                for (int x = 0; x < j; x++) {
                    if (key == chaves.get(x)) {

                    } else {
                        j++;
                        pix = key;
                        s= false;
                    }
                }
            }
        }
    }

    public void addContas(String login, String senha, String telefone, String email, String pix1, String pix2,
            String pix3) {
        Contas.add(login);
        Contas.add(senha);
        Contas.add(email);
        Contas.add(telefone);
        Contas.add(pix1);
        Contas.add(pix2);
        Contas.add(pix3);

    }

    public void verificaCadastro(String login, String telefone, String email){

        for (int i = 0; i < Banco_ct.Contas.size(); i++) {

            if(login.equals(Contas.get(i)) || telefone.equals(Contas.get(i)) || email.equals(Contas.get(i))) {
                check = false;
            }
        }

    }
}
