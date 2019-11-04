package beans;

public class Vehiculo {

		private String marca;
		private String modelo;
		private String matricula;
		private int anio;
		private String color;
	
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String marca, String modelo, String matricula, int anio, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.anio = anio;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Su vehiculo es un " + marca + " " + modelo + " con matricula " + matricula + " y del año " + anio + ". Color: " + color + ".";
	}

	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	
	
}
