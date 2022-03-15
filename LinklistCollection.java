public class LinklistCollection extends AbstractCollection {

    class Node{
        Object object;
        Node next;
        Node prev;
Node(){
    prev=next=this;

}
Node(Object obj ,Node p,Node n)
{
    this.prev=p;
    this.next=n;
    this.object=obj;
}


    }
private int size;
private Node head =new Node();
public boolean add(Object object){
    
    head.prev=head.prev.next=new Node(object,head.prev,head);
    ++size;
    return true;
}
public int size(){

    return size;
}

public Iterator iterator(){
return new Iterator() {
    private Node cursor=head.next;
    private boolean okremove=false;
    public boolean hasnext(){
return (cursor!=head);

    }
    public Object next(){

if(cursor==head) throw new RuntimeException();
Object temp=cursor.object;
cursor=cursor.next;
okremove=true;
return temp;

    }

    public void remove(){
        if(!okremove){
            throw new IllegalStateException();
        }
        Object temp=cursor.object;
        cursor.prev=cursor.prev.prev;
        cursor.prev.next=cursor;
        --size;
        okremove=false;
    }
};
}
    public static void main(String[] args) {
        LinklistCollection l=new LinklistCollection();
      
        l.add("Apple");
        l.add("Orange");
        l.add("Banana");
        l.add("Melon");
        l.add("Watermelon");
        System.out.println(l.size);
        System.out.println(  l.contains("Apple"));
        l.Contains("Aplle");
        
        Iterator its=(Iterator)l.iterator();
        System.out.println(l);
        its.next();
        its.remove();
        System.out.println(l);

      
    }
    @Override
    public Iterator Iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}
