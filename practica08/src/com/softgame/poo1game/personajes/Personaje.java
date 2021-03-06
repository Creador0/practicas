package com.softgame.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int vida;
	
	public Personaje(String nombre){
		this.vida = 3;
		this.nombre = nombre;
	}
	
	public Personaje(String nombre, int vida){
		this.vida = vida;
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre){
		if(nombre.length() > 3 && nombre.length() < 10){
			this.nombre = nombre;
		}
	}

	public String getNombre(){
		return nombre;
	}

	public void saludar(){
		System.out.println("Hola alumno de POO " + nombre);
	}
		
	public int getVida(){
		return vida;
	}	
	public boolean setVida(int vida){
		if(vida > 0 && vida < 100){
			this.vida = vida;
			return true;
		} else {
			return false;
		}
	}
	public String getDetalle(){
		return (nombre + "\t" + vida);
	}
	
	public void decVida(){
		if(vida != 0){
			vida = vida - 1;
		}
	}
	
	public void decVida(int dec){
		if((vida - dec)>0){
			vida = vida - dec;
		}
	}
}