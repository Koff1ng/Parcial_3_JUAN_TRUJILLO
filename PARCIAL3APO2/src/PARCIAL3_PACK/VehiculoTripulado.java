package PARCIAL3_PACK;

public class VehiculoTripulado extends Nave {

    private int numTripulantes;
    private String misionActual;

    public VehiculoTripulado(String nombre, int numMotores, double peso, int numTripulantes) {
        super(nombre, nombre, numMotores, peso, peso);
        this.numTripulantes = numTripulantes;
        this.misionActual = "En espera";
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public String getMisionActual() {
        return misionActual;
    }

    public void setMisionActual(String misionActual) {
        this.misionActual = misionActual;
    }

    public void despegar() {
        System.out.println("Despegando...");
    }

    public void aterrizar() {
        System.out.println("Aterrizando...");
    }

    public void realizarMision(String mision) {
        System.out.println("Realizando misión: " + mision);
        this.misionActual = mision;
    }

	
	public void viajar() {
		System.out.println("Viajando al destino...");
		
	}
}
