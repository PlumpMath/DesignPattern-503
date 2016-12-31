
public class SharedString {
    private String content;
    private Color color;
    private Size size;
    public SharedString(String content){
        this.content = content;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void setSize(Size size) {
        this.size = size;
    }
    
    public void diaplay(){
        System.out.println("内容"+this.content+",颜色"+this.color.getColor()+",大小"+this.size.getValue());
    }
}
