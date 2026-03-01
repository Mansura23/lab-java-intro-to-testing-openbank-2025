package org.ironhack;

public class Wizard extends Player {
    private String spell;
    private SpellLibrary spellLibrary;


    public Wizard(int health, int strength, int lives, String spell, SpellLibrary spellLibrary) {
        super(health, strength, lives);
        this.spell = spell;
        this.spellLibrary = spellLibrary;
    }

    public Wizard(int health, int strength, int lives, String spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public Elf convertToElf(){
        int elfSpeed=5;
        return new Elf(this.getHealth(), this.getStrength(), this.getLives(), elfSpeed);

    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

     public String castRandomSpell(){
        if(spellLibrary == null){
            return "No spell library found!";
        }
        return "Casting " + spellLibrary.getRandomSpell();
     }
}
