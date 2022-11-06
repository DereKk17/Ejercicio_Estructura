package Solucion;

public class App {

    static PagaJusto funciones = new PagaJusto();
    static int[] id = new int[6];
    static String[] nombre = new String[6];

    static float [][] finanzas = new float[6][4];

    public static void main(String[] args) {

        llenar();
        mostrarMatriz();

        ordenar();
        System.out.println();

        mostrarMatriz();







    }

    public static void llenar(){
        int dato = 5;
        for(int i = 0 ; i < id.length; i++){
            id[i] = dato;
            nombre[i] = "Empleado" + dato;
            for(int j = 0; j < 4; j++){
                finanzas[i][j] = (float) Math.random()* 2000000;
            }
            dato --;
        }
    }

    public static void mostrarMatriz(){
        for(int j = 0; j < id.length ; j++){
            System.out.print(id[j] + "  " + nombre[j] + "  ");
            for(int i = 0; i < 4; i ++){
                System.out.print(finanzas[j][i] + "   ");
            }
            System.out.println();
        }
    }

    public static void buscarPorId (int identificacion){
        int posicion = funciones.BusquedaBinaria(id, 6, identificacion);
        System.out.println(posicion);

        System.out.print(id[posicion] + " " + nombre[posicion] + " ");

        for(int i = 0; i < 4; i++){
            System.out.print(finanzas[posicion][i] + "   ");
        }

    }

    public static void ordenar(){
        funciones.selection(id, nombre, finanzas);
    }

}
