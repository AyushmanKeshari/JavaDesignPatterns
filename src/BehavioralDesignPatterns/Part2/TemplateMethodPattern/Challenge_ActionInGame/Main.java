package BehavioralDesignPatterns.Part2.TemplateMethodPattern.Challenge_ActionInGame;

public class Main {

  public static void main(String[] args) {
    Pirate pirate = new Pirate();
    pirate.defendAgainstAttack();

    Troll troll = new Troll();
    troll.defendAgainstAttack();
  }

}
