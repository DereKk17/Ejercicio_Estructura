package Solucion;


public class PagaJusto<T> {

    public int BusquedaBinaria(int[] vector, int TL, int dato) {

        int centro, izq=0, der=TL-1;

        while(izq<=der){
            centro= (der-izq)/2 +izq;
            if(vector[centro]==dato)
                return centro;
            else
            if(dato < vector[centro])
                der=centro-1;
            else
                izq=centro+1;
        }
        return -1;
    }

    public void selection(int vectorId[], String vectorNombre[], float matrizFinanzas[][]) {
        int mas_pequeno, pos, temp;
        String temp2;
        float temp3;

        for (int i = 0; i < vectorId.length - 1; i++) {
            mas_pequeno = vectorId[i];
            pos = i;
            for (int j = i + 1; j < vectorId.length; j++) { // toma la pos siguient
                if (vectorId[j] < mas_pequeno) { // ¿Es el siguiente < al anterior?
                    mas_pequeno = vectorId[j];
                    pos = j;
                }
            }
            if (pos != i) {
                temp = vectorId[i];
                temp2 = vectorNombre[i];
                vectorId[i] = vectorId[pos];
                vectorNombre[i] = vectorNombre[pos];
                for(int a = 0; a < 4; a++){
                    temp3 = matrizFinanzas[i][a];
                    matrizFinanzas[i][a] = matrizFinanzas[pos][a];
                    matrizFinanzas[pos][a] = temp3;
                }
                vectorId[pos] = temp;
                vectorNombre[pos] = temp2;

            }

        }


    }
}
