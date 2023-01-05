public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void displayForward(){
        Node<T> temp = head;
        while(temp != null){
            System.out.print(temp.getValue() + "-->");
            temp = temp.getNextNode();
        }
        System.out.print("null");
    }

    public void displayBackward(){
        Node<T> temp = tail;
        while(temp != null){
            System.out.print(temp.getValue() + "-->");
            temp = temp.getPreviousNode();
        }
        System.out.println("null");
    }

    public void add(T value){
        Node<T> newNode = new Node<>(value);
        if(head == null){
            head = newNode;
        }else{
            tail.setNextNode(newNode);
        }
        newNode.setPreviousNode(tail);
        newNode.setNextNode(null);
        tail = newNode;
        length++;
    }

    public void addFirst(T value){
        Node<T> newNode = new Node<>(value);
            if(head == null) {
                head = newNode;
                return;
            }else{
                head.setPreviousNode(newNode);
            }
            newNode.setNextNode(head);
            newNode.setPreviousNode(null);
            head = newNode;
            length++;
    }

    public void add(T value, int index){
       Node<T> newNode = new Node<>(value);
       int currentIndex = 0;
       if(head == null){
           head = newNode;
           return;
       }
       Node<T> current = head;
       while(current != null){
           if(currentIndex == index){
               newNode.setPreviousNode(current.getPreviousNode());
               if(current.getPreviousNode() != null) {
                   current.getPreviousNode().setNextNode(newNode);
               }
               newNode.setNextNode(current);
               current.setPreviousNode(newNode);
               length++;
           }
           current = current.getNextNode();
           currentIndex++;
       }
    }

    public T get(int index){
        if(head == null){
            return null;
        }
        int currentIndex = 0;
        Node<T> current = head;
        while(current != null){
            if(currentIndex == index){
                return current.getValue();
            }
            current = current.getNextNode();
            currentIndex++;
        }
        throw new ArrayIndexOutOfBoundsException(index);
    }

    public void delete(int index){
        Node<T> current = head;
        int currentIndex = 0;

        if(current.getNextNode() == null){
            head = null;
        }
        while(current != null){
            if(currentIndex == index){
                if(current.getPreviousNode() != null) {
                    current.getPreviousNode().setNextNode(current.getNextNode());
                }
                current.getNextNode().setPreviousNode(current.getPreviousNode());
               length --;
            }
            current = current.getNextNode();
            currentIndex ++;
        }

    }
}


