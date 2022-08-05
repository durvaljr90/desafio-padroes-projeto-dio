package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema2.cep.CepApi;

import static one.digitalinnovation.gof.subsistema1.crm.CrmService.gravarCliente;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        gravarCliente(nome, cep, cidade, estado);


    }
}
