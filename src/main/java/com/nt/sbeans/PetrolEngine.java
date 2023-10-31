package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngg")
public class PetrolEngine implements Engine {
	

	public PetrolEngine() {

System.out.println("PetrolEngine::O-Param cons");
	}

	public void Start() {

System.out.println("PetrolEngine.Start()");

	}

	public void Stop() {

System.out.println("PetrolEngine.Stop()");

	}

}
