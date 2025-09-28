package service;
import model.Autor;
import model.Livro;
import java.util.*;
import javax.jws.WebService;

import controller.AutorController;
import controller.LivroController;

@WebService(endpointInterface = "service.BibliotecaService")
public class BibliotecaServiceImpl implements BibliotecaService {

    private AutorController autorController = new AutorController();
    private LivroController livroController = new LivroController();

    @Override
    public Autor criarAutor(Autor autor) {
        return autorController.criar(autor);
    }

    @Override
    public Autor buscarAutor(int id) {
        return autorController.buscar(id);
    }

    @Override
    public List<Autor> listarAutores() {
        return autorController.listar();
    }

    @Override
    public boolean removerAutor(int id) {
        return autorController.remover(id);
    }

    @Override
    public Autor atualizarAutor(int id, Autor autor) {
        return autorController.atualizar(id, autor);
    }

    @Override
    public Livro criarLivro(Livro livro) {
        return livroController.criar(livro);
    }

    @Override
    public Livro buscarLivro(int id) {
        return livroController.buscar(id);
    }

    @Override
    public List<Livro> listarLivros() {
        return livroController.listar();
    }

    @Override
    public boolean removerLivro(int id) {
        return livroController.remover(id);
    }

    @Override
    public Livro atualizarLivro(int id, Livro livro) {
        return livroController.atualizar(id, livro);
    }
}
