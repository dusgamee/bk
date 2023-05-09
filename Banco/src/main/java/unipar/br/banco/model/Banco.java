
package unipar.br.banco.model;


public class Banco {
    
    private int nrBanco;
    private String nmBanco;
    private Agencia agencia;

    public void setNrBanco(int nrBanco) {
        this.nrBanco = nrBanco;
    }

    public void setNmBanco(String nmBanco) {
        this.nmBanco = nmBanco;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public int getNrBanco() {
        return nrBanco;
    }

    public String getNmBanco() {
        return nmBanco;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    @Override
    public String toString() {
        return "Banco{" + "nrBanco=" + nrBanco +
                ", nmBanco=" + nmBanco + ", agencia=" + agencia + '}';
    }
    
    
    
}
