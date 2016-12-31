
public class PrimaryState extends RoleState{

      public PrimaryState(PlayerRole role) {
            this.point = 0;
            this.grade = "入门级";
            this.role = role;
      } 
      
      public PrimaryState(RoleState state) {
            this.point = state.point;
            this.grade = "入门级";
            this.role = state.role;
      }
      
      public void play(int score, String result) {
            if (result.equalsIgnoreCase("win")) {
                  this.point += score;
                  System.out.println("玩家"+this.role.getNickname()+"获胜，增加积分"+score+"当前积分为"+this.point+"。");
            } else if(result.equalsIgnoreCase("lose")){
                  this.point -= score;
                  System.out.println("玩家"+this.role.getNickname()+"失利，减少积分"+score+"当前积分为"+this.point+"。");
            }
            this.check();
      }

      public void doubleScore(int score, String result) {
           System.out.println("暂不支持该功能！");
      }

      public void changeCards() {
            System.out.println("暂不支持该功能");
      }

      public void peerCards() {
            System.out.println("暂不支持该功能");
      }

      public void check() {
            if (this.point>=10000) {
                  this.role.setState(new FinalState(this));
            } else if(this.point>=5000) {
                  this.role.setState(new ProfessionalState(this));
            }
            else if(this.point>=1000) {
                  this.role.setState(new SecondaryState(this));
            }
      }
      
}
