public class Maxcount {
    public static  int Maxcount(LinkList<Integer> L) {
        int cnt=1;
        Integer maxe;
        LinkNode<Integer> p =L.head.next;
        maxe=p.data;
        while(p.next!=null){
            if (p.next.data>maxe){
                maxe=p.next.data;
                cnt=1;
            }
            else if (p.next.data==maxe)
                cnt++;
            p=p.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(new LinkNode<>(1));
        linkList.add(new LinkNode<>(2));
        linkList.add(new LinkNode<>(3));
        linkList.add(new LinkNode<>(3));
        linkList.add(new LinkNode<>(3));
        int num = Maxcount(linkList);
        System.out.println(num);
    }
}

}


