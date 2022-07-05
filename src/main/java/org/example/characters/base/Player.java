package org.example.characters.base;

import org.example.gear.Gear;
import org.example.quests.Quest;

import java.util.ArrayList;
import java.util.List;

public class Player extends Battler{

    List<Gear> inventory = new ArrayList<Gear>();
    List<Quest> quests = new ArrayList<Quest>();


    public Player(String name) {
        super(name);
    }

    public List<Quest> getQuests(){
        return this.quests;
    }

    public void addQuest(Quest quest) {
        this.getQuests().add(quest);
    }

    public void removeQuest(Quest quest) {
        this.getQuests().remove(quest);
    }

}
