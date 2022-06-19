package Mundo;
import java.util.*;

public class ControlTv {
	private ArrayList<Televisor> conTv;
	
	public ControlTv() {
		conTv = new ArrayList<Televisor>();
	}
	
	public int BuscarTv(int cod) {
		for(int i=0; i<this.conTv.size(); i++) {
			if(this.conTv.get(i).getCode() == cod) {
				return i;
			}
		}
		return -1;
	}
	
	/*public void valNullCode(int code) throws Exception{
		if(code == null) {
			throw new Exception("Error, debe llenar todos los campos");
		}
	}*/
	
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
	
	/*
	public String GenDescuento(int code, int descuento) {
		int valPos = BuscarTv(code);
		double des = conTv.get(valPos).getPrecio() * (descuento/100);
		if(valPos != -1 && code > 0 && descuento > 0) {
			this.conTv.get(valPos).setPrecio(des);
			return "xdxd";
		}
		return "nadaaaa";
	}*/
	
	public String EliminarProducto(int cod) {
		int valPos = BuscarTv(cod);
		if(valPos >= 0) {
			this.conTv.remove(valPos);
			return "Producto eliminado";
		}
		return "El producto no existe";
	}
	
	
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
