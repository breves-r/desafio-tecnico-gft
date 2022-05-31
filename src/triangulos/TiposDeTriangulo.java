package triangulos;

public class TiposDeTriangulo {

	public static void main(String[] args) {
		System.out.println(triangulos(7,7,7));
		System.out.println(triangulos(7,7,8));
		System.out.println(triangulos(7,8,14));
		System.out.println(triangulos(7,8,15));

	}
	
	public static String triangulos(int a, int b, int c) {
		
		if((a+b)>c && (a+c)>b && (b+c)>a){
		    
		    if(a==b && a==c) {
		      return "Equilátero";
		    }else if (a==b || a==c || b==c) {
		      return "Isósceles";
		    }else {
		      return "Escaleno";
		    }
		  }
		  return "Não é triângulo";
	}
	
	

}
