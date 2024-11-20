package org.pujitha.virtualthreads.prg2;

import org.pujitha.virtualthreads.util.CommonUtil;

import javax.xml.stream.events.Comment;
import java.time.Duration;

public class StackTraceDemo {
    public static void main(String[] args) {
//        demo(Thread.ofPlatform());
        demo(Thread.ofVirtual().name("Virtual"));
        CommonUtil.sleep(Duration.ofSeconds(2));

    }

    public static void demo(Thread.Builder builder){
        for(int i=1; i<=20;i++){
            int j=i;
            builder.start(()->Task.execute(j));
        }
    }
}
