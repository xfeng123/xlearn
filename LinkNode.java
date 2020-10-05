public class LinkNode<E>		//单链表结点泛型类
{  E data;
    public LinkNode<E> next;
    public LinkNode()		//构造方法
    {   next=null;  }
    public LinkNode(E d)		//重载构造方法
    {  data=d;
        next=null;
    }
}
