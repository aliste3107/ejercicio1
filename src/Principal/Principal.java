package Principal;

import beans.Vehiculo;

public class Principal {

	public static void main(String[] args) {
	
//		int x = 1, y = 2;
//		int z;
//		
//		z=y;
//		y=x;
//		x=z;
//		
		Vehiculo v1=new Vehiculo();
		
		v1.setMarca("VW");
		v1.setModelo("Golf 4");
		v1.setMatricula("868ccNY");
		v1.setAnio(2003);
		v1.setColor("Negro");
		
		System.out.println(v1);
		
		
		if(compruebaMatricula(v1.getMatricula())) {
			System.out.println("MATRICULA CORRECTA");
		}else {
			System.out.println("MATRICULA ERRONEA");
		}
		
		
	}
	
	private static boolean compruebaMatricula(String matricula) {
		
		String num;
		num = matricula.substring(0, 4);
		System.out.println(num);
		boolean isMatricula=true;
		for(int i=0; i<4;i++) {
			if (!Character.isDigit(matricula.charAt(i))){
				isMatricula=false;
			}
		}
		
		if (matricula.length()!=7) {
			isMatricula=false;
		}
		return isMatricula;
		
	}
	
}
