package com.rose4j.java.jet;

public class CustomizeGreetingTemplate implements IGenerator
 {
  protected static String nl;
  public static synchronized CustomizeGreetingTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    CustomizeGreetingTemplate result = new CustomizeGreetingTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " Hello, ";
  protected final String TEXT_2 = NL + " The current time is ";
  protected final String TEXT_3 = ".";

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(new java.util.Date());
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}