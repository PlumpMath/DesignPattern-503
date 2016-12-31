
abstract class RoleState {
      
      protected PlayerRole role;
      protected int point;
      protected String grade;

      public abstract void play(int score, String result) ;

      public abstract void doubleScore(int score, String result);

      public abstract void changeCards() ;

      public abstract void peerCards() ;
      
      public abstract void check();
}
