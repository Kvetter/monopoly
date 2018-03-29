package com.ziemerz.monopoly;

import com.ziemerz.monopoly.model.Piece;
import com.ziemerz.monopoly.model.Player;

public class PieceStub implements Piece {
    private Player player;
    private int location;

    @Override
    public int getLocation() {
        return location;
    }

    @Override
    public void setLocation(int newLocation) {
        this.location = newLocation;
    }

    @Override
    public Player getPlayer() {
        return this.player;
    }

    @Override
    public void addPlayer(Player player) {
        this.player = player;
    }
}
