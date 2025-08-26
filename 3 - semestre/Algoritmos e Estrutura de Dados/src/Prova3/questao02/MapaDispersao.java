package Prova3.questao02;

public class MapaDispersao <T> {
    
    private ListaEncadeada<NoMapa<T>>[] info;
    
    @SuppressWarnings("unchecked")
    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }

    private int calcularHash(int chave) {
        return (chave % info.length);
    }

    public void inserir(int chave, T dado) {
        int indice = calcularHash(chave);

        if(info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }

        NoMapa<T> noMapa = new NoMapa<>();
        noMapa.setChave(chave);
        noMapa.setValor(dado);

        info[indice].inserir(noMapa);
    }

    public void remover(int chave) {
        int indice = calcularHash(chave);

        if(info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);
            info[indice].retirar(noMapa);
        }

    }

    public T buscar(int chave) {
        int indice = calcularHash(chave);

        if(info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            NoLista<NoMapa<T>> no = info[indice].buscar(noMapa);
            if(no != null) {
                return no.getInfo().getValor();
            }
        }

        return null;
    }

    public double calcularFatorCarga() {
        int qtd = 0;

        for(int i=0;i<info.length;i++){
            if(info[i] != null) {
                qtd = qtd + info[i].obterComprimento();
            }
        }
        return (1.0) * qtd / info.length;
    }

    @SuppressWarnings("unchecked")
    public void realocarMapa(int novoTamanho) {
        // Guarda o vetor antigo
        ListaEncadeada<NoMapa<T>>[] antigo = info;

        // Cria novo vetor com o novo tamanho
        info = new ListaEncadeada[novoTamanho];

        // Inicializa todas as posições do novo vetor
        for (int i = 0; i < novoTamanho; i++) {
            info[i] = new ListaEncadeada<NoMapa<T>>();
        }

        // Percorre todas as listas do vetor antigo
        for (int i = 0; i < antigo.length; i++) {
            if (antigo[i] != null) {
                NoLista<NoMapa<T>> p = antigo[i].getPrimeiro(); // Corrigido: obter primeiro nó da lista
                while (p != null) {
                    NoMapa<T> noMapa = p.getInfo();
                    inserir(noMapa.getChave(), noMapa.getValor()); // Reinserção para aplicar novo hash
                    p = p.getProximo();
                }
            }
        }
    }

    public void incluirTodos(MapaDispersao<T> outroMapa){
        ListaEncadeada<MapaDispersao<T>> listaNova = new ListaEncadeada<>();
        
        if()

        for(int i=0; i< outroMapa.)
        int indice = calcularHash(chave);

        if(info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }

        NoMapa<T> noMapa = new NoMapa<>();
        noMapa.setChave(chave);
        noMapa.setValor(dado);

        info[indice].inserir(noMapa);
    }
}
