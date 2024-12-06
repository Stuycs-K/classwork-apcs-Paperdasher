public class Warrior extends Adventurer{
  //instance variables
  private String name;
  private int HP,maxHP;

  //constructors
  public Warrior(String name){
    super(name);
  }

  public Warrior(String name, int hp){
    super(name, hp);
  }

  //Accessor Methods
  public String getSpecialName(){
    return super.getName().substring(0, 13);
  }

  public int getSpecial(){
    return;
  }

  public void setSpecial(int n){

  }

  public int getSpecialMax(){
    return;
  }



  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    return ;
  }

  //heal or buff the target adventurer
  public String support(Adventurer other){
    return ;
  }

  //heal or buff self
  public String support(){
    return ;
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other);
}
