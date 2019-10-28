class Sequential{
	
	public static  int pile = 50;
	public static int total_time = 0;
	public static int cart = 0;
	public static int extra = 0;

	static void addToCart(){
			pile = pile - 5;
			cart = cart + 5;
			total_time = total_time + 10;
			System.out.println("Adding 5 books to the cart \t Time: "+total_time + " seconds");
	}
	
	static void goToIncinerator(){
			total_time = total_time + 30;
			System.out.println("Going to incinerator \t\t Time: "+total_time+ " seconds");
	}

	static void unloadBooks(){
			cart = cart-5;
			extra = extra + 2;
			total_time = total_time + 10;	
			System.out.println("Burn 3 books and keep 2 \t Time: "+total_time+ " seconds");
	}
	
	static void goBack(){
			total_time = total_time + 30;
			System.out.println("Going Back \t\t Time: "+total_time+ " seconds");
	}
	
	public static void main(String args[]){

		
		System.out.println("-----PROCESS STARTS------");
		while(pile>0){
			addToCart();
			goToIncinerator();
			unloadBooks();			
			if(pile !=0 )
				goBack();
		}
		
		System.out.println("All books are near incinerator."+ extra);
		
		while(extra>0){
			total_time=total_time+20;
			extra = extra -3;
		}
		System.out.println("Total time taken by the process= "+total_time + " seconds");

	}
}
