package Prova3.questao02;

public class ListaEncadeada<T> {
    private NoLista<T> primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor){
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }

    public boolean estaVazia(){
        return this.primeiro == null;
    }

    public void exibir(){
        NoLista<T> p = this.primeiro;
        while(p!=null){
            System.out.println(p.getInfo());
            p = p.getProximo();

        }

    }

    public NoLista<T> buscar(T valor){
        NoLista<T> p = this.primeiro;
        while(p!=null){
            if(p.getInfo().equals(valor)){
                return p;
            }
            p = p.getProximo();
        }

        return null;
    }

    public void retirar(T valor){
        NoLista<T> anterior = null;
        NoLista<T> p = this.primeiro;

        while((p!=null) && (!p.getInfo().equals(valor))){
            anterior = p;
            p = p.getProximo();
        }

        if(p != null){
            if(p == primeiro){
                primeiro = p.getProximo();
            }else{
                anterior.setProximo(p.getProximo());
            }
        }
    }

    public int obterComprimento(){
        int qtd = 0;
        NoLista<T> p = this.primeiro;
        while(p != null){
            qtd++;
            p = p.getProximo();
        }
        return qtd;
    }

    public NoLista<T> obterNo(int ind){
        /*
        if(ind < 0 || ind >= obterComprimento()){
            throw new java.lang.IndexOutOfBoundsException();
        }

        NoLista<T> p = primeiro;
        int sequencia = 0;
        while(p!= null && sequencia < ind){
            sequencia++;
            p = p.getProximo()
        }
        return p;
        */
        if(ind < 0 ){
            throw new java.lang.IndexOutOfBoundsException();
        }

        NoLista<T> p = primeiro;
        
        while(p!= null && ind > 0){
            ind--;
            p = p.getProximo();
        }


        if(p == null){
            throw new java.lang.IndexOutOfBoundsException();
        }
        return p;
    }

    
    public String toString() {
        String msg = "";
        NoLista<T> p = primeiro;

        while(p!=null){
            if(p!=primeiro){
                msg+= ", ";
            }
            msg+= p.getInfo();
            p = p.getProximo();
        }

        return msg;
    }

}


