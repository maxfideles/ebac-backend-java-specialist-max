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

    public void escrever(String texto);

    public String getCor();
}
