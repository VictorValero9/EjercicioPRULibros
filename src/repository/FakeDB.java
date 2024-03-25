package repository;

import repository.IFakeDB;

import java.util.HashMap;
import java.util.Map;

public class FakeDB implements IFakeDB {
    private Map<String, Integer> stockLibros;

    public FakeDB() {
        this.stockLibros = new HashMap<>();
    }

    @Override
    public void recibirStock(int cantidad) {
        for (String libro : stockLibros.keySet()) {
            stockLibros.put(libro, stockLibros.get(libro) + cantidad);
        }
    }
    @Override
    public void vender(int cantidad){
        for (String libro : stockLibros.keySet()) {
            int stockActual = stockLibros.get(libro);
            if (stockActual >= cantidad) {
                stockLibros.put(libro, stockActual - cantidad);
            }
        }
    }
}

