package me.hex;

import me.hex.impl.CommandClass;
import me.hex.structure.CooldownManager;
import me.hex.utility.Player;

public class Main {
    
    public static void main(String[] args) {

        CooldownManager cooldownManager = new CooldownManager();

        Player p = new Player();
        CommandClass command = new CommandClass();

        cooldownManager.addCooldown(command, p, 5.00);

        System.out.println(cooldownManager.getCooldownFor(p, command));

        cooldownManager.removeCooldown(command, p, 2.00);

        System.out.println(cooldownManager.getCooldownFor(p, command));

    }
}
