import model.Enciclopedia;
import model.Libro;
import model.LibroTuristico;
import model.Novela;
import repository.FakeDB;
import utilities.Printer;

public class Main {
    public static void main(String[] args) {
        Libro enciclopedia = new Enciclopedia(1, "Buenas", "J.F Roger", 10);
        Libro libroTuristico = new LibroTuristico(2, "Madrid", "Santiago Sergi", 200);
        Libro novela = new Novela(3, "Cookie Clicker", "Abuela", 52);

        FakeDB fakedb = new FakeDB();

        fakedb.recibirStock(10);

        Printer printer = new Printer();

        printer.imprimirInfo(enciclopedia);
        printer.imprimirInfo(novela);
        printer.imprimirInfo(libroTuristico);

    }
}