package Triangulo;

public class Triangulo {
		private int Base;
		private int lado2;
		private int lado3;
		
		
		
		public Triangulo(int lado1, int lado2, int lado3) {
			super();
			this.Base = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
		}
		//h2 alcuadrado
		//
		//
		public String medirPerimetro() {
			int perimetro=Base+lado2+lado3;
			return"el perimetro es: "+perimetro;
	     }
		public String tipoDeTriangulo() {
			if(Base==lado2 && Base==lado3) {
				return"Este triangulo es Equilatero";
			}else if(Base==lado2 && Base!=lado3) {
				return"Este triangulo es isoseles";
			}else 
				return"Este triangulo es escaleno";
			
		}
		public String medirArea() {
				double altura= Math.sqrt((lado2*lado2)-((lado3)*(lado3)/4));
				
				double area=(Base*altura)/2;
				return"la altura es: "+altura+"El area es: "+area;
		
			
		}
		
		
}
