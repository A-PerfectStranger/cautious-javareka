class Funciones {
    public static void main(String[] args) {
        System.out.println("Precio Total: " + CalcularPrecioTotal(2.5f, 3));
    }

    public static float CalcularPrecioTotal(float precioUnidad, int cantidad) {
        float precioTotal = precioUnidad * cantidad;
        return precioTotal;
    }

}