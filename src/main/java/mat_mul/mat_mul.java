package mat_mul;

public class mat_mul {
		
//	int numElemnets;
	static int width;
	static int InputA[][];
	static int InputB[][];
	static int InputC[][];
	
	public mat_mul(int input_width)
	{
		width = input_width*input_width;
	//	numElemnets = input_width*input_width;	
		InputA = new int[width][width];
		InputB = new int[width][width];
		
	}
	
	
	
	public int[][] multiply() {
			

		/*
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}

		
		}*/
						
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < width; j++) {
				
				InputA[i][j]=i+width*j;
				InputB[i][j]=i+width*j;

			}
		}
						
	
		int[][] c = new int[width][width];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < width; j++) {
				for (int k = 0; k < width; k++) {
					c[i][j] = c[i][j] + InputA[i][k] * InputB[k][j];
				}
			}
		}
		
		
		
		return c;
	}
	
	
	
}