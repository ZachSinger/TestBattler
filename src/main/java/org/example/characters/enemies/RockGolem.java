package org.example.characters.enemies;

import org.example.characters.base.Enemy;
import org.example.characters.interfaces.Defender;

public class RockGolem extends Enemy implements Defender {
    public RockGolem(String name) {
        super(name);
    }

    public RockGolem(){
        this("Rock Golem");
    }

    public void block() {
        this.setDefense(this.getDefense() * (int)1.2);
    }
}
