package operations;

import interfaces.ICalculadora;

public class Soma implements ICalculadora {
	public Integer calcula(Integer n1, Integer n2) {
	    return n1 + n2;
	  }

	  public Float calcula(Float n1, Float n2) {
	    return n1 + n2;
	  }

	  public Double calcula(Double n1, Double n2) {
	    return n1 + n2;
	  }

	  public Integer calcula(Integer[] numbers) {
	    int resultado = 0;

	    for (Integer number : numbers) {
	      resultado += number;
	    }
	    return resultado;
	  }

	  public Float calcula(Float[] numbers) {
	    float resultado = 0;

	    for (float number : numbers) {
	      resultado += number;
	    }
	    return resultado;
	  }

	  public Double calcula(Double[] numbers) {
	    double resultado = 0;

	    for (double number : numbers) {
	      resultado += number;
	    }
	    return resultado;
	  }
}
