package com.deitel.exercicios.Capitulo16.Cap16_15;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Choice {
	
	private Map<String, Color> map = new HashMap<>();
	private Color color;
	
	public Choice() {
		map.put("preto", Color.BLACK);
		map.put("branco", Color.WHITE);
		map.put("azul", Color.BLUE);
		map.put("vermelho", Color.RED);
		map.put("verde", Color.GREEN);
		map.put("cinza", Color.GRAY);
	}

	public Color getColor() {
		return color;
	}
	
	public void setColor(String color) {
		if(map.containsKey(color)) {
			this.color = map.get(color);
		}
		else {
			System.out.println("Cor não cadastrada!");
		}
	}
}
