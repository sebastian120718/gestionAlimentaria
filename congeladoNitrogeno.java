public class congeladoNitrogeno extends productoCongelado{
    private String metodoCongelacion;
    private int tiempoExposicion;

    public congeladoNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, String metodoCongelacion, int tiempoExposicion){
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion(){
        return metodoCongelacion;
    }
    public void setMetodoCongelacion (String metodoCongelacion){
        this.metodoCongelacion = metodoCongelacion;
    }
    public int getTiempoExposicion(){
        return tiempoExposicion;
    }
    public void setTiempoExposicion(int tiempoExposicion){
        this.tiempoExposicion = tiempoExposicion;
    }
    
    @Override
    public void mostrarInfo() {
    System.out.println("=== CONGELADO POR NITRÓGENO ===");
    System.out.println("Fecha caducidad: " + getFechaCaducidad());
    System.out.println("Número lote: " + getNumeroLote());
    System.out.println("Fecha envasado: " + getFechaEnvasado());
    System.out.println("País origen: " + getPaisOrigen());
    System.out.println("Temperatura recomendada: " + getTemperaturaRecomendada());
    System.out.println("Método: " + getMetodoCongelacion());
    System.out.println("Tiempo exposición: " + getTiempoExposicion());
    }
}