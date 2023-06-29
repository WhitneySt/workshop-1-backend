
public class Main {
    public static void main(String[] args) {
        Capitan capitan = new Capitan("Whitney", "Stevenson", "123456");
        Yate lujoso = new Yate(capitan, 1500, 2023, 10.2, 8);
        Velero pequeno = new Velero(capitan, 1200, 2021,5.8, 3);

        //Mostrar monto de alquiler
        System.out.println("Yate: ");
        System.out.println("Monto del alquiler " + lujoso.calcularMontoAlquiler());
        System.out.println(lujoso);
        System.out.println("-----------------------");
        System.out.println("Velero: ");
        System.out.println("Monto del alquiler " + pequeno.calcularMontoAlquiler());
        System.out.println(pequeno);

    }
}