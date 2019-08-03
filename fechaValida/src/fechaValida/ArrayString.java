package fechaValida;

public class ArrayString {

	public static void main(String[] args) {		
		String[][] array = new String[2][4];			
		array[0][0]="Avila";
		array[0][1]="Burgos";
		array[0][2]="Leon";
		array[0][3]="Valencia";

		array[1][0]="Salamanca";
		array[1][1]="Segovia";
		array[1][2]="Madrid";
		array[1][3]="Zamora";
		
		for (int j=0;j<array.length;j++) {
			System.out.println("");
			for (int i=0;i<array[0].length;i++) {			
				System.out.print(" "+array[j][i]);
			}

		}
	}
}


