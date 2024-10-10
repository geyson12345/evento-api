//package br.com.itau.seguros.consumidor1.cliente1;
//
//import br.com.itau.seguros.consumidor1.dto.OrderCreatedEventDto;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class OrderCreatedListener {
//
//    @RabbitListener(queues = "orders.v1.order-created.send-consumidor1")
//    public void onOrderCreated(OrderCreatedEventDto message) {
//        System.out.println("CPF do Cliente " + message.getCpf());
//        System.out.println("Cliente  " + message.getNome());
//    }
//}
