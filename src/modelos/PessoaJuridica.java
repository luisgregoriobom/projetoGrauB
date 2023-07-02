package modelos;

public class PessoaJuridica extends ClienteBanco {

    private int cnpj;
    PessoaFisica responsavel;


    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public void verificaDoc() {
        if(getResponsavel().getNome().length() > 30){
            System.out.println(getResponsavel().getNome());
            System.out.println("Nome inválido para Responsável!");
            System.out.println("===============================");
        } else {
            System.out.println(getResponsavel().getNome());
            System.out.println("Nome válido para Responsável!");
            System.out.println("===============================");
        }
    }
}
