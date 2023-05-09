
package unipar.br.banco.model;

public class Agencia {
    
    private int nrAgencia;
    private String nomeAgencia;
    private Conta contaCorrente;

    public void setNrAgencia(int nrAgencia) {
        this.nrAgencia = nrAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public int getNrAgencia() {
        return nrAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setContaCorrente(Conta contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public Conta getContaCorrente() {
        return contaCorrente;
    }

    @Override
    public String toString() {
        return "Agencia{" + "nrAgencia=" +
                nrAgencia + ", nomeAgencia=" + nomeAgencia +
                ", contaCorrente=" + contaCorrente + '}';
    }

    
    
    
}
