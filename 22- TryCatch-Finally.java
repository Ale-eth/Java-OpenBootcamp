



    // TryCatch nos permite poner a prueba una sentencia de codigo que es propensa a fallar, evita que el programa colapse
    // Y va a seguir funcionando sin esa excepcion
    
    try{                                          // Try ejecutara el codigo
      int resultado = 5 / 0;
      } catch (Exception error){                  // Catch va a capturar el error
          error.printStackTrace();                //  printStackTrace() imprime el tipo de error
        } finally{                                // Finally se usa para dar un fin a ese trycatch, por lo general se usa para cerrar conexiones
            System.out.println("Fin trycatch");   // de bases de datos etc...
            }

    System.out.println("Sigue el programa");
