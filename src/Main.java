// Lorraynne Silva - 125111405188 - Estudante de Programação
//  Ctrl + Alt + Shift + L format
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ContaBancaria conta = new ContaBancaria(1001, "Lorraynne", 500.00);
        System.out.println(conta.getNumeroConta());

        ContaBancaria conta2 = new ContaBancaria(1002, "Pedro", 800.00);
        System.out.println(conta2.getNumeroConta());

        ContaBancaria conta3 = new ContaBancaria(1003, "Joao", 700.00);
        System.out.println(conta3.getNumeroConta());

        conta.sacar(1000);
        System.out.println(conta.getSaldo());
        conta.depositar(100);
        conta.sacar(500);
        System.out.println(conta.getSaldo());

        conta2.depositar(10000);
        System.out.println(conta2.getSaldo());
        conta2.sacar(800);
        System.out.println(conta2.getSaldo());
        conta3.depositar(1000);
        conta3.sacar(699);
        System.out.print(conta3.getSaldo());


    }
}
