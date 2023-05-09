package unipar.br.banco.model;
public class Endereco {
    
    private String nmRua;
    private String dsComplemento;
    private int nrCasas;
    private String nmCidade;
    private String sgUf;

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public void setNrCasas(int nrCasas) {
        this.nrCasas = nrCasas;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public void setSgUf(String sgUf) {
        this.sgUf = sgUf;
    }

    public String getNmRua() {
        return nmRua;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public int getNrCasas() {
        return nrCasas;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public String getSgUf() {
        return sgUf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "nmRua=" + nmRua + ", dsComplemento=" + 
                dsComplemento + ", nrCasas=" + nrCasas + ", nmCidade=" +
                nmCidade + ", sgUf=" + sgUf + '}';
    }
    
    
    
}
