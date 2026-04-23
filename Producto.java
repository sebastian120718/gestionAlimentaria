public class Producto{
    private String fechaCaducidad;
    private int numeroLote;
    private String fechaEnvasado;
    private String paisOrigen;
    
    public Producto(String fechaCaducidad, int numeroLote, String fechaEnvasado,String paisOrigen){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    //Fecha Caducidad
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }

    //Numero lote
    public int getNumeroLote(){
        return numeroLote;
    } 
    public void setNumeroLote(int numeroLote){
        this.numeroLote = numeroLote;
    }

    //Fecha Envasado
    public String getFechaEnvasado(){
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado){
        this.fechaEnvasado = fechaEnvasado;
    }

    //Pais de Origen
    public String getpaisOrigen(){
        return paisOrigen;
    }
    public void setpaisOrigen(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }

    public void mostrarInfo(){
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Numero de lote: " + getNumeroLote());
        System.out.println("Fecha de Envasado: " + getFechaEnvasado());
        System.out.println("Pais de origen: " + getpaisOrigen());
    }
}
