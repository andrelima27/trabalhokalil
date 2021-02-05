package codeprojeto;
import java.util.ArrayList;
import java.util.Random;

public class Banco_ct {
    protected String pix;
	private ArrayList<Cliente_code> Contas = new ArrayList<Cliente_code>();
	
	public void GeraPix() {
		
		String gerada; 
		Random r = new Random();
		String key ="";
		for(int i = 0; i<4; i++) {
			gerada = Integer.toString(Math.abs(r.nextInt()),36).substring(0,5);

			key += gerada;
		}
		pix = key;
		
	}
	public void Contas(String login, String email, String telefone, String senha, String pix1, String pix2, String pix3) {
		Contas.add(new Cliente_code());
                
		
		System.out.println(Contas.get(0));
	}
}
