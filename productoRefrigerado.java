public class productoRefrigerado extends productoTemperatura{
    private String codigoOrganismo;

    productoRefrigerado(String codigoOrganismo , String fechaEnvasado ,double temperaturaRecomendada , String paisOrigen){
        super( codigoOrganismo, fechaEnvasado, temperaturaRecomendada, paisOrigen);
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
        System.out.println("Código organismo: " + codigoOrganismo);
    }

}
