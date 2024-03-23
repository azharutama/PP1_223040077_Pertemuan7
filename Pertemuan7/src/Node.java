public class Node {
  private matakuliah data;
  private Node next;

  public Node(matakuliah data) {

    this.data = data;

  }

  //setter getter//
  
public void setData(matakuliah data) {
  this.data = data;
}

  public matakuliah getData() {
    return data;
}



public void setNext(Node next) {
  this.next = next;
}


public Node getNext() {
    return next;
}




}