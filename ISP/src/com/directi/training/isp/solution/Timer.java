package com.directi.training.isp.solution;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final ITimeout timeout_device)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timeout_device.timeOutCallback();
            }
        }, timeOut);
    }
}
