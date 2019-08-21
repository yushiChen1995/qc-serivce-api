/*
 - Copyright 1999-2016 Shanghai XiangTu Network Technology Co. Limit
*/
/*
 - Copyright 1999-2016 Shanghai XiangTu Network Technology Co. Limit
*/
package com.qc.pojo.goods;

import com.esotericsoftware.kryo.DefaultSerializer;
import com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer;
import java.io.Serializable;

/**
* Brand设置Kryo的CompatibleFieldSerializer
* Auto generated by Stanley Li
*/
@DefaultSerializer(CompatibleFieldSerializer.class)
public class Brand implements Serializable {
    /**
     * 品牌id
     * tb_brand.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 品牌名称
     * tb_brand.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 品牌图片地址
     * tb_brand.image
     *
     * @mbggenerated
     */
    private String image;

    /**
     * 品牌的首字母
     * tb_brand.letter
     *
     * @mbggenerated
     */
    private String letter;

    /**
     * 排序
     * tb_brand.seq
     *
     * @mbggenerated
     */
    private Integer seq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     * This method returns the value of the database column tb_brand.id
     *
     * @return the value of tb_brand.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * 品牌id
     * This method sets the value of the database column tb_brand.id
     *
     * @param id the value for tb_brand.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 品牌名称
     * This method returns the value of the database column tb_brand.name
     *
     * @return the value of tb_brand.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 品牌名称
     * This method sets the value of the database column tb_brand.name
     *
     * @param name the value for tb_brand.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 品牌图片地址
     * This method returns the value of the database column tb_brand.image
     *
     * @return the value of tb_brand.image
     *
     * @mbggenerated
     */
    public String getImage() {
        return image;
    }

    /**
     * 品牌图片地址
     * This method sets the value of the database column tb_brand.image
     *
     * @param image the value for tb_brand.image
     *
     * @mbggenerated
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 品牌的首字母
     * This method returns the value of the database column tb_brand.letter
     *
     * @return the value of tb_brand.letter
     *
     * @mbggenerated
     */
    public String getLetter() {
        return letter;
    }

    /**
     * 品牌的首字母
     * This method sets the value of the database column tb_brand.letter
     *
     * @param letter the value for tb_brand.letter
     *
     * @mbggenerated
     */
    public void setLetter(String letter) {
        this.letter = letter;
    }

    /**
     * 排序
     * This method returns the value of the database column tb_brand.seq
     *
     * @return the value of tb_brand.seq
     *
     * @mbggenerated
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 排序
     * This method sets the value of the database column tb_brand.seq
     *
     * @param seq the value for tb_brand.seq
     *
     * @mbggenerated
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Brand other = (Brand) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getLetter() == null ? other.getLetter() == null : this.getLetter().equals(other.getLetter()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getLetter() == null) ? 0 : getLetter().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", image=").append(image);
        sb.append(", letter=").append(letter);
        sb.append(", seq=").append(seq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}