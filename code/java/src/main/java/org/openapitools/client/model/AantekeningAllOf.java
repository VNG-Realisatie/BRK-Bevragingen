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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * AantekeningAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-20T16:12:03.834Z[Etc/UTC]")
public class AantekeningAllOf {
  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_DOMEIN = "domein";
  @SerializedName(SERIALIZED_NAME_DOMEIN)
  private String domein;

  public static final String SERIALIZED_NAME_EINDDATUM = "einddatum";
  @SerializedName(SERIALIZED_NAME_EINDDATUM)
  private LocalDate einddatum;

  public static final String SERIALIZED_NAME_EINDDATUM_RECHT = "einddatumRecht";
  @SerializedName(SERIALIZED_NAME_EINDDATUM_RECHT)
  private LocalDate einddatumRecht;

  public static final String SERIALIZED_NAME_STUK_IDENTIFICATIES = "stukIdentificaties";
  @SerializedName(SERIALIZED_NAME_STUK_IDENTIFICATIES)
  private List<String> stukIdentificaties = null;

  public static final String SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL_IDENTIFICATIE = "isGebaseerdOpStukdeelIdentificatie";
  @SerializedName(SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL_IDENTIFICATIE)
  private String isGebaseerdOpStukdeelIdentificatie;

  public static final String SERIALIZED_NAME_IS_VERMELD_IN_STUKDEEL_IDENTIFICATIES = "isVermeldInStukdeelIdentificaties";
  @SerializedName(SERIALIZED_NAME_IS_VERMELD_IN_STUKDEEL_IDENTIFICATIES)
  private List<String> isVermeldInStukdeelIdentificaties = null;


  public AantekeningAllOf identificatie(String identificatie) {
    
    this.identificatie = identificatie;
    return this;
  }

   /**
   * Get identificatie
   * @return identificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentificatie() {
    return identificatie;
  }


  public void setIdentificatie(String identificatie) {
    this.identificatie = identificatie;
  }


  public AantekeningAllOf domein(String domein) {
    
    this.domein = domein;
    return this;
  }

   /**
   * Het domein waartoe de identificatie behoort. 
   * @return domein
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Het domein waartoe de identificatie behoort. ")

  public String getDomein() {
    return domein;
  }


  public void setDomein(String domein) {
    this.domein = domein;
  }


  public AantekeningAllOf einddatum(LocalDate einddatum) {
    
    this.einddatum = einddatum;
    return this;
  }

   /**
   * Get einddatum
   * @return einddatum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getEinddatum() {
    return einddatum;
  }


  public void setEinddatum(LocalDate einddatum) {
    this.einddatum = einddatum;
  }


  public AantekeningAllOf einddatumRecht(LocalDate einddatumRecht) {
    
    this.einddatumRecht = einddatumRecht;
    return this;
  }

   /**
   * Get einddatumRecht
   * @return einddatumRecht
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getEinddatumRecht() {
    return einddatumRecht;
  }


  public void setEinddatumRecht(LocalDate einddatumRecht) {
    this.einddatumRecht = einddatumRecht;
  }


  public AantekeningAllOf stukIdentificaties(List<String> stukIdentificaties) {
    
    this.stukIdentificaties = stukIdentificaties;
    return this;
  }

  public AantekeningAllOf addStukIdentificatiesItem(String stukIdentificatiesItem) {
    if (this.stukIdentificaties == null) {
      this.stukIdentificaties = new ArrayList<>();
    }
    this.stukIdentificaties.add(stukIdentificatiesItem);
    return this;
  }

   /**
   *             Identificatie van het stuk. Een stuk is een brondocument dat aanleiding geeft tot een wijziging van de gegevens in een basisregistratie. Dit kan een aangeboden stuk of een Kadasterstuk zijn. 
   * @return stukIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "            Identificatie van het stuk. Een stuk is een brondocument dat aanleiding geeft tot een wijziging van de gegevens in een basisregistratie. Dit kan een aangeboden stuk of een Kadasterstuk zijn. ")

  public List<String> getStukIdentificaties() {
    return stukIdentificaties;
  }


  public void setStukIdentificaties(List<String> stukIdentificaties) {
    this.stukIdentificaties = stukIdentificaties;
  }


  public AantekeningAllOf isGebaseerdOpStukdeelIdentificatie(String isGebaseerdOpStukdeelIdentificatie) {
    
    this.isGebaseerdOpStukdeelIdentificatie = isGebaseerdOpStukdeelIdentificatie;
    return this;
  }

   /**
   * De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop deze aantekening is gebaseerd. 
   * @return isGebaseerdOpStukdeelIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop deze aantekening is gebaseerd. ")

  public String getIsGebaseerdOpStukdeelIdentificatie() {
    return isGebaseerdOpStukdeelIdentificatie;
  }


  public void setIsGebaseerdOpStukdeelIdentificatie(String isGebaseerdOpStukdeelIdentificatie) {
    this.isGebaseerdOpStukdeelIdentificatie = isGebaseerdOpStukdeelIdentificatie;
  }


  public AantekeningAllOf isVermeldInStukdeelIdentificaties(List<String> isVermeldInStukdeelIdentificaties) {
    
    this.isVermeldInStukdeelIdentificaties = isVermeldInStukdeelIdentificaties;
    return this;
  }

  public AantekeningAllOf addIsVermeldInStukdeelIdentificatiesItem(String isVermeldInStukdeelIdentificatiesItem) {
    if (this.isVermeldInStukdeelIdentificaties == null) {
      this.isVermeldInStukdeelIdentificaties = new ArrayList<>();
    }
    this.isVermeldInStukdeelIdentificaties.add(isVermeldInStukdeelIdentificatiesItem);
    return this;
  }

   /**
   * De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze aantekening is vermeld 
   * @return isVermeldInStukdeelIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze aantekening is vermeld ")

  public List<String> getIsVermeldInStukdeelIdentificaties() {
    return isVermeldInStukdeelIdentificaties;
  }


  public void setIsVermeldInStukdeelIdentificaties(List<String> isVermeldInStukdeelIdentificaties) {
    this.isVermeldInStukdeelIdentificaties = isVermeldInStukdeelIdentificaties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AantekeningAllOf aantekeningAllOf = (AantekeningAllOf) o;
    return Objects.equals(this.identificatie, aantekeningAllOf.identificatie) &&
        Objects.equals(this.domein, aantekeningAllOf.domein) &&
        Objects.equals(this.einddatum, aantekeningAllOf.einddatum) &&
        Objects.equals(this.einddatumRecht, aantekeningAllOf.einddatumRecht) &&
        Objects.equals(this.stukIdentificaties, aantekeningAllOf.stukIdentificaties) &&
        Objects.equals(this.isGebaseerdOpStukdeelIdentificatie, aantekeningAllOf.isGebaseerdOpStukdeelIdentificatie) &&
        Objects.equals(this.isVermeldInStukdeelIdentificaties, aantekeningAllOf.isVermeldInStukdeelIdentificaties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificatie, domein, einddatum, einddatumRecht, stukIdentificaties, isGebaseerdOpStukdeelIdentificatie, isVermeldInStukdeelIdentificaties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AantekeningAllOf {\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    domein: ").append(toIndentedString(domein)).append("\n");
    sb.append("    einddatum: ").append(toIndentedString(einddatum)).append("\n");
    sb.append("    einddatumRecht: ").append(toIndentedString(einddatumRecht)).append("\n");
    sb.append("    stukIdentificaties: ").append(toIndentedString(stukIdentificaties)).append("\n");
    sb.append("    isGebaseerdOpStukdeelIdentificatie: ").append(toIndentedString(isGebaseerdOpStukdeelIdentificatie)).append("\n");
    sb.append("    isVermeldInStukdeelIdentificaties: ").append(toIndentedString(isVermeldInStukdeelIdentificaties)).append("\n");
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

