public class tesAddMid {
  public static void main(String[] args) {
    ListMatakuliah list = new ListMatakuliah();

    list.addMid(new matakuliah("IF003 ", "Struktur Diskrit, ", 3),2);
    list.addMid(new matakuliah("IF004 ", "Konstruksi PL Berorientasi Objek, ", 3), 1);
    list.addMid(new matakuliah("IF001 ", "Dasar Pemrograman, ", 4),4);
    list.addMid(new matakuliah("IF002 ", "Pemrograman Web, ", 3),3);
   
   
    list.displayElement();
  }
  
}
