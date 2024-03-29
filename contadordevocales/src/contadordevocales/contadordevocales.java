package contadordevocales;

public class contadordevocales {

	public static void main(String[] args) {
        // Cadena de texto ingresada por el usuario
        String texto = obtenerTexto();
        
        // Contador de vocales
        int contadorVocales = contarVocales(texto);
        
        // Mostrar el resultado
        System.out.println("La cantidad de vocales en la cadena es: " + contadorVocales);
    }
    
    // Método para obtener la cadena de texto ingresada por el usuario
    public static String obtenerTexto() {
        System.out.println("Por favor, ingrese una cadena de texto:");
       
        return "Eejercicio de contador de vocales.";
    }
    
    // Método para contar vocales en una cadena de texto
    public static int contarVocales(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            // Comprobamos si el caracter es una vocal (mayúscula o minúscula)
            if (esVocal(caracter)) {
                contador++;
            }
        }
        return contador;
    }
    
    // Método para verificar si un carácter es una vocal (mayúscula o minúscula)
    public static boolean esVocal(char caracter) {
        // Convertimos el carácter a minúscula para hacer la comparación más simple
        char vocal = Character.toLowerCase(caracter);
        // Verificamos si el carácter es una vocal
        return vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u';
    }
}

