package com.pluralsight.spring.salesforce.model.make;

import com.pluralsight.spring.salesforce.model.part.Engine;
import com.pluralsight.spring.salesforce.model.part.Transmission;
import org.springframework.stereotype.Component;

@Component
public class Van {

    private Engine engine;

    private Transmission transmission;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
