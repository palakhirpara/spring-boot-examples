package hello;

import hello.StoresApi;
import hello.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Map;


@RestController
public class PetController implements StoresApi {
    @Override
    public ResponseEntity<Void> deleteOrder(@Min(1L) Long aLong) {
        //return new ResponseEntity<>(0, HttpStatus.ACCEPTED);
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Integer>> getInventory() {
        return null;
    }

    @Override
    public ResponseEntity<Order> getOrderById(@Min(1L) @Max(10L) Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Order> placeOrder(@Valid Order order) {
        return null;
    }
}
