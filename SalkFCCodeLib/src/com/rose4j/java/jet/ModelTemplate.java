package com.rose4j.java.jet;

import java.util.*;

public class ModelTemplate
{
  protected static String nl;
  public static synchronized ModelTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    ModelTemplate result = new ModelTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "/**" + NL + " * UserInfo generated by jet" + NL + " */" + NL + "public class ";
  protected final String TEXT_3 = " implements java.io.Serializable {" + NL + "" + NL + "\t";
  protected final String TEXT_4 = NL + "\t\t";
  protected final String TEXT_5 = NL + "     private String ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + NL + "\tpublic ";
  protected final String TEXT_8 = "() {" + NL + "\t}" + NL + "" + NL + "\t";
  protected final String TEXT_9 = NL + "\t\t";
  protected final String TEXT_10 = NL + "     public void  set";
  protected final String TEXT_11 = "(String ";
  protected final String TEXT_12 = "){" + NL + "\t\tthis.";
  protected final String TEXT_13 = "=";
  protected final String TEXT_14 = NL + "}" + NL + "\tpublic String get";
  protected final String TEXT_15 = "(){" + NL + "\t\treturn this.";
  protected final String TEXT_16 = NL + "\t}";
  protected final String TEXT_17 = NL + NL + "}";
  protected final String TEXT_18 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
JavaTemplateParameter para = (JavaTemplateParameter)argument;
String packageName=para.getPackageName();
String className=para.getClassName();
List elementList = para.getFieldNames();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(packageName);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_3);
     for (Iterator i = elementList.iterator(); i.hasNext(); ) { 
    stringBuffer.append(TEXT_4);
    
		String fieldName = i.next().toString();
		
    stringBuffer.append(TEXT_5);
    stringBuffer.append(fieldName);
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_8);
     for (Iterator i = elementList.iterator(); i.hasNext(); ) { 
    stringBuffer.append(TEXT_9);
    
		String fldName = i.next().toString();
		String first = fldName.substring(0, 1).toUpperCase();
		String rest = fldName.substring(1, fldName.length());
		String newStr = new StringBuffer(first).append(rest).toString();
		
    stringBuffer.append(TEXT_10);
    stringBuffer.append(newStr);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(fldName);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(fldName);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(fldName);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(newStr);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(fldName);
    stringBuffer.append(TEXT_16);
     } 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}
