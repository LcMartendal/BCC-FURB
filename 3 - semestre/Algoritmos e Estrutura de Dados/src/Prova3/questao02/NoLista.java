package Prova3.questao02;

public class NoLista<T> {
    private NoLista<T> proximo;
    private T info;
    
    public NoLista<T> getProximo() {
        return proximo;
    }
    public void setProximo(NoLista<T> proximo) {
        this.proximo = proximo;
    }
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }

    

}
