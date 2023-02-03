package lk.ijse.dep9.app;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppInitializer {
    public static void main(String[] args) {
        SpringApplication.run(AppInitializer.class);
    }

    public AppInitializer() {
        System.out.println("appinitializer");
    }
    @Bean
    public ModelMapper modelMapper(){return new ModelMapper();}
}
