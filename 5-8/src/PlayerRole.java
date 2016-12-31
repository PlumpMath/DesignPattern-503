
public class PlayerRole {
      private String nickname;
      private RoleState state;
      
      public PlayerRole(String nickname) {
            super();
            this.nickname = nickname;
      }

      public String getNickname() {
            return nickname;
      }

      public void setState(RoleState state) {
            this.state = state;
      }
      
      public void play(int score,String result) {
            state.play(score,result);
      }
      
      public void doubleScore(int score,String result) {
            state.doubleScore(score,result);
      }
      
      public void changeCards() {
            state.changeCards();
      }
      
      public void peerCards() {
            state.peerCards();
      }
}
