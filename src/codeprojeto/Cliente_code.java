
package codeprojeto;


public class Cliente_code {
    	protected String login;
        protected String email;
	protected String telefone;
	protected String senha;
	
	protected String pix1;
	protected String pix2;
	protected String pix3;
	private static int i = 0;
	
	protected String [][]clientes = new String[i][7];

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPix1() {
        return pix1;
    }

    public void setPix1(String pix1) {
        this.pix1 = pix1;
    }

    public String getPix2() {
        return pix2;
    }

    public void setPix2(String pix2) {
        this.pix2 = pix2;
    }

    public String getPix3() {
        return pix3;
    }

    public void setPix3(String pix3) {
        this.pix3 = pix3;
    }

	
	
	public void CadastroCliente() {
		i++;
		Banco_ct bc = new Banco_ct();
		
		bc.GeraPix();
		pix1 = bc.pix;

		bc.GeraPix();
		pix2 = bc.pix;
	
		bc.GeraPix();
		pix3 = bc.pix;
		
		System.out.println(pix1);
		System.out.println(pix2);
		System.out.println(pix3);
		
		bc.Contas(login, email, telefone, senha, pix1, pix2, pix3);
		
		
		
		
	}
}
