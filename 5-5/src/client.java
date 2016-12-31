
public class client {
      public static void main(String[] args) {
            WTO wto = new WTO();
            China cn = new China();
            America us = new America();
            cn.setUnitedNations(wto);
            us.setUnitedNations(wto);
            wto.setCn(cn);
            wto.setUs(us);
            cn.declare("中国是一个爱好和平的国家");
            us.declare("m美国将为世界和平而努力");
      }
}
