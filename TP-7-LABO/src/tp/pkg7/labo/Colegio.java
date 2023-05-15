/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.pkg7.labo;
import Vistas.Menu;
import tp.pkg7.labo.Materia;
import java.util.HashMap;
import java.util.HashSet;


/**
 *
 * @author Gonza
 */
public class Colegio {

private HashSet<Materia> materiasTotales = new HashSet<Materia>();    
private HashMap<Integer, Alumno> alumnosTotales= new HashMap<Integer,Alumno>();

//   public static void main(String[] args) {
//       Menu m = new Menu();
//       m.setVisible(true);
//  }

    public Colegio() {
       Materia m2 = new Materia(1,"Ingles",1);
       Materia m3 = new Materia(2,"Matematicas",1);
       Materia m4 = new Materia(3,"Laboratorio I",1);
       materiasTotales.add(m2);
       materiasTotales.add(m3);
       materiasTotales.add(m4);
       Alumno a= new Alumno(1001, "Lopez", "Martin");
       Alumno a1= new Alumno(1002, "Martinez", "Brenda");
       alumnosTotales.put(a.getLegajo(), a);
       alumnosTotales.put(a1.getLegajo(), a1);
    }

    public HashSet<Materia> getMateriasTotales() {
        return materiasTotales;
    }

    public void addMateriasTotales(Materia materia) {
        materiasTotales.add(materia);
    }

    public HashMap<Integer, Alumno> getAlumnosTotales() {
        return alumnosTotales;
    }

    public void addAlumnosTotales(Alumno alumno) {
        alumnosTotales.put(alumno.getLegajo(), alumno);
    }
     
}
