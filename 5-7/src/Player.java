
public  class Player implements Observer {
      private String name;
      
      public Player(String name) {
            this.name = name;
      }

      public String getName() {
            return this.name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public void help() {
            System.out.println("坚持住"+this.name+"来救你！");
      }

      public void beAttacked(Ally ally) {
            System.out.println(this.name+"被攻击");
            ally.notifyObserver(name);
      }

}
