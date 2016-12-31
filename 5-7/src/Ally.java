import java.util.ArrayList;

public class Ally {
      private ArrayList<Observer> players = new ArrayList<Observer>();
      
      public void join(Observer observer) {
            players.add(observer);
      }
      
      public void notifyObserver(String name) {
            System.out.println("紧急通知，盟友"+name+"遭受敌人攻击！");
            for (Observer observer : players) {
                  if(!((Observer)observer).getName().equalsIgnoreCase(name)){
                  }
            }
      }

}
