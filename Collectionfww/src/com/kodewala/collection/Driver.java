package com.kodewala.collection;
//ArrayList store duplicate data
//maintain insertion order
// allow multiple null

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> state = new ArrayList<>();
		state.add("karnataka");

		state.add("delhi");
		state.add("mp");
		state.add("hariyana");
		state.add("up");
		state.add("hp");
		state.add("CG");
		state.add("TN");
		state.add("BIHAR");
		state.add("GUJRAT");
		state.add("RAJSTAN");
		state.add("PUNJAB");

		System.out.println(state);
	}

}
