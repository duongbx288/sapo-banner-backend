package com.banner_management.backend.entity;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "banner_mapping")
public class BannerMappingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "banner_id", nullable = false)
    @NotNull(message = "thiếu mã banner")
    private Integer bannerId;

    @Column(name = "section_id", nullable = false)
    @NotNull(message = "Thiếu mã khu vực")
    private Integer sectionId;

    @Column(name = "state", nullable = false)
    @NotNull(message = "Thiếu trạng thái hiển thị")
    private Short state;

    @Column(name = "percentage")
    private Integer percentage;

    @Column(name = "created_by" , nullable = false)
    @NotNull
    private String createdBy;

    @Override
    public String toString() {
        return "BannerMappingEntity{" +
                "id=" + id +
                ", bannerId=" + bannerId +
                ", sectionId=" + sectionId +
                ", state=" + state +
                ", percentage=" + percentage +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "created_at", nullable = false)
    @NotNull
    private Timestamp createdAt;

    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBannerID() {
        return bannerId;
    }

    public void setBannerID(int bannerID) {
        this.bannerId = bannerID;
    }

    public int getSectionID() {
        return sectionId;
    }

    public void setSectionID(int sectionID) {
        this.sectionId = sectionID;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }


    public BannerMappingEntity() {
    }

}
