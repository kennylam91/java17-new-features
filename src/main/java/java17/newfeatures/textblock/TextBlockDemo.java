package java17.newfeatures.textblock;

public class TextBlockDemo {

  public static void main(String[] args) {
    final String text = """
        {
          "name": "John Doe",
          "age": 25,
          "address": "Le Van Thiem, Ha Noi, Viet Nam"
        }
        """;
    final String textWithPrecedingSpaces = """
        {
          "name": "John Doe",
          "age": 25,
          "address": "Le Van Thiem, Ha Noi, Viet Nam"
        }
      """;

    System.out.println(text);
    System.out.println("123");
    System.out.println(textWithPrecedingSpaces);
  }

}
