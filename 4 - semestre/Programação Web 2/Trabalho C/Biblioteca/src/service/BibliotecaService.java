package service;
import model.Autor;
import model.Livro;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface BibliotecaService {

    @WebMethod Autor criarAutor(Autor autor);
    @WebMethod Autor buscarAutor(int id);
    @WebMethod List<Autor> listarAutores();
    @WebMethod boolean removerAutor(int id);
    @WebMethod Autor atualizarAutor(int id, Autor autor);

    @WebMethod Livro criarLivro(Livro livro);
    @WebMethod Livro buscarLivro(int id);
    @WebMethod List<Livro> listarLivros();
    @WebMethod boolean removerLivro(int id);
    @WebMethod Livro atualizarLivro(int id, Livro livro);
}
