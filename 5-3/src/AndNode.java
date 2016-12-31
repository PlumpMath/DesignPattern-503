
public class AndNode implements Node{

      private AndNode left;
      private AndNode right;
      
      public AndNode(AndNode left, AndNode right) {
            this.left = left;
            this.right = right;
      }

      public int interpret() {
            if(left.interpret()==1&&right.interpret()==1){
                  return 1;
            }
            else {
                  return 0;
            }
      }
      
}
