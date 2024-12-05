public abstract class Personaje implements Combatiente {

private String nombre;
private int salud;
private int nivel;
private TipoArma arma;


public Personaje(String nombre){

    this.nombre = nombre;
    this.salud = 100;
    this.nivel = 1;
    this.arma = TipoArma.ARCO;

}

public String getNombre(){
    return nombre;
}

}
