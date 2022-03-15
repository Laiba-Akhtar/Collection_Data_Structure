
public class ArrayCollection extends AbstractCollection {
    private final int LENGTH_I=16;
    public  int size;


    
    private Object[] a=new Object[LENGTH_I];
        public  int size(){
        
            return  size;
        }


        public void resize(int newsize){

            // Object[] b = new Object[newsize];
            // for(int i=0;i< LENGTH_I;i++)
            // {
            //     b[i]=a[i];
            // }
            // a=b;
        System.arraycopy(a, 0, b, 0, a.length);

        
        }
        public  boolean add(Object obj){
            if(size==a.length)
              resize(2*size);
            a[size++]=obj;
            return  true;
        }
      

   

   

    public Iterator iterator(){
            return  new Iterator() {
                private  int i=0;
                private  boolean okToremove=false;

                public boolean hasnext() {
                    return (i<size);
                }


                public Object next() {
                    if(i==size) throw new RuntimeException();
                    okToremove=true;
                    return a[i++];
                }


                public void remove() {
                        if(!okToremove) throw new IllegalStateException();
                        a[--i]=a[--size];
                        a[size]=null;
                        okToremove=false;
                }
            };
        }
       
          
public static void main(String[] args) {
    ArrayCollection a=new ArrayCollection();
    a.add("Apple");
    a.add("Orange");
    a.add("Banana");
    a.add("Melon");
    a.add("Watermelon");
    System.out.println(a.size);
  
    System.out.println( a.contains("Apple"));
   a.contains("Apple");
    Iterator its=(Iterator)a.iterator();
   its.next();
    // System.out.print (a);
    System.out.println(a.remove(null));
   its.remove();
    System.out.print (a);
    

}

    @Override
    public Iterator Iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}
    
/*class ArrayCollection extends AbstractCollection {

    private final int  length_I=16;
    private int size;
    private Object[] b = new Object[length_I];


public void resize(int newsize){

    Object[] a = new Object[newsize];
    for(int i=0;i<length_I;i++)
    {
        a[i]=b[i];
    }
    b=a;


}

    @Override
    public int size() {
        
        return size;
    }
    public boolean add(Object object){
        if(size==length_I){
resize(2*length_I);
        }
        b[size++]=object;
        return true;
    }
    




   
public static void main(String[] args) {
    ArrayCollection a=new ArrayCollection();
    a.add("Apple");
    a.add("Orange");
    a.add("Banana");
    a.add("Melon");
    a.add("Watermelon");
    
    Iterator its=a.iterator();
    its.toString();

}

@Override
public Iterator iterator() {
    return new  Iterator;
    int i=0;
    boolean oktoremove=false;
   public boolean hasnext() {

return (i<size);

}
public Object next()
{

    if(i==size){
throw  new RuntimeException();
    }

if(oktoremove==true) {
    return b[i++];
}
}

public void remove(){
    if(!oktoremove) throw new IllegalAccessError();

    b[--i]=b[--size];
    b[size]=null;
oktoremove=false;

}

@Override
public Iterator Iterator() {
    // TODO Auto-generated method stub
    return null;
}



}


*/
