package Main;
import java.util.*;


public class Arrays {
	public static Integer[] makeIntArrays(int qty) {
	    Integer[] intArr = new Integer[qty];
	    Scanner scan = new Scanner(System.in);

	    for (int i = 0; i < qty; i++) {
	      System.out.println("Digite o " + (i + 1) + "º número: ");
	      intArr[i] = scan.nextInt();
	    }
	    return intArr;
	  }

	  public static Float[] makeFloatArrays(int qty) {
	    Float[] floatArr = new Float[qty];
	    Scanner scan = new Scanner(System.in);
	    scan.useLocale(Locale.ENGLISH);

	    for (int i = 0; i < qty; i++) {
	      System.out.println("Digite o " + (i + 1) + "º número: ");
	      floatArr[i] = scan.nextFloat();
	    }
	    return floatArr;
	  }

	  public static Double[] makeDoubleArrays(int qty) {
	    Double[] doubleArr = new Double[qty];
	    Scanner scan = new Scanner(System.in);
	    scan.useLocale(Locale.ENGLISH);

	    for (int i = 0; i < qty; i++) {
	      System.out.println("Digite o " + (i + 1) + "º número: ");
	      doubleArr[i] = scan.nextDouble();
	    }
	    return doubleArr;
	  }
}
