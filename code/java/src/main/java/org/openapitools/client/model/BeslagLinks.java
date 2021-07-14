/*
 * Kadaster - BRK-Bevragen API
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
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
 * BeslagLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-14T09:03:43.376348Z[Etc/UTC]")
public class BeslagLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private HalLink self;

  public static final String SERIALIZED_NAME_BESLAGLEGGERS = "beslagleggers";
  @SerializedName(SERIALIZED_NAME_BESLAGLEGGERS)
  private List<HalLink> beslagleggers = null;


  public BeslagLinks self(HalLink self) {
    
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


  public BeslagLinks beslagleggers(List<HalLink> beslagleggers) {
    
    this.beslagleggers = beslagleggers;
    return this;
  }

  public BeslagLinks addBeslagleggersItem(HalLink beslagleggersItem) {
    if (this.beslagleggers == null) {
      this.beslagleggers = new ArrayList<>();
    }
    this.beslagleggers.add(beslagleggersItem);
    return this;
  }

   /**
   * Get beslagleggers
   * @return beslagleggers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink> getBeslagleggers() {
    return beslagleggers;
  }


  public void setBeslagleggers(List<HalLink> beslagleggers) {
    this.beslagleggers = beslagleggers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeslagLinks beslagLinks = (BeslagLinks) o;
    return Objects.equals(this.self, beslagLinks.self) &&
        Objects.equals(this.beslagleggers, beslagLinks.beslagleggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, beslagleggers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeslagLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    beslagleggers: ").append(toIndentedString(beslagleggers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

