package com.albarizaez;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "comida",
        "descripcion",
        "precio"
})
@Generated("jsonschema2pojo")
public class Comida {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("comida")
    private String comida;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("precio")
    private Double precio;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("comida")
    public String getComida() {
        return comida;
    }

    @JsonProperty("comida")
    public void setComida(String comida) {
        this.comida = comida;
    }

    @JsonProperty("descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    @JsonProperty("descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @JsonProperty("precio")
    public Double getPrecio() {
        return precio;
    }

    @JsonProperty("precio")
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
