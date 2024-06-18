package subsystem2.cep;

public class ApiCep {
    private static ApiCep instance = new ApiCep();

    private ApiCep(){
        super();
    }

    public static ApiCep getInstance(){
        return instance;
    }

    public String recoveryCidade(String cep){
        return "SAO JOSE DOS CAMPOS";
    }

    public String recoveryEstado(String cep){
        return "SP";
    }
}
