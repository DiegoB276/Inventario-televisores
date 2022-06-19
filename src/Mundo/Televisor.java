package Mundo;

public class Televisor {

	private int code;
	private String marca;
	private double precio;

	public Televisor(int cod, String marca, double price) {
		this.code = cod;
		this.marca = marca;
		this.precio = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//Infrmacion de un producto.
	@Override
	public String toString() {
		return "Codigo: " + this.code + "\n" + 
				"Marca: " + this.marca + "\n" + 
				"Precio: " + this.precio + "\n";
	}
}
