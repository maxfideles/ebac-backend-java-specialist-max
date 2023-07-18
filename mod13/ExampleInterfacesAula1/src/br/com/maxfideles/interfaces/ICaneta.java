package br.com.maxfideles.interfaces;

/**
 * Defining the methods that must be implemented by the class
 * the use this interface<br>
 * There are two methods:<br>
 * - void escrever (String)<br>
 * - String getCor()
 *
 * @author maxfideles
 */
public interface ICaneta {

    /**
     *
     * @param texto Text to be added to be printed on the console
     */
    public void escrever(String texto);

    /**
     *
     * @return The color defined in the class
     */

    public String getCor();
}
