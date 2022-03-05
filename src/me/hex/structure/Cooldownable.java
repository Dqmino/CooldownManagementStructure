package me.hex.structure;

import java.util.Map;

public interface Cooldownable<T> {
    Map<T, Double> getCooldowns();
}
