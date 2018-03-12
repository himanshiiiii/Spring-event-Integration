package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationEvent;

public class MobileEvent extends ApplicationEvent {

    public MobileEvent(Object source) {
        super(source);
    }
}
