package hr.fer.infosus.festivalbackend;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.hibernate.event.spi.PostDeleteEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableProcessApplication
public class FestivalBackendApplication {

    @Autowired
    private RuntimeService runtimeService;
    public static void main(String[] args) {
        SpringApplication.run(FestivalBackendApplication.class, args);
    }

    @EventListener
    private void processPostDeploy(PostDeleteEvent event){
        runtimeService.startProcessInstanceByKey("editEvent");
    }
}
