package one.digitalinnovation.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.ApiCep;

public class Facade {
    public void customerMigration(String name, String cep){
        String cidade = ApiCep.getInstance().recoveryCidade(cep);
        String estado = ApiCep.getInstance().recoveryEstado(cep);

        CrmService.saveCustomer(name, cep, cidade, estado);
    }
}
