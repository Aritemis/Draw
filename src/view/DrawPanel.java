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
	private JButton ellipseButton;
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
		theLayout.putConstraint(SpringLayout.WEST, triangleButton, 10, SpringLayout.WEST, this);
		theLayout.putConstraint(SpringLayout.SOUTH, triangleButton, -10, SpringLayout.SOUTH, this);
		theLayout.putConstraint(SpringLayout.NORTH, rectangleButton, 0, SpringLayout.NORTH, triangleButton);
		theLayout.putConstraint(SpringLayout.WEST, rectangleButton, 6, SpringLayout.EAST, triangleButton);
		theLayout.putConstraint(SpringLayout.NORTH, circleButton, 0, SpringLayout.NORTH, triangleButton);
		theLayout.putConstraint(SpringLayout.WEST, circleButton, 6, SpringLayout.EAST, rectangleButton);
		theLayout.putConstraint(SpringLayout.NORTH, squareButton, 0, SpringLayout.NORTH, triangleButton);
		theLayout.putConstraint(SpringLayout.WEST, squareButton, 6, SpringLayout.EAST, circleButton);
		theLayout.putConstraint(SpringLayout.WEST, polygonButton, 0, SpringLayout.WEST, triangleButton);
		theLayout.putConstraint(SpringLayout.SOUTH, polygonButton, -6, SpringLayout.NORTH, triangleButton);
		
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
				shape.addRectangle();
				repaint();
			}
		});
		
		circleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent OnClick)
			{
				shape.addCircle();
				repaint();
			}
		});
		
		squareButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent OnClick)
			{
				shape.addSquare();
				repaint();
			}
		});
		
		polygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent OnClick)
			{
				shape.addPolygon();
				repaint();
			}
		});
		
		ellipseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent OnClick)
			{
				shape.addEllipse();
				repaint();
			}
		});
	}
	
}
