public class office extends Unit{

      private String name;
      public office(String name){
            this.name = name;
      }
      
      @Override
      public void handleArchives() {
            System.out.println(this.name+"处理公文！");
      }
      
}

