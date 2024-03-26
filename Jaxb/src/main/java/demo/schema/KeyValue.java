package demo.schema;

import jakarta.xml.bind.annotation.XmlAttribute;

public final class KeyValue {

    private String key;
    private String value;
    private String type;

    public String getKey() {
        return key;
    }

    @XmlAttribute
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    @XmlAttribute
    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }
}
