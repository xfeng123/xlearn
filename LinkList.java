//单链表泛型类
public class LinkList<E> {
    public LinkNode<E> head;		//存放头结点
    public LinkNode<E> point;

    //构造方法
    public LinkList() {
        head=new LinkNode<E>();	//创建头结点
        head.next=null;		//头结点next成员置为next
    }

    public void add(LinkNode<E> node){
        if (head.next==null){
            this.head.next = node;
            this.point = this.head.next;
        }else {
            this.point.next = node;
            this.point = node;
        }
    }

}