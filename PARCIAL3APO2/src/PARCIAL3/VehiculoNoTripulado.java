package PARCIAL3;

public class VehiculoNoTripulado extends Nave {
    private String categoria;
    private String descripcion;
    private String nombre;

    public VehiculoNoTripulado(String categoria, String descripcion, String nombre) {
    	super(nombre,descripcion,categoria);
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }


	public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public boolean necesitaCombustible() {
        if (descripcion.contains("no precisan de combustible")) {
            return false;
        } else {
            return true;
        }
    }

    public int obtenerVelocidad() {
        if (descripcion.contains("aproximadamente a 12000 km/h")) {
            return 12000;
        } else {
            return 0;
        }
    }

    public int obtenerCantidadMotores() {
        if (nombre.contains("ATV")) {
            return 4;
        } else {
            return 0;
        }
    }

    public double obtenerEmpuje() {
        if (nombre.contains("ATV")) {
            return 0.2;
        } else {
            return 0;
        }
    }


	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		
	}
}