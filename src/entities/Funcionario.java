package entities;

/*
 * ================================================================
 * Arquivo: Funcionario.java
 * Pacote: entities
 * Autor: Joneidson
 * Data de Criação: 08/08/2025
 *
 * Descrição:
 * TODO: Descreva o propósito deste arquivo.
 *
 * Versão: 1.0
 * ================================================================
 */
public class Funcionario {
    public String name;
    public double salarioBruto;
    public double tax;

    public double liquidoSalario() {
        return salarioBruto - tax;
    }

    public void aumentoSalario(double porcentage) {
        salarioBruto+=salarioBruto * porcentage / 100.00;
    }


    public String toString() {
        return name
              + ", "
              + String.format("%.2f", liquidoSalario());
    }


}
