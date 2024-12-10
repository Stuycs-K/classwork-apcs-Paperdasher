public class Warrior extends Adventurer{
  //instance variables
  private int mana;

  //constructors
  public Warrior(String name){
    super(name);
    mana = (int)(Math.random() * 10 + Math.random()* 10 + 2);
  }

  public Warrior(String name, int hp){
    super(name, hp);
    mana = (int)(Math.random() * 10 + Math.random() * 10 + 2);
  }

  public Warrior(String name, int hp, int mana){
    super(name, hp);
    this.mana = mana;
  }

  //Accessor Methods
  public String getSpecialName(){
    return "mana";
  }

  public int getSpecial(){
    return mana;
  }

  public void setSpecial(int n){
    mana = n;
  }

  public int getSpecialMax(){
    return 20;
  }



  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    other.applyDamage(5);
    return getName() + " attacked " + other.getName() + " and applied 5 damage.";
  }

  //heal or buff the target adventurer
  public String support(Adventurer other){
    if(!(other.getmaxHP() - other.getHP() <= 5)){
      other.applyHeal(5);
      return getName() + " supported " + other.getName() + " by healing 5 HP.";  
    }
    else if(this.getmaxHP() > this.getHP()){
      int diff = this.getmaxHP() - this.getHP();
      applyHeal(diff);
      return getName() + " supported " + other.getName() + " by healing " + diff + "HP.";  
    }
    else{
      return "Uh oh, " + other.getName() + " already is at max HP. Therefore, no action was taken.";  
    }
  }

  //heal or buff self
  public String support(){
    if(!(this.getmaxHP() - this.getHP() <= 5)){
      applyHeal(5);
      int spec = (int)(5 * Math.random() + 1);
      restoreSpecial(spec);
      return getName() + " supported themself by healing 5 HP and gained " + spec + " mana.";  
    }
    else if(this.getmaxHP() > this.getHP()){
      int diff = this.getmaxHP() - this.getHP();
      applyHeal(diff);
      int spec = (int)(5 * Math.random() + 1);
      restoreSpecial(spec);
      return getName() + " supported themself by healing " + diff + "HP and gained " + spec + " mana.";  
    }
    else{
      int spec = (int)(5 * Math.random() + 1);
      restoreSpecial(spec);
      return "Uh oh, " + getName() + " already is at max HP. Instead of healing, " + getName() + " only gained " + spec + " mana from the process.";  
    }
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (this.mana >= 5){
      this.mana -= 5;
      other.applyDamage(20);
      return getName() + " used their special attack on " + other.getName() + " and dealt 20 damage, consumed 5 mana.";
    }
    else{
      applyDamage(5);
      return (getName() + " attempted at a special attack but failed. Instead, " + getName() + " hurt themselves with 5 damage!");
    }
  }
}
