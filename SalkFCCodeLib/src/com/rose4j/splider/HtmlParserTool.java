package com.rose4j.splider;

import java.util.HashSet;
import java.util.Set;

import org.htmlparser.Parser;
import org.w3c.dom.NodeList;
import org.w3c.dom.traversal.NodeFilter;
import org.htmlparser.filters.NodeClassFilter;
import org.htmlparser.filters.OrFilter;
import org.htmlparser.tags.LinkTag;
public class HtmlParserTool {
	// ��ȡһ����վ�ϵ�����,filter ������������
		public  Set<String> extracLinks(String url,LinkFilter filter) {

			Set<String> links = new HashSet<String>();
			try {
				Parser parser = new Parser();
				
				//parser.setURL(url);
				//parser.setEncoding("gb2312");
				//parser.setEncoding("gb22312");
				// ���� <frame >��ǩ�� filter��������ȡ frame ��ǩ��� src ��������ʾ������
//				NodeFilter frameFilter = new NodeFilter() {
//					public boolean accept(Node node) {
//						if (node.getText().startsWith("frame src=")) {
//							return true;
//						} else {
//							return false; 
//						}
//					}
//				};
				NodeFilter frameFilter=null;
				// OrFilter �� ���ù��� <a> ��ǩ���� <frame> ��ǩ
				//frameFilter
//				OrFilter linkFilter = new OrFilter(new NodeClassFilter(
//						LinkTag.class), frameFilter);
				// �õ����о������˵ı�ǩ
				OrFilter linkFilter=null;
				//NodeList list = parser.extractAllNodesThatMatch(linkFilter);
				NodeList list=null;
//				for (int i = 0; i < list.size(); i++) {
//					Node tag = list.elementAt(i);
//					if (tag instanceof LinkTag)// <a> ��ǩ
//					{
//						LinkTag link = (LinkTag) tag;
//						String linkUrl = link.getLink();// url
//						if(filter.accept(linkUrl))
//							links.add(linkUrl);
//					} else// <frame> ��ǩ
//					{
//			        // ��ȡ frame �� src ���Ե������� <frame src="test.html"/>
//						String frame = tag.getText();
//						int start = frame.indexOf("src=");
//						frame = frame.substring(start);
//						int end = frame.indexOf(" ");
//						if (end == -1)
//							end = frame.indexOf(">");
//						String frameUrl = frame.substring(5, end - 1);
//						if(filter.accept(frameUrl))
//							links.add(frameUrl);
//					}
//				}
			} catch (ParserException e) {
				e.printStackTrace();
			}
			return links;
		}
}
