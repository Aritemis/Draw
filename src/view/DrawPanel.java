package view;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import controller.DrawConsole;
import java.awt.Color;

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
		setBackground(new Color(192, 192, 192));
		this.baseControl = baseControl;
		this.shape = new Shapely();
		this.theLayout = new SpringLayout();
		theLayout.putConstraint(SpringLayout.NORTH, shape, 50, SpringLayout.NORTH, this);
		theLayout.putConstraint(SpringLayout.SOUTH, shape, -54, SpringLayout.SOUTH, this);
		this.triangleButton = new JButton("Triangle");
		theLayout.putConstraint(SpringLayout.SOUTH, triangleButton, -6, SpringLayout.NORTH, shape);
		theLayout.putConstraint(SpringLayout.EAST, triangleButton, -179, SpringLayout.EAST, this);
		this.rectangleButton = new JButton("Rectangle");
		theLayout.putConstraint(SpringLayout.SOUTH, rectangleButton, -6, SpringLayout.NORTH, shape);
		this.clearButton = new JButton("Clear");
		theLayout.putConstraint(SpringLayout.WEST, clearButton, 0, SpringLayout.WEST, shape);
		theLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		clearButton.setBackground(Color.LIGHT_GRAY);
		clearButton.setForeground(Color.BLACK);
		this.circleButton = new JButton("Circle");
		theLayout.putConstraint(SpringLayout.SOUTH, circleButton, -6, SpringLayout.NORTH, shape);
		this.squareButton = new JButton("Square");
		theLayout.putConstraint(SpringLayout.WEST, circleButton, 6, SpringLayout.EAST, squareButton);
		theLayout.putConstraint(SpringLayout.WEST, squareButton, 6, SpringLayout.EAST, rectangleButton);
		theLayout.putConstraint(SpringLayout.SOUTH, squareButton, -6, SpringLayout.NORTH, shape);
		this.ellipseButton = new JButton("Ellipse");
		theLayout.putConstraint(SpringLayout.WEST, ellipseButton, 6, SpringLayout.EAST, triangleButton);
		theLayout.putConstraint(SpringLayout.SOUTH, ellipseButton, -6, SpringLayout.NORTH, shape);
		this.polygonButton= new JButton("Polygon");
		theLayout.putConstraint(SpringLayout.EAST, polygonButton, -570, SpringLayout.EAST, this);
		theLayout.putConstraint(SpringLayout.WEST, rectangleButton, 6, SpringLayout.EAST, polygonButton);
		theLayout.putConstraint(SpringLayout.SOUTH, polygonButton, -6, SpringLayout.NORTH, shape);
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
		this.add(ellipseButton);
		this.add(polygonButton);
		this.add(clearButton);
	}

	private void setupLayout() 
	{
		theLayout.putConstraint(SpringLayout.WEST, shape, 25, SpringLayout.WEST, this);
		theLayout.putConstraint(SpringLayout.EAST, shape, -25, SpringLayout.EAST, this);
		
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
