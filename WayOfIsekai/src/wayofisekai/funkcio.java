package wayofisekai;

import anotation.gFN;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class funkcio<gameClass> {
    
    public Boolean saveObject(gameClass obj, String name){
        
        String objName = obj.getClass().getSimpleName();
        String fileName = objName + ".xml";
        Boolean first = Boolean.FALSE;
        
        try {
            
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            TransformerFactory tf = TransformerFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Transformer t = tf.newTransformer();
            
            File file = new File(fileName);
            if (!(file.exists() && file.isFile())) {
                
                //Fájl létrehozása
                file.createNewFile();
                Document xml = db.newDocument();
                t.setOutputProperty(OutputKeys.ENCODING, "utf-8");
                String mainCellName = obj.getClass().getSimpleName();
                Element mainCell = xml.createElement(mainCellName);
                xml.appendChild(mainCell);
                DOMSource source = new DOMSource(xml);
                StreamResult result = new StreamResult(file);
                t.transform(source, result);
                first = Boolean.TRUE;
                
            } 
            if (first == Boolean.TRUE) {
                
                saveMethod(obj, file, name);
                
            } else {
                
                try {
                    
                    Character xy = new Character();
                    xy = loadGame(obj, name);
                    
                    if (xy.getName().contains(name)) {
                        
                        throw new van();
                        
                    } else {
                        
                        saveMethod(obj, file, name);
                        
                    }
                    
                } catch (van ex){
                    
                    System.out.println("Van már ilyen karakter");
                    
                }
                
            }
            
            
        } catch (Exception ex) {
            
            System.err.println("Error: " + ex.toString());
            
        }
        
        return Boolean.FALSE;
        
    }
    
    public Boolean saveMethod(gameClass obj, File file, String name){
        
        try {
            
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            TransformerFactory tf = TransformerFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Transformer t = tf.newTransformer();
            
            //Mentési folyamat
            Field[] properties = obj.getClass().getDeclaredFields();
            HashMap<String, HashMap<String, String>> dataHM = new HashMap<String, HashMap<String,String>>();
            for (Field property : properties) {
                
                String gFN = property.getAnnotation(gFN.class).value();
                String propertyType = property.getAnnotation(gFN.class).type().getSimpleName();
                Method gF = obj.getClass().getMethod(gFN);
                String propertyValue = gF.invoke(obj).toString();
                HashMap<String, String> valueData = new HashMap<String, String>();
                valueData.put(propertyValue, propertyType);
                dataHM.put(property.getName(), valueData);
                
            }
            
            properties = obj.getClass().getSuperclass().getDeclaredFields();
            for (Field property : properties) {
                
                String gFN = property.getAnnotation(gFN.class).value();
                String propertyType = property.getAnnotation(gFN.class).type().getSimpleName();
                Method gF = obj.getClass().getSuperclass().getMethod(gFN);
                String propertyValue = gF.invoke(obj).toString();
                HashMap<String, String> valueData = new HashMap<String, String>();
                valueData.put(propertyValue, propertyType);
                dataHM.put(property.getName(), valueData);
                
            }
            
            Document xml = db.parse(file);
            xml.normalize();
            Element mainCell = (Element)xml.getFirstChild();
            
            Element newCell = xml.createElement(name);
            mainCell.appendChild(newCell);
            
            for (Map.Entry<String, HashMap<String, String>> data : dataHM.entrySet()) {
                
                String propName = data.getKey();
                HashMap<String, String> valueDataS = data.getValue();
                String finalValue = "";
                String finalType = "";
                
                for (Map.Entry<String, String> valueData : valueDataS.entrySet()) {
                    
                    finalValue = valueData.getKey();
                    finalType = valueData.getValue();
                    
                }
                
                Element property = xml.createElement(propName);
                property.setTextContent(finalValue);
                property.setAttribute("type", finalType);
                newCell.appendChild(property);
            }
            
            DOMSource source = new DOMSource(xml);
            StreamResult result = new StreamResult(file);
            t.transform(source, result);
            return Boolean.TRUE;
            
        } catch (Exception ex) {
            
            System.out.println("Error: " + ex.toString());
            
        }
        
        return Boolean.FALSE;
        
    }
    
    public Object[] loadObjectArray(gameClass obj) {
        
        Object[] objects = null;
        String fileName = obj.getClass().getSimpleName() + ".xml";
        
        File file = new File(fileName);
        try {
            
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document xml = db.parse(file);
            NodeList nodes = xml.getElementsByTagName(obj.getClass().getSimpleName());
            objects = new Object[nodes.getLength()];
            
            for (Integer i = 0; i < nodes.getLength(); i++) {
                
                Node node = nodes.item(i);
                Element indv = (Element)node;
                ArrayList<SimpleEntry<SimpleEntry, HashMap<String, String>>> propertiesData = new ArrayList<SimpleEntry<SimpleEntry, HashMap<String, String>>>();
                NodeList properties = indv.getChildNodes();
                
                for (Integer j = 0; j < properties.getLength(); j++) {
                    
                    Node nd = properties.item(j);
                    if (nd.getNodeType() == Node.ELEMENT_NODE) {
                        
                        Element property = (Element)nd;
                        NamedNodeMap attrs = property.getAttributes();
                        HashMap<String, String> attrKeyValuePair = new HashMap<String, String>();
                        
                        for (Integer k = 0; k < attrs.getLength(); k++) {
                            
                            Attr attr = (Attr)attrs.item(k);
                            String attrName = attr.getName();
                            String attrValue = attr.getValue();
                            attrKeyValuePair.put(attrName, attrValue);
                            
                        }
                        
                        String propertyName = property.getTagName();
                        String propertyValue = property.getTextContent();
                        SimpleEntry<SimpleEntry, HashMap<String, String>> propertyData = new SimpleEntry(new SimpleEntry(propertyName, propertyValue), attrKeyValuePair);
                        propertiesData.add(propertyData);
                        
                    }
                    
                }
                
                objects[i] = propertiesData;
                
            }
            
        } catch (Exception ex) {
            
            System.err.println("Error: " + ex.toString());
            
        }
        
        return objects;
        
    }
    
    public ArrayList loadList(gameClass kar){
        
        ArrayList<String> list = new ArrayList<>();
        try {
            
            String fileName = kar.getClass().getSimpleName() + ".xml";
            File file = new File(fileName);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document xml = db.parse(file);
            xml.normalize();
            
            NodeList charByTag = xml.getElementsByTagName(kar.getClass().getSimpleName());
            for (Integer i = 0; i < charByTag.getLength(); i++) {
                
                Node charTag = charByTag.item(i);
                Element charData = (Element)charTag;
                String name = charData.getElementsByTagName("name").item(0).getTextContent();
                for (Integer j = 0; j < list.size(); j++) {
                    
                    if (list.contains(name) == Boolean.FALSE) {
                        
                        list.add(j, name);
                        
                    } else {
                        
                        throw new Exception();
                        
                    }
                    
                }
                
                if (list.size() == 0) {
                        
                        list.add(name);
                        
                }
                
            }
            
        } catch (Exception ex){
            
            System.err.println("Error: " + ex.toString());
            
        }
        return list;
        
    }
    
    public Character loadGame(gameClass kar, String text){
        
        Character loadedChar = new Character();
        
        try {
            
            String fileName = kar.getClass().getSimpleName() + ".xml";
            File file = new File(fileName);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document xml = db.parse(file);
            xml.normalize();
            
            NodeList charByTag = xml.getElementsByTagName(text);
            for (Integer i = 0; i < charByTag.getLength(); i++) {
                
                Node charTag = charByTag.item(i);
                Element charData = (Element)charTag;
                String name = charData.getElementsByTagName("name").item(0).getTextContent();
                Integer lvl = Integer.parseInt(charData.getElementsByTagName("lvl").item(0).getTextContent());
                Integer xp = Integer.parseInt(charData.getElementsByTagName("xp").item(0).getTextContent());
                Boolean sex = Boolean.parseBoolean(charData.getElementsByTagName("sex").item(0).getTextContent());
                loadedChar = new Character(name, lvl, xp, sex);
                
            }
            
        } catch (Exception ex) {
            
            System.err.println("Error: " + ex.toString());
            
        }
        return loadedChar;
        
    }

    public Integer lvlUpXp(Integer lvl){
        
        Integer lvlUp = 0;
        
        if (lvl <= 15) lvlUp = lvl * 1500;
        else if (lvl <= 30) lvlUp = lvl * 3000;
        else if (lvl <= 45) lvlUp = lvl * 6000;
        else lvlUp = lvl * 10000;
        
        return lvlUp;
    }
    
}

class van extends Exception{}