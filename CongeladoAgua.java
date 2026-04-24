public class CongeladoAgua extends ProductoCongelado{
    private double salinidadAgua;

    public CongeladoAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, double salinidadAgua){
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;

    }

    public double getSalinidadAgua(){
        return salinidadAgua;
    }
    public void setSalinidadAgua ( double salinidadAgua){
        this.salinidadAgua= salinidadAgua;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== CONGELADO POR AGUA ===");
        System.out.println("Fecha caducidad: " + getFechaCaducidad());
        System.out.println("Número lote: " + getNumeroLote());
        System.out.println("Fecha envasado: " + getFechaEnvasado());
        System.out.println("País origen: " + getPaisOrigen());
        System.out.println("Temperatura recomendada: " + getTemperaturaRecomendada() + " °C");
        System.out.println("Salinidad del agua: " + getSalinidadAgua() + " g/L");
    }

}