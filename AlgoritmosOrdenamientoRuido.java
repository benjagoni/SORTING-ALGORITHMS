/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatosavanzadas;

import static estructurasdedatosavanzadas.AlgoritmosOrdenamiento.partiendo;
import static estructurasdedatosavanzadas.EvaluacionOrdenamientoRuido.compareToRuido;
import java.util.ArrayList;

/**
 *
 * @author benjagoni
 */
public class AlgoritmosOrdenamientoRuido {
    
    public EvaluacionOrdenamientoRuido test;
    
    public AlgoritmosOrdenamientoRuido() {
        
    }
    
    public void seleccionDirectaRuido(ArrayList <Integer> datos, int ruidoCada) { //selectionSort con ruido 
        int i;
        int j;
        int min;
        int aux;
        
        for(i=0; i < datos.size(); i++) {//limites de fors cambiados
            min = i;
            for(j = i; j < datos.size();j++) {
                if(test.compareToRuido(datos.get(j), datos.get(min), ruidoCada) < 0) {
                    min = j;
                }                
            }
            
            aux = datos.get(i);
            datos.set(i, datos.get(min));
            datos.set(min, aux);
            
        }
    }
    
    public <T extends Comparable <T>> void selectionSortReplitRuido(ArrayList<Integer> datos, int ruidoCada){
        int indice;
        for(int i=0; i<datos.size();i++){
            indice=i;
            int min=datos.get(i);
            for(int j=i+1;j<datos.size();j++){
                if(compareToRuido(datos.get(j), min,ruidoCada)<0){
                    min=datos.get(j);
                    indice=j;
                }
            }
            datos.set(indice, datos.get(i));
            datos.set(i, min);
        }
    }
        
    public void insercionDirectaRuido(ArrayList<Integer> datos, int ruidoCada) { //insertion sort
        int i;
        int j;
        int aux;
        
        for(i = 0; i <datos.size(); i++) { // se cambio limite del for entonces podria ser posible error en prueba 
            for(j = 0; j <= i; j++) {
                if(test.compareToRuido(datos.get(i), datos.get(j), ruidoCada) < 0) {
                    aux = datos.get(i);
                    datos.set(i, datos.get(j));
                    datos.set(j, aux);
                }
            }
        }
    }
    
    public void bubbleSortRudio(ArrayList<Integer> datos, int ruidoCada) {
        int i;
        int j;
        int aux;
        for(i = datos.size(); i + 1> 0; i--) {
            for(j = 1; j < i; j++) {
                if(compareToRuido(datos.get(j), datos.get(j+1), ruidoCada) > 0) {
                    aux = datos.get(j);
                    datos.set(j, datos.get(j+1));
                    datos.set(j+1, aux);
                }
            }
        }
    }
    
    public void bubbleSortReplitRuido(ArrayList<Integer> datos, int ruidoCada) {
        int n = datos.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (compareToRuido(datos.get(j), datos.get(j+1), ruidoCada) > 0)
                {
                    // swap arr[j+1] and arr[j]
                    int aux = datos.get(j);
                    datos.set(j, datos.get(j+1));
                    datos.set(j+1, aux);
                }
    }
    
    public static int partiendoRuido(ArrayList <Integer> datos, int min, int max, int ruidoCada) {
        int pos = min;
        int i = max;
        int aux;
        
        while(pos != i) {
            if(compareToRuido(datos.get(pos), datos.get(pos+1), ruidoCada) >= 0) { // revisar caso para que no se salga de arreglo o evaluar si i detiene que se salga de cualquier manera
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
    
    public void quickSortRuido(ArrayList<Integer> datos, int ruidoCada) {

        quickSortRuido(datos, 0, datos.size() - 1, ruidoCada);
    }
    
    private void quickSortRuido(ArrayList<Integer> datos, int min, int max, int ruidoCada) {
        if(min >= max) {
            return;
        }
        
        int pos;
        pos = partiendoRuido(datos, min, max, ruidoCada);
        
        quickSortRuido(datos, min, pos-1, ruidoCada);
        quickSortRuido(datos, pos + 1, max, ruidoCada);
        
    }
    
    private void mergeSortRuido(ArrayList<Integer> datos,int min,int max, int ruidoCada){


    if(min>=max) {
        return;
    }
        
    int pivote=(min+max)/2;

    mergeSortRuido(datos,min,pivote, ruidoCada);
    mergeSortRuido(datos, pivote+1, max, ruidoCada);
    mezclaRuido(datos, min, pivote, pivote+1, max, ruidoCada);
   }
    
    
   public <T extends Comparable <T>> void mergeSortRuido(ArrayList<Integer> datos, int ruidoCada){
        mergeSortRuido(datos,0,datos.size()-1, ruidoCada);
   }
   
    private void mezclaRuido(ArrayList <Integer> datos,int inicioA,int finA,int inicioB,int finB, int ruidoCada){// A y B son las rebanadas de datos

      int[] temp=new int[finB-inicioA+1];
      int der=inicioB, izq=inicioA;
      
      for(int i =0;i<temp.length;i++){
          if(der<=finB)
            if(izq<=finA){
              if(compareToRuido(datos.get(izq), datos.get(der), ruidoCada)<0) 
                  temp[i]=datos.get(izq++);
              else
                  temp[i]=datos.get(der++);
            }else//izq<finA
              temp[i]=datos.get(der++);

          else//der<finB
            temp[i]=datos.get(izq++);

      }
      for(int i =0;i<temp.length;i++)
        datos.set(inicioA+i, temp[i]);

   }//mezcla
    
}
