public class ProductoRefrigerado extends ProductoTemperatura{
    private String codigoOrganismo;

    ProductoRefrigerado(String fechaCaducidad, int numeroLote , String fechaEnvasado ,String paisOrigen, double temperaturaRecomendada ,String codigoOrganismo){
        super(fechaCaducidad,numeroLote,fechaEnvasado, paisOrigen, temperaturaRecomendada );
        this.codigoOrganismo = codigoOrganismo;

    }  
    
    public String getCodigoOrganismo(){
        return codigoOrganismo;

    }

    public void setCodigoOrganismo (String codigoOrganismo){
        this.codigoOrganismo = codigoOrganismo;
    }

     @Override
    public void mostrarInfo() {
        System.out.println("=== PRODUCTO REFRIGERADO ===");
        System.out.println("Fecha caducidad: " + getFechaCaducidad());
        System.out.println("Número lote: " + getNumeroLote());
        System.out.println("Fecha envasado: " + getFechaEnvasado());
        System.out.println("País origen: " + getPaisOrigen());
        System.out.println("Temperatura recomendada: " + getTemperaturaRecomendada());
        System.out.println("Código organismo: " + getCodigoOrganismo());
    }

}
