public class Warrior extends Adventurer{
  //instance variables
  private String name, SpecialName;
  private int HP,maxHP,Special,SpecialMax;

  //constructors
  public Warrior(String name){
    super(name);
  }

  public Warrior(String name, int hp){
    super(name, hp);
    this.maxHP = 200;
  }

  public Mana(String name, int special){
    this.SpecialName = name;
    this.Special = special;
  }

  //Accessor Methods
  public String getSpecialName(){
    return SpecialName;
  }

  public int getSpecial(){
    return Special;
  }

  public void setSpecial(int n){
    this.Special = n;
  }

  public int getSpecialMax(){
    return SpecialMax;
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
