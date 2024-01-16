package dio.springboot.padroes_projeto.facade.subsistema1;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente cadastrado no sistema de CRM");
    }
}
