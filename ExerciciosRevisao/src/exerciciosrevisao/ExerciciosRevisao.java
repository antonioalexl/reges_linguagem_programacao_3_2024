/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosrevisao;

/**
 *
 * @author anton
 */
public class ExerciciosRevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exercicios exec = new Exercicios();
        exec.verificarNumero(8);

        exec.imprimirNumero(10, 30);

        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(500, 100));
        calc.somaImpressao(5, 10);

        calc.somaUsuario();

        Cliente cli = new Cliente();
        cli.Nome = "TESTE";
        cli.Idade = 120;
        cli.Saldo = 120;
        cli.Endereco = "Rua da Reges";

        cli.RealizarCompra(100);
        cli.RealizarCompra(200);

        cli.Imprimir();

        TV tv = new TV();

        tv.ligado = false; // TV inicia desligada
        tv.canal = 1; // Canal inicial é 1
        tv.volume = 10; // Volume inicial é 5

        tv.ligarDesligar();
        tv.aumentarVolume();
        tv.reduzirVolume();
        tv.trocarCanal(10);
        tv.ligarDesligar();

        exec.adivinhacao();

        exec.tabuadaPares();

        // Criando um objeto da classe Funcionario
        Funcionario func = new Funcionario();

        func.nome = "Peter Parker";
        func.cargo = "Herói";
        func.salario = 10;
        func.departamento = "Stark Industries";

        // Exibindo as informações do funcionário antes do aumento de salário
        System.out.println("Informações do funcionário antes do aumento:");
        func.exibirInformacoes();

        // Aumentando o salário do funcionário em 10%
        func.aumentarSalario(0.10);

        // Exibindo as informações do funcionário após o aumento de salário
        System.out.println("Informações do funcionário após o aumento:");
        func.exibirInformacoes();

        Banco bancoA = new Banco();
        bancoA.saldo = 1000.0;
        Banco bancoB = new Banco();

        bancoB.saldo = 500.0;

        // Testando os métodos com diferentes operações bancárias
        bancoA.exibirSaldo();
        bancoB.exibirSaldo();

        bancoA.depositar(500.0);
        bancoA.exibirSaldo();

        bancoA.sacar(300.0);
        bancoA.exibirSaldo();

        bancoA.transferir(200.0, bancoB);
        bancoA.exibirSaldo();
        bancoB.exibirSaldo();

        bancoB.transferir(1000.0, bancoA); // Tentativa de transferência com saldo insuficiente
    }

}
