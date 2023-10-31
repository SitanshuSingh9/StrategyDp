package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj02StrategyDpApplication {

	public static void main(String[] args) {
		//get the ioc container
		
		ApplicationContext ctx= SpringApplication.run(BootProj02StrategyDpApplication.class, args);

	//get the Target class SPring bean obj ref
		
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		
		//invoke the b method
		
		vehicle.move("Chandauli"," Shri Kashi Vishwnath(vns)");
		
		((ConfigurableApplicationContext)ctx).close();
	
	
	}

}
