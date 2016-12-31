
public class client {
      private static int index = -1;
      private static MenentoCaretaker mc = new MenentoCaretaker();
      
      public static void main(String[] args) {
            Chessman chess= new Chessman("车", 1, 1);
            play(chess);
            chess.setY(4);
            play(chess);
            chess.setX(5);
            play(chess);
            undo(chess,index);
            undo(chess,index);
            redo(chess,index);
            redo(chess,index);
      }

      private static void redo(Chessman chess, int i) {
            System.out.println("撤销悔棋");
            index++;
            chess.restore(mc.getMenento(i+1));
            System.out.println("棋子"+chess.getLabel()+"当前位置为："+"第"+chess.getX()+"行"+"第"+chess.getY()+"列。");
      }

      private static void undo(Chessman chess, int i) {
            System.out.println("悔棋");
            index--;
            chess.restore(mc.getMenento(i-1));
            System.out.println("棋子"+chess.getLabel()+"当前位置为："+"第"+chess.getX()+"行"+"第"+chess.getY()+"列。");
            
      }

      private static void play(Chessman chess) {
            mc.setMemento(chess.save());
            index++;
            System.out.println("棋子"+chess.getLabel()+"当前位置为："+"第"+chess.getX()+"行"+"第"+chess.getY()+"列。");
      }
}
