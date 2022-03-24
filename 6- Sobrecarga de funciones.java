    

            // A simple vista puede parecer que esto es incorrecto ya que las 3 funciones tienen el mismo nombre, pero no.
           //  Al tener distintos parametros, no hay problema. A esto se llama sobrecarga de funciones 

  
    holaMundo();
  
    holaMundo("Ale");

    holaMundo("Ale", "eth");



    private static void holaMundo(){
      System.out.println("Hola Mundo!");
    }

    private static void holaMundo(String nombre){
      System.out.println("Hola " + nombre + "!");
    }

    private static void holaMundo(String nombre, String apellido){
      System.out.println("Hola " + nombre + " " + apellido + "!");
    }





