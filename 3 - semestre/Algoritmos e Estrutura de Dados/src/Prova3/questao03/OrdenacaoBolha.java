package Prova3.questao03;

public class OrdenacaoBolha <T extends Comparable<T>> extends OrdenacaoAbstract<T>{

    @Override
    public void ordenar() {
        int n = getInfo().length;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (getInfo()[j].compareTo(getInfo()[j + 1]) > 0) {
                    trocar(j, j + 1);
                }
            }
        }
    }

    public void ordenarDecrescente(){
        int tam = getInfo().length;
        for(int i=0; i<=tam -1;i++){  
            trocar(i, tam);
            tam--;
        }
    }

}

