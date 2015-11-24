class LotoN {
    public static void main (String args[]){
        long start = System.currentTimeMillis(); 
        int numbers[] = new int[52];
        int index[] = new int[6];
        int num;
        boolean numExist = false;

        //инициализация массивов 0-ми
/*        for(int i = 0; i<52; i++) {
            numbers[i] = 0;
         }
        for(int i = 0; i<6; i++){
            index[i] = 0;
         }*/


        //заполнение массива случайными, неповторяющимися целыми числами от 1 до 52
        for(int i = 0; i<52; i++) {
            num = (int)(Math.random()*52+1);
//            System.out.println(i + " : " +num);
            for(int x: numbers) {
            	if(x == num) numExist = true;
             }
            if(numExist) {
            	i--;
             }else {
            	numbers[i] = num;
             }
            numExist = false;
//            System.out.println(i + "  numbers[" + i + "]: " + numbers[i]);
        }
        


        //выбор случайных 6-ти цифр, которые будут случайными порядковыми номерами массива
        numExist = false;
        for(int i = 0; i<6; i++){
            num = (int)(Math.random()*52);
            for(int x: index) {
            	if(x == num) numExist = true;
             }
            if(numExist) {
            	i--;
             } else {
            	index[i] = num;
             }
            numExist = false;
        }

        for(int i = 0; i<52; i++){
            System.out.print(numbers[i] + " ");
        }

	System.out.println("\nСлучайные 6 чисел из 52-х.");
        for(int i = 0; i<6; i++) {
            System.out.println("Число с порядковым номером " + index[i] + " : " + numbers[index[i]]);	
	}

	System.out.println();
	System.out.println("Время выполнение программы: " + (System.currentTimeMillis() - start) + " Мсек");
    }
}
