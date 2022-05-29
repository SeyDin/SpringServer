package app.services;

import app.components.ZoneStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.logging.Logger;

@Service
public class CheckPhonesInWIFIRangeEngine {

    @Autowired
    private ZoneStatus zoneStatus;

    static final Logger LOGGER =
            Logger.getLogger(PricingScheduledEngine.class.getName());

    @Scheduled(fixedDelay = 2000)
    public void checkPhone() throws IOException {
        String host = "192.168.1.114";
        int timeOut = 2000;
        boolean temp = InetAddress.getByName(host).isReachable(timeOut);
        zoneStatus.setHostInZone(temp);
    }
}
