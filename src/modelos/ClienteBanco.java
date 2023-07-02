package modelos;

import repository.Verifica;
import Exception.NumException;

public abstract class ClienteBanco implements Verifica {

    private int numeroConta;
    private String nome;
    private Endereço endereço;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws NumException {
            if (numeroConta > 0) {
                this.numeroConta = numeroConta;
            } else {
                NumException exception = new NumException();
                exception.impMsg();
            }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public abstract void verificaDoc();

    @Override
    public void validar() {
        if(getNumeroConta() %2 == 0){
            System.out.println("NUMERO CONTA: " + getNumeroConta());
            System.out.println("A conta é um número par!");
        }else {
            System.out.println("NUMERO CONTA: " + getNumeroConta());
            System.out.println("A conta é um numero ímpar");
        }
    }
}
