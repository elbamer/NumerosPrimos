package fechaValida;

public class primos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int con=0;		
		int num;  
		int num1=100; 
		for (int j=1 ;j<=num1;j++){
			num=j;   
			con=0; 
			for (int i=1 ;i<=num;i++){
				if(num%i==0) {
					con=con+1;
				}
			}

			if(con==2) {
				System.out.println("El numero "+num+" es primo ");

			}else {	

				System.out.println("El numero "+num +" no es primo ");
			} 
		
		}
	}
}














