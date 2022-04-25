import java.util.Scanner;
public class usuarios {
    String nombre;
    String contraseña;

    public usuarios(String nombre, String contraseña) {
        this.nombre=nombre;
        this.contraseña=contraseña;
    }

    public static String preguntaNom(String nom) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime nombre usuario: ");
        return sc.nextLine();
    }

    public static void leerMatriz (String nombre, String contraseña) {
        System.out.println("Dime nombre");


    }

    for(int i = 0; i<matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {

}


/***************IMPRIMIR MATRIZ****************
 int[][] matriz = {{2, 4, 4}, {6, 6, 9}, {8, 10, 12}};
 for(int i = 0; i<matriz.length; i++) {
 for (int j = 0; j < matriz[i].length; j++) {
 System.out.print(matriz[i][j] + " ");    // Imprime elemento
 }
 System.out.println();    // Imprime salto de línea
 }