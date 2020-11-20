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
import org.openapitools.client.model.AantekeningBasis;
import org.openapitools.client.model.Bedrag;
import org.openapitools.client.model.Hypotheek;
import org.openapitools.client.model.HypotheekHalAllOf;
import org.openapitools.client.model.HypotheekLinks;
import org.openapitools.client.model.PersoonBeperkt;
import org.openapitools.client.model.TypeBreuk;
import org.openapitools.client.model.Waardelijst;

/**
 * HypotheekHal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-20T16:12:03.834Z[Etc/UTC]")
public class HypotheekHal {
  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_DOMEIN = "domein";
  @SerializedName(SERIALIZED_NAME_DOMEIN)
  private String domein;

  public static final String SERIALIZED_NAME_AANDEEL_IN_BETROKKEN_RECHT = "aandeelInBetrokkenRecht";
  @SerializedName(SERIALIZED_NAME_AANDEEL_IN_BETROKKEN_RECHT)
  private TypeBreuk aandeelInBetrokkenRecht;

  public static final String SERIALIZED_NAME_GEDEELTELIJKE_BEZWARING_OUD_OBJECT = "gedeeltelijkeBezwaringOudObject";
  @SerializedName(SERIALIZED_NAME_GEDEELTELIJKE_BEZWARING_OUD_OBJECT)
  private Boolean gedeeltelijkeBezwaringOudObject;

  public static final String SERIALIZED_NAME_OMSCHRIJVING_BETROKKEN_RECHT = "omschrijvingBetrokkenRecht";
  @SerializedName(SERIALIZED_NAME_OMSCHRIJVING_BETROKKEN_RECHT)
  private Waardelijst omschrijvingBetrokkenRecht;

  public static final String SERIALIZED_NAME_TOELICHTING_BEWAARDER = "toelichtingBewaarder";
  @SerializedName(SERIALIZED_NAME_TOELICHTING_BEWAARDER)
  private String toelichtingBewaarder;

  public static final String SERIALIZED_NAME_BETREFT_GEDEELTE_VAN_PERCEEL = "betreftGedeelteVanPerceel";
  @SerializedName(SERIALIZED_NAME_BETREFT_GEDEELTE_VAN_PERCEEL)
  private Boolean betreftGedeelteVanPerceel;

  public static final String SERIALIZED_NAME_AANTEKENINGEN = "aantekeningen";
  @SerializedName(SERIALIZED_NAME_AANTEKENINGEN)
  private List<AantekeningBasis> aantekeningen = null;

  public static final String SERIALIZED_NAME_HYPOTHEEKHOUDERS = "hypotheekhouders";
  @SerializedName(SERIALIZED_NAME_HYPOTHEEKHOUDERS)
  private List<PersoonBeperkt> hypotheekhouders = null;

  public static final String SERIALIZED_NAME_BEDRAG_ZEKERHEIDSSTELLING = "bedragZekerheidsstelling";
  @SerializedName(SERIALIZED_NAME_BEDRAG_ZEKERHEIDSSTELLING)
  private Bedrag bedragZekerheidsstelling;

  public static final String SERIALIZED_NAME_STUK_IDENTIFICATIES = "stukIdentificaties";
  @SerializedName(SERIALIZED_NAME_STUK_IDENTIFICATIES)
  private List<String> stukIdentificaties = null;

  public static final String SERIALIZED_NAME_OMSCHRIJVING_GEKOZEN_WOONPLAATS = "omschrijvingGekozenWoonplaats";
  @SerializedName(SERIALIZED_NAME_OMSCHRIJVING_GEKOZEN_WOONPLAATS)
  private String omschrijvingGekozenWoonplaats;

  public static final String SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL_IDENTIFICATIE = "isGebaseerdOpStukdeelIdentificatie";
  @SerializedName(SERIALIZED_NAME_IS_GEBASEERD_OP_STUKDEEL_IDENTIFICATIE)
  private String isGebaseerdOpStukdeelIdentificatie;

  public static final String SERIALIZED_NAME_IS_VERMELD_IN_STUKDEEL_IDENTIFICATIES = "isVermeldInStukdeelIdentificaties";
  @SerializedName(SERIALIZED_NAME_IS_VERMELD_IN_STUKDEEL_IDENTIFICATIES)
  private List<String> isVermeldInStukdeelIdentificaties = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private HypotheekLinks links;


  public HypotheekHal identificatie(String identificatie) {
    
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


  public HypotheekHal domein(String domein) {
    
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


  public HypotheekHal aandeelInBetrokkenRecht(TypeBreuk aandeelInBetrokkenRecht) {
    
    this.aandeelInBetrokkenRecht = aandeelInBetrokkenRecht;
    return this;
  }

   /**
   * Get aandeelInBetrokkenRecht
   * @return aandeelInBetrokkenRecht
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeBreuk getAandeelInBetrokkenRecht() {
    return aandeelInBetrokkenRecht;
  }


  public void setAandeelInBetrokkenRecht(TypeBreuk aandeelInBetrokkenRecht) {
    this.aandeelInBetrokkenRecht = aandeelInBetrokkenRecht;
  }


  public HypotheekHal gedeeltelijkeBezwaringOudObject(Boolean gedeeltelijkeBezwaringOudObject) {
    
    this.gedeeltelijkeBezwaringOudObject = gedeeltelijkeBezwaringOudObject;
    return this;
  }

   /**
   * Get gedeeltelijkeBezwaringOudObject
   * @return gedeeltelijkeBezwaringOudObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGedeeltelijkeBezwaringOudObject() {
    return gedeeltelijkeBezwaringOudObject;
  }


  public void setGedeeltelijkeBezwaringOudObject(Boolean gedeeltelijkeBezwaringOudObject) {
    this.gedeeltelijkeBezwaringOudObject = gedeeltelijkeBezwaringOudObject;
  }


  public HypotheekHal omschrijvingBetrokkenRecht(Waardelijst omschrijvingBetrokkenRecht) {
    
    this.omschrijvingBetrokkenRecht = omschrijvingBetrokkenRecht;
    return this;
  }

   /**
   * Get omschrijvingBetrokkenRecht
   * @return omschrijvingBetrokkenRecht
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardelijst getOmschrijvingBetrokkenRecht() {
    return omschrijvingBetrokkenRecht;
  }


  public void setOmschrijvingBetrokkenRecht(Waardelijst omschrijvingBetrokkenRecht) {
    this.omschrijvingBetrokkenRecht = omschrijvingBetrokkenRecht;
  }


  public HypotheekHal toelichtingBewaarder(String toelichtingBewaarder) {
    
    this.toelichtingBewaarder = toelichtingBewaarder;
    return this;
  }

   /**
   * Toelichtende tekst van de bewaarder. De bewaarder is iemand die bij het Kadaster werkt. Hij schrijft stukken in in de openbare registers en de basisregistratie Kadaster conform de Kadasterwet. 
   * @return toelichtingBewaarder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Toelichtende tekst van de bewaarder. De bewaarder is iemand die bij het Kadaster werkt. Hij schrijft stukken in in de openbare registers en de basisregistratie Kadaster conform de Kadasterwet. ")

  public String getToelichtingBewaarder() {
    return toelichtingBewaarder;
  }


  public void setToelichtingBewaarder(String toelichtingBewaarder) {
    this.toelichtingBewaarder = toelichtingBewaarder;
  }


  public HypotheekHal betreftGedeelteVanPerceel(Boolean betreftGedeelteVanPerceel) {
    
    this.betreftGedeelteVanPerceel = betreftGedeelteVanPerceel;
    return this;
  }

   /**
   * Get betreftGedeelteVanPerceel
   * @return betreftGedeelteVanPerceel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBetreftGedeelteVanPerceel() {
    return betreftGedeelteVanPerceel;
  }


  public void setBetreftGedeelteVanPerceel(Boolean betreftGedeelteVanPerceel) {
    this.betreftGedeelteVanPerceel = betreftGedeelteVanPerceel;
  }


  public HypotheekHal aantekeningen(List<AantekeningBasis> aantekeningen) {
    
    this.aantekeningen = aantekeningen;
    return this;
  }

  public HypotheekHal addAantekeningenItem(AantekeningBasis aantekeningenItem) {
    if (this.aantekeningen == null) {
      this.aantekeningen = new ArrayList<>();
    }
    this.aantekeningen.add(aantekeningenItem);
    return this;
  }

   /**
   * Get aantekeningen
   * @return aantekeningen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AantekeningBasis> getAantekeningen() {
    return aantekeningen;
  }


  public void setAantekeningen(List<AantekeningBasis> aantekeningen) {
    this.aantekeningen = aantekeningen;
  }


  public HypotheekHal hypotheekhouders(List<PersoonBeperkt> hypotheekhouders) {
    
    this.hypotheekhouders = hypotheekhouders;
    return this;
  }

  public HypotheekHal addHypotheekhoudersItem(PersoonBeperkt hypotheekhoudersItem) {
    if (this.hypotheekhouders == null) {
      this.hypotheekhouders = new ArrayList<>();
    }
    this.hypotheekhouders.add(hypotheekhoudersItem);
    return this;
  }

   /**
   * Een hypotheekhouder vestigt als geldverstrekker een recht van hypotheek als zekerheid voor de lening. 
   * @return hypotheekhouders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Een hypotheekhouder vestigt als geldverstrekker een recht van hypotheek als zekerheid voor de lening. ")

  public List<PersoonBeperkt> getHypotheekhouders() {
    return hypotheekhouders;
  }


  public void setHypotheekhouders(List<PersoonBeperkt> hypotheekhouders) {
    this.hypotheekhouders = hypotheekhouders;
  }


  public HypotheekHal bedragZekerheidsstelling(Bedrag bedragZekerheidsstelling) {
    
    this.bedragZekerheidsstelling = bedragZekerheidsstelling;
    return this;
  }

   /**
   * Get bedragZekerheidsstelling
   * @return bedragZekerheidsstelling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Bedrag getBedragZekerheidsstelling() {
    return bedragZekerheidsstelling;
  }


  public void setBedragZekerheidsstelling(Bedrag bedragZekerheidsstelling) {
    this.bedragZekerheidsstelling = bedragZekerheidsstelling;
  }


  public HypotheekHal stukIdentificaties(List<String> stukIdentificaties) {
    
    this.stukIdentificaties = stukIdentificaties;
    return this;
  }

  public HypotheekHal addStukIdentificatiesItem(String stukIdentificatiesItem) {
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


  public HypotheekHal omschrijvingGekozenWoonplaats(String omschrijvingGekozenWoonplaats) {
    
    this.omschrijvingGekozenWoonplaats = omschrijvingGekozenWoonplaats;
    return this;
  }

   /**
   * Get omschrijvingGekozenWoonplaats
   * @return omschrijvingGekozenWoonplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOmschrijvingGekozenWoonplaats() {
    return omschrijvingGekozenWoonplaats;
  }


  public void setOmschrijvingGekozenWoonplaats(String omschrijvingGekozenWoonplaats) {
    this.omschrijvingGekozenWoonplaats = omschrijvingGekozenWoonplaats;
  }


  public HypotheekHal isGebaseerdOpStukdeelIdentificatie(String isGebaseerdOpStukdeelIdentificatie) {
    
    this.isGebaseerdOpStukdeelIdentificatie = isGebaseerdOpStukdeelIdentificatie;
    return this;
  }

   /**
   * De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop deze hypotheek is gebaseerd. 
   * @return isGebaseerdOpStukdeelIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop deze hypotheek is gebaseerd. ")

  public String getIsGebaseerdOpStukdeelIdentificatie() {
    return isGebaseerdOpStukdeelIdentificatie;
  }


  public void setIsGebaseerdOpStukdeelIdentificatie(String isGebaseerdOpStukdeelIdentificatie) {
    this.isGebaseerdOpStukdeelIdentificatie = isGebaseerdOpStukdeelIdentificatie;
  }


  public HypotheekHal isVermeldInStukdeelIdentificaties(List<String> isVermeldInStukdeelIdentificaties) {
    
    this.isVermeldInStukdeelIdentificaties = isVermeldInStukdeelIdentificaties;
    return this;
  }

  public HypotheekHal addIsVermeldInStukdeelIdentificatiesItem(String isVermeldInStukdeelIdentificatiesItem) {
    if (this.isVermeldInStukdeelIdentificaties == null) {
      this.isVermeldInStukdeelIdentificaties = new ArrayList<>();
    }
    this.isVermeldInStukdeelIdentificaties.add(isVermeldInStukdeelIdentificatiesItem);
    return this;
  }

   /**
   * De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze hypotheek is vermeld 
   * @return isVermeldInStukdeelIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze hypotheek is vermeld ")

  public List<String> getIsVermeldInStukdeelIdentificaties() {
    return isVermeldInStukdeelIdentificaties;
  }


  public void setIsVermeldInStukdeelIdentificaties(List<String> isVermeldInStukdeelIdentificaties) {
    this.isVermeldInStukdeelIdentificaties = isVermeldInStukdeelIdentificaties;
  }


  public HypotheekHal links(HypotheekLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HypotheekLinks getLinks() {
    return links;
  }


  public void setLinks(HypotheekLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HypotheekHal hypotheekHal = (HypotheekHal) o;
    return Objects.equals(this.identificatie, hypotheekHal.identificatie) &&
        Objects.equals(this.domein, hypotheekHal.domein) &&
        Objects.equals(this.aandeelInBetrokkenRecht, hypotheekHal.aandeelInBetrokkenRecht) &&
        Objects.equals(this.gedeeltelijkeBezwaringOudObject, hypotheekHal.gedeeltelijkeBezwaringOudObject) &&
        Objects.equals(this.omschrijvingBetrokkenRecht, hypotheekHal.omschrijvingBetrokkenRecht) &&
        Objects.equals(this.toelichtingBewaarder, hypotheekHal.toelichtingBewaarder) &&
        Objects.equals(this.betreftGedeelteVanPerceel, hypotheekHal.betreftGedeelteVanPerceel) &&
        Objects.equals(this.aantekeningen, hypotheekHal.aantekeningen) &&
        Objects.equals(this.hypotheekhouders, hypotheekHal.hypotheekhouders) &&
        Objects.equals(this.bedragZekerheidsstelling, hypotheekHal.bedragZekerheidsstelling) &&
        Objects.equals(this.stukIdentificaties, hypotheekHal.stukIdentificaties) &&
        Objects.equals(this.omschrijvingGekozenWoonplaats, hypotheekHal.omschrijvingGekozenWoonplaats) &&
        Objects.equals(this.isGebaseerdOpStukdeelIdentificatie, hypotheekHal.isGebaseerdOpStukdeelIdentificatie) &&
        Objects.equals(this.isVermeldInStukdeelIdentificaties, hypotheekHal.isVermeldInStukdeelIdentificaties) &&
        Objects.equals(this.links, hypotheekHal.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificatie, domein, aandeelInBetrokkenRecht, gedeeltelijkeBezwaringOudObject, omschrijvingBetrokkenRecht, toelichtingBewaarder, betreftGedeelteVanPerceel, aantekeningen, hypotheekhouders, bedragZekerheidsstelling, stukIdentificaties, omschrijvingGekozenWoonplaats, isGebaseerdOpStukdeelIdentificatie, isVermeldInStukdeelIdentificaties, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HypotheekHal {\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    domein: ").append(toIndentedString(domein)).append("\n");
    sb.append("    aandeelInBetrokkenRecht: ").append(toIndentedString(aandeelInBetrokkenRecht)).append("\n");
    sb.append("    gedeeltelijkeBezwaringOudObject: ").append(toIndentedString(gedeeltelijkeBezwaringOudObject)).append("\n");
    sb.append("    omschrijvingBetrokkenRecht: ").append(toIndentedString(omschrijvingBetrokkenRecht)).append("\n");
    sb.append("    toelichtingBewaarder: ").append(toIndentedString(toelichtingBewaarder)).append("\n");
    sb.append("    betreftGedeelteVanPerceel: ").append(toIndentedString(betreftGedeelteVanPerceel)).append("\n");
    sb.append("    aantekeningen: ").append(toIndentedString(aantekeningen)).append("\n");
    sb.append("    hypotheekhouders: ").append(toIndentedString(hypotheekhouders)).append("\n");
    sb.append("    bedragZekerheidsstelling: ").append(toIndentedString(bedragZekerheidsstelling)).append("\n");
    sb.append("    stukIdentificaties: ").append(toIndentedString(stukIdentificaties)).append("\n");
    sb.append("    omschrijvingGekozenWoonplaats: ").append(toIndentedString(omschrijvingGekozenWoonplaats)).append("\n");
    sb.append("    isGebaseerdOpStukdeelIdentificatie: ").append(toIndentedString(isGebaseerdOpStukdeelIdentificatie)).append("\n");
    sb.append("    isVermeldInStukdeelIdentificaties: ").append(toIndentedString(isVermeldInStukdeelIdentificaties)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

