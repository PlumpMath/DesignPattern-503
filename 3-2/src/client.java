
public class client {
	
	public static void main(String args[])
	{
         try
         {
         	ImageReader imageReader;
         	ImageReaderFactory factory;
         	factory=(ImageReaderFactory)XMLUtil.getBean();
         	imageReader=factory.createImageReader();
         	imageReader.readImage();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
