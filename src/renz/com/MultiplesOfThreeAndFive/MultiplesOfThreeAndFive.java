package renz.com.MultiplesOfThreeAndFive;

public class MultiplesOfThreeAndFive {
	
	public static void main(String[] args){
		int num = 1,total = 0;
		
		while(num < 1000){
			if(num % 3 == 0 || num %5 ==0){
				total += num;
			}
			num +=1;
		}
		
		System.out.println("Total:" + total);
	}
}
