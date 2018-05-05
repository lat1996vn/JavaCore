import java.awt.Frame;
class FrameDemo extends Frame{
  public FrameDemo(String title){
    super(title);
  } 
  public static void main(String args[]){
    FrameDemo frame = new FrameDemo("First Frame");
    frame.setSize(300,200);
    frame.setVisible(true);
  }
}
