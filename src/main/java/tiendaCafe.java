import java.util.Scanner;

public class tiendaCafe
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        int productos, cantidad;
        int totalUnidades = 0;
        double precio, importe;
        double subtotal, descuento, total;
        String cliente;

        while (opcion != 2)
        {

            System.out.println("====CAFETERIA ESCOLAR====");
            System.out.println("1. Registrar compra");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    teclado.nextLine();

                    System.out.println("====REGISTRAR COMPRA====");
                    System.out.print("Nombre del cliente: ");
                    cliente = teclado.nextLine();

                    System.out.print("Cuantos productos diferentes compraras?: ");
                    productos = teclado.nextInt();

                    subtotal = 0;
                    totalUnidades = 0;

                    for (int i = 1; i <= productos; i++) {

                        System.out.println("Producto " + i);

                        System.out.print("Precio: ");
                        precio = teclado.nextDouble();

                        System.out.print("Cantidad: ");
                        cantidad = teclado.nextInt();

                        importe = precio * cantidad;
                        subtotal = subtotal + importe;
                        totalUnidades = totalUnidades + cantidad;

                        System.out.println("Importe: $" + importe);
                    }

                    if (subtotal < 100)
                    {
                        descuento = 0;
                    }
                    else if (subtotal < 300)
                    {
                        descuento = subtotal * 0.05;
                    }
                    else
                    {
                        descuento = subtotal * 0.10;
                    }

                    total = subtotal - descuento;

                    System.out.println("====RESUMEN DE COMPRA====");
                    System.out.println("Cliente: " + cliente);
                    System.out.println("Productos diferentes: " + productos);
                    System.out.println("Unidades compradas: " + totalUnidades);
                    System.out.printf("Subtotal: ", + subtotal);
                    System.out.printf("Descuento: ", +descuento);
                    System.out.printf("Total: ", +total);
                    break;

                case 2:
                    System.out.println("Gracias por visitar la cafeteria.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
    }
}