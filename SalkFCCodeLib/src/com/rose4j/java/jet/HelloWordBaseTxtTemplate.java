package com.focus.demo.jet.hello;

import java.util.*;

public class HelloWordBaseTxtTemplate
{
  protected static String nl;
  public static synchronized HelloWordBaseTxtTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    HelloWordBaseTxtTemplate result = new HelloWordBaseTxtTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "Copy right:2009-2015";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
