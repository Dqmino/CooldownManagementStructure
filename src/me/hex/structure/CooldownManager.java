package me.hex.structure;

import me.hex.structure.Cooldownable;
import me.hex.utility.Player;

import java.util.Objects;
import java.util.Optional;

public class CooldownManager {

    public <T> double getCooldownFor(T obj, Cooldownable<T> t){
        Optional<Double> optional = Optional.ofNullable(t.getCooldowns().get(obj));
        return optional.orElse(0.00);
    }


    public <T> boolean removeCooldown(Cooldownable<T> cooldownable, T object, Double d) {
        return Objects.equals(cooldownable.getCooldowns()
                .computeIfPresent(object, (k, v) -> cooldownable.getCooldowns()
                        .put(object, getCooldownFor(object, cooldownable))), d);
    }


    public <T> boolean addCooldown(Cooldownable<T> cooldownable, T object, Double d) {
        return !Objects.equals(cooldownable.getCooldowns().put(object, d),
                cooldownable.getCooldowns().get(object));
    }
}
