package app.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ZoneStatus {
    public boolean hostInZone;

    public boolean isHostInZone() {
        return hostInZone;
    }

    public void setHostInZone(boolean hostInZone) {
        this.hostInZone = hostInZone;
    }
}
