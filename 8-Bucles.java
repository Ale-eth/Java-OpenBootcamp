

    // FOR

    for (int=0; i <= 10; i++){            // For de 10 vueltas
      System.out.println( i );
    }



    // WHILE

    int contador = 0;     

    while(contador < 10){                 // While de 10 vueltas
      System.out.println(contador);
      contador++;
    }




          // CONTINUE y BREAK


                // Continue
                int contador = 0;     

                while(contador < 10){                             // En este ejemplo de continue, si el contador llega a la vuelta 5 no ejecutara 
                  System.out.println(contador);                   // el resto del bucle, sino que pasara a la siguiente vuelta.
                      
                    if (contador == 5){
                        continue;
                    }
                  
                   System.out.println("Numero de vuelta: " +contador);    // Este print no se va a ver
                }



                // Break
                int contador = 0;     

                while(contador < 10){                            // A diferencia de continue, cuando el contador llegue a 5 rompera el bucle.
                  System.out.println(contador);                  
                      
                    if (contador == 5){
                        break;
                    }
                  
                   System.out.println("Numero de vuelta: " +contador);    // Este print no se va a ver
                }








