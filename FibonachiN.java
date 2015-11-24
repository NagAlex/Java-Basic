import java.io.*;

class FibonachiN{
    public static void main(String args[]) throws IOException {
    	
	String par;
	int num = 1, col = 1;
        boolean goodnum = true;
	BufferedReader parametr = new BufferedReader(new InputStreamReader(System.in));
      
	//проверка на правильность ввода числа
	do {
	    System.out.print("Задайте количество членов последовательности Фибоначчи (целое число от -93 до 93,кроме 0): ");
	    par = parametr.readLine();
	    try {
 	         num = Integer.parseInt(par);
		 if ((num > 93)||(num < -93)) {
		      System.out.println("Невозможно сформировать последовательность до " + 
		      			  num + "-го члена (ограничение разрядности типа long)");
		 }
		 if ((num > -94) && (num < 94) && (num != 0)) goodnum = false;
	    } catch (NumberFormatException e){
	     	   System.out.println("Число задано неверно");
	      }
	} while (goodnum);

	//Формирование последовательности Фибоначчи
	col = Math.abs(num);
	long fib[] = new long[col];
	fib[0] = 0;
	if (col > 1) {
	    fib[1] = 1;
	    if (num > 0) {
	        for (int i = 2; i < col; i++) {
		    fib[i] = fib[i-1] + fib[i-2];
	        }
	    } else {
	        for (int i = 2; i < col; i++) {
	            fib[i] = fib[i-2] - fib[i-1];
	        }
	    }
	}
	
	//вывод последовательности Фибоначчи
        System.out.print("Последовательность Фибоначчи до " + num + " члена: ");
        if (num > 0) {
	    for (int i = 0; i < col; i++) {
	        System.out.print(fib[i] + " ");
	    }
        } else {
            for (int i = col-1; i >= 0; i--) {
	        System.out.print(fib[i] + " ");
	    }
        }
	System.out.println();
   }
}
