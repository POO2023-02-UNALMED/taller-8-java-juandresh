package futbol;

public class Jugador extends Futbolista {
	public Short golesMarcados;
	public Byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
		}
	//////////////////////////////////////////
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	//////////////////////////////////////////
	
	public String toString() {
		return("El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+ ". Ha marcado "+this.golesMarcados);
	}
	//////////////////////////////////////////
	
	@Override
	public boolean jugarConLasManos() {
		return false;}
	///////////////////////////////////////////
	
	public short getGolesMarcados() {
		return this.golesMarcados;}
	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;}
	
	public byte getDorsal() {
		return this.dorsal = dorsal;}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;}
	///////////////////////////////////////////
	
	@Override
	public int compareTo(Object otro) {
		Jugador otroJ = (Jugador) otro;
		int diferencia= Math.abs(this.getEdad() - otroJ.getEdad());
		return diferencia;
	}
}
