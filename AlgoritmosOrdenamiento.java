/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatosavanzadas;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author benjagoni
 */
public class AlgoritmosOrdenamiento <T> {
    
    int comp;
    
    public AlgoritmosOrdenamiento() {
        this.comp = 0;
    }
    
    public static <T extends Comparable<T>> void seleccionDirecta(T[] datos) { //selectionSort
        int i;
        int j;
        int min;
        T aux;
        
        for(i=0; i < datos.length; i++) {
            min = i;
            for(j = i; j < datos.length;j++) {
                if(datos[j].compareTo(datos[min]) < 0) {
                    min = j;
                }                
            }
            
            aux = datos[i];
            datos[i] = datos[min];
            datos[min] = aux;
        }
    }
    
    public static <T extends Comparable<T>> void seleccionDirecta(ArrayList <T> datos) { //selectionSort
        int i;
        int j;
        int min;
        T aux;
        
        for(i=0; i < datos.size()+1; i++) {
            min = i;
            for(j = i; j < datos.size()+1;j++) {
                if(datos.get(j).compareTo(datos.get(min)) < 0) {
                    min = j;
                }                
            }
            
            aux = datos.get(i);
            datos.set(i, datos.get(min));
            datos.set(min, aux);
        }
    }
    
    public <T extends Comparable <T>> void selectionSortReplit(T[] datos){
        int indice;
        for(int i=0; i<datos.length;i++){
            indice=i;
            T min=datos[i];
            for(int j=i+1;j<datos.length;j++){
                if(datos[j].compareTo(min)<0){
                min=datos[j];
                indice=j;
                }
            }
            datos[indice]=datos[i];
            datos[i]=min;
        }
    }
    
     public <T extends Comparable <T>> void selectionSortReplit(ArrayList<T> datos){
        int indice;
        for(int i=0; i<datos.size();i++){
            indice=i;
            T min=datos.get(i);
            for(int j=i+1;j<datos.size();j++){
                if(datos.get(j).compareTo(min)<0){
                min=datos.get(j);
                indice=j;
                }
            }
            datos.set(indice, datos.get(i));
            datos.set(i, min);
        }
    }
    
    
//    public static <T extends Comparable <T>> void selectionSortReplit(T[] datos){
//        int indice;
//        int i;
//        for(i=0; i<datos.length;i++){
//            indice=i;
//            T min=datos[i];
//            for(int j=i+1;j<datos.length;j++){
//                if(datos[j].compareTo(min)<0){
//                min=datos[j];
//                indice=j;
//                }
//            }
//            datos[indice]=datos[i];
//            datos[i]=min;
//        }
//    }
    
    public <T extends Comparable<T>> void seleccionDirectaNComparaciones(ArrayList <T> datos) { //selectionSort
        int i;
        int j;
        int min;
        T aux;
        
        for(i=0; i < datos.size()+1; i++) {
            min = i;
            for(j = i; j < datos.size()+1;j++) {
                if(datos.get(j).compareTo(datos.get(min)) < 0) {
                    min = j;
                }
                comp++;
            }
            
            aux = datos.get(i);
            datos.set(i, datos.get(min));
            datos.set(min, aux);
        }
    }
    
    
    public static <T> String imprimeArreglo(T[] datos) {
        int i;
        StringBuilder cad = new StringBuilder();
        
        for(i = 0; i < datos.length; i++) {
            cad.append(datos[i]).append(" ");//volver a probar para ver si esta linea es equivalente a cad.append(datos[i] + " ");
        }
        
        return cad.toString();
    }
    
    public static <T> String imprimeArrayList(ArrayList<T> datos) {
        int i;
        StringBuilder cad = new StringBuilder();
        
        for(i = 0; i < datos.size(); i++) {
            cad.append(datos.get(i)).append(" ");//volver a probar para ver si esta linea es equivalente a cad.append(datos[i] + " ");
        }
        
        return cad.toString();
    }
    
    public static <T extends Comparable <T>> void insercionDirecta(T[] datos) { //insertion sort
        int i;
        int j;
        T aux;
        
        for(i = 0; i <datos.length; i++) {
            for(j = 0; j <= i; j++) {
                if(datos[i].compareTo(datos[j]) < 0) {
                    aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] = aux;
                    
                }
            }
        }
    }
    
    public static <T extends Comparable <T>> void insercionDirecta(ArrayList<T> datos) { //insertion sort
        int i;
        int j;
        T aux;
        
        for(i = 0; i <datos.size()+1; i++) { // se cambio limite del for entonces podria ser posible error en prueba 
            for(j = 0; j <= i; j++) {
                if(datos.get(i).compareTo(datos.get(j)) < 0) {
                    aux = datos.get(i);
                    datos.set(i, datos.get(j));
                    datos.set(j, aux);
                }
            }
        }
    }
    
        public <T extends Comparable <T>> void insercionDirectaNComparaciones(ArrayList<T> datos) { //insertion sort
        int i;
        int j;
        T aux;
        
        for(i = 0; i <datos.size()+1; i++) { // se cambio limite del for entonces podria ser posible error en prueba 
            for(j = 0; j <= i; j++) {
                if(datos.get(i).compareTo(datos.get(j)) < 0) {
                    aux = datos.get(i);
                    datos.set(i, datos.get(j));
                    datos.set(j, aux);
                }
                
                comp++;
            }
        }
    }
    
    
    
    public static <T extends Comparable <T>>void bubbleSort(T[] datos) {
        int i;
        int j;
        T aux;
        for(i = datos.length-1; i > 0; i--) {
            for(j = 1; j < i; j++) {
                if(datos[j].compareTo(datos[j+1]) > 0) {
                    aux = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = aux;
                }
            }
        }
    }
    
    public static <T extends Comparable <T>> void bubbleSort(ArrayList<T> datos) {
        int i;
        int j;
        T aux;
        for(i = datos.size(); i > 0; i--) {
            for(j = 1; j < i; j++) {
                if(datos.get(j).compareTo(datos.get(j+1)) > 0) {
                    aux = datos.get(j);
                    datos.set(j, datos.get(j+1));
                    datos.set(j+1, aux);
                }
            }
        }
    }
    
    
    public <T extends Comparable <T>> void bubbleSortNComparaciones(ArrayList<T> datos) {
        int i;
        int j;
        T aux;
        
        for(i = datos.size(); i > 0; i--) {
            for(j = 1; j < i; j++) {
                if(datos.get(j).compareTo(datos.get(j+1)) > 0) {
                    aux = datos.get(j);
                    datos.set(j, datos.get(j+1));
                    datos.set(j+1, aux);
                }
                
                comp = comp + 1;
            }
        }
    }
    
    public static <T extends Comparable <T>> void quickSort(T[] datos) {

        quickSort(datos, 0, datos.length - 1);
    }
    
    private static <T extends Comparable <T>> void quickSort(T[] datos, int min, int max) {
        if(min >= max) {
            return;
        }
        
        int pos;
        pos = partiendo(datos, min, max);
        
        quickSort(datos, min, pos-1);
        quickSort(datos, pos + 1, max);
        
    }
    
    public static <T extends Comparable <T>> void quickSort(ArrayList<T> datos) {

        quickSort(datos, 0, datos.size()-1);
    }
    
    private static <T extends Comparable <T>> void quickSort(ArrayList<T> datos, int min, int max) {
        if(min >= max) {
            return;
        }
        
        int pos;
        pos = partiendo(datos, min, max);
        
        quickSort(datos, min, pos-1);
        quickSort(datos, pos + 1, max);
        
    }
    
    public <T extends Comparable <T>> void quickSortNComparaciones(ArrayList<Pelicula> datos) {

        quickSortNComparaciones(datos, 0, datos.size());
    }
    
    private <T extends Comparable <T>> void quickSortNComparaciones(ArrayList<Pelicula> datos, int min, int max) {
        if(min >= max) {
            return;
        }
        
        int pos;
        pos = partiendoNComparaciones(datos, min, max);
        
        quickSortNComparaciones(datos, min, pos-1);
        quickSortNComparaciones(datos, pos + 1, max);
    }
    
    public static <T extends Comparable <T>> int partiendo(T[] datos, int min, int max) {
        int pos = min;
        int i = max;
        T aux;
        
        while(pos != i) {
            if(datos[pos].compareTo(datos[pos+1]) >= 0) { // revisar caso para que no se salga de arreglo o evaluar si i detiene que se salga de cualquier manera
                aux = datos[pos];
                datos[pos] = datos[pos + 1];
                datos[pos +  1] = aux;
                pos = pos + 1;     
            } else {
                aux = datos[i];
                datos[i] = datos[pos + 1];
                datos[pos + 1] = aux;
                i--;
            }
        }
        
        return pos;
    }
    
    public static <T extends Comparable <T>> int partiendo(ArrayList <T> datos, int min, int max) {
        int pos = min;
        int i = max;
        T aux;
        
        while(pos != i) {
            if(datos.get(pos).compareTo(datos.get(pos+1)) >= 0) { // revisar caso para que no se salga de arreglo o evaluar si i detiene que se salga de cualquier manera
                aux = datos.get(pos);
                datos.set(pos, datos.get(pos+1));
                datos.set(pos+1, aux);
                pos = pos + 1;     
            } else {
                aux = datos.get(i);
                datos.set(i, datos.get(pos+1));
                datos.set(pos+1, aux);
                i--;
            }
        }
        
        return pos;
    }
    
    public <T extends Comparable <T>> int partiendoNComparaciones(ArrayList <Pelicula> datos, int min, int max) {
        int pos = min;
        int i = max;
        Pelicula aux;
        
        while(pos != i-2) { // cambie de (pos != i) a (pos != i -1) por out of bounds
            if(datos.get(pos).compareTo(datos.get(pos+1)) >= 0) { // revisar caso para que no se salga de arreglo o evaluar si i detiene que se salga de cualquier manera
                aux = datos.get(pos);
                datos.set(pos, datos.get(pos+1));
                datos.set(pos+1, aux);
                pos = pos + 1;     
            } else {
                aux = datos.get(i);
                datos.set(i, datos.get(pos+1));
                datos.set(pos+1, aux);
                i--;
            }
            
            comp = comp + 1;
        }
        
        return pos;
    }
    
    private <T extends Comparable <T>> void mergeSort(T[] datos,int min,int max){


    if(min>=max) {
        return;
    }
        
    int pivote=(min+max)/2;

    mergeSort(datos,min,pivote);
    mergeSort(datos,pivote+1,max);
    //mezcla la rebanada que va de min a pivote con
    //la rebanada d pivote+1 a max
    mezcla(datos,min,pivote,pivote+1,max);
   }
    
    
   public <T extends Comparable <T>> void mergeSort(T[] datos){
     mergeSort(datos,0,datos.length-1);
   }
   
    private <T extends Comparable <T>> void mezcla(T[] datos,int inicioA,int finA,int inicioB,int finB){// A y B son las rebanadas de datos

      T[] temp=(T[])new Comparable[finB-inicioA+1];
      int der=inicioB, izq=inicioA;
      
      for(int i =0;i<temp.length;i++){
          if(der<=finB)
            if(izq<=finA){
              if(datos[izq].compareTo(datos[der])<0) 
                  temp[i]=datos[izq++];
              else
                  temp[i]=datos[der++];
            }else//izq<finA
              temp[i]=datos[der++];

          else//der<finB
            temp[i]=datos[izq++];

      }
      for(int i =0;i<temp.length;i++)
        datos[inicioA+i]=temp[i];

   }//mezcla
    
    public static <T extends Comparable <T>> T[] desordena(T[] datos) {
        int i;
        T aux;
        int posRand;
        
        Random rand = new Random();
        for(i = datos.length -1; i > 0; i--) {
            posRand = rand.nextInt(i + 1);
            aux = datos[i];
            datos[i] = datos[posRand];
            datos[posRand] = aux;
        }
        
        return datos;
    }
    
    public ArrayList <T> desordena(ArrayList <T> datos) {
        int i;
        T aux;
        int posRand;
        
        Random rand = new Random();
        for(i = datos.size(); i < 0; i--) {
            posRand = rand.nextInt(i + 1);
            aux = datos.get(i);
            datos.set(i, datos.get(posRand));
            datos.set(posRand, aux);
        }
        
        return datos;
    }  
    
    public static void main(String[] args) {
        AlgoritmosOrdenamiento alg = new AlgoritmosOrdenamiento();
        ArrayList<Integer> arraylist = new ArrayList();
        
        imprimeArrayList(arraylist);
        
        
        arraylist.add(7);
        arraylist.add(2);
        arraylist.add(8);
        arraylist.add(60);
        arraylist.add(-3);
        arraylist.add(8);
        
        alg.quickSort(arraylist);
        
        System.out.println(imprimeArrayList(arraylist) + "\n");
    }
}
