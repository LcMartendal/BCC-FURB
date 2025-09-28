package br.furb.biblioteca.controle;

import br.furb.biblioteca.modelo.Autor;
import java.util.*;

public class AutorControle {

    private Map<Integer, Autor> autores = new HashMap<>();

    public Autor criar(Autor autor) {
        autores.put(autor.getId(), autor);
        return autor;
    }

    public Autor buscar(int id) {
        return autores.get(id);
    }

    public List<Autor> listar() {
        return new ArrayList<>(autores.values());
    }

    public boolean remover(int id) {
        return autores.remove(id) != null;
    }
}
