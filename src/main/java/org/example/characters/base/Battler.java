package org.example.characters.base;

import java.util.HashMap;
import java.util.Map;

public class Battler extends GameCharacter{
    private Map<String, Integer> stats = new HashMap<>();

    public Battler(String name) {
        super(name);
    }

    public Integer getMaxHp(){
        return this.stats.get("maxhp");
    }

    public void setMaxHp(Integer hp){
        this.stats.put("maxhp", hp);
    }

    public Integer getHp(){
        return this.stats.get("hp");
    }

    public void setHp(Integer hp){
        hp = Math.min(hp, this.getMaxHp());
        hp = Math.max(hp, 0);
        this.stats.put("hp", hp);
    }

    public void updateHp(Integer hp){
        Integer currentHp = this.getHp();
        Integer newHp = currentHp + hp;

        this.setHp(newHp);
    }

    public Integer getAttack(){
        return this.stats.get("attack");
    }

    public void setAttack(Integer attack){
        this.stats.put("attack", attack);
    }

    public Integer getDefense(){
        return this.stats.get("defense");
    }

    public void setDefense(Integer defense){
        this.stats.put("defense", defense);
    }

    public void attack(Battler target){
        Integer attackResult = Math.max(this.getAttack() - target.getDefense(), 0);
        target.updateHp(attackResult * -1);
    }
}
