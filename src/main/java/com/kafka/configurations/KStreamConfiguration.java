package com.kafka.configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KStreamConfiguration {

    @Bean(name = "streamProps")
    Properties prop() throws FileNotFoundException, IOException {
        Properties streamProps = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/streams.properties")) {
            streamProps.load(fis);
        }
        streamProps.put(StreamsConfig.APPLICATION_ID_CONFIG, "basic-streams");
        
        return streamProps;
    }
}
