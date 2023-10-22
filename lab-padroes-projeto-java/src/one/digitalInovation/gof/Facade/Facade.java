package one.digitalInovation.gof.Facade;

import one.digitalInovation.gof.Facade.subsistema1.CrmService;
import one.digitalInovation.gof.Facade.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String name, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(name, cep, cidade, estado);
    }
}
