package StructuralDesignPatterns.ProxyPattern.ProxyPatternSlideShowImages;

public class ImageGallery {

  //Loading all images in the beginning, user might not open some images.
  public static void main(String[] args) {

    String path = "C:\\Users\\ayush\\IdeaProjects\\JavaDesignPatterns\\src\\StructuralDesignPatterns\\ProxyPattern\\resources\\";

    DisplayObject image1 = new ImageProxy(path + "image1.jpeg");
    DisplayObject image2 = new ImageProxy(path + "image2.jpeg");
    DisplayObject image3 = new ImageProxy(path + "image3.jpeg");
    DisplayObject image4 = new ImageProxy(path + "image4.jpeg");
    DisplayObject image5 = new ImageProxy(path + "image5.jpeg");
    DisplayObject image6 = new ImageProxy(path + "image6.jpeg");
    DisplayObject image7 = new ImageProxy(path + "image7.jpeg");
    DisplayObject image8 = new ImageProxy(path + "image8.jpeg");
    DisplayObject image9 = new ImageProxy(path + "image9.jpeg");
    DisplayObject image10 = new ImageProxy(path + "image10.jpeg");

    //Lazy loading: Reduce memory use.
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
