package app.services;

import app.components.ZoneStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PricingScheduledEngine {

    @Autowired
    private ZoneStatus zoneStatus;

    static final Logger LOGGER =
            Logger.getLogger(PricingScheduledEngine.class.getName());
    private Double price;

    public Double getProductPrice() {
        return price;

    }

    @Scheduled(fixedDelay = 2000)
    public void computePrice() {
        LOGGER.info("host in zone: " + zoneStatus.isHostInZone());

        // added sleep to simulate method
        // which takes longer to execute.
        //Thread.sleep(4000);
    }

}
