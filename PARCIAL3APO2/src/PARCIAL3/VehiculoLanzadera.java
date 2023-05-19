package PARCIAL3;

public class VehiculoLanzadera extends Nave {

	 
	  private double empuje;
	  private double peso;
	  private double combustible;

	 
	  public VehiculoLanzadera(String nombre, String fabricante, int anioFabricacion, double precio,
	                           double velocidadMaxima, double empuje, double peso, double combustible) {
	    super(nombre, fabricante, anioFabricacion, precio, velocidadMaxima);
	    this.empuje = empuje;
	    this.peso = peso;
	    this.combustible = combustible;
	  }


	  public void lanzarCargaUtil(String cargaUtil) {
	    System.out.println("Lanzando carga útil: " + cargaUtil);
	  }

	  public void utilizarPropulsor() {
	    System.out.println("Utilizando propulsor de combustible " + combustible);
	  }

	
	  public double getEmpuje() {
	    return empuje;
	  }

	  public void setEmpuje(double empuje) {
	    this.empuje = empuje;
	  }

	  public double getPeso() {
	    return peso;
	  }

	  public void setPeso(double peso) {
	    this.peso = peso;
	  }

	  public double getCombustible() {
	    return combustible;
	  }

	  public void setCombustible(double combustible) {
	    this.combustible = combustible;
	  }


	
	public void despegar() {
		
		System.out.println("Despegando en 3...2...1");
	}



	public void aterrizar() {
		
		System.out.println("Aterrizando...");
	}



	public void viajar() {
		
		System.out.println("Viajando al destino...");
	}


	@Override
	protected String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	}
