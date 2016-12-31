import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
      public static Object getBean(String args){
            try {
                  DocumentBuilderFactory dFactoy = DocumentBuilderFactory.newInstance();
                  DocumentBuilder builder = dFactoy.newDocumentBuilder();
                  Document doc;
                  doc = builder.parse(new File("config.xml"));
                  NodeList nList = null;
                  Node classNode = null;
                  String cName = null;
                  nList = doc.getElementsByTagName("className");
                  if (args.equalsIgnoreCase("appliance")) {
                        classNode = nList.item(0).getFirstChild();
                  } else  if(args.equals("manufacturer")){
                        classNode = nList.item(1).getFirstChild();
                  }
                  cName = classNode.getNodeValue();
                  Class c = Class.forName(cName);
                  Object object = c.newInstance();
                  return object;
                 
            } catch (Exception e) {
                  e.printStackTrace();
                  return null;
            }
      }
}
