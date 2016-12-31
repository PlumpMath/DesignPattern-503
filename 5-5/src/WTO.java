import javax.jws.soap.SOAPBinding.Use;

public class WTO extends UnitedNations{
      private China cn;
      private America us;
      
      public void setCn(China cn) {
            this.cn = cn;
      }

      public void setUs(America us) {
            this.us = us;
      }

      @Override
      public void declare(String message, Country country) {
            if (country == cn) {
                  us.getMessage(message);
            } else {
                  cn.getMessage(message);
            }
      }
      
}
