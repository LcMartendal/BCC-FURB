package cliente;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import model.Autor;
import model.Livro;
import service.BibliotecaService;
import java.net.URL;
//import java.util.List;
import java.util.logging.Logger;

public class BibliotecaCliente {
    private static final Logger logger = Logger.getLogger("BibliotecaCliente");

    public static void main(String[] args) throws Exception {
        URL wsdl = new URL("http://localhost:8080/BibliotecaService?wsdl");
        QName qname = new QName("http://service/", "BibliotecaServiceImplService");

        Service service = Service.create(wsdl, qname);
        BibliotecaService port = service.getPort(BibliotecaService.class);

        Autor a = new Autor();
        a.setId(1);
        a.setNome("Machado de Assis");
        a.setEmail("machado@literatura.com");
        port.criarAutor(a);

        Livro l = new Livro();
        l.setId(101);
        l.setTitulo("Dom Casmurro");
        l.setIsbn("1234567890");
        l.setAno(1899);
        port.criarLivro(l);

        logger.info("autores cadastrados - " + port.listarAutores() + "\n");
        logger.info("livros cadastrados - " + port.listarLivros() + "\n");

        logger.info("Autor buscado pelo id - " + port.buscarAutor(1) + "\n");
        logger.info("Livro buscado pelo id - " + port.buscarLivro(101) + "\n");
        
        logger.info("busca livro inexistente - " + port.buscarLivro(999) + "\n"); 
        logger.info("busca autor inexistente - " + port.buscarAutor(999) + "\n"); 
        logger.info("Livro removido - " + port.removerLivro(101) + "\n"); 
        logger.info("Autor removido - " + port.removerAutor(1) + "\n"); 

        logger.info("autores listados -" + port.listarAutores() + "\n");
        logger.info("livros listados - " + port.listarLivros() + "\n");

        Autor a1 = new Autor();
        a1.setId(2);
        a1.setNome("Machado de Assis");
        a1.setEmail("machado@literatura.com");
        port.criarAutor(a1);

        logger.info("Autor buscado pelo id - " + port.buscarAutor(2) + "\n");

        a1.setId(2);
        a1.setNome("Assis de Machado");
        a1.setEmail("machado@literatura.com");
        port.atualizarAutor(2, a1);

        logger.info("Autor buscado pelo id - " + port.buscarAutor(2) + "\n");

        Livro l1 = new Livro();
        l1.setId(102);
        l1.setTitulo("Dom Casmurro");
        l1.setIsbn("1234567890");
        l1.setAno(1899);
        port.criarLivro(l1);

        logger.info("Livro buscado pelo id - " + port.buscarLivro(102) + "\n");

        l1.setId(102);
        l1.setTitulo("Camurosso Dom");
        l1.setIsbn("1234567890");
        l1.setAno(1899);
        port.atualizarLivro(102, l1);

        logger.info("Livro buscado pelo id - " + port.buscarLivro(102) + "\n"); 
    }
}
