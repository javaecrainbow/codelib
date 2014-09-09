package com.rose4j.java.jet;

public class HelloWordTxtTemplate
{
  protected static String nl;
  public static synchronized HelloWordTxtTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    HelloWordTxtTemplate result = new HelloWordTxtTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = " Hello Word!!" + NL;
  protected final String TEXT_4 = NL + "Copy right:2009-2015";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
String userName = (String)argument;


    stringBuffer.append(TEXT_2);
    stringBuffer.append(userName);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
