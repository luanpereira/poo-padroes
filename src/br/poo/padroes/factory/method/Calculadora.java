package br.poo.padroes.factory.method;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Calculadora {
	private static IOperacao operacao;
	
	public static void main(String[] args) {
		soma();
	}
	
	public static void soma(){
		BigDecimal resultado;
		operacao = new Soma();
		
		operacao.setParcelas(new ArrayList<>());
		operacao.getParcelas().add(new BigDecimal(4));
		operacao.getParcelas().add(new BigDecimal(6));
		resultado = operacao.resultado();
		
		System.out.println("Resultado: " + resultado.toString());
	}
}
