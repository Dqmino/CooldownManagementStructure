package me.hex.impl;

import me.hex.utility.Player;
import me.hex.structure.Cooldownable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CommandClass implements Cooldownable<Player> {

    private final Map<Player, Double> cooldowns = new HashMap<>();

    public void onCommand(){
        /*
         * Stuff for your logic
         */
    }


    @Override
    public Map<Player, Double> getCooldowns() {
        return cooldowns;
    }

}
