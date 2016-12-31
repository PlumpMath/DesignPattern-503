import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import java.io.*;
public class XMLUtil
{
	public static String getMakeName()
	{
		try
		{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("configMake.xml")); 
		
			NodeList nl= doc.getElementsByTagName("makerName");
			Node classNode=nl.item(0).getFirstChild();
			String makeName=classNode.getNodeValue().trim();
            return makeName;
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}