

package unipar.br.banco.model;
public class Conta {
    
    private int nrConta;
    private Endereco endereco;
    private String cpfCorrentista;
    private String tpConta;

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setCpfCorrentista(String cpfCorrentista) {
        this.cpfCorrentista = cpfCorrentista;
    }

    public void setTpConta(String tpConta) {
        this.tpConta = tpConta;
    }

    public int getNrConta() {
        return nrConta;
    }

    

    

    public Endereco getEndereco() {
        return endereco;
    }

    public String getCpfCorrentista() {
        return cpfCorrentista;
    }

    public String getTpConta() {
        return tpConta;
    }

    @Override
    public String toString() {
        return "Conta{" + "nrConta=" + nrConta + ", endereco=" + endereco + ", cpfCorrentista=" + cpfCorrentista + ", tpConta=" + tpConta + '}';
    }

   
    

    
    
    
    
}
