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
import org.openapitools.client.model.AdresUitgebreid;
import org.openapitools.client.model.LocatieKadastraalObjectAllOf;
import org.openapitools.client.model.Waardelijst;

/**
 * Waardelijsten in deze component :   [koppelingswijze](http://www.kadaster.nl/schemas/waardelijsten/Koppelingswijze) en [land](http://www.kadaster.nl/schemas/waardelijsten/BRPLand/) 
 */
@ApiModel(description = "Waardelijsten in deze component :   [koppelingswijze](http://www.kadaster.nl/schemas/waardelijsten/Koppelingswijze) en [land](http://www.kadaster.nl/schemas/waardelijsten/BRPLand/) ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-20T16:12:03.834Z[Etc/UTC]")
public class LocatieKadastraalObject {
  public static final String SERIALIZED_NAME_STRAAT = "straat";
  @SerializedName(SERIALIZED_NAME_STRAAT)
  private String straat;

  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Integer huisnummer;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private String huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private String huisnummertoevoeging;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_WOONPLAATS = "woonplaats";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS)
  private String woonplaats;

  public static final String SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE = "nummeraanduidingIdentificatie";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE)
  private String nummeraanduidingIdentificatie;

  public static final String SERIALIZED_NAME_ADRESREGEL1 = "adresregel1";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL1)
  private String adresregel1;

  public static final String SERIALIZED_NAME_ADRESREGEL2 = "adresregel2";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL2)
  private String adresregel2;

  public static final String SERIALIZED_NAME_ADRESREGEL3 = "adresregel3";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL3)
  private String adresregel3;

  public static final String SERIALIZED_NAME_LAND = "land";
  @SerializedName(SERIALIZED_NAME_LAND)
  private Waardelijst land;

  public static final String SERIALIZED_NAME_KOPPELINGSWIJZE = "koppelingswijze";
  @SerializedName(SERIALIZED_NAME_KOPPELINGSWIJZE)
  private Waardelijst koppelingswijze;


  public LocatieKadastraalObject straat(String straat) {
    
    this.straat = straat;
    return this;
  }

   /**
   * Een naam die door de gemeente aan een openbare ruimte is gegeven.
   * @return straat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort", value = "Een naam die door de gemeente aan een openbare ruimte is gegeven.")

  public String getStraat() {
    return straat;
  }


  public void setStraat(String straat) {
    this.straat = straat;
  }


  public LocatieKadastraalObject huisnummer(Integer huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.")

  public Integer getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Integer huisnummer) {
    this.huisnummer = huisnummer;
  }


  public LocatieKadastraalObject huisletter(String huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(String huisletter) {
    this.huisletter = huisletter;
  }


  public LocatieKadastraalObject huisnummertoevoeging(String huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bis", value = "Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(String huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
  }


  public LocatieKadastraalObject postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6922KZ", value = "De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public LocatieKadastraalObject woonplaats(String woonplaats) {
    
    this.woonplaats = woonplaats;
    return this;
  }

   /**
   * Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.
   * @return woonplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Duiven", value = "Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.")

  public String getWoonplaats() {
    return woonplaats;
  }


  public void setWoonplaats(String woonplaats) {
    this.woonplaats = woonplaats;
  }


  public LocatieKadastraalObject nummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
    return this;
  }

   /**
   * Identificatie van het adres in het geval dit adres in BAG geregistreerd is. 
   * @return nummeraanduidingIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234207890123456", value = "Identificatie van het adres in het geval dit adres in BAG geregistreerd is. ")

  public String getNummeraanduidingIdentificatie() {
    return nummeraanduidingIdentificatie;
  }


  public void setNummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
  }


  public LocatieKadastraalObject adresregel1(String adresregel1) {
    
    this.adresregel1 = adresregel1;
    return this;
  }

   /**
   * Het eerste deel van een adres is een combinatie van de straat en huisnummer. 
   * @return adresregel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort 1A-bis", value = "Het eerste deel van een adres is een combinatie van de straat en huisnummer. ")

  public String getAdresregel1() {
    return adresregel1;
  }


  public void setAdresregel1(String adresregel1) {
    this.adresregel1 = adresregel1;
  }


  public LocatieKadastraalObject adresregel2(String adresregel2) {
    
    this.adresregel2 = adresregel2;
    return this;
  }

   /**
   * Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode. 
   * @return adresregel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6922KZ  Duiven", value = "Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode. ")

  public String getAdresregel2() {
    return adresregel2;
  }


  public void setAdresregel2(String adresregel2) {
    this.adresregel2 = adresregel2;
  }


  public LocatieKadastraalObject adresregel3(String adresregel3) {
    
    this.adresregel3 = adresregel3;
    return this;
  }

   /**
   * Het derde deel van een adres is optioneel een of meer geografische gebieden van het adres in het buitenland. 
   * @return adresregel3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Selangor", value = "Het derde deel van een adres is optioneel een of meer geografische gebieden van het adres in het buitenland. ")

  public String getAdresregel3() {
    return adresregel3;
  }


  public void setAdresregel3(String adresregel3) {
    this.adresregel3 = adresregel3;
  }


  public LocatieKadastraalObject land(Waardelijst land) {
    
    this.land = land;
    return this;
  }

   /**
   * Get land
   * @return land
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardelijst getLand() {
    return land;
  }


  public void setLand(Waardelijst land) {
    this.land = land;
  }


  public LocatieKadastraalObject koppelingswijze(Waardelijst koppelingswijze) {
    
    this.koppelingswijze = koppelingswijze;
    return this;
  }

   /**
   * Get koppelingswijze
   * @return koppelingswijze
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardelijst getKoppelingswijze() {
    return koppelingswijze;
  }


  public void setKoppelingswijze(Waardelijst koppelingswijze) {
    this.koppelingswijze = koppelingswijze;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocatieKadastraalObject locatieKadastraalObject = (LocatieKadastraalObject) o;
    return Objects.equals(this.straat, locatieKadastraalObject.straat) &&
        Objects.equals(this.huisnummer, locatieKadastraalObject.huisnummer) &&
        Objects.equals(this.huisletter, locatieKadastraalObject.huisletter) &&
        Objects.equals(this.huisnummertoevoeging, locatieKadastraalObject.huisnummertoevoeging) &&
        Objects.equals(this.postcode, locatieKadastraalObject.postcode) &&
        Objects.equals(this.woonplaats, locatieKadastraalObject.woonplaats) &&
        Objects.equals(this.nummeraanduidingIdentificatie, locatieKadastraalObject.nummeraanduidingIdentificatie) &&
        Objects.equals(this.adresregel1, locatieKadastraalObject.adresregel1) &&
        Objects.equals(this.adresregel2, locatieKadastraalObject.adresregel2) &&
        Objects.equals(this.adresregel3, locatieKadastraalObject.adresregel3) &&
        Objects.equals(this.land, locatieKadastraalObject.land) &&
        Objects.equals(this.koppelingswijze, locatieKadastraalObject.koppelingswijze);
  }

  @Override
  public int hashCode() {
    return Objects.hash(straat, huisnummer, huisletter, huisnummertoevoeging, postcode, woonplaats, nummeraanduidingIdentificatie, adresregel1, adresregel2, adresregel3, land, koppelingswijze);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocatieKadastraalObject {\n");
    sb.append("    straat: ").append(toIndentedString(straat)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    woonplaats: ").append(toIndentedString(woonplaats)).append("\n");
    sb.append("    nummeraanduidingIdentificatie: ").append(toIndentedString(nummeraanduidingIdentificatie)).append("\n");
    sb.append("    adresregel1: ").append(toIndentedString(adresregel1)).append("\n");
    sb.append("    adresregel2: ").append(toIndentedString(adresregel2)).append("\n");
    sb.append("    adresregel3: ").append(toIndentedString(adresregel3)).append("\n");
    sb.append("    land: ").append(toIndentedString(land)).append("\n");
    sb.append("    koppelingswijze: ").append(toIndentedString(koppelingswijze)).append("\n");
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

