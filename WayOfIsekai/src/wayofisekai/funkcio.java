package wayofisekai;

import anotation.gFN;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
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
        Boolean nincs = Boolean.FALSE;
        
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
                String mainCellName = obj.getClass().getName();
                Element mainCell = xml.createElement(mainCellName);
                xml.appendChild(mainCell);
                DOMSource source = new DOMSource(xml);
                StreamResult result = new StreamResult(file);
                t.transform(source, result);
                first = Boolean.TRUE;
                
            } 
            if (first == Boolean.TRUE || obj.getClass().getSimpleName().equals("npc")) {
                
                saveMethod(obj, file);
                
            } else {
                
                try {
                    
                    ArrayList<Character> xy = loadList(obj);
                    for (Character k : xy){
                        
                        if (k.getName().contains(name) && k.getName().length() == name.length()) {
                        
                            nincs = Boolean.TRUE;
                            throw new van();
                        
                        }
                        
                    }
                    
                    if (nincs == Boolean.FALSE) {
                        
                        saveMethod(obj, file);
                        
                    }
                    
                } catch (van ex){
                    
                    JOptionPane.showMessageDialog(null, "Error: Van már ilyen karakter");
                    
                }
                
            }
            
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
            
        }
        
        return Boolean.FALSE;
        
    }
    
    public Boolean saveMethod(gameClass obj, File file){
        
        try {
            
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            TransformerFactory tf = TransformerFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Transformer t = tf.newTransformer();
            
            //Mentési folyamat
            Field[] properties = obj.getClass().getDeclaredFields();
            HashMap<String, HashMap<String, String>> dataHM = 
                    new HashMap<String, HashMap<String,String>>();
            
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
            
            Element newCell = xml.createElement(obj.getClass().getSimpleName());
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
            
            JOptionPane.showMessageDialog(null, "ANYÁD");
            
        }
        
        return Boolean.FALSE;
        
    }
    
    /* loadList azért szükséges, hogy egy listával kinyerjem az ősszes character.xml fájlban
    található karaktert, pontosabban azok név, szint, és tapasztalat tulajdonságait, hogy
    utána azt a betöltésnél egy táblázatba kiírassam, illetve egy comboBox segítségével választhassunk is közülük. */
    public ArrayList<Character> loadList(gameClass kar){
        
        ArrayList<Character> list = new ArrayList<>();
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
                String name = 
                    charData.getElementsByTagName("name").item(0).getTextContent();
                
                Integer lvl = 
                        Integer.parseInt
                    (charData.getElementsByTagName("lvl").item(0).getTextContent());
                
                Integer xp = 
                        Integer.parseInt
                    (charData.getElementsByTagName("xp").item(0).getTextContent());
                
                Boolean sex = 
                        Boolean.parseBoolean
                    (charData.getElementsByTagName("sex").item(0).getTextContent());
                
                Integer money = 
                        Integer.parseInt
                    (charData.getElementsByTagName("money").item(0).getTextContent());
                
                Character listChar = new Character(name, lvl, xp, sex, money);
                list.add(listChar);
                
            }
            
        } catch (Exception ex){
            
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
            
        }
        return list;
        
    }
    
    public ArrayList<Enemy> loadEnemy(Character ch){
        ArrayList<Enemy> enemies = new ArrayList<>();
        try {
            String filename = "enemy.xml";
            File file = new File(filename);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document xml = builder.parse(file);
            xml.normalize();
            
            NodeList enemyByTag = xml.getElementsByTagName("enemy");
            for (Integer i = 0; i < enemyByTag.getLength(); i++) {
                Node enemyTag = enemyByTag.item(i);
                Element enemyAdat = (Element)enemyTag;
                String name = enemyAdat.getElementsByTagName("name").item(0).getTextContent();
                Integer hp = Integer.parseInt(enemyAdat.getElementsByTagName("hp").item(0).getTextContent());
                Integer dmg = Integer.parseInt(enemyAdat.getElementsByTagName("dmg").item(0).getTextContent());
                Integer def = Integer.parseInt(enemyAdat.getElementsByTagName("def").item(0).getTextContent());
                Integer drate = Integer.parseInt(enemyAdat.getElementsByTagName("drate").item(0).getTextContent());
                Integer quest = Integer.parseInt(enemyAdat.getElementsByTagName("quest").item(0).getTextContent());
                Enemy e = new Enemy(name, hp, dmg, def, drate, quest);
                enemyStat(e, ch);
                e.setDefHp(e.getHp());
                enemies.add(e);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        return enemies;
    }
    
    public ArrayList<npc> loadNpc(npc xy){
        
        ArrayList<npc> npcs = new ArrayList<>();
        
        try {
            String filename = xy.getClass().getSimpleName() + ".xml";
            File file = new File(filename);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document xml = builder.parse(file);
            xml.normalize();
            
            NodeList enemyByTag = xml.getElementsByTagName(xy.getClass().getSimpleName());
            for (Integer i = 0; i < enemyByTag.getLength(); i++) {
                Node npcTag = enemyByTag.item(i);
                Element npcAdat = (Element)npcTag;
                String name = npcAdat.getElementsByTagName("vilName").item(0).getTextContent();
                Boolean comp = Boolean.parseBoolean
                    (npcAdat.getElementsByTagName("comp").item(0).getTextContent());
                Boolean acc = Boolean.parseBoolean
                    (npcAdat.getElementsByTagName("acc").item(0).getTextContent());
                String cname = npcAdat.getElementsByTagName("cname").item(0).getTextContent();
                xy = new npc(name, comp, acc, cname);
                npcs.add(xy);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        
        return npcs;
        
    }
    
    public Enemy enemyStat(Enemy en, Character ch){
        
        try {
            
            if (ch.getLvl() != 1) {
                
                en.setHp(en.getHp() * ch.getLvl());
                en.setAtk(en.getAtk() * ch.getLvl());
                en.setDef(en.getDef() * ch.getLvl());
                
            }
            
        } catch (Exception ex){
            
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
            
        }
        return en;
        
    }
    
    public Boolean removeChar(gameClass kar, String name){
        
        try {
            
            String fileName = kar.getClass().getSimpleName() + ".xml";
            File file = new File(fileName);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document xml = db.parse(file);
            
            NodeList chars = xml.getElementsByTagName(kar.getClass().getSimpleName());
            for (Integer i = 0; i < chars.getLength(); i++) {
                
                Element character = (Element)chars.item(i);
                Element nameTag = (Element)character.getElementsByTagName("name").item(0);
                if (nameTag.getTextContent().equalsIgnoreCase(name)) {
                    
                    nameTag.getParentNode().getParentNode().removeChild(chars.item(i));
                    break;
                    
                }
                
            }
            
            clean(xml);
            
            saveXMLContent(xml, fileName);
            return Boolean.TRUE;
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
            
        }
        
        return Boolean.FALSE;
        
    }
    
    public Boolean removeNpcs(gameClass xy, String name){
        
        try {
            
            String fileName = xy.getClass().getSimpleName() + ".xml";
            File file = new File(fileName);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document xml = db.parse(file);
            
            NodeList npcs = xml.getElementsByTagName(xy.getClass().getSimpleName());
            for (Integer i = 0; i < npcs.getLength(); i++) {
                
                Element npc = (Element)npcs.item(i);
                Element nameTag = (Element)npc.getElementsByTagName("cname").item(0);
                if (nameTag.getTextContent().equalsIgnoreCase(name)) {
                    
                    nameTag.getParentNode().getParentNode().removeChild(npcs.item(i));
                    break;
                    
                }
                
            }
            
            clean(xml);
            
            saveXMLContent(xml, fileName);
            return Boolean.TRUE;
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
            
        }
        
        return Boolean.FALSE;
        
    }
    
    public static void clean(Node node)
    {
      NodeList childNodes = node.getChildNodes();

      for (int n = childNodes.getLength() - 1; n >= 0; n--)
      {
         Node child = childNodes.item(n);
         short nodeType = child.getNodeType();

         if (nodeType == Node.ELEMENT_NODE)
            clean(child);
         else if (nodeType == Node.TEXT_NODE)
         {
            String trimmedNodeVal = child.getNodeValue().trim();
            if (trimmedNodeVal.length() == 0)
               node.removeChild(child);
            else
               child.setNodeValue(trimmedNodeVal);
         }
         else if (nodeType == Node.COMMENT_NODE)
            node.removeChild(child);
      }
    }
    
    private static void saveXMLContent(Document xml, String file) {
        try {
                   
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource domSource = new DOMSource(xml);
            StreamResult streamResult = new StreamResult(file);
            transformer.transform(domSource, streamResult);
                        
        } catch (Exception ex) {
                   
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                        
        }
    }
    
    public Integer lvlUpXp(Integer lvl){
        
        Integer lvlUp = 0;
        
        if (lvl <= 15) lvlUp = lvl * 1500;
        else if (lvl <= 30) lvlUp = lvl * 3000;
        else if (lvl <= 45) lvlUp = lvl * 6000;
        else lvlUp = lvl * 10000;
        
        return lvlUp;
    }
    
    public ArrayList quest(Character ch, Integer qid){
        
        ArrayList<Enemy> qe = new ArrayList<>();
        ArrayList<Enemy> list = loadEnemy(ch);
        
        for (Integer i = 0; i < list.size(); i++) {
            
            if (list.get(i).getQuest() == qid) {
                
                qe.add(list.get(i));
                
            }
            
        }
        
        return qe;
        
    }
    
    public Boolean npcQuest(Character ch, Integer xpMin, Integer xpMax, Integer gMin, Integer gMax){
        
        Random rand = new Random();
        
        try {
            
            if (xpMin == 0) {
                ch.setXp(rand.nextInt(xpMax));
            } else {
                Integer avg = rand.nextInt(xpMax) + xpMin;
                ch.setXp(avg);
            }
            
            if (gMin == 0) {
                ch.setMoney(rand.nextInt(gMax));
            } else {
                Integer avg = rand.nextInt(gMax) + gMin; 
                ch.setMoney(avg);
            }
            
            return Boolean.TRUE;
            
        } catch(Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
            return Boolean.FALSE;
            
        }
        
    }
    
}

class van extends Exception{}