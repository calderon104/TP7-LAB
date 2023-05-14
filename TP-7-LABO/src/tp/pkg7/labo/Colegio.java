/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.pkg7.labo;

import java.util.HashMap;
import java.util.HashSet;


/**
 *
 * @author Gonza
 */
public class Colegio {

private HashSet<Materia> materiasTotales;    
private HashMap<Integer, Alumno> alumnosTotales;

    public static void main(String[] args) {
        Materia m = new Materia(1,"Ingles",1);
        
    }
    
    public HashSet<Materia> getMateriasTotales(){
        return materiasTotales;
    }
    
    public void setMateriasTotales(Materia m){
        materiasTotales.add(m);
    }
    
    public HashMap<Integer, Alumno> getAlumnosTotales(){
        return alumnosTotales;
    }
    
    public void setAlumnosTotales(Alumno a){
        alumnosTotales.put(a.getLegajo(), a);
    }
    
}
