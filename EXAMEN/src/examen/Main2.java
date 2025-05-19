package examen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        String ruta = "C:\\temp\\vehicles.csv";
        Set<Vehicle> vehicles = new HashSet<>();
        
        try(BufferedReader lector = new BufferedReader(new FileReader(ruta))){
            
           String linea;
           while((linea = lector.readLine()) != null){
            
               String[] partes = linea.split(",");
               
                   String matricula = partes[1];
                   String marca = partes[2];
                   String model = partes[3];
                   int any = Integer.parseInt(partes[4]);
                   double preu = Integer.parseInt(partes[5]);
                   
           }
                    
            
        }catch(FileNotFoundException f){
            f.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        //numero total coches mayor 15000
        List<Vehicle> resultado = vehicles.stream()
                        .filter((v -> v.getPreu() > 15000))
                        .collect(Collectors.toList());
        
            int contador = (int) resultado.stream().count();
            System.out.println("Vehiculos con precio mayor a 15.000¤: " + contador);
        
        
        //precio medio
        //double media = vehicles.stream().map(v->v.getPreu()).mapToInt(e->e).average().orElse(0);
        //System.out.println("Precio medio " + media);
        //vehiculo mas caro y mas barato
        //int masC = vehicles.stream().map(p->p.getPreu()).mapToInt(e->e).max().orElse(0);
        //int masB = vehicles.stream().map(p->p.getPreu()).mapToInt(e->e).min().orElse(0);
        
        //System.out.println("Coche mas caro " + masC);
        //System.out.println("Coche mas barato " + masB);
        }
        
       
    }
//}

