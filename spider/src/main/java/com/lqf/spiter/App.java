package com.lqf.spiter;

import java.util.Iterator;
import java.util.List;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws Exception {
		String url = "http://www.amazon.com/movies-tv-dvd-bluray/b/ref=sa_menu_mov?ie=UTF8&node=2625373011";
//		url = "http://www.amazon.com/books-used-books-textbooks/b/ref=topnav_storetab_b?ie=UTF8&node=283155";
		WebClient client = new WebClient();
		client.setJavaScriptEnabled(false);
		HtmlPage page = (HtmlPage) client.getPage(url);
		List tiles = page.getDocumentHtmlElement().getHtmlElementsByAttribute(
				"a", "class", "title ntTitle noLinkDecoration");
		System.out.println(tiles.size());

		Iterator it = tiles.iterator();
		while (it.hasNext()) {
			HtmlElement tmp = (HtmlElement) it.next();
			HtmlElement price = (HtmlElement)tmp.getParentDomNode().getFirstByXPath("span[@class = 's9Price red t14']");
			if (price == null)
				continue;
			
			System.out.println("href : " + tmp.getAttribute("href"));
			System.out.println("title : " + tmp.getAttribute("title"));
			System.out.println("imgurl : " + ((HtmlElement)tmp.getFirstByXPath("div/div/img")).getAttribute("src"));
			System.out.println("price : " + price.asText());
		}
	}
}
