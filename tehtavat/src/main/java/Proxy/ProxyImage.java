package Proxy;

public class ProxyImage implements Image {
  private final String filename;
  private RealImage image;

  public ProxyImage(String filename) {
    this.filename = filename;
  }

  @Override
  public void displayImage() {
    if (image == null) {
      image = new RealImage(filename);
    }
    image.displayImage();
  }

  @Override
  public void showData() {
    // TODO Auto-generated method stub
    System.out.println("ProxyImage.showData() not implemented");
  }

}