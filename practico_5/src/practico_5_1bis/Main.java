package practico_5_1bis;

public class Main {

	public static void main(String[] args) {

		Pila p1 = new Pila();

		p1.push("Matias");
		p1.push("Maite");
		p1.push("Nicolas");
		p1.push("Karina");
		p1.push("Hugo");
		System.out.println(p1.size());
		//System.out.println(p1.toString());
		System.out.println(p1);

		p1.pop();

		System.out.println(p1);

		p1.pop();

		System.out.println(p1);
		System.out.println(p1.top());
		System.out.println(p1.size());
		
		/*
		  System.out.println("*****************"); String frase =
		  "El mas grande sigue siendo River Plate";
		  
		  System.out.println(frase.contains("estadio"));
		  System.out.println(frase.contains("Plate"));
		  System.out.println(frase.toUpperCase().contains("plate".toUpperCase()));
		*/ 
		
		System.out.println("************");
		Pila p2 = new Pila();
//		p2 = p1.copy();
		System.out.println(p2);
		
		System.out.println("************");
		p2 = p1;
		System.out.println(p2);
		
		
						
	}
}
