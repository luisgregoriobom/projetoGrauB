package modelos;

public class PessoaJuridica extends ClienteBanco {

    private int cnpj;
    PessoaFisica pessoaFisica;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    @Override
    public void verificaDoc() {
        if(getPessoaFisica().getNome().length() > 30){
            System.out.println(getPessoaFisica().getNome());
            System.out.println("Nome inválido para Responsável!");
        } else {
            System.out.println(getPessoaFisica().getNome());
            System.out.println("Nome válido para Responsável!");
        }
    }
}
