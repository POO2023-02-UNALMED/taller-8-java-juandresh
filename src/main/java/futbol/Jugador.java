package futbol;

public class Jugador extends Futbolista {
	public Short golesMarcados;
	public Byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, Short golesMarcados, Byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
		}
	//////////////////////////////////////////
	
	public Jugador(String nombre, int edad, String posicion, Short golesMarcados, Byte dorsal) {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	//////////////////////////////////////////
	
	public String toString() {
		return("El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+ ". Ha marcado "+this.golesMarcados);
	}
	//////////////////////////////////////////
	
	public boolean jugarConLasManos() {
		return false;}
	///////////////////////////////////////////
	
	public Short getGolesMarcados() {
		return this.golesMarcados;}
	public void setGolesMarcados(Short golesMarcados) {
		this.golesMarcados = golesMarcados;}
	
	public Byte getDorsal() {
		return this.dorsal = dorsal;}
	public void setDorsal(Byte dorsal) {
		this.dorsal = dorsal;}
	///////////////////////////////////////////
	
	
}
