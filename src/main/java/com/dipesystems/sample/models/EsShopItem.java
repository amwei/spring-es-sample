package com.dipesystems.sample.models;

import com.dipegroup.spring.es.models.objects.EsModel;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: ssbe
 * Description:
 * Date: 6/19/2017
 *
 * @author Dmitriy_Chirkov
 * @since 1.8
 */
public class EsShopItem implements EsModel<Long> {

    public static final String INDEX = "sshop";
    public static final String TYPE = "items";

    @Id
    private Long id;

    private String name;
    private String description;
    private String comment;

    private String type;

    private List<String> sizes = new ArrayList<>();
    private List<String> colors = new ArrayList<>();

    private String price;
    private String discount;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getSizes() {
        return sizes;
    }

    public void setSizes(List<String> sizes) {
        this.sizes = sizes;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String getEsIndex() {
        return INDEX;
    }

    @Override
    public String getEsType() {
        return TYPE;
    }

    @Override
    public Long getId() {
        return id;
    }
}
