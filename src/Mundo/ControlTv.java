package Mundo;
import java.util.*;

public class ControlTv {
	private ArrayList<Televisor> conTv;
	
	public ControlTv() {
		conTv = new ArrayList<Televisor>();
	}
	
	//Verifica si el producto existe.
	public int BuscarTv(int cod) {
		for(int i=0; i<this.conTv.size(); i++) {
			if(this.conTv.get(i).getCode() == cod) {
				return i;
			}
		}
		return -1;
	}

	//Agrega un producto al inventario.
	public String AgregarProducto(int cod, String marca, double price) {
		int valPos = BuscarTv(cod);
		if(valPos == -1) {
			if(cod == 0 || price == 0) {
				return "Error, el codigo y el precio no pueden ser 0";
			}
			Televisor auxTv = new Televisor(cod, marca, price);
			this.conTv.add(auxTv);
			return "Producto agregado al inventario \n";
		}
		
		return "Error, el producto ya está en el inventario \n";
	}
	
	//Eliminar Producto
	public String EliminarProducto(int cod) {
		int valPos = BuscarTv(cod);
		if(valPos >= 0) {
			this.conTv.remove(valPos);
			return "Producto eliminado";
		}
		return "El producto no existe";
	}
	
	//Consulta la informacion del producto.
	public String consultarInfo(int cod) {
		String ans;
		int valPos = BuscarTv(cod);
		if(valPos > -1) {
			ans = this.conTv.get(valPos).toString();
			return ans;
		}
		return "Error, el producto no existe";
	}
	
	public int SizeTV() {
		return this.conTv.size();
	}
	
	
}
