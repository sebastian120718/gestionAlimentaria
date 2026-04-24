public class ProductoCongelado extends ProductoTemperatura{

    public ProductoCongelado(String fechaCaducidad,int numeroLote, String fechaEnvasado,String paisOrigen,double temperaturaRecomendada){
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
    }

    public void mostrarInfo(){
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Número de lote: " + getNumeroLote());
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("País de origen: " + getPaisOrigen());
        System.out.println("Temperatura recomendada: " + getTemperaturaRecomendada() + " °C");
    }
}