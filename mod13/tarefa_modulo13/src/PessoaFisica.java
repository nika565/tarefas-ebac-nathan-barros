public class PessoaFisica extends Pessoa {

    // A principal diferença entre uma pessoa física e juridica é CPF/CNPJ
    private String cpf;

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
}
