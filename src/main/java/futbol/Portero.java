package futbol; 

public class Portero extends Futbolista{
	public Short golesRecibidos;
	public Byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
		} 
	/////////////////////////////////////
	
	public String toString() {
		return("El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos);
	}
	/////////////////////////////////////
	
	@Override
	public boolean jugarConLasManos() {
		return true;}
	/////////////////////////////////////
	
	public short getGolesRecibidos() {
		return this.golesRecibidos;}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;}
	
	public byte getDorsal() {
		return this.dorsal = dorsal;}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;}
	/////////////////////////////////////
	
	@Override
	public int compareTo(Object otro) {
		Portero otroP =(Portero) otro;
		int diferencia= Math.abs(this.golesRecibidos - otroP.golesRecibidos);
		return diferencia;
	}
}
