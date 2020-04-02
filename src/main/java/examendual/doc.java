package examendual;
/**
 * Write a description of class doc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface doc
{
   
   // Devuelve el contenido del archivo tras insertar la linea line en la linea numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
    /**
     * Función que devuelve el contenido del archivo tras insertar una línea llamada 
     * line en la línea número x, el cual se lo hemos pasado,  el contenido de 
     * la linea x, pasa a ser la línea x+1 y asi sucesivamente.
     * @param x Número de la linea en la que se va a insertar el contenido.
     * @param line Linea cuyo contenido va a ser el que se va a insertar.
     * @param file Archivo en el que se va a insertar la línea.
     * @return devuelve el String con el contenido del fichero.
     */
   public abstract String escribirLinea(int x, String line, String file);
   
   
}