package run.mymuse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Boot application launcher class
 */
@SpringBootApplication
public class Boot {
    private static final Logger LOGGER = LoggerFactory.getLogger(Boot.class);

    public static void main(String ... args) {
        LOGGER.debug("Starting server...");

        SpringApplication.run(Boot.class, args);
    }
}
