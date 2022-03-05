package subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String Cep, String Estado, String cidade) {
        System.out.println("Cliente Salvo no Sistema de CRM");
        System.out.println(nome);
        System.out.println(Cep);
        System.out.println(cidade);
        System.out.println(Estado);
    }

}
