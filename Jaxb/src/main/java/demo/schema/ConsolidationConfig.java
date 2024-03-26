package demo.schema;

import jakarta.xml.bind.annotation.XmlElement;

public final class ConsolidationConfig {
    private Config config;

    public Config getConfig() {
        return config;
    }

    @XmlElement(name="config", namespace = NAMESPACES.CONSO)
    public void setConfig(Config config) {
        this.config = config;
    }
}
