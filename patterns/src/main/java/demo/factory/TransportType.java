package demo.factory;

import java.util.function.Supplier;

// New factory pattern realisation.
public enum TransportType {
    SHIP(Ship::new),
    WAGON(Wagon::new);

    private Supplier<Transport> transportSupplier;

    TransportType(Supplier<Transport> transportSupplier) {
        this.transportSupplier = transportSupplier;
    }

    public Supplier<Transport> getTransportSupplier() {
        return transportSupplier;
    }
}
