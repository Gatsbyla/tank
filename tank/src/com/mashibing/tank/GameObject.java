package com.mashibing.tank;

import java.awt.Graphics;
import java.io.Serializable;
//抽象只需要把必须的抽象出来，必有的属性必有 的方法
public abstract class GameObject implements Serializable {
	public int x, y;
	
	public abstract void paint(Graphics g);
	public abstract int getWidth();
	public abstract int getHeight();
}
