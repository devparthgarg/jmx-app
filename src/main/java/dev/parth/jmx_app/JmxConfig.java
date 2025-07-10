package dev.parth.jmx_app;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName = "dev.parth.jmx_app:name=Testing",description = "Testing JMX")
public class JmxConfig {

    @ManagedOperation(description = "print string")
    public String jmxTest(String s){
        System.out.println("hello "+s);
        return "hello "+s;
    }
}
