public class ProductoTemperatura extends Producto{
    private double temperaturaRecomendada;

    public ProductoTemperatura(String fechaCaducidad, int numeroLote, String fechaEnvasado,String paisOrigen,double temperaturaRecomendada){
        super(fechaCaducidad,numeroLote,fechaEnvasado,paisOrigen);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public double getTemperaturaRecomendada(){
        return temperaturaRecomendada;
    }
    public void setTemperaturaRecomendada(double temperaturaRecomendada){
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public void mostrarInfo(){
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Numero de lote: " + getNumeroLote());
        System.out.println("Fecha de Envasado: " + getFechaEnvasado());
        System.out.println("Pais de origen: " + getPaisOrigen());
        System.out.println("Temperatura Recomendada: " + getTemperaturaRecomendada());
    }
}