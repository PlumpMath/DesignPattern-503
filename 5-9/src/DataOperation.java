

public class DataOperation implements Cipher {
      private Cipher cipher;
      
      public void setCipher(Cipher cipher) {
            this.cipher = cipher;
      }

      public String doEncrypt(int key, String plainText) {
            return cipher.doEncrypt(key, plainText);
      }

}
