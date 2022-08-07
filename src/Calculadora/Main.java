package Calculadora;

/**
 * *Classe principal dos exercícios da aula 1 de métodos
 */

public class Main {

    public static void main(String[] args) {
        //Exercicio1calculadora
        System.out.println("Exercício calculadora");
        Exercicio1calculadora.soma(3,6);
        Exercicio1calculadora.subtracao(9, 18.8);
        Exercicio1calculadora.multiplicacao(7, 8);
        Exercicio1calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
