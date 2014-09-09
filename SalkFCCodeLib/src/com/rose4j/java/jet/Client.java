package com.rose4j.java.jet;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Client {
  @Test
  public void testTxt() {
	  HelloWordTxtTemplate template = new HelloWordTxtTemplate();
	  String result = template.generate("Tom");
	  System.out.println("test result:"+result);
  }
  @Test
  public void testXml(){
	  HelloWordXmlTemplate template = new HelloWordXmlTemplate();
	  List demo = new ArrayList();
	  demo.add("first");
	  demo.add("second");
	  demo.add("third");
	  String result = template.generate(demo);
	  System.out.println("test result:"+result);
  }
  @Test
  public void testJsp(){
	  HelloWordJspTemplate template = new HelloWordJspTemplate();
	  String result = template.generate("button");
	  System.out.println("test result:"+result);
  }
  @Test(dataProvider="javaMethodData")
  public void testJava(String data){
	  HelloWordJavaTemplate template = new HelloWordJavaTemplate();
	  String result = template.generate(data);
	  System.out.println("test result:"+result);
  }
  @DataProvider
  public Object[][] javaMethodData(){
	  return new Object[][]{new Object[]{"ss"},new Object[]{"sst"}};
  }
  @Test
  public void testGenerateModel(){
	  ModelTemplate template = new ModelTemplate();
	  JavaTemplateParameter parameter = new JavaTemplateParameter();
	  parameter.setPackageName("com.focus.model");
	  parameter.setClassName("UserInfo");
	  List fields = new ArrayList();
	  fields.add("userName");
	  fields.add("password");
	  parameter.setFieldNames(fields);
	  System.out.println(template.generate(parameter));
  }
  
  
}
