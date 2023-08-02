package org.cfx.homework;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * @author RTX 9090
 */
public class HomeWorkTest {
    /**
    * 修改
     */
    @Test
    public void test01() throws Exception {
        //创建SAXReader对象
        SAXReader reader = new SAXReader();
        //获取文档
        Document document = reader.read("H:\\Desktop\\IdeaWorkSpace\\day030_xml\\src\\org\\cfx\\homework\\Students.xml");
        //读取根目录
//        System.out.println(document.getRootElement());
        Element rootElement = document.getRootElement();
        System.out.println("根元素"+rootElement);
        System.out.println("根元素的名称"+rootElement.getName());
        System.out.println(rootElement.element("student").element("name").getText());
        //获取所有子标签
        List<Element> elements = rootElement.elements();

        elements.forEach(System.out::println);

        //获取第一个sex属性
        Element sex = elements.get(0).element("sex");
        sex.setText("女");

        FileWriter fileWriter = new FileWriter("H:\\Desktop\\IdeaWorkSpace\\day030_xml\\src\\org\\cfx\\homework\\Students.xml");

        XMLWriter xmlWriter = new XMLWriter(fileWriter);

        xmlWriter.write(document);
        xmlWriter.close();
        fileWriter.close();

    }

    /**
     * 查
     * @throws Exception
     */
    @Test
    public void test02() throws Exception {
        //创建SAXReader对象
        SAXReader reader = new SAXReader();
        //获取文档
        Document document = reader.read("H:\\Desktop\\IdeaWorkSpace\\day030_xml\\src\\org\\cfx\\homework\\Students.xml");
        //读取根目录
        Element rootElement = document.getRootElement();

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("myKey", "http://ronghuanet.cn");// key的名字自己取
        reader.getDocumentFactory().setXPathNamespaceURIs(hashMap);

        System.out.println("=============================");

        Node node = rootElement.selectSingleNode("//myKey:student[@id='2']//myKey:name");
        System.out.println(node.getText());

    }

    /**
     * 增
     * @throws Exception
     */
    @Test
    public void test03() throws Exception {
        //创建SAXReader对象
        SAXReader reader = new SAXReader();
        //获取文档
        Document document = reader.read("H:\\Desktop\\IdeaWorkSpace\\day030_xml\\src\\org\\cfx\\homework\\Students.xml");
        //读取根目录
        Element rootElement = document.getRootElement();

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("myKey", "http://ronghuanet.cn");// key的名字自己取
        reader.getDocumentFactory().setXPathNamespaceURIs(hashMap);

        System.out.println("=============================");

        Element element = rootElement.addElement("student");
        Element element1 = element.addElement("name");
        Element element2 = element.addElement("sex");
        Element element3 = element.addElement("age");
        Element element4 = element.addElement("hobby");
        Element element5 = element.addElement("birthday");
        element.addAttribute("team","1");
        element.addAttribute("id","3");
        element1.setText("1111");
        element2.setText("女");
        element3.setText("23");
        element4.setText("无");
        element5.setText("2021年11月25日11:26:48");



        FileWriter fileWriter = new FileWriter("H:\\Desktop\\IdeaWorkSpace\\day030_xml\\src\\org\\cfx\\homework\\Students.xml");

        XMLWriter xmlWriter = new XMLWriter(fileWriter);

        xmlWriter.write(document);
        xmlWriter.close();
        fileWriter.close();

    }
}
