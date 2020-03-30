package ex_4_loops;

public class Exercise {
	public static void main(String[] args) {
		int numbers[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

		/*
		1. Create a while loop which will print only even numbers from numbers[];
		2. Create a do/while loop which will print only odd numbers from numbers[];
		3. Create a short for loop which will print only numbers divisible by 5 from numbers[];
		 */
		int i=0;

		while (i < numbers.length){
			if(numbers[i] % 2 == 0){
				System.out.println(numbers[i]);
			}
			i++;
		}
		System.out.println("End of loop");

		int a = 0;

		do {
			if(numbers[a] % 2 != 0){
				System.out.println(numbers[a]);
			}
			a++;
		} while (a < numbers.length);

		System.out.println("End of loop");

		for(int number : numbers){
			if(number % 5 == 0){
				System.out.println(number);
			}
		}

	}
}
