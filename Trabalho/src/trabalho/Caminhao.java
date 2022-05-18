/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author Muniunga
 */
public class Caminhao {

    private String marca;
    private String modelo;
    private float valor;
    private String cliente;

    public Caminhao(String marca, String modelo, float valor, String cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.cliente = cliente;
    }

    Caminhao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }

}
