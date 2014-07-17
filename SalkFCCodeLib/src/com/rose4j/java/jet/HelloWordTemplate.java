package com.focus.demo.jet.hello;

public class HelloWordTemplate
{
  protected static String nl;
  public static synchronized HelloWordTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    HelloWordTemplate result = new HelloWordTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\\";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = " Hello Word!!";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
String userName = (String)argument;


    stringBuffer.append(TEXT_2);
    stringBuffer.append(userName);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
