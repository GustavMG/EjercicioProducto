package ejercicioProducto;

public class Producto {
	
	//Atributos
	String nombreProducto;
	float precio;
	float descuento;
	
	//Constructor
	public Producto(String nombreProducto, float precio, float descuento) {
		super();
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.descuento = descuento;
	}
	
	//Método
	public void imprimirInfo() {
		System.out.println("Nombre: " + nombreProducto);
		System.out.println("Precio: " + precio);
		System.out.println("Descuento: " + descuento);
	}
	
	public String aplicarDescuento() {
		String resultado;
		float cantidadADescontar = (descuento*precio)/100;
		float precioConDescuento = precio - (cantidadADescontar);
		resultado ="Cantidad a descontar: " + cantidadADescontar +"\n"+ "Precio con descuento: " + precioConDescuento;
		return resultado;
	}
	
	
	

}
