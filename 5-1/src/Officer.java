
abstract class Officer {
      protected String name;
      protected Officer successor;
      
      public Officer(String name){
            this.name = name;
      }

      public Officer getSuccessor() {
            return successor;
      }

      public void setSuccessor(Officer successor) {
            this.successor = successor;
      }
      
      public abstract void handleRequest(Mission request);
}
