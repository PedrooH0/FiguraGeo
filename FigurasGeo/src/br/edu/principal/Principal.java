package br.edu.principal;

import br.edu.figurasgeo.Triangulo;

public class Principal {

	public static void main(String[] args) {
		
		Triangulo obj = new Triangulo();
		obj.altura = 5;
		obj.base = 3;
		obj.area = 7.5;
		System.out.println("A área do objeto é: " + obj.area);

	}

}
