public class Velero extends Embarcacion{
    private int mastiles;

    Velero(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int mastiles){
        super(capitan, precioBase, anioFabricacion, eslora);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    @Override
    public Boolean esComprable(){
        return false;
    }


    public Boolean esGrande(){
        return this.mastiles > 4;
    }
}
