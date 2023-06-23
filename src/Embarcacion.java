public abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double eslora;

    Embarcacion(Capitan capitan, double precioBase, int anioFabricacion, double eslora){
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = anioFabricacion > 2020 ? 20000: 0;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public double calcularMontoAlquiler(){
        return this.precioBase + this.valorAdicional;
    }

    public abstract Boolean esComprable();
}
