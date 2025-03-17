
package agenciadeviagens;

public class Hospedagem {
    private String descricao;
    private float diaria;
    
    public Hospedagem(String descricao, float diaria){
        this.descricao = descricao;
        this.diaria = diaria;
    }
    
    public String getHotel(){
        return descricao;
    }
    
    public void setHotel(String descricao){
        this.descricao = descricao;
    }
    
    public float getDiaria(){
        return diaria;
    }
    
    public void setDiaria(float diaria){
        this.diaria = diaria;
    }
    
}
