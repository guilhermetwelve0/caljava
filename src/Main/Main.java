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
	      System.out.println("Seja bem-vind@ ao �Calcula j�!'");
	      System.out.println("Voc� deseja fazer uma soma, subtracao, multiplicacao ou divisao?");
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
	      System.out.println("Ser� uma " + operation + " de quantos n�meros?(M�nimo de 2 n�meros!)");
	      qtySelection = scan.nextInt();
	    } while (qtySelection < 2);

	    do {
	      System.out.println("Ser�o " + qtySelection + " n�meros do tipo inteiro, float ou double?");
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
	              resultado = soma.calcula(Arrays.makeIntArrays(qtySelection));
	              System.out.println("O resultado da soma solicitada � " + ((int) resultado) + ".");
	              break;
	            case "float":
	              resultado = soma.calcula(Arrays.makeFloatArrays(qtySelection));
	              System.out.println("O resultado da soma solicitada � " + ((float) resultado) + ".");
	              break;
	            case "double":
	              resultado = (Double) soma.calcula(Arrays.makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da soma solicitada � " + resultado + ".");
	              break;
	          }
	          break;
	        case "subtracao":
	          Subtracao subtracao = new Subtracao();
	          switch (typeSelection) {
	            case "inteiro":
	              resultado = subtracao.calcula(Arrays.makeIntArrays(qtySelection));
	              System.out.println("O resultado da subtracao solicitada � " + ((int) resultado) + ".");
	              break;
	            case "float":
	              resultado = subtracao.calcula(Arrays.makeFloatArrays(qtySelection));
	              System.out.println("O resultado da subtracao solicitada � " + ((float) resultado) + ".");
	              break;
	            case "double":
	              resultado = subtracao.calcula(Arrays.makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da subtracao solicitada � " + resultado + ".");
	              break;
	          }
	          break;
	        case "multiplicacao":
	          Multiplicacao multiplicacao = new Multiplicacao();
	          switch (typeSelection) {
	            case "inteiro":
	              resultado = (Integer) multiplicacao.calcula(Arrays.makeIntArrays(qtySelection));
	              System.out.println("O resultado da multiplicacao solicitada � " + ((int) resultado) + ".");
	              break;
	            case "float":
	              resultado = (Float) multiplicacao.calcula(Arrays.makeFloatArrays(qtySelection));
	              System.out.println("O resultado da multiplicacao solicitada � " + ((float) resultado) + ".");
	              break;
	            case "double":
	              resultado = (Double) multiplicacao.calcula(Arrays.makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da multiplicacao solicitada � " + resultado + ".");
	              break;
	          }
	          break;

	        case "divisao":
	          Divisao divisao = new Divisao();
	          switch (typeSelection) {
	            case "inteiro":
	              resultado = divisao.calcula(Arrays.makeIntArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada � " + ((int) resultado) + ".");
	              break;
	            case "float":
	              resultado = divisao.calcula(Arrays.makeFloatArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada � " + ((float) resultado) + ".");
	              break;
	            case "double":
	              resultado = divisao.calcula(Arrays.makeDoubleArrays(qtySelection));
	              System.out.println("O resultado da divisao solicitada � " + resultado + ".");
	              break;
	          }
	          break;

	        default:
	          System.out.println("Opera��o inv�lida. Tente novamente.");
	          again = true;
	      }
	    } while (again);
	  }
}
