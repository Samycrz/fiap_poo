import br.com.fiap.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // Criando os passageiros (Objetos)
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");

        System.out.println("--- Adicionando Saldo ---");
        passageiro1.adicionarSaldo(50.0);
        passageiro2.adicionarSaldo(12.5);

        System.out.println("\n--- Testando transferirSaldo ---");
        // Ana transfere 20 para Carlos
        passageiro1.transferirSaldo(passageiro2, 20.0);

        // Carlos tenta transferir 100 para Ana (Vai dar erro de saldo)
        passageiro2.transferirSaldo(passageiro1, 100.0);

        System.out.println("\n--- Sistema FiapRide (Status Atual) ---");
        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$ " + passageiro2.getSaldo());

        System.out.println("\n--- Testando encerrarConta ---");
        // Ana tenta encerrar a conta, mas ainda tem R$ 30 (Vai dar erro)
        passageiro1.encerrarConta();

        // Ana transfere todo o restante (R$ 30) para o Carlos para zerar a conta
        passageiro1.transferirSaldo(passageiro2, 30.0);

        // Agora Ana tenta encerrar novamente (Vai dar sucesso)
        passageiro1.encerrarConta();

        System.out.println("\n--- Tentando usar a conta encerrada ---");
        // Ana tenta fazer uma recarga após a conta ser encerrada (Vai dar erro)
        passageiro1.adicionarSaldo(50.0);
    }
}