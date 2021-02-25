package com.grubtech.mars;

import com.grubtech.mars.config.Configuration;
import com.grubtech.mars.controller.MarsRoverController;
import com.grubtech.mars.controller.RoverController;

public abstract class BootstrapMarsRoverController implements AppBootstrap {

    Configuration configuration;

    public BootstrapMarsRoverController() {
        this.configuration = getConfiguration();
        boot();
    }

    @Override
    public RoverController boot(){
        config(configuration);
        return new MarsRoverController(this.configuration);
    }

    public Configuration getConfiguration() {
        return new Configuration();
    }

    public abstract void config(Configuration configuration);






}
