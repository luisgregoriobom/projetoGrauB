import modelos.Endereço;
import modelos.PessoaFisica;
import modelos.PessoaJuridica;
import Exception.NumException;

public class TstConta {
    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica();
        Endereço endereço = new Endereço();

        pj.setCnpj(987654321);
        endereço.setRua("Rua Teste, 123");
        pj.setEndereço(endereço);

        try {
            pj.setNumeroConta(1234);
        } catch (NumException e) {
            e.impMsg();
        }

        PessoaFisica pf = new PessoaFisica();
        pf.setCpf(1234456);
        pf.setNome("Teste da Silva Santos");
        pj.setResponsavel(pf);

        //saida
        pj.validar();
        System.out.println("CNPJ: " + pj.getCnpj());
        System.out.println("Rua: " + pj.getEndereço().getRua());
        System.out.println("===============================");
        System.out.println("CPF do Responsável: " + pj.getResponsavel().getCpf());
        pj.getResponsavel().verificaDoc();
        System.out.println("Nome do Responsável: " + pj.getResponsavel().getNome());
        pj.verificaDoc();
    }
}
