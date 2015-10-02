
public class project0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i < 500; i++){
			if(isEleven(i) & isFive(i)){System.out.println("animate this");
			}
			else if (isTwo(i)){
				System.out.println("davis");
			}
			else if (isTwo(i) & isEleven(i)){
				System.out.println("ninja");
			}
			else if(isThree(i)){
				System.out.println("Claughton");
			}
			else if(isFive(i)){
				System.out.println("vidal");
			}
			else if(isThree(i) & isEleven(i)){
				System.out.println("Herr Direktor");
			}
			else if(isThree(i) & isTwo(i)){
				System.out.println("chismé");
			}
			else if(isThree(i) & isFive(i)){
				System.out.println("Old School");
			}
			else if(isThree(i) & isTwo(i) & isFive(i)){
				System.out.println("Team Builder");
			}
			else{
				System.out.println(i);
			}
			
		}
	}
	

	static boolean isTwo(int n){
		return (n % 2 == 0);	
	}
	
	static boolean isThree(int m){
		return (m % 3 == 0);	
	}
	
	static boolean isFive(int o){
		return (o % 5 == 0);	
	}
	
	static boolean isEleven(int o){
		return (o % 11 == 0);	
	}
	
}