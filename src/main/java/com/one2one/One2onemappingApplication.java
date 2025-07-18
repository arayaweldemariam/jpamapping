package com.one2one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.one2one.service.ServiceApp;

@SpringBootApplication
public class One2onemappingApplication implements CommandLineRunner
{
	@Autowired
	private ServiceApp app;

	public static void main(String[] args) {
		SpringApplication.run(One2onemappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		app.savedata();
	}

}
