package moe.everything.scribe.archiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("moe.everything")
public class ScribeArchiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScribeArchiverApplication.class, args);
	}

}
