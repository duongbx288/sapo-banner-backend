package com.banner_management.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "websites")
public class WebsiteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    @NotEmpty(message = "Thiếu tên website")
    private  String code;

    @Column(name = "domain")
    @NotEmpty(message = "Thiếu liên kết trang web")
    private String domain;


    public WebsiteEntity() {
    }

    public WebsiteEntity(String code, String domain) {
        this.code = code;
        this.domain = domain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String name) {
        this.code = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String url) {
        this.domain = url;
    }

    @Override
    public String toString() {
        return "WebsiteEntity{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
}
