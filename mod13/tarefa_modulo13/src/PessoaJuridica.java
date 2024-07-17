public class PessoaJuridica extends Pessoa {

    // A principal diferença entre uma pessoa física e juridica é CPF/CNPJ
    private String cnpj;

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCpf(){
        return this.cnpj;
    }

}
