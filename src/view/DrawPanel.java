package view;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import controller.DrawConsole;

public class DrawPanel extends JPanel 
{

	private DrawConsole baseControl;
	private JButton rectangleButton;
	private JButton clearButton;
	private JButton circleButton;
	private JButton squareButton;
	private JButton polygonButton;
	private JButton triangleButton;
	private JScrollPane DrawPayne;
	private Shapely shape;
	private ArrayList<Rectangle> rectangleList;
	private SpringLayout theLayout;
	
	public DrawPanel(DrawConsole baseControl)
	{
		this.baseControl = baseControl;
		this.shape = new Shapely();
		this.theLayout = new SpringLayout();
		this.triangleButton = new JButton("Triangle");
		this.rectangleButton = new JButton("Rectangle");
		this.clearButton = new JButton("Clear");
		this.circleButton = new JButton("Circle");
		this.squareButton= new JButton("Square");
		this.polygonButton= new JButton("Polygon");
		this.rectangleList = new ArrayList<Rectangle>();
		
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel() 
	{
		this.setLayout(theLayout);
		this.add(shape);
		this.add(triangleButton);
		this.add(rectangleButton);
		this.add(circleButton);
		this.add(squareButton);
		this.add(polygonButton);
		this.add(clearButton);
	}

	private void setupLayout() 
	{
		
	}

	private void setupListeners() 
	{
		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent OnClick)
			{
				shape.clear();
				repaint();
			}
		});
		
		triangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent OnClick)
			{
				shape.addTriangle();
				repaint();
			}
		});
		
		rectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent OnClick)
			{
				shape.addTriangle();
				repaint();
			}
		});
		
		circleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent OnClick)
			{
				shape.addTriangle();
				repaint();
			}
		});
		
		squareButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent OnClick)
			{
				shape.addTriangle();
				repaint();
			}
		});
		
		polygonButton.addActionListener(new ActionListener()
		{
			public void actionPerfomed(ActionEvent OnClick)
			{
				shape.addPolygon();
				repaint();
			}
		});
	}
	
}
