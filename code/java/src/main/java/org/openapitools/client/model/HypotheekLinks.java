/*
 * Kadaster - BRK-Bevragen API
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.HalLink;

/**
 * HypotheekLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-20T16:12:03.834Z[Etc/UTC]")
public class HypotheekLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private HalLink self;

  public static final String SERIALIZED_NAME_HYPOTHEEKHOUDERS = "hypotheekhouders";
  @SerializedName(SERIALIZED_NAME_HYPOTHEEKHOUDERS)
  private List<HalLink> hypotheekhouders = null;

  public static final String SERIALIZED_NAME_STUKKEN = "stukken";
  @SerializedName(SERIALIZED_NAME_STUKKEN)
  private List<HalLink> stukken = null;

  public static final String SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL = "isGebaseerdOpStukdeel";
  @SerializedName(SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL)
  private HalLink isGebaseerdOpStukdeel;

  public static final String SERIALIZED_NAME_IS_VERMELD_IN_STUKDELEN = "isVermeldInStukdelen";
  @SerializedName(SERIALIZED_NAME_IS_VERMELD_IN_STUKDELEN)
  private List<HalLink> isVermeldInStukdelen = null;


  public HypotheekLinks self(HalLink self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getSelf() {
    return self;
  }


  public void setSelf(HalLink self) {
    this.self = self;
  }


  public HypotheekLinks hypotheekhouders(List<HalLink> hypotheekhouders) {
    
    this.hypotheekhouders = hypotheekhouders;
    return this;
  }

  public HypotheekLinks addHypotheekhoudersItem(HalLink hypotheekhoudersItem) {
    if (this.hypotheekhouders == null) {
      this.hypotheekhouders = new ArrayList<>();
    }
    this.hypotheekhouders.add(hypotheekhoudersItem);
    return this;
  }

   /**
   * Get hypotheekhouders
   * @return hypotheekhouders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink> getHypotheekhouders() {
    return hypotheekhouders;
  }


  public void setHypotheekhouders(List<HalLink> hypotheekhouders) {
    this.hypotheekhouders = hypotheekhouders;
  }


  public HypotheekLinks stukken(List<HalLink> stukken) {
    
    this.stukken = stukken;
    return this;
  }

  public HypotheekLinks addStukkenItem(HalLink stukkenItem) {
    if (this.stukken == null) {
      this.stukken = new ArrayList<>();
    }
    this.stukken.add(stukkenItem);
    return this;
  }

   /**
   * Get stukken
   * @return stukken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink> getStukken() {
    return stukken;
  }


  public void setStukken(List<HalLink> stukken) {
    this.stukken = stukken;
  }


  public HypotheekLinks isGebaseerdOpStukdeel(HalLink isGebaseerdOpStukdeel) {
    
    this.isGebaseerdOpStukdeel = isGebaseerdOpStukdeel;
    return this;
  }

   /**
   * Get isGebaseerdOpStukdeel
   * @return isGebaseerdOpStukdeel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getIsGebaseerdOpStukdeel() {
    return isGebaseerdOpStukdeel;
  }


  public void setIsGebaseerdOpStukdeel(HalLink isGebaseerdOpStukdeel) {
    this.isGebaseerdOpStukdeel = isGebaseerdOpStukdeel;
  }


  public HypotheekLinks isVermeldInStukdelen(List<HalLink> isVermeldInStukdelen) {
    
    this.isVermeldInStukdelen = isVermeldInStukdelen;
    return this;
  }

  public HypotheekLinks addIsVermeldInStukdelenItem(HalLink isVermeldInStukdelenItem) {
    if (this.isVermeldInStukdelen == null) {
      this.isVermeldInStukdelen = new ArrayList<>();
    }
    this.isVermeldInStukdelen.add(isVermeldInStukdelenItem);
    return this;
  }

   /**
   * Get isVermeldInStukdelen
   * @return isVermeldInStukdelen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink> getIsVermeldInStukdelen() {
    return isVermeldInStukdelen;
  }


  public void setIsVermeldInStukdelen(List<HalLink> isVermeldInStukdelen) {
    this.isVermeldInStukdelen = isVermeldInStukdelen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HypotheekLinks hypotheekLinks = (HypotheekLinks) o;
    return Objects.equals(this.self, hypotheekLinks.self) &&
        Objects.equals(this.hypotheekhouders, hypotheekLinks.hypotheekhouders) &&
        Objects.equals(this.stukken, hypotheekLinks.stukken) &&
        Objects.equals(this.isGebaseerdOpStukdeel, hypotheekLinks.isGebaseerdOpStukdeel) &&
        Objects.equals(this.isVermeldInStukdelen, hypotheekLinks.isVermeldInStukdelen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, hypotheekhouders, stukken, isGebaseerdOpStukdeel, isVermeldInStukdelen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HypotheekLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    hypotheekhouders: ").append(toIndentedString(hypotheekhouders)).append("\n");
    sb.append("    stukken: ").append(toIndentedString(stukken)).append("\n");
    sb.append("    isGebaseerdOpStukdeel: ").append(toIndentedString(isGebaseerdOpStukdeel)).append("\n");
    sb.append("    isVermeldInStukdelen: ").append(toIndentedString(isVermeldInStukdelen)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

