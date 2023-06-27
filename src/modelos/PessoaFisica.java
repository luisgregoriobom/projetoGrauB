package modelos;

public class PessoaFisica extends ClienteBanco{


    private int cpf;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void verificaDoc() {
        if(getCpf() >= 10 && getCpf() <= 20){
            System.out.println(getCpf() + " CPF Válido!");
        } else {
            System.out.println(getCpf() + " CPF Inválido");
        }
    }
}
