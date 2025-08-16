package org.barghos.math.shapes;

import org.barghos.math.matrix.IMat4RF;
import org.barghos.math.vector.Vec3F;
import org.barghos.util.tuple.floats.ITup3RF;

public class Triangle3F
{	
	public Vec3F a = new Vec3F();
	public Vec3F b = new Vec3F();
	public Vec3F c = new Vec3F();
	
	public Triangle3F() { }
	public Triangle3F(ITup3RF a, ITup3RF b, ITup3RF c) { this.a.set(a); this.b.set(b); this.c.set(c); }
	public Triangle3F(Triangle3F t) { this.a.set(t.a); this.b.set(t.b); this.c.set(t.c); }
	
	
	public Triangle3F set(ITup3RF a, ITup3RF b, ITup3RF c) { this.a.set(a); this.b.set(b); this.c.set(c); return this; }
	public Triangle3F set(Triangle3F t) { this.a.set(t.a); this.b.set(t.b); this.c.set(t.c); return this; }
	
	public Vec3F[] getPoints()
	{
		return new Vec3F[] {this.a, this.b, this.c};
	}

	public Vec3F[] getPoints(IMat4RF m)
	{
		Vec3F a = m.transform3T(true, this.a, new Vec3F());
		Vec3F b = m.transform3T(true, this.b, new Vec3F());
		Vec3F c = m.transform3T(true, this.c, new Vec3F());
		
		return new Vec3F[] {a, b, c};
	}


	public Triangle3F transform(IMat4RF m)
	{
		Vec3F a = m.transform3T(true, this.a, new Vec3F());
		Vec3F b = m.transform3T(true, this.b, new Vec3F());
		Vec3F c = m.transform3T(true, this.c, new Vec3F());
		
		return new Triangle3F(a, b, c);
	}
	
	public Triangle3F transform(IMat4RF m, Triangle3F t)
	{
		if(t == null) t = new Triangle3F();
		
		Vec3F a = m.transform3T(true, this.a, new Vec3F());
		Vec3F b = m.transform3T(true, this.b, new Vec3F());
		Vec3F c = m.transform3T(true, this.c, new Vec3F());
		
		return t.set(a, b, c);
	}
}
