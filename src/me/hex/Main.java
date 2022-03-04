package me.hex;

import me.hex.impl.CommandClass;
import me.hex.structure.CooldownManager;
import me.hex.utility.Player;

public class Main {

    public static void main(String[] args) {

        Player p = new Player();
        CommandClass command = new CommandClass();

        command.addCooldown(p, 5.00);

        System.out.println(CooldownManager.getCooldownFor(p, command));

    }
}
