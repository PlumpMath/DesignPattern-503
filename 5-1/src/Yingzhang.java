
public class Yingzhang extends Officer{

      public Yingzhang(String name) {
            super(name);
      }
      
      public void handleRequest(Mission request){
            if (request.getEnemyNumber()<200) {
                  System.out.println("营长"+name+"下达代号为"+request.getCode()+"的作战任务，敌人数量为"+request.getEnemyNumber());
            } else {
                  System.out.println("开会代号为："+request.getCode()+"的作战任务，敌人数量为"+request.getEnemyNumber());
            }
      }

}
