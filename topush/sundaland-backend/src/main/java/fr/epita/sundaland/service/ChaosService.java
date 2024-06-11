package fr.epita.sundaland.service;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.Random;

@ApplicationScoped
public class ChaosService {
    @Inject Logger logger;

    @Scheduled(every = "10s", delayed = "1m")
    public void randomCrash() {
        logger.info("Playing russian roulette...");
        final var random = new Random();
        final var roulette = random.nextInt(10);
        if (roulette == 0) {
            logger.fatal("Russian roulette was fatal!!!!");
            System.exit(1);
        }
        logger.info("Russian roulette, not this time");
    }
}
