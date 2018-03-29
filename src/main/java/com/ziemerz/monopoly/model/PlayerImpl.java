package com.ziemerz.monopoly.model;

import org.springframework.stereotype.Component;

@Component
public class PlayerImpl implements Player {
    @Override
    public void takeTurn() {
        System.out.println("Took turn");
    }
}
