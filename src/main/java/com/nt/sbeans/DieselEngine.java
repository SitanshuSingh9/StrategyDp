package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngg")
public class DieselEngine implements Engine {

	public DieselEngine() {

System.out.println("DieselEngine::O-param cons");
	}

	public void Start() {

System.out.println("DieselEngine.Start()");

	}

	public void Stop() {

System.out.println("DieselEngine.Stop()");
	}

}
