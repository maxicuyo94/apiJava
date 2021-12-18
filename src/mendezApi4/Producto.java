package mendezApi4;

public class Producto {
	private String nombre;
	private int precio;
	private int stock;
	private int precioVenta;
	private boolean promocional;

	// constructor
	public Producto(String nombre, int precio, int stocks, boolean promocional) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stocks;
		this.promocional = promocional;
		this.precioVenta = this.calcularPrecioVenta(precio, stocks, promocional);

	}

	private int calcularPrecioVenta(int precio, int stock, boolean promocional) {
		double precioVenta;
		if (!promocional) {
			if ((stock >= 100 && precio > 1500) || stock < 50) {
				precioVenta = precio * 1.15 * 1.21;
			} else {
				precioVenta = precio * 1.2 + 1.21;
			}
		} else {
			precioVenta = precio * 1.21;
		}

		return (int) precioVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public boolean isPromocional() {
		return promocional;
	}
}
