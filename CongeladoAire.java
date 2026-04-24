public class CongeladoAire extends ProductoCongelado {
    private double nitrogeno;
    private double oxigeno; 
    private double dioxidoCarbono;
    private double vaporAgua;

    public CongeladoAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada,double nitrogeno, double oxigeno, double dioxidoCarbono, double vaporAgua){
        super(fechaCaducidad,numeroLote,fechaEnvasado,paisOrigen,temperaturaRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;

    }

    public double getNitrogeno(){
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno){
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno(){
        return oxigeno;
    }
    public void setOxigeno (double oxigeno){
        this.oxigeno = oxigeno;
    }
    public double getDioxidoCarbono(){
        return dioxidoCarbono;
    }
    public void setDioxidoCarbono (double dioxidoCarbono){
        this.dioxidoCarbono = dioxidoCarbono;
    }
    public double getVaporAgua(){
        return vaporAgua;
    }
    public void setVaporAgua (double vaporAgua){
        this.vaporAgua = vaporAgua;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== CONGELADO POR AIRE ===");
        System.out.println("Fecha caducidad: " + getFechaCaducidad());
        System.out.println("Número lote: " + getNumeroLote());
        System.out.println("Fecha envasado: " + getFechaEnvasado());
        System.out.println("País origen: " + getPaisOrigen());
        System.out.println("Temperatura recomendada: " + getTemperaturaRecomendada() + " °C");
        System.out.println("Nitrógeno: " + getNitrogeno() + "%");
        System.out.println("Oxígeno: " + getOxigeno() + "%");
        System.out.println("Dióxido de carbono: " + getDioxidoCarbono() + "%");
        System.out.println("Vapor de agua: " + getVaporAgua() + "%");
    }
}