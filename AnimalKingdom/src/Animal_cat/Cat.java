package Animal_cat;

public class Cat extends Animal {
	 
	    int count;
	    public  CatShow(String name,int type,int count) {
	         super(name,type);
	        this.count=count;
	    }
	        System.out.println(type);
	        System.out.println(name);
	        System.out.println(count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		myCat.CatShow("sdgrh", 6, 87);
		
		
	}

}
