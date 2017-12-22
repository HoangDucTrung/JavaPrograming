/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationweb;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author trunghd
 */
public class JavaApplicationWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Document doc = Jsoup.connect("http://truyentranh.net/one-piece").get();
        Elements doc_content = doc.select("section#examples div");
        Elements link = doc_content.select("p a");
//        System.out.println(doc_content);
        for (Element links : link) 
        {
//            System.out.println(links.attr("abs:href"));
            String link_content = links.attr("abs:href");
            System.out.println("--------------------------Start link: "+link_content+"----------------------");
            Document doc_link = Jsoup.connect(link_content).get();
            //System.out.println(doc_link);
            Elements doc_link_content = doc_link.select("div.each-page");
            Elements link_content_img = doc_link_content.select("img");
            for (Element link_imgs : link_content_img)
            {
                String link_img = link_imgs.attr("abs:src");
                System.out.println(link_img);
            }
//            System.out.println(link_content_img);
            System.out.println("--------------------------End link: "+link_content+"----------------------");
        }
//        System.out.println(link);
    }

    private void content(String link) throws IOException {
        Document doc = Jsoup.connect(link).get();
        System.out.println(doc);
    }

}
