package operations;

import interfaces.ICalculadora;

	public class Subtracao implements ICalculadora {
		public Integer calcula(Integer n1, Integer n2) {
			Integer resultado = null;

			if (n1 == null || n2 == null) {


			} else {
				resultado = n1 - n2;
			}

			return resultado;
		 }

		 public Float calcula(Float n1, Float n2) {
			 Float resultado = null;

				if (n1 == null || n2 == null) {



				} else {
					resultado = n1 - n2;
				}

				return resultado;
		 }

		 public Double calcula(Double n1, Double n2) {
			 Double resultado = null;

				if (n1 == null || n2 == null) {


				} else {
					resultado = n1 - n2;
				}

				return resultado;
		 }

		 public Integer calcula(Integer[] numbers) {
			 Integer sub = numbers[0];
				for (int i = 1; i < numbers.length; i++) {
					sub -= numbers[i];
				}
				return sub;
		 }

		 public Float calcula(Float[] numbers) {
			 Float sub = numbers[0];
				for (int i = 1; i < numbers.length; i++) {
					sub -= numbers[i];
				}
				return sub;
		 }

		 public Double calcula(Double[] numbers) {
			 Double sub = numbers[0];
				for (int i = 1; i < numbers.length; i++) {
					sub -= numbers[i];
				}
				return sub;
			}
	}
		