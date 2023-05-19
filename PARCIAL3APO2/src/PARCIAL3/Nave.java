package PARCIAL3;
public abstract class Nave {
    private double peso;
    private double velocidadMaxima;
    private double aceleracionMaxima;
    private double combustible;

    public Nave(double peso, double velocidadMaxima, double aceleracionMaxima, double combustible) {
        this.peso = peso;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionMaxima = aceleracionMaxima;
        this.combustible = combustible;
    }

	public Nave(String nombre, String fabricante, int anioFabricacion, double precio, double velocidadMaxima2) {
		
	}


	public Nave(String nombre, String descripcion, String categoria) {
	
	}

	public double getPeso() {
        return peso;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public double getAceleracionMaxima() {
        return aceleracionMaxima;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public abstract void despegar();
    public abstract void aterrizar();	
    public abstract void viajar();

	protected abstract String getNombre();
}
