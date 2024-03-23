public class tesAddTail {

  public static void main(String[] args) {
    ListMatakuliah list = new ListMatakuliah();

   
    list.addTail(new matakuliah("IF003 ", "Struktur Diskrit, ", 3));
    list.addTail(new matakuliah("IF002 ", "Pemrograman Web, ", 3));
    list.addTail(new matakuliah("IF001 ", "Dasar Pemrograman, ", 4));
    list.addHead(new matakuliah("IF004 ", "Konstruksi PL Berorientasi Objek, ", 3));
   
    list.displayElement();
  }
  
  
}
