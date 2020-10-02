package com.tracer.core;


public class Core {
	
	public static void main(String ...strings) {
		Cores[] cores = {new HernanCore(), new RyanCore()};
		for(Cores i : cores) i.Launch();
		System.out.println("Fin");
	}

}
