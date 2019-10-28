package Triangulo;

public class TrianguloMain {

	public static void main(String[] args) {
		//medir perimetro , clase triangulo,calcular perimetro y area
		//El perímetro de un triángulo isósceles se obtiene como suma de los tres lados del triángulo
		//El área de un triángulo es igual a base por altura partido por 2. La altura es la recta perpendicular
		//trazada desde un vértice al lado opuesto (o su prolongación).
		//metodo que compare triangulos
		Triangulo medidor= new Triangulo(5,5,5);
		System.out.print(medidor.medirPerimetro());
		System.out.println();
		System.out.print(medidor.tipoDeTriangulo());
		System.out.println();
		System.out.print(medidor.medirArea());
		
	}

}
