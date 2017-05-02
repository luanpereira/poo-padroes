package br.poo.padroes.factory.method;

import java.math.BigDecimal;
import java.util.List;

public class Soma implements IOperacao {
	private List<BigDecimal> parcelas;

	@Override
	public List<BigDecimal> getParcelas() {
		return parcelas;
	}

	@Override
	public void setParcelas(List<BigDecimal> parcelas) {
		this.parcelas = parcelas;
	}
	
	@Override
	public BigDecimal resultado(){
		return BigDecimal.ZERO;
	}
	
}
