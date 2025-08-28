package Prova3.questao02;

public class NoMapa <T> {
    private int chave;
    private T valor;

    public int getChave() {
        return chave;
    }
    public void setChave(int chave) {
        this.chave = chave;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
    
    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NoMapa other = (NoMapa) obj;
        if (chave != other.chave)
            return false;
        return true;
    }
}
