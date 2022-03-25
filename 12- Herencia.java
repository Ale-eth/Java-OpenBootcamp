


        // La herencia permite tomar una clase como molde, y agregarle mas propiedades.
        //    Ej: Clase AUTO            (modelo, color)
        //        Clase AUTO ELECTRICO  (modelo, color, tipo de motor)
        //        Clase AUTO HIBRIDO    (modelo, color, tipo de motor, tipo de combustible)


                public class Auto {                             // Clase original

                  // Atributos
                  String marca;
                  String color;
                  String patente;
                  Double peso_kg;
                  Integer velocidad = 0;


                  // Metodos constructores        // Constructor de auto normal
                  public Auto(String marca, String color, String patente, Double peso_kg){
                    this.marca = marca;              
                    this.color = color;
                    this.patente = patente;
                    this.peso_kg = peso_kg:
                  }

                  // Metodos de comportamiento
                  public void acelerar(Integer cantidad){
                    this.velocidad += cantidad;
                    }
                  }





                  // Constructor de auto electrico
                  public class AutoElectrico extends Auto{                    // Extends hace referencia a que va a heredar los atributos y metodos 
                                                                              // de la clase en este caso Auto
                          String motorElectrico;    // Atributo nuevo
                        
                          public AutoElectrico(String motorElectrico){
                            this.motorElectrico = motorElectrico;}
                    
                          }              


                  
         













