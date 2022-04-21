package operations;

import interfaces.ICalculadora;

	public class Divisao implements ICalculadora{

		public Integer calcula(Integer n1, Integer n2) {
		   return n1 / n2;
		 }

		 public Float calcula(Float n1, Float n2) {
		   return n1 / n2;
		 }

		 public Double calcula(Double n1, Double n2) {
		   return n1 / n2;
		 }

		 public Integer calcula(Integer[] numbers) {
		 Integer tamanho = numbers.length;
		if (tamanho == 0) {
		return null;
		}
		Integer divisao = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
		divisao /= numbers[i];
		}
		return divisao;
		 }

		 public Float calcula(Float[] numbers) {
		 Integer tamanho = numbers.length;
		if (tamanho == 0) {
		return null;
		}
		Float divisao = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
		divisao /= numbers[i];
		}
		return divisao;
		 }

		 public Double calcula(Double[] numbers) {
		 Integer tamanho = numbers.length;
		if (tamanho == 0) {
		return null;
		}
		Double divisao = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
		divisao /= numbers[i];
		}
		return divisao;
		}
		 }