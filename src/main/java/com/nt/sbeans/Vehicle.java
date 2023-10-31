package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
@Autowired
@Qualifier("motor")
	private Engine engine;
	
// b.meathod

public void move(String StartPlace, String StopPlace) {
	engine.Start();
	System.out.println("YaTra prarabh From::"+StartPlace);
	System.out.println("NOTE::>YaTriGan Apne saman ki surksha syam karen");
	engine.Stop();
	System.out.println("YaTra Samapat Apki Vartman location Yaha  hai::>"+StopPlace);
}
	
	
	
}
