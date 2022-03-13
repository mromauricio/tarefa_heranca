package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaFisica extends Pessoa {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String cpf;
    private Date birthDate;

    public PessoaFisica(String name, String cpf, Date birthDate)  {
        super.setName(name);
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + '\n' +
                "Nome= " + super.getName() + '\n' +
                "CPF= " + cpf + '\n' +
                "Nascimento= " + sdf.format(birthDate)  + '\n' +
                '}';
    }
}
