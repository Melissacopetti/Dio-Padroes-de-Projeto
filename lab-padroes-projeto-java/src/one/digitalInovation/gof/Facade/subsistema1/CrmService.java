package one.digitalInovation.gof.Facade.subsistema1;

public class CrmService {

    private CrmService() {
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema CRM");
    }
}
