class SingleLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public SingleLinkedList() {
        this.size = size;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail=head;
        }
        size++;
    }
    public void insertLast(int val)
    {
        Node node= new Node(val);
        if(head==null)
        {
            insertFirst(val);
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertMiddle(int value,int index)
    {
        Node node= new Node(value);
        if(index==1)
        {
            insertFirst(value);
            return;
        }
        if(index==size)
        {
            insertLast(value);
            return;
        }
        Node temp=head;
        for (int i = 1; i <index-1; i++) {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public int deleteAtFirst()
    {
        int val=head.value;
        Node temp=head;
        head=head.next;
        temp=null;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteAtLast()
    {
        if(head==tail)
        {
           
            return  deleteAtFirst();
        }
        int val= tail.value;
        Node lastSecond=get(size-2);
        tail=lastSecond;
        tail.next=null;
        size--;
        return val;
    }

    public Node get(int index)
    {
        Node temp=head;
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        return temp;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}