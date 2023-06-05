package java17.newfeatures.record;

public class RecordDemo {

  public static void main(String[] args) {
    Company company1 = new Company("Google", 100, true);
    System.out.println(company1);

    var company2 = new Company("Google", 100, true);
    System.out.println(company2);

    System.out.println("check equals(): " + company1.equals(company2));
  }


}
