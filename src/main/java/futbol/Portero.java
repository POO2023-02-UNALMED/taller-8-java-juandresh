package futbol;

public class Portero extends Futbolista{
	public Short golesRecibidos;
	public Byte dorsal;
	
	public Portero(String nombre, int edad, String posicion, Short golesMarcados, Byte dorsal) {
		super(nombre, edad, "portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
		} 
	/////////////////////////////////////
	
	public String toString() {
		return("El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de portero con el dorsal "+this.dorsal+ ". Le han marcado "+this.golesRecibidos);
	}
	/////////////////////////////////////
	
	public boolean jugarConLasManos() {
		return true;}
	/////////////////////////////////////
	
	public Short getGolesRecibidos() {
		return this.golesRecibidos;}
	public void setGolesRecibidos(Short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;}
	
	public Byte getDorsal() {
		return this.dorsal = dorsal;}
	public void setDorsal(Byte dorsal) {
		this.dorsal = dorsal;}
	/////////////////////////////////////
	
	public int compareTo(Portero otro) {
		int diferencia= Math.abs(this.golesRecibidos - otro.golesRecibidos);
		return diferencia;
	}
}
