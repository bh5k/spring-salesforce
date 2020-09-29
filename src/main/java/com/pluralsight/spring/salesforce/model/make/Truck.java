package com.pluralsight.spring.salesforce.model.make;

import com.pluralsight.spring.salesforce.model.part.Engine;
import com.pluralsight.spring.salesforce.model.part.Transmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Truck {

    private Engine engine;
    private Transmission transmission;

    @Autowired
    public Truck (Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
