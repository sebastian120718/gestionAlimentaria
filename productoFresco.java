public class productoFresco extends Producto{

    public productoFresco ( String fechaCaducidad , int numeroLote , String fechaEnvasado , String paisOrigen){
        super (fechaCaducidad, numeroLote,fechaEnvasado, paisOrigen);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== PRODUCTO FRESCO ===");
        System.out.println("Fecha caducidad: " + getFechaCaducidad());
        System.out.println("Número lote: " + getNumeroLote());
        System.out.println("Fecha envasado: " + getFechaEnvasado());
        System.out.println("País origen: " + getPaisOrigen());
    }

}