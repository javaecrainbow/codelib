package com.focus.demo.jet.hello;

import java.util.*;

public class HelloWordXmlTemplate
{
  protected static String nl;
  public static synchronized HelloWordXmlTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    HelloWordXmlTemplate result = new HelloWordXmlTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "   <demo>";
  protected final String TEXT_2 = NL + NL + "     <element>";
  protected final String TEXT_3 = "</element>";
  protected final String TEXT_4 = NL + "   </demo>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     List elementList = (List) argument; 
    stringBuffer.append(TEXT_1);
     for (Iterator i = elementList.iterator(); i.hasNext(); ) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(i.next().toString());
    stringBuffer.append(TEXT_3);
     } 
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
