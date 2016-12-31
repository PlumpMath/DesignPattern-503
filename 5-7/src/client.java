
public class client {

      public static void main(String[] args) {
            Observer observer1 = new Player("杨过");
            Observer observer2 = new Player("小笼包");
            
            Ally ally = new Ally();
            ally.join(observer1);
            ally.join(observer2);
            
            observer2.beAttacked(ally);
      }

}
