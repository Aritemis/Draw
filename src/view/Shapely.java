package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Shapely extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Rectangle> squareList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public Shapely()
	{
		this.rectangleList = new ArrayList<Rectangle>();
		this.squareList = new ArrayList<Rectangle>();
		this.ellipseList = new ArrayList<Ellipse2D>();
		this.circleList = new ArrayList<Ellipse2D>();
		this.triangleList = new ArrayList<Polygon>();
		this.polygonList = new ArrayList<Polygon>();
	}
	
	public void addRectangle()
	{
		int xPosition = (int)(Math.random() * 750);
		int yPosition = (int)(Math.random() * 750);
		int width = (int)(Math.random() * 100);
		int height = (int)(Math.random() * 100);
		
		rectangleList.add(new Rectangle(xPosition, yPosition, width, height));
	}
	
	public void addSquare()
	{
		int xPosition = (int)(Math.random() * 500);
		int yPosition = (int)(Math.random() * 500);
		int size = (int)(Math.random() * 100);
		
		squareList.add(new Rectangle(xPosition, yPosition, size, size));
	}
	
	public void addEllipse()
	{
		int xPosition = (int)(Math.random() * 500);
		int yPosition = (int)(Math.random() * 500);
		int width = (int)(Math.random() * 100);
		int height = (int)(Math.random() * 100);
		
		Ellipse2D current = new Ellipse2D.Double(xPosition, yPosition, width, height);
		ellipseList.add(current);
		
	}
	
	public void addCircle()
	{
		int xPosition = (int)(Math.random() * 500);
		int yPosition = (int)(Math.random() * 500);
		int size = (int)(Math.random() * 100);
		
		Ellipse2D current = new Ellipse2D.Double(xPosition, yPosition, size, size);
		ellipseList.add(current);
	}
	
	public void addTriangle()
	{
		int[] xPoints = new int[3];
		int[] yPoints = new int[3];
		
		xPoints = new int[] {(int)(Math.random() * 400), (int)(Math.random() * 400), (int)(Math.random() * 400)};
		yPoints = new int[] {(int)(Math.random() * 400), (int)(Math.random() * 400), (int)(Math.random() * 400)};
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		
		triangleList.add(triangle);
	}
	
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 5) + 3;
		int[] xPoints = new int[numberOfSides];
		int[] yPoints = new int[numberOfSides];
		
		for(int sides = 0; sides < numberOfSides; sides++)
		{
			xPoints[sides] = (int)(Math.random() * 500);
			yPoints[sides] = (int)(Math.random() * 500);
		}
		
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
	}
	
	public void clear()
	{
		rectangleList.clear();
		squareList.clear();
		ellipseList.clear();
		circleList.clear();
		triangleList.clear();
		polygonList.clear();
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		
		for(Rectangle current : rectangleList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue, alpha));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.fill(current);
		}
		
		for(Rectangle current : squareList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue, alpha));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.fill(current);
		}
		
		for(Ellipse2D current : ellipseList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue, alpha));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.fill(current);
		}
		
		for(Ellipse2D current : circleList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue, alpha));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.fill(current);
		}
		
		for(Polygon current : triangleList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue, alpha));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.fill(current);
		}
		
		for(Polygon current : polygonList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue, alpha));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.fill(current);
		}
	}
}