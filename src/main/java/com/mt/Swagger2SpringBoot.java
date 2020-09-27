package com.mt;

import com.mt.service.InitializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories
@ComponentScan(
    basePackages = {
        "com.mt",
        "com.mt.api",
        "com.mt.configuration",
        "com.mt.model",
        "com.mt.repository"
    })
public class Swagger2SpringBoot implements CommandLineRunner {
  
  @Autowired
  InitializationService initializationService;
  
  public static void main(String[] args) {
    new SpringApplication(Swagger2SpringBoot.class).run(args);
  }
  
  @Override
  public void run(String... arg0) {
    if (arg0.length > 0 && arg0[0].equals("exitcode")) {
      throw new ExitException();
    }
    initializationService.importCsvIntoDatabase();
  }
  
  static class ExitException extends RuntimeException implements ExitCodeGenerator {
    private static final long serialVersionUID = 1L;
    
    @Override
    public int getExitCode() {
      return 10;
    }
  }
}
