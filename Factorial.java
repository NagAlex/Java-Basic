import java.io.*;

class FactorialN{
    static long Fact (int i) {
    	long res;

    	if (i == 0) {return 1;}
    	res = i * Fact(i-1);
    	return res;
    }

    public static void main(String args[]) throws IOException {
	String par;
	int num = 1;
        boolean goodnum = true;
	BufferedReader parametr = new BufferedReader(new InputStreamReader(System.in));

	//проверка на правильность ввода числа
	do {
	    System.out.print("Введите целое число от 0 до 20: ");
	    par = parametr.readLine();
	    try {
 	         num = Integer.parseInt(par);
		 if (num > 20) {
		      System.out.println("Невозможно вывести факториал " + num + " (ограничение разрядности типа long)");
		 }
		 if ((num >= 0) && (num < 21)) goodnum = false;
	        }
            catch (NumberFormatException e){
	     	   System.out.println("Число задано неверно");
	        }
	 } while (goodnum);

	//вывод факториала введённого числа
	System.out.println("Факториал числа " + num + " равен: " + Fact(num));

	}
        
   
}
