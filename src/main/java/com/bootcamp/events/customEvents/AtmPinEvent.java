package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationEvent;

public class AtmPinEvent extends ApplicationEvent {

    public AtmPinEvent(Object source) {
        super(source);
    }
}
