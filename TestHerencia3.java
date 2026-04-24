public class TestHerencia3 {

    public static void main(String[] args) {

        // ==================================
        // PRODUCTOS FRESCOS (2)
        // ==================================
        ProductoFresco fresco1 = new ProductoFresco(
                "10/05/2026", 101,
                "01/05/2026", "Perú");

        ProductoFresco fresco2 = new ProductoFresco(
                "15/05/2026", 102,
                "03/05/2026", "Chile");


        // ==================================
        // PRODUCTOS REFRIGERADOS (3)
        // ==================================
        ProductoRefrigerado refrigerado1 = new ProductoRefrigerado(
                "20/05/2026", 201,
                "05/05/2026", "Argentina",
                4.0, "ORG-001");

        ProductoRefrigerado refrigerado2 = new ProductoRefrigerado(
                "22/05/2026", 202,
                "06/05/2026", "Brasil",
                3.5, "ORG-002");

        ProductoRefrigerado refrigerado3 = new ProductoRefrigerado(
                "25/05/2026", 203,
                "07/05/2026", "Uruguay",
                5.0, "ORG-003");


        // ==================================
        // CONGELADOS POR AGUA (2)
        // ==================================
        CongeladoAgua agua1 = new CongeladoAgua(
                "30/06/2026", 301,
                "10/05/2026", "Perú",
                -18, 35);

        CongeladoAgua agua2 = new CongeladoAgua(
                "05/07/2026", 302,
                "11/05/2026", "Ecuador",
                -20, 40);


        // ==================================
        // CONGELADOS POR AIRE (2)
        // ==================================
        CongeladoAire aire1 = new CongeladoAire(
                "10/07/2026", 401,
                "12/05/2026", "Colombia",
                -15, 78, 21, 0.03, 1);

        CongeladoAire aire2 = new CongeladoAire(
                "15/07/2026", 402,
                "13/05/2026", "México",
                -17, 79, 20, 0.04, 1);


        // ==================================
        // CONGELADO POR NITRÓGENO (1)
        // ==================================
        CongeladoNitrogeno nitrogeno1 = new CongeladoNitrogeno(
                "20/07/2026", 501,
                "14/05/2026", "España",
                -25, "Inmersión criogénica", 15);


        // ==================================
        // MOSTRAR INFORMACIÓN
        // ==================================
        System.out.println("========= PRODUCTOS FRESCOS =========");
        fresco1.mostrarInfo();
        System.out.println();

        fresco2.mostrarInfo();
        System.out.println();


        System.out.println("====== PRODUCTOS REFRIGERADOS ======");
        refrigerado1.mostrarInfo();
        System.out.println();

        refrigerado2.mostrarInfo();
        System.out.println();

        refrigerado3.mostrarInfo();
        System.out.println();


        System.out.println("==== CONGELADOS POR AGUA ====");
        agua1.mostrarInfo();
        System.out.println();

        agua2.mostrarInfo();
        System.out.println();


        System.out.println("==== CONGELADOS POR AIRE ====");
        aire1.mostrarInfo();
        System.out.println();

        aire2.mostrarInfo();
        System.out.println();


        System.out.println("=== CONGELADO POR NITRÓGENO ===");
        nitrogeno1.mostrarInfo();
    }
}