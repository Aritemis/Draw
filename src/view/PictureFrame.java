package view;

import javax.swing.JFrame;

import controller.DrawConsole;

public class PictureFrame extends JFrame 
{
	
	private DrawConsole baseControl;
	private DrawPanel panel;
	private Shapely sculpt;
	
	public PictureFrame(DrawConsole baseControl)
	{
		this.baseControl = baseControl;
		this.panel = new DrawPanel(baseControl);
		this.sculpt = new Shapely();
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(panel);
		this.setSize(1500, 1000);
		this.add(sculpt);
		this.setVisible(true);
	}

}
