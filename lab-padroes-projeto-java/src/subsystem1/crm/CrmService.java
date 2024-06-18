package subsystem1.crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void saveCustomer(String name, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);

    }
}
