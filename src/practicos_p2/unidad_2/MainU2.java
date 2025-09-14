package practicos_p2.unidad_2;

import java.util.Scanner;

public class MainU2 {
    
    
    
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!       FUNCIONES       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // !!!!!!!!!!!   FUNC. EJ. 8   !!!!!!!!!!!
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
        // Método para calcular el precio final
    public static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        // Convertimos % a decimales
        double impDecimal = impuesto / 100;
        double descDecimal = descuento / 100;
        // Aplicamos fórmula
        double precioFinal = base + (base * impDecimal) - (base * descDecimal);
        return precioFinal;
    }
    
    
   
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // !!!!!!!!!!!   FUNC. EJ. 9   !!!!!!!!!!!
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
        // Función para calcular costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return -1; // indicador de error
        }
    }
          // Función para calcular el total de compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
   
    
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // !!!!!!!!!!!   FUNC. EJ. 10   !!!!!!!!!!
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    // Función que calcula el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
 
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // !!!!!!!!!!!   FUNC. EJ. 11   !!!!!!!!!!
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  
    
    // Variable "global" (de clase) para el descuento especial del 10%
    static double DESCUENTO_ESPECIAL = 0.10;

    // Método que calcula y MUESTRA el descuento y el precio final
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // variable local
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // !!!!!!!!!!!   FUNC. EJ. 13   !!!!!!!!!!
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
    
    // Función recursiva para imprimir los precios
    public static void imprimirArray(double[] arr, int indice) {
        if (indice == arr.length) {
            return; // caso base: fin del array
        }
        System.out.println("Precio: $" + arr[indice]);
        imprimirArray(arr, indice + 1); // llamada recursiva
    }
    
    
    
    
    
    public static void main(String[] args) {Scanner input = new Scanner(System.in);      
       
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 1   !!!!!!!!!!!!!!!!!!
       
        /*
        System.out.println("Ingrese un año:");
        int anio = input.nextInt();

        if ( (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0) ) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        */
        
        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 2   !!!!!!!!!!!!!!!!!!
       
        /*
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = input.nextInt();

        int mayor;
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);  
        */
        
        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 3   !!!!!!!!!!!!!!!!!!
        
        /*
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
        */
        
        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 4   !!!!!!!!!!!!!!!!!!
        
        /*
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = input.next().toUpperCase(); 

        double descuento = 0;

        if (categoria.equals("A")) {
            descuento = 0.10;
        } else if (categoria.equals("B")) {
            descuento = 0.15;
        } else if (categoria.equals("C")) {
            descuento = 0.20;
        } else {
            System.out.println("Categoría inválida.");
            return;
        }

        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
       */
        
        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 5   !!!!!!!!!!!!!!!!!!
        
        /*
        int sumaPares = 0;
        int numero;

        // Bucle que pide números hasta que el usuario ingrese 0
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();

            if (numero == 0) {
                break; // cortar el ciclo
            }

            if (numero % 2 == 0) { 
                sumaPares += numero;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
        */
        
        
        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 6   !!!!!!!!!!!!!!!!!!
        
        /*
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Pedimos 10 númerosn y validamos
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = input.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
       */        
        
        
        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 7   !!!!!!!!!!!!!!!!!!
         
        /*
        int nota;

        // Bucle do-while: pide hasta que esté en rango
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente: " + nota);
       */              
        
        
        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 8   !!!!!!!!!!!!!!!!!!
         
        /*
        System.out.print("Ingrese el precio base del producto: ");
        double base = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();

        // Llamamos al método
        double resultado = calcularPrecioFinal(base, impuesto, descuento);

        // Mostrar resultado
        System.out.println("El precio final del producto es: " + resultado);
        */      
        
        
        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 9   !!!!!!!!!!!!!!!!!!
        
        /*
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.next();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        if (costoEnvio == -1) {
            System.out.println("Zona inválida. Debe ser Nacional o Internacional.");
            return;
        }

        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);  
        */
        
        
        
        
        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 10   !!!!!!!!!!!!!!!!!!
        
        /*
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        int resultado = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + resultado);
        */

        
        
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 11   !!!!!!!!!!!!!!!!!!
        
        /*
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        calcularDescuentoEspecial(precio); // usa la variable global del 10%
        */
        
        
        
        
        
        

        // !!!!!!!!!!!!!!!!!!   EJERCICIO 12   !!!!!!!!!!!!!!!!!!
        
        /*
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        */
        
        
        
        
        
        // !!!!!!!!!!!!!!!!!!   EJERCICIO 13   !!!!!!!!!!!!!!!!!!
        
        /*
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirArray(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirArray(precios, 0);
        */  
    }
}
