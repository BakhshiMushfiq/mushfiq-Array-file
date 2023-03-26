package LoopProject;

public class EachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] myString = {"zaby", "jamsid", "Saboor"};
		for (String my: myString) {
			System.out.println(my);
		}
		int [] number = {1, 2, 3, 4};
		for (int num: number) {
			System.out.println("\n totle:" + num);
		}
		int [] numbers = {2, 3, 5, 7, 20};
		System.out.println("lenght: " + numbers.length);
				int sum = 0;
				for (int i = 0; i < numbers.length; i++) {
					sum += numbers [i];
				}
					System.out.println("sum: " + sum);
					
					
					double avarage = sum /numbers.length;
					System.out.println("avrage: " + avarage);
				}
				}


