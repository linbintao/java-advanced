package com.soft1841.thread;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupDemo1 {
    public static void main(String[] args) throws Exception {
        String url ="https://sports.qq.com/";
        Connection connection = Jsoup.connect(url);
        Document document = connection.get();
        Elements elements =document.getElementsByClass("scr-newsarea");
        System.out.println(elements.size());
        for(Element element :elements){
            Element link = element.child(0);
            String titleString =link.text();
            System.out.println(titleString);
        }


    }
}
