public class Yate extends Embarcacion{
    private int camarotes;

    Yate(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int camarotes){
        super(capitan, precioBase, anioFabricacion, eslora);
        this.camarotes = camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public Boolean esLujoso(){
        return this.camarotes > 7;
    }

    @Override
    public Boolean esComprable(){
        return true;
    }

    @Override
    public String toString(){
        String esLujoso = esLujoso() ? " ": "No ";
        String esComprable = esComprable()? " ": "No ";

        return "El yate" +esLujoso+"es lujoso y"+esComprable+"es comprable";

    }
}
