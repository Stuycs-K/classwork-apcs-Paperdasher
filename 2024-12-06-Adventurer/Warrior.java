public class Warrior extends Adventurer{
  //instance variables
  private int mana;

  //constructors
  public Warrior(String name){
    super(name);
    mana = 0;
  }

  public Warrior(String name, int hp){
    super(name, hp);
    mana = 0;
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
    return 100;
  }



  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    super.applyDamage(5);
    return "You attacked " + other.getName() + " and applied 5 damage";
  }

  //heal or buff the target adventurer
  public String support(Adventurer other){

    return "You supported " + other.getName() + " by healing 5 HP";
  }

  //heal or buff self
  public String support(){
    return "You supported yourself by healing 5 HP";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other);{
    return "You attacked " + other.getName() + " and consumed " + ___ + " mana";
  }
}
