public class tesAddHead {

  public static void main(String[] args) {
    ListMatakuliah list = new ListMatakuliah();

    list.addHead(new matakuliah("IF004 ", "Konstruksi PL Berorientasi Objek, ", 3));
    list.addHead(new matakuliah("IF003 ", "Struktur Diskrit, ", 3));
    list.addHead(new matakuliah("IF002 ", "Pemrograman Web, ", 3));
    list.addHead(new matakuliah("IF001 ", "Dasar Pemrograman, ", 4));
   
    list.displayElement();
  }
  
}
