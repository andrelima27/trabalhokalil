public class Cliente extends ChavesPix {

    private String login;
    private String senha;
    private String armazenaPix;

    public String getArmazenaPix() {
        return armazenaPix;
    }
    
    public void setArmazenaPix(String armazenaPix) {
        this.armazenaPix = armazenaPix;
    }

    private void guardaPix(){
        setArmazenaPix(gerarPix());
    }

    


  

    
}
