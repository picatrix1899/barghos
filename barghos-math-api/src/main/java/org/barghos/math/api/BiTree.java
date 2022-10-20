package org.barghos.math.api;

import java.util.ArrayList;
import java.util.List;

public class BiTree
{
	private BiTree a;
	private BiTree b;
	private List<Model> values = new ArrayList<Model>();
	public float posX;
	public float posY;
	public float width;
	public float height;
	
	public BiTree(float width, float height, float posX, float posY)
	{
		this.width = width;
		this.height = height;
		this.posX = posX;
		this.posY = posY;
	}
	
	public void add(Model model)
	{
		if(values.size() == 4)
		{
			split();
		}
		
		if(a != null)
		{
			if(a.compare(model.aabb)) a.add(model);
			if(b.compare(model.aabb)) b.add(model);
			
			return;
		}
		
		this.values.add(model);
	}
	
	public void split()
	{
		if(width >= height)
		{
			a = new BiTree(this.width / 2.0f, this.height, this.posX, this.posY);
			b = new BiTree(this.width / 2.0f, this.height, (this.posX + this.width) / 2.0f, this.posY);
			System.out.println("Branch A: " + this.width / 2.0f + "/" + this.height + ", " + this.posX + "/" + this.posY);
			System.out.println("Branch B: " + this.width / 2.0f + "/" + this.height + ", " + (this.posX + this.width) / 2.0f + "/" + this.posY);
		}
		else
		{
			a = new BiTree(this.width , this.height / 2.0f, this.posX, this.posY);
			b = new BiTree(this.width , this.height / 2.0f, this.posX, (this.posY + this.width) / 2.0f);
			
			System.out.println("Branch A: " + this.width + "/" + this.height / 2.0f + ", " + this.posX + "/" + this.posY);
			System.out.println("Branch B: " + this.width + "/" + this.height / 2.0f + ", " + this.posX + "/" + (this.posY + this.width) / 2.0f);
		}
		
		for(Model m : this.values)
		{
			if(a.compare(m.aabb)) a.add(m);
			if(b.compare(m.aabb)) b.add(m);
		}
		
		values.clear();
	}
	
	public boolean compare(AABB2f aabb)
	{

		return	!(aabb.maxX < this.posX || aabb.minX > this.posX + this.width ||
				aabb.maxY < this.posY  || aabb.minY > this.posY + this.height);
	}
	
	public void get(AABB2f aabb, List<Model> models)
	{
		if(a != null)
		{
			if(a.compare(aabb)) a.get(aabb, models);
			if(b.compare(aabb)) b.get(aabb, models);
			
			return;
		}
		
		models.addAll(this.values);
	}
}
