package org.example.characters.base;

import org.example.gear.Gear;

import java.util.ArrayList;
import java.util.List;

public class Enemy extends Battler{
    private List<Gear> loopDrop = new ArrayList<Gear>();

    public Enemy(String name) {
        super(name);
    }
    public Enemy(String name, Integer maxHp, Integer attack, Integer defense){
        this(name);
        this.setMaxHp(maxHp);
        this.setHp(maxHp);
        this.setAttack(attack);
        this.setDefense(defense);
    }

    public List<Gear> getLoopDrop() {
        return loopDrop;
    }

    public void setLoopDrop(List<Gear> loopDrop) {
        this.loopDrop = loopDrop;
    }
    public void setLoopDropItem(Gear item){
        this.getLoopDrop().add(item);
    }
}
