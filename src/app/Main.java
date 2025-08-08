package app;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: ${NAME}.java
 * Pacote: ${PACKAGE_NAME}
 * Autor: Joneidson
 * Data de Criação: 08/08/2025
 *
 * Descrição:
 * TODO: Descreva o propósito deste arquivo.
 *
 * Versão: 1.0
 * ================================================================
 */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        funcionario = new Funcionario();
        System.out.println("Qual o nome do Funcionario: ");
        funcionario.name = sc.nextLine();

        System.out.println("Qual o salario bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println("Qual a taxa de imposto: ");
        funcionario.tax = sc.nextDouble();
        sc.nextLine();

        System.out.println();
        System.out.println("Funcionario " + funcionario);
        System.out.println("Qual a porcentagem para almento de salario: ");
        double percentage = sc.nextDouble();
        funcionario.aumentoSalario(percentage);

        System.out.println(funcionario);

        sc.close();
    }


}