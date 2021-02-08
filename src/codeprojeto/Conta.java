package codeprojeto;

import java.util.ArrayList;

public class Conta {
   
    protected static ArrayList<Double> saldoCorrente = new ArrayList<Double>();
    protected static ArrayList<Double> saldoPoupanca = new ArrayList<Double>();
    protected static ArrayList<Double> saldoSalario = new ArrayList<Double>();

    public static ArrayList<Double> getSaldoCorrente() {
        return saldoCorrente;
    }

    public static void setSaldoCorrente(ArrayList<Double> saldoCorrente) {
        Conta.saldoCorrente = saldoCorrente;
    }

    public static ArrayList<Double> getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public static void setSaldoPoupanca(ArrayList<Double> saldoPoupança) {
        Conta.saldoPoupanca = saldoPoupança;
    }

    public static ArrayList<Double> getSaldoSalario() {
        return saldoSalario;
    }

    public static void setSaldoSalario(ArrayList<Double> saldoSalario) {
        Conta.saldoSalario = saldoSalario;
    }




    
    
    
    
    
    
    
}
