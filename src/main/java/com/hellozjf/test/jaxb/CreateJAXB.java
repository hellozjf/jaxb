package com.hellozjf.test.jaxb;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class CreateJAXB {
    
    public static String getCurrentProjectPath() throws Exception {
        File directory = new File("");// 参数为空
        String courseFile = directory.getCanonicalPath();
        return courseFile;
    }
    
    public static void createXSD(File xmlFile) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("xsd.exe " + xmlFile + " /outputdir:xsd");
    }
    
    public static Element getXsComplexType(Document document) throws Exception {
        Element root = document.getRootElement();
        List<Element> elements = root.elements();
        for (Element element : elements) {
            if (element.attribute("name").getValue().equals("ufinterface")) {
                Element e2 = element.element("complexType");
                return e2.element("sequence");
            }
        }
        return null;
    }
    
    public static void generateXSD() throws Exception {
        File dir = new File("xsd");
        File[] files = dir.listFiles();
        
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(files[0]);
        Element xsSequence = getXsComplexType(document);
        
        for (int i = 1; i < files.length; i++) {
            Document tmpDoc = saxReader.read(files[i]);
            Element tmpXsSeq = getXsComplexType(tmpDoc);
            if (tmpXsSeq != null) {
                List<Element> elements = tmpXsSeq.elements();
                for (int j = 0; j < elements.size(); j++) {
                    Element element = (Element) elements.get(j).clone();
                    try {
                        if (element.attribute("name").equals("accept")) {
                            System.out.println("accept");
                        }
                        xsSequence.add(element);
                    } catch (Exception e) {
                        System.out.println(element.asXML());
                        e.printStackTrace();
                        return;
                    }
                }
            }
        }
        
        File output = new File("output.xsd");
        PrintWriter writer = new PrintWriter(output);
        writer.print(document.asXML());
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        
        new File("xsd").mkdir();
        
        URL url = CreateJAXB.class.getClassLoader().getResource("Template");
        File dir = new File(url.getPath());
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.getName().endsWith(".xml")) {
                createXSD(file);
                String name = file.getName().replaceAll(".xml", "");
                Runtime.getRuntime().exec("xjc -d " + getCurrentProjectPath() + "/src/main/java/" + " -p com.hellozjf.test.jaxb." + name + " xsd/" + name + ".xsd");
            }
        }
        
    }

}
