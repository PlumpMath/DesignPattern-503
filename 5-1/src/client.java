
public class client {
      
      public static void main(String[] args) {
            Officer banzhang,paizhang,yingzhang;
            
            banzhang = new Banzhang("王班长");
            paizhang = new Paizhang("李排长");
            yingzhang = new Yingzhang("孙营长");
            
            banzhang.setSuccessor(paizhang);
            paizhang.setSuccessor(yingzhang);
            
            Mission m1 = new Mission("A01", 56);
            banzhang.handleRequest(m1);
            
      }
}
