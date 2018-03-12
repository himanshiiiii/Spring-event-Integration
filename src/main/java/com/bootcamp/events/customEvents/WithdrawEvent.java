package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationEvent;

public class WithdrawEvent extends ApplicationEvent {

    public WithdrawEvent(Object source) {
        super(source);
    }
}
