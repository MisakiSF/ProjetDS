package sid.org.clientservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sid.org.clientservice.Entity.Client;
import sid.org.clientservice.Repositorys.ClientRepostorys;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientRepostorys c){
        return args -> {
            Client cl1=new Client(null,"safae","safae@glsid.com");
            Client cl2=new Client(null,"nizar","nizar@gmail.com");
            c.save(cl1);
            c.save(cl2);
        };
    }
}
