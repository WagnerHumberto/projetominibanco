import dev.etech.agencia.Conta;
import dev.etech.agencia.PessoaFisica;
import dev.etech.agencia.PessoaJuridica;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
//
//        PessoaFisica pessoaFisica = new PessoaFisica("wagner", "22222222222", "wa@wa.com");
//        System.out.println(pessoaFisica);
//
//        PessoaJuridica pessoaJuridica = new PessoaJuridica("wagner", "20051889000189", "wa@wa.com");
//        System.out.println(pessoaJuridica);
//
//       Conta contaFisica = new Conta(pessoaFisica);
//       contaFisica.depositar(1000.00);
//
//       Conta contaJuridica =new Conta(pessoaJuridica);
//       contaFisica.transferir(contaJuridica,50.00);

        ArrayList<String> listaNomes;
        listaNomes = new ArrayList<>();
        listaNomes.add("Marcos");
        listaNomes.add("João");
        listaNomes.add("Letícia");
        listaNomes.add("Guilherme");
        listaNomes.add("Carolina");
        listaNomes.add("Jessica");
        System.out.println(listaNomes.size());
        System.out.println(listaNomes);
        System.out.println(listaNomes.get(0));

    }
}
