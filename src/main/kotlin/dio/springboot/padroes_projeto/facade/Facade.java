package dio.springboot.padroes_projeto.facade;

//Facade
// Provê uma interface que reduz a complexidade nas integrações com subsistemas

import dio.springboot.padroes_projeto.facade.subsistema1.CrmService;
import dio.springboot.padroes_projeto.facade.subsistema2.CepApi;

public class Facade {
    // tipo de interface mais simples
    public void migrarCliente(String nome, String cep) {
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        String cidade = CepApi.getInstancia().recuperarCidade(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
