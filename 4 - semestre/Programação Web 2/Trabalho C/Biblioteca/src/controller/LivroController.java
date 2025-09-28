package controller;
import model.Livro;
import java.util.*;

public class LivroController {

    private Map<Integer, Livro> livros = new HashMap<>();

    public Livro criar(Livro livro) {
        livros.put(livro.getId(), livro);
        return livro;
    }

    public Livro buscar(int id) {
        return livros.get(id);
    }

    public List<Livro> listar() {
        return new ArrayList<>(livros.values());
    }

    public boolean remover(int id) {
        return livros.remove(id) != null;
    }

    public Livro atualizar(int id, Livro livroAtualizado) {
        if (livros.containsKey(id)) {
            livroAtualizado.setId(id);
            livros.put(id, livroAtualizado);
            return livroAtualizado;
        }
        return null;
    }
}
