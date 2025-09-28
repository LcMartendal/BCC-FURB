package publisher;  
import service.BibliotecaServiceImpl;
import javax.xml.ws.Endpoint;

public class BibliotecaPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/BibliotecaService";
        System.out.println("Publicando BibliotecaService em: " + url);
        Endpoint.publish(url, new BibliotecaServiceImpl());
        System.out.println("Serviço ativo! Acesse: " + url + "?wsdl");
    }
}
