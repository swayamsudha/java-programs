/*create a frame*/
import java.awt.*;
class FrameDemo
{
	public static void main(String args[])
	{
		//frame creation
		Frame fr = new Frame("My awt program");
		//set the size of frame
		fr.setSize(300,250);//300pixel is the width and 250 is the height
		//display the frame
		fr.setVisible(true);
	}
}