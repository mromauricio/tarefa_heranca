package entities;

public class PessoaJuridica extends Pessoa {
    private String tradeName;
    private String cnpj;

    public PessoaJuridica(String name, String tradeName, String cnpj) {
        super.setName(name);
        this.tradeName = tradeName;
        this.cnpj = cnpj;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + '\n' +
                "Razão social= " + super.getName() + '\n' +
                "Nome fantasia= " + tradeName + '\n' +
                "CNPJ= " + cnpj + '\n' +
                '}';
    }
}
