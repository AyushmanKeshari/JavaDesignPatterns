package StructuralDesignPatterns.ProxyPattern.Problem_SlideShowImages;

public class ImageGallery {

  public static void main(String[] args) {

    String path = "C:\\Users\\ayush\\IdeaProjects\\JavaDesignPatterns\\src\\StructuralDesignPatterns\\ProxyPattern\\resources\\";

    DisplayObject image1 = new ImageFile(path + "image1.jpeg");
    DisplayObject image2 = new ImageFile(path + "image2.jpeg");
    DisplayObject image3 = new ImageFile(path + "image3.jpeg");
    DisplayObject image4 = new ImageFile(path + "image4.jpeg");
    DisplayObject image5 = new ImageFile(path + "image5.jpeg");
    DisplayObject image6 = new ImageFile(path + "image6.jpeg");
    DisplayObject image7 = new ImageFile(path + "image7.jpeg");
    DisplayObject image8 = new ImageFile(path + "image8.jpeg");
    DisplayObject image9 = new ImageFile(path + "image9.jpeg");
    DisplayObject image10 = new ImageFile(path + "image10.jpeg");


    image1.display();
    image2.display();
    image3.display();
    image4.display();
    image5.display();
    image6.display();
    image7.display();
    image8.display();
    image9.display();
    image10.display();

    image1.display();
    image2.display();
    image3.display();
    image4.display();
    image5.display();
    image6.display();
    image7.display();
    image8.display();
    image9.display();
    image10.display();

  }

}
