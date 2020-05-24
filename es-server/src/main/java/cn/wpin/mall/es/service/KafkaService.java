//package cn.wpin.mall.es.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.Acknowledgment;
//import org.springframework.stereotype.Component;
//
///**
// * kafka测试
// * @author wangpin
// */
//@Component
//public class KafkaService {
//
//
//    @Autowired
//    EsProductService esProductService;
//
//    @Autowired
//    private KafkaTemplate kafkaTemplate;
//
//    public void testKafkaSend(){
//        kafkaTemplate.send("wangpin","user","update  from user set name=wangpin1 where id=1");
//        kafkaTemplate.send("wangpin",1,"user","update  from user set name=wangpin1 where id=1");
//    }
//
//    @KafkaListener(topics = {"wangpin"})
//    public void listenMessage(String message, Acknowledgment ack){
//        System.out.println(message);
//        ack.acknowledge();
//    }
//
//}
