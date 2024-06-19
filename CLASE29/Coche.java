/**
 * Coche
 */

public class Coche {

// Atributos de la clase tienen modificador private

    private String marca;
    private String modelo;
    private String color;

// Metodo Constructor !
public Coche(String marca, String modelo, String color){
    this.marca = marca;
    this.modelo = modelo;
    this.color = color; 
}

// Metodos getters y setters (traen y cambian informacion)

public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca = marca;
}

public String getModelo(){
    return modelo;
}
public void setModelo(String modelo){
    this.modelo = modelo;
}
public String getColor(){
    return color;
}
public void setColor(String color){
    this.color = color;
}

public void mostrarInfo(){
    System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color);
}

}

