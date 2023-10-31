package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public class Electric implements Engine {

	public Electric() {
System.out.println("Electric.::O-param cons");
	}

	public void Start() {

System.out.println("Electric.Start()");
	}

	public void Stop() {
	System.out.println("Electric.Stop()");

	}

}
