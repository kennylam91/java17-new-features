package java17.newfeatures.typecasting;

import java17.newfeatures.record.Company;

public class TypeCastingDemo {

  public static void main(String[] args) {
    Object obj = new Company("Facebook", 10000, true);
    if(obj instanceof Company comp) {
      System.out.println("This is a company: " + comp);
    }
  }

}
