package me.hex.structure;

import me.hex.structure.Cooldownable;

import java.util.Optional;

public class CooldownManager {

    public static double getCooldownFor(Object obj, Cooldownable<?> t){
        Optional<Double> optional = Optional.of(t.getCooldowns().get(obj));
        return optional.orElse(0.00);
    }
}
