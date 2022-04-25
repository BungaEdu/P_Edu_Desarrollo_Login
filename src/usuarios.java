import java.util.Scanner;
public class usuarios {
    String nombre; //por qué no me deja poner private, para los setGet:
    String password;
    String confirmPass;

    public usuarios(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    public static String registro(String nom,String pass,String confirmPass) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime nombre usuario: ");
        return nom = sc.nextLine();
        System.out.println("Dime password: ");
        return pass = sc.nextLine();
        System.out.println("Confirma contraseña: ");
        confirmPass = sc.nextLine();
        while (confirmPass.equals(pass)==false) {
            confirmPass = sc.nextLine();
        }
    }



}
/*
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
 }*/