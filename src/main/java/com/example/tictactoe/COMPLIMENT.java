package com.example.tictactoe;

import java.util.HashMap;
import java.util.Map;

public class COMPLIMENT {

	private static Map<String, String> compliment;

	static {

		compliment = new HashMap<String, String>(6);
		compliment.put("dark_cell", "light_cell");
		compliment.put("light_cell", "dark_cell");
		compliment.put("dark_cross", "light_cross");
		compliment.put("light_cross", "dark_cross");
		compliment.put("dark_zero", "light_zero");
		compliment.put("light_zero", "dark_zero");
	}

	public static String getConjugate(String key) {
		return compliment.get(key);
	}
}
