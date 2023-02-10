package com.directi.training.isp.solution;

import java.util.Random;

public class Sensor
{
    public void register(IProximity proximity_device)
    {
        while (true) {
            if (isPersonClose()) {
                proximity_device.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
