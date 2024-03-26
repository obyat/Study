package demo.schema;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="ConsolidationConfigList", namespace = NAMESPACES.CONSO)
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ConsolidationConfigList {
    public ConsolidationConfig consolidationConfig;

    public String version;

    public String getVersion() {
        return version;
    }

    @XmlAttribute
    public void setVersion(String version) {
        this.version = version;
    }

    public ConsolidationConfig getConsolidationConfig() {
        return consolidationConfig;
    }

    @XmlElement(name="ConsolidationConfig", namespace = NAMESPACES.CONSO)
    public void setConsolidationConfig(ConsolidationConfig consolidationConfig) {
        this.consolidationConfig = consolidationConfig;
    }
}
