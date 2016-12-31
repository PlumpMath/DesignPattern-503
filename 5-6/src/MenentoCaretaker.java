import java.util.ArrayList;

public class MenentoCaretaker {
      private ArrayList  mementolist = new ArrayList();
      
      public ChessmanMenento getMenento(int i) {
            return (ChessmanMenento)mementolist.get(i);
      }
      
      public void setMemento(ChessmanMenento menento){
            mementolist.add(menento);
      }
}
