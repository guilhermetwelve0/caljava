package Main;

import operations.*;

import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String confirmation;
	    boolean again = true;
	    String operation = "";
	    String typeSelection = "";
	    int qtySelection = 0;

	    do {
	      System.out.println("Seja bem-vind@ ao ´Calcula já!'");
	      System.out.println("Você deseja fazer uma soma, subtracao, multiplicacao ou divisao?");
	      operation = scan.next();

	      if (operation.equals("soma") ||
	          operation.equals("subtracao") ||
	          operation.equals("multiplicacao") ||
	          operation.equals("divisao")
	      ) {
	        again = false;
	      }

	    } while (again);

	    do {
	      System.out.println("Será uma " + operation + " de quantos números?(Mínimo de 2 números!)");
	      qtySelection = scan.nextInt();
	    } while (qtySelection < 2);

	    do {
	      System.out.println("Serão " + qtySelection + " números do tipo inteiro, float ou double?");
	      typeSelection = scan.next();

	      again = !typeSelection.equals("inteiro") &&
	          !typeSelection.equals("float") &&
	          !typeSelection.equals("double");
	    } while (again);


	    do {
	      double resultado = 0;

	      switch (operation) {
	        case "soma":
	          Soma soma = new Soma();
	          switch (typeSelection) {
	            case "inteiro":
	              resultado = (Integer)soma.calcula(Arrays.makeIntArrays(qtySelection));
	              System.out.println("O resultado da soma solicitada é " + ((int) resultado) + ".");
	              break;
	            case "float":
	              resultado = (Float)soma.calcula(Arrays.makeFloatArrays(qtySelection));
	              System.out.println("O resultado da soma solicitada é " + ((float) resultado) + ".");
	              break;
	            case "double":
	              resultado = (Double)soma.calcula(Arrays.makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da soma solicitada é " + ((double)resultado) + ".");
	              break;
	          }
	          break;
	        case "subtracao":
	          Subtracao subtracao = new Subtracao();
	          switch (typeSelection) {
	            case "inteiro":
	              resultado = (Integer)subtracao.calcula(Arrays.makeIntArrays(qtySelection));
	              System.out.println("O resultado da subtracao solicitada é " + ((int) resultado) + ".");
	              break;
	            case "float":
	              resultado = (Float)subtracao.calcula(Arrays.makeFloatArrays(qtySelection));
	              System.out.println("O resultado da subtracao solicitada é " + ((float) resultado) + ".");
	              break;
	            case "double":
	              resultado = (Double)subtracao.calcula(Arrays.makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da subtracao solicitada é " + ((double)resultado) + ".");
	              break;
	          }
	          break;
	        case "multiplicacao":
	          Multiplicacao multiplicacao = new Multiplicacao();
	          switch (typeSelection) {
	            case "inteiro":
	              resultado = (Integer) multiplicacao.calcula(Arrays.makeIntArrays(qtySelection));
	              System.out.println("O resultado da multiplicacao solicitada é " + ((int) resultado) + ".");
	              break;
	            case "float":
	              resultado = (Float) multiplicacao.calcula(Arrays.makeFloatArrays(qtySelection));
	              System.out.println("O resultado da multiplicacao solicitada é " + ((float)resultado) + ".");
	              break;
	            case "double":
	              resultado = (Double) multiplicacao.calcula(Arrays.makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da multiplicacao solicitada é " + ((double)resultado) + ".");
	              break;
	          }
	          break;

	        case "divisao":
	          Divisao divisao = new Divisao();
	          switch (typeSelection) {
	            case "inteiro":
	              resultado = (Integer) divisao.calcula(Arrays.makeIntArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada é " + ((int)resultado) + ".");
	              break;
	            case "float":
	              resultado = (Float) divisao.calcula(Arrays.makeFloatArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada é " + ((float)resultado) + ".");
	              break;
	            case "double":
	              resultado = (Double)divisao.calcula(Arrays.makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada é " + ((double)resultado) + ".");
	              break;
	          }
	          break;

	        default:
	          System.out.println("Operação inválida. Tente novamente.");
	          again = true;
	      }
	    } while (again);
	  }
}
