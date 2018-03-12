package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationEvent;

public class EmployeeEvent extends ApplicationEvent {

    public EmployeeEvent(Object source) {
        super(source);
    }
}
