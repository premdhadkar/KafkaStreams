package com.kafka;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaStreamsApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("streamProps")
	Properties propertes;
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		propertes.forEach((e,r) -> System.out.println(e+"    "+r));
	}

}
