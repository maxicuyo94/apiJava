package mendezApi4;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
	private List<Producto> listaDeProducto;

	public Inventario() {
		this.listaDeProducto = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto producto) {
		this.listaDeProducto.add(producto);
	}

	public void mostrarProducto() {
		int totalCompra = 0;
		int totalVenta = 0;
		for (Producto p : this.listaDeProducto) {
			totalCompra += p.getPrecio();
			totalVenta += p.getPrecioVenta();
			System.out.println("Nombre del producto: "+ p.getNombre());
			System.out.println("Precio del producto: "+ p.getPrecioVenta());
		}
		System.out.println("Total precio de venta: "+ totalCompra);
		System.out.println("Total precio de compra: "+ totalVenta);
	}
}
