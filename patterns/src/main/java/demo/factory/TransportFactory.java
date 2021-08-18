package demo.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TransportFactory {
    public Transport getTransport(TransportType type) {
////        return type != null ? type.getTransportConsumer().get() : null;
//        if (type != null) {
//            return type.getTransportSupplier().get();
//        }
//        return null;
        return getTransportMap().get(type).get();
    }

    private Map<TransportType, Supplier<Transport>> getTransportMap() {
        Map<TransportType, Supplier<Transport>> transportTypeMap = new HashMap<>();
        transportTypeMap.put(TransportType.SHIP, Ship::new);
        transportTypeMap.put(TransportType.WAGON, Wagon::new);
        return transportTypeMap;
    }
}
