package org.example.characters.base;

import org.example.gear.Gear;
import org.example.quests.Quest;

import java.util.ArrayList;
import java.util.List;

public class Npc extends GameCharacter{
    //Props(fields) go up top
    private String dialogue;
    private List<Gear> reward = new ArrayList<Gear>();
    private Quest quest;

    //Then your constructor in the middle
    public Npc(String name) {
        super(name);
    }

    public Quest giveQuest(){
        return quest;
    }

    public List<Gear> giveReward(){
        return reward;
    }

    public String speak(){
        return dialogue;
    }

    public void setReward(List<Gear> reward) {
        this.reward = reward;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    //All methods go below (usually getters/setters first tho)
}
