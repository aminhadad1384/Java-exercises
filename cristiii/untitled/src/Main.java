import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static class DoublyLinkedList<E>{
        private Node<E> head;
        private Node<E> tail;
        private int size;

        private static class Node<E> {
            private E _data;
            private Node<E> _next;
            private Node<E> _prev;

            public Node(E data) { this._data = data; }
            public Node(E data, Node<E> prev, Node<E> next) {
                this._data = data; this._next = next; this._prev = prev;
            }
            public Node<E> getNext() { return _next; }
            public void setNext(Node<E> next) { this._next = next; }
            public E getData() { return _data; }
            public void setData(E data) { this._data = data; }
            public Node<E> getPrev() { return _prev; }
            public void setPrev(Node<E> prev) { this._prev = prev; }
        }

        public DoublyLinkedList() {
            head = new Node<>(null,null,null);
            tail = new Node<>(null,head,null);
            head.setNext(tail);
        }

        private void addBetween(E e, Node<E> p, Node<E> q) {
            Node<E> newNode = new Node<>(e, p, q);
            p.setNext(newNode);
            q.setPrev(newNode);
            size++;
        }

        public boolean add(E e) {
            addBetween(e, tail.getPrev(), tail);
            return true;
        }

        public E getLast(){
            if(isEmpty()) throw new NoSuchElementException();
            return tail.getPrev().getData();
        }

        public E remove(Node<E> node){
            Node<E> p = node.getPrev();
            Node<E> q = node.getNext();
            p.setNext(q);
            q.setPrev(p);
            size--;
            return node.getData();
        }

        public E removeLast() {
            if(isEmpty()) throw new NoSuchElementException();
            return remove(tail.getPrev());
        }

        public int size() { return size; }
        public boolean isEmpty() { return size==0; }

        public E get(int index) {
            if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
            Node<E> c = head.getNext();
            for (int i = 0; i < index; i++) c = c.getNext();
            return c.getData();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int indexForTests=0; indexForTests<t; indexForTests++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            DoublyLinkedList<Integer> d = new DoublyLinkedList<>();
            //adding numbers
            for(int AddIndex=0; AddIndex<n; AddIndex++){
                d.add(sc.nextInt());
            }
            //removing
            for(int DeleteIndex=0; DeleteIndex<k; DeleteIndex++){
                boolean removed = false;
                DoublyLinkedList.Node<Integer> node = d.head.getNext();

                while(node.getNext() != d.tail){
                    if(node.getData() < node.getNext().getData()){
                        d.remove(node);
                        removed = true;
                        break;
                    }
                    node = node.getNext();
                }
                if(!removed && !d.isEmpty()){
                    d.removeLast();
                }
            }

            for(int i=0; i<d.size(); i++){
                System.out.print(d.get(i) + " ");
            }
            System.out.println();
        }
    }
}