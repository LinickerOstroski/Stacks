package pilhajava;

import java.util.Date;

public class Recorde {
    private Date data;
    private String nome;
    private double tempo;

    public Recorde(){
        System.out.println("Classe criada!");
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    
}
