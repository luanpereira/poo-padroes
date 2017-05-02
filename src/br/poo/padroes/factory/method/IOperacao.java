package br.poo.padroes.factory.method;

import java.math.BigDecimal;
import java.util.List;

public interface IOperacao {

	BigDecimal resultado();

	void setParcelas(List<BigDecimal> parcelas);

	List<BigDecimal> getParcelas();

}
