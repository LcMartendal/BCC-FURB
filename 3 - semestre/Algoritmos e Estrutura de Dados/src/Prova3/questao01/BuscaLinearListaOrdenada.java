package Prova3.questao01;

public class BuscaLinearListaOrdenada<T extends Comparable<T>>{

    @SuppressWarnings("rawtypes")
    public NoLista buscar(ListaEncadeada<T> lista, T valor) {
        NoLista<T> no = lista.getPrimeiro();

        while(no != null){
            if(no == valor){
                return no;
            }else{
                no = no.getProximo();
            }
        }
        return null;
    }
}
