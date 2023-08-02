package org.cfx._03parse;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author RTX 9090
 */
public class XmlTest {
    @Test
    public void test01() throws Exception {
        //1、创建SAXReader对象
        SAXReader reader = new SAXReader();
        // 2、获取文档
        Document document = reader.read("H:\\Desktop\\IdeaWorkSpace\\day030_xml\\src\\org\\cfx\\_01dtd\\User.xml");
        //3、获取根元素
        Element rootElement = document.getRootElement();
//        System.out.println(rootElement);
        //4、创建List<User>
        List<User> users = new ArrayList<User>();
        //5、获取子元素
        List<Element> elements = rootElement.elements();
//        System.out.println(elements);
        elements.forEach(e -> {
            String username = e.element("username").getText();
            String password = e.element("password").getText();
            String address = e.element("address").getText();

            users.add(new User(username, password, address));
        });
        users.forEach(System.out::println);
    }

    /**
        使用xpath解析
     */
    @Test
    public void test02() throws Exception {
        //1、创建SAXReader对象
        SAXReader reader = new SAXReader();
        // 2、获取文档
        Document document = reader.read("H:\\Desktop\\IdeaWorkSpace\\day030_xml\\src\\org\\cfx\\_01dtd\\User.xml");
        // 3、获取根元素
        Element rootElement = document.getRootElement();

        /*
          /a /b /c 表示一层一层的获取元素，获取a下面的下面的c下面的。
         */
        System.out.println(rootElement.selectSingleNode("/Users/User/username").getText());
        /*
            a[1]：表示第一个a元素；a[last()]：表示最后一个a元素
         */
        System.out.println(rootElement.selectSingleNode("/Users/User[2]/username").getText());
        System.out.println(rootElement.selectSingleNode("/Users/User[last()]/username").getText());

        /*
            //b： 表示和这个名称相同，表示只要名称是b，都得到
         */
        System.out.println(rootElement.selectNodes("//username").size());
        System.out.println("=================================");
        List<Element> list = rootElement.selectNodes("//username");
        list.forEach(e->{
            System.out.println(e.getText());
        });


        /*
            //* 表示所有元素都能拿到
         */
        System.out.println(rootElement.selectNodes("//*").size());
        System.out.println("============================");
        List<Element> list1 = rootElement.selectNodes("//*");
        list1.forEach(e->{
            System.out.println(e.getText().trim());
        });

        /*
            /a[@id] 表示拿带有id的元素
         */
        System.out.println(rootElement.selectNodes("//username[@id]").size());
        System.out.println("============================");
        List<Element> list2 = rootElement.selectNodes("//username[@id]");
        list2.forEach(e->{
            System.out.println(e.getText());
        });
        /*
             //a[@id='b1'] 表示元素名称是a,在a上面有id属性，并且id的属性值是b1
         */
        System.out.println(rootElement.selectNodes("//User[@id='1']").size());
        System.out.println("============================");
        List<Element> list3 = rootElement.selectNodes("//User[@id='1']");
        list3.forEach(e->{
            System.out.println(e.element("username").getText());
        });
    }
}
