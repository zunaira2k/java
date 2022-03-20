package inheritanceoverridding;
class shape{
    void draw() {
		System.out.println("Drawing Shape");
	}
	
	void erase() {
		System.out.println("Erasing Shape");
	}
}

class Circle extends shape{
    
    @Override void draw(){
System.out.println("Drawing circle");
    }
    @Override void erase(){
System.out.println("Erasing circle");
            }
}

class Triangle extends shape{
    @Override void draw(){
        System.out.println("Drawing Triangle");
            }
    @Override void erase(){
        System.out.println("Erasing Triangle");
                    }
}

class Square extends shape{
    @Override
	void draw() {
		System.out.println("Drawing Square");
	}
	
	@Override
	void erase() {
		System.out.println("Erasing Square");
	}
}
public class inhertsol2 {
    public static void main(String[] args) {
        
    
    shape c = new Circle();
    shape t = new Triangle();
    shape s = new Square();
    
    c.draw(); c.erase();
    t.draw(); t.erase();
    s.draw(); s.erase();
}
}
