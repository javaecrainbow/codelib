package com.rose4j.java.jet;

import java.util.*;

public class HelloWordJavaTemplate
{
  protected static String nl;
  public static synchronized HelloWordJavaTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    HelloWordJavaTemplate result = new HelloWordJavaTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "test ss;";
  protected final String TEXT_2 = NL + "test not ss;";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
String arg = (String)argument;
if("ss".equals(arg)){

    stringBuffer.append(TEXT_1);
    
}else{

    stringBuffer.append(TEXT_2);
    
}

    return stringBuffer.toString();
  }
}
