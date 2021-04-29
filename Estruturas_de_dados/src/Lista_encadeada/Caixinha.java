package Lista_encadeada;

public class Caixinha {
    //Atributos
    private int      elemento;
    private Caixinha proximo;

    //Setters e Getters
    public void setElemento(int elemento){
        this.elemento = elemento;
    }
    public int getElemento(){
        return this.elemento;
    }
    public void setProximo(Caixinha proximo){
        this.proximo = proximo;
    }
    public Caixinha getProximo(){
        return this.proximo;
    }
}
