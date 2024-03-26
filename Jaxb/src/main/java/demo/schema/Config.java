package demo.schema;

import jakarta.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;

public class Config {
    private List<KeyValue> keyValues = new ArrayList<>();
    public List<KeyValue> getKeyValues(){
        return keyValues;
    }

    @XmlElement(name="KeyValue", namespace = NAMESPACES.BEE)
    protected void setKeyValues(List<KeyValue> keyValues){
        this.keyValues = keyValues;
    }
}