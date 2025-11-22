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

            public Node(E data) {
                this._data = data;
            }

            public Node(E data, Node prev, Node next) {
                this._data = data;
                this._next = next;
                this._prev = prev;
            }

            public Node<E> getNext() {
                return _next;
            }

            public void setNext(Node<E> next) {
                this._next = next;
            }

            public E getData() {
                return _data;
            }

            public void setData(E data) {
                this._data = data;
            }

            public Node<E> getPrev() {
                return _prev;
            }

            public void setPrev(Node prev) {
                this._prev = prev;
            }
        }

        public DoublyLinkedList() {
            head = new Node(null,null,null);
            tail = new Node(null,head,null);
            head.setNext(tail);
        }

        private void addBetween(E e, Node<E> p, Node<E> q) {
            Node<E> newNode = new Node<>(e, p, q);
            p.setNext(newNode);
            q.setPrev(newNode);
            size++;
        }

        public boolean add(E e) {
            addBetween(e, tail.getPrev(),tail);
            return true;
        }

        public void add(int index, E element) {
            if(index<0 || index > size) throw new IndexOutOfBoundsException();
            Node c = head;
            for (int i = 0; i < index; i++)
                c = c.getNext();
            addBetween(element,c,c.getNext());
        }

        public void addFirst(E e) {
            addBetween(e, head, head.getNext());
        }


        public E get(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException();
            Node<E> c = head.getNext();
            for (int i = 0; i < index; i++)
                c = c.getNext();
            return c.getData();
        }

        public E getFirst()  {
            if(isEmpty()) throw new NoSuchElementException();
            return head.getNext().getData();
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
        public E remove(int index) throws IndexOutOfBoundsException {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException();
            Node<E> c = head.getNext();
            for (int i = 0; i < index; i++)
                c = c.getNext();
            return remove(c);
        }

        public boolean remove(E e) {
            Node<E> c = head.getNext();
            while(c!=tail) {
                if (c.getData().equals(e)) {
                    remove(c);
                    return true;
                }
                c= c.getNext();
            }
            return false;
        }

        public E removeFirst() throws NoSuchElementException {
            if(isEmpty()) throw new NoSuchElementException();
            return remove(head.getNext());
        }

        public E removeLast() throws NoSuchElementException {
            if(isEmpty()) throw new NoSuchElementException();
            return remove(tail.getPrev());
        }


        public E set(int index, E e) throws IndexOutOfBoundsException {
            if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
            Node<E> c = head.getNext();
            for (int i = 0; i < index; i++) {
                c = c.getNext();
            }
            E data = c.getData();
            c.setData(e);
            return data;
        }


        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size==0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String numbers=sc.nextLine();
        String[] parts = numbers.split(" ");
        int[] NumArr = new int[n];
        for (int i = 0; i < NumArr.length; i++) {
            NumArr[i] = Integer.parseInt(parts[i]);
        }
        DoublyLinkedList<Integer> listOfNumbers = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> listOfOdds = new DoublyLinkedList<>();
        for(int i=0;i<NumArr.length;){
            while (i < NumArr.length && NumArr[i] % 2 == 0) {
                listOfOdds.add(NumArr[i]);
                i++;
            }
            while(!listOfOdds.isEmpty()){
                listOfNumbers.add(listOfOdds.removeLast());
            }
            if(i < NumArr.length) {
                listOfNumbers.add(NumArr[i]);
                i++;
            }
        }
        for(int j=0;j<listOfNumbers.size();j++){
            System.out.print(listOfNumbers.get(j)+" ");
        }
    }
}
