package com.mashibing.tank.cor;

import java.util.LinkedList;
import java.util.List;

import com.mashibing.tank.GameObject;
//它也实现collider，一个collide和一串collide不都是碰撞检测嘛，这样你就能add一个chain链条
public class ColliderChain implements Collider {
	private List<Collider> colliders = new LinkedList<>();
	
	public ColliderChain() {
		add(new BulletTankCollider());
		add(new TankTankCollider());
		add(new BulletWallCollider());
		add(new TankWallCollider());
	}
	
	
	public void add(Collider c) {
		colliders.add(c);
	}

	//让链条自己遍历
	public boolean collide(GameObject o1, GameObject o2) {
		for(int i=0; i<colliders.size(); i++) {
			if(!colliders.get(i).collide(o1, o2)) {
				//死了就不需要继续撞了，让cllide有返回值
				return false;
			}
		}
		
		return true;
	}
	
	
}
