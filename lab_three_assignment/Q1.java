package lab_three.lab_three_exercises.src.lab_three_assignment;
public class Q1 {
public E find_second_node( n){
  Node<E> t=n;
       if (t==null||t.getNext()==null)return null;
     while (t.getNext().getNext()!=null)
         t=t.getNext();
    }
        return t.getElement();
   }
}
