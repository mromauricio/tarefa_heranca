package application;

import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        PessoaFisica pf = new PessoaFisica("Mauricio Rodrigues", "045.319.137-11", sdf.parse("25/12/2021"));
        System.out.println(pf);

        PessoaJuridica pj = new PessoaJuridica("Fundação Invovações Tecnológicas", "FITEC", "37.598.548/0001-95");
        System.out.println(pj);
    }

}
