package mendezApi4;

public class Aplication {

	public static void main(String[] args) {
		Producto producto1 = new Producto("leche",200,4000,false);
		Producto producto2 = new Producto("pan",100,1000,true);
		Producto producto3 = new Producto("azucar",300,2000,false);
		Producto producto4 = new Producto("arroz",400,5000,true);
		Producto producto5 = new Producto("sal",500,6000,false);
		Producto producto6 = new Producto("aceite",600,7000,true);
		Producto producto7 = new Producto("cafe",700,8000,false);

		Inventario inventario = new Inventario();
		inventario.agregarProducto(producto1);
		inventario.agregarProducto(producto2);
		inventario.agregarProducto(producto3);
		inventario.agregarProducto(producto4);
		inventario.agregarProducto(producto5);
		inventario.agregarProducto(producto6);
		inventario.agregarProducto(producto7);

		inventario.mostrarProducto();

	}

}
