package com.kvetter.monopoly.model;

public interface Piece {
    int getLocation();
    void setLocation(int newLocation);
    Player getPlayer();
    void addPlayer(Player player);
}
