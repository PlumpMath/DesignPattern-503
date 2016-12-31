
public class client {

    public static void main(String[] args) {
        SharedString str1,str2;
        SharedStringFactory factory = new SharedStringFactory();
        str1 = factory.getSharedStrng("Java");
        str1.setColor(new Color("红色"));
        str1.setSize(new Size(5));
        str1.diaplay();
        str2 = factory.getSharedStrng("Java");
        str2.setColor(new Color("黑色"));
        str2.setSize(new Size(10));
        str2.diaplay();
        System.out.println(str1==str2);
    }
}
