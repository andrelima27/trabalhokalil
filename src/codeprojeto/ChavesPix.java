import java.util.Random;

public class ChavesPix {

    String gerar;

protected String gerarPix(){
    
    Random r = new Random();
    
    for(int i = 0; i<4;i++){
    gerar = Integer.toString(Math.abs(r.nextInt()), 36).substring(0,5);
    
}

    return gerar;

}

}
