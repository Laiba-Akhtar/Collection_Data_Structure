

public abstract class AbstractCollection implements collectioninterface{

protected AbstractCollection()
{}

public abstract int size();
public abstract Iterator Iterator ();
public boolean add(Object object){ throw new UnsupportedOperationException();


    
}
public boolean isEmpty()
{
    return size()==0;
}
public String toString(){
if(isEmpty()) return "[]";
Iterator it= iterator();
StringBuffer buff=new StringBuffer("["+it.next()  );
    while(it.hasnext()){
    buff.append(","+it.next());
    

}


return (buff+"]");
}
public void clear()
{
for(Iterator   it=iterator();it.hasnext();){
    it.next();
    it.remove();

}
}

public boolean remove(Object object){

    Iterator   it=iterator();
if(object==null){

while(it.hasnext()){
    if(it.next()==null)
    {
it.remove();

    }
}
return true;

}
else 
{

    while(it.hasnext()){
        if(object .equals(it.next()))
        {
    it.remove();
    return true;
    
        }
    }
    return false;
    
    }

}


public boolean contains(Object object){

    Iterator  it=iterator ();
    if(object==null){
    
    while(it.hasnext()){
        if(it.next()==null)
        {
    
    //return true;
        }
    }
    return true;
    
    }
    else 
    {
    
        while(it.hasnext()){
            if(object .equals(it.next()))
            {
        
        return true;
        
            }
        }
        return false;
        
        }
    
    }


  
    
    
    
    
    
    
    
        
    }




    
