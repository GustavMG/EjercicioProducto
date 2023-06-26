package ejercicioProducto;

public class Consumidor extends Producto {
	
	//Atributos
	String nombreConsumidor;
	int numeroUsuario;
	
	//Constructor
	public Consumidor(String nombre, float precio, float descuento, String nombreConsumidor, int numeroUsuario) {
		super(nombre, precio, descuento);
		this.nombreConsumidor = nombreConsumidor;
		this.numeroUsuario = numeroUsuario;
	}



	public static void main(String[] args) {
		Consumidor consumidor01 = new Consumidor("Gansito", 18.5f, 15.0f, "Consumidor1", 8019);
		
		consumidor01.imprimirInfo();
		System.out.println(consumidor01.aplicarDescuento());

	}

}
