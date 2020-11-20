/* 
 * Kadaster - BRK-Bevragen API
 *
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// KadasterNatuurlijkPersoon
    /// </summary>
    [DataContract]
    public partial class KadasterNatuurlijkPersoon :  IEquatable<KadasterNatuurlijkPersoon>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets Geslachtsaanduiding
        /// </summary>
        [DataMember(Name="geslachtsaanduiding", EmitDefaultValue=false)]
        public GeslachtEnum? Geslachtsaanduiding { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="KadasterNatuurlijkPersoon" /> class.
        /// </summary>
        /// <param name="identificatie">Unieke identificatie voor de persoon. Voor een Kadasterpersoon is dit de identificatie zoals die door het Kadaster is vastgesteld. Voor een ingeschreven natuurlijk persoon is dit het burgerservicenummer. Voor een ingeschreven niet-natuurlijk persoon is dit het RSIN. Of de waarde in identificatie een burgerservicenummer, een RSIN of een kadasterpersoonidentificatie is kan worden afgeleid uit het type persoon. .</param>
        /// <param name="omschrijving">Voor mensen leesbare, herkenbare en identificerende omschrijving van de persoon (met bijvoorbeeld de naam). .</param>
        /// <param name="domein">Het domein waartoe de identificatie behoort. .</param>
        /// <param name="indicatieNietToonbareDiakriet">indicatieNietToonbareDiakriet.</param>
        /// <param name="beschikkingsbevoegdheid">beschikkingsbevoegdheid.</param>
        /// <param name="woonadres">woonadres.</param>
        /// <param name="postadres">postadres.</param>
        /// <param name="kadastraalOnroerendeZaakIdentificaties">kadastraalOnroerendeZaakIdentificaties.</param>
        /// <param name="geheimhoudingPersoonsgegevens">Aanduiding die aangeeft dat gegevens van een persoon wel of niet verstrekt mogen worden. .</param>
        /// <param name="landWaarnaarVertrokken">landWaarnaarVertrokken.</param>
        /// <param name="geslachtsaanduiding">geslachtsaanduiding.</param>
        /// <param name="heeftPartnerschap">heeftPartnerschap.</param>
        /// <param name="naam">naam.</param>
        /// <param name="geboorte">geboorte.</param>
        /// <param name="overlijden">overlijden.</param>
        public KadasterNatuurlijkPersoon(string identificatie = default(string), string omschrijving = default(string), string domein = default(string), bool indicatieNietToonbareDiakriet = default(bool), Waardelijst beschikkingsbevoegdheid = default(Waardelijst), AdresUitgebreid woonadres = default(AdresUitgebreid), Postadres postadres = default(Postadres), List<string> kadastraalOnroerendeZaakIdentificaties = default(List<string>), bool geheimhoudingPersoonsgegevens = default(bool), Waardelijst landWaarnaarVertrokken = default(Waardelijst), GeslachtEnum? geslachtsaanduiding = default(GeslachtEnum?), List<HeeftPartnerschap> heeftPartnerschap = default(List<HeeftPartnerschap>), NaamPersoon naam = default(NaamPersoon), Geboorte geboorte = default(Geboorte), Overlijden overlijden = default(Overlijden))
        {
            this.Identificatie = identificatie;
            this.Omschrijving = omschrijving;
            this.Domein = domein;
            this.IndicatieNietToonbareDiakriet = indicatieNietToonbareDiakriet;
            this.Beschikkingsbevoegdheid = beschikkingsbevoegdheid;
            this.Woonadres = woonadres;
            this.Postadres = postadres;
            this.KadastraalOnroerendeZaakIdentificaties = kadastraalOnroerendeZaakIdentificaties;
            this.GeheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
            this.LandWaarnaarVertrokken = landWaarnaarVertrokken;
            this.Geslachtsaanduiding = geslachtsaanduiding;
            this.HeeftPartnerschap = heeftPartnerschap;
            this.Naam = naam;
            this.Geboorte = geboorte;
            this.Overlijden = overlijden;
        }
        
        /// <summary>
        /// Unieke identificatie voor de persoon. Voor een Kadasterpersoon is dit de identificatie zoals die door het Kadaster is vastgesteld. Voor een ingeschreven natuurlijk persoon is dit het burgerservicenummer. Voor een ingeschreven niet-natuurlijk persoon is dit het RSIN. Of de waarde in identificatie een burgerservicenummer, een RSIN of een kadasterpersoonidentificatie is kan worden afgeleid uit het type persoon. 
        /// </summary>
        /// <value>Unieke identificatie voor de persoon. Voor een Kadasterpersoon is dit de identificatie zoals die door het Kadaster is vastgesteld. Voor een ingeschreven natuurlijk persoon is dit het burgerservicenummer. Voor een ingeschreven niet-natuurlijk persoon is dit het RSIN. Of de waarde in identificatie een burgerservicenummer, een RSIN of een kadasterpersoonidentificatie is kan worden afgeleid uit het type persoon. </value>
        [DataMember(Name="identificatie", EmitDefaultValue=false)]
        public string Identificatie { get; set; }

        /// <summary>
        /// Voor mensen leesbare, herkenbare en identificerende omschrijving van de persoon (met bijvoorbeeld de naam). 
        /// </summary>
        /// <value>Voor mensen leesbare, herkenbare en identificerende omschrijving van de persoon (met bijvoorbeeld de naam). </value>
        [DataMember(Name="omschrijving", EmitDefaultValue=false)]
        public string Omschrijving { get; set; }

        /// <summary>
        /// Het domein waartoe de identificatie behoort. 
        /// </summary>
        /// <value>Het domein waartoe de identificatie behoort. </value>
        [DataMember(Name="domein", EmitDefaultValue=false)]
        public string Domein { get; set; }

        /// <summary>
        /// Gets or Sets IndicatieNietToonbareDiakriet
        /// </summary>
        [DataMember(Name="indicatieNietToonbareDiakriet", EmitDefaultValue=false)]
        public bool IndicatieNietToonbareDiakriet { get; set; }

        /// <summary>
        /// Gets or Sets Beschikkingsbevoegdheid
        /// </summary>
        [DataMember(Name="beschikkingsbevoegdheid", EmitDefaultValue=false)]
        public Waardelijst Beschikkingsbevoegdheid { get; set; }

        /// <summary>
        /// Gets or Sets Woonadres
        /// </summary>
        [DataMember(Name="woonadres", EmitDefaultValue=false)]
        public AdresUitgebreid Woonadres { get; set; }

        /// <summary>
        /// Gets or Sets Postadres
        /// </summary>
        [DataMember(Name="postadres", EmitDefaultValue=false)]
        public Postadres Postadres { get; set; }

        /// <summary>
        /// Gets or Sets KadastraalOnroerendeZaakIdentificaties
        /// </summary>
        [DataMember(Name="kadastraalOnroerendeZaakIdentificaties", EmitDefaultValue=false)]
        public List<string> KadastraalOnroerendeZaakIdentificaties { get; set; }

        /// <summary>
        /// Aanduiding die aangeeft dat gegevens van een persoon wel of niet verstrekt mogen worden. 
        /// </summary>
        /// <value>Aanduiding die aangeeft dat gegevens van een persoon wel of niet verstrekt mogen worden. </value>
        [DataMember(Name="geheimhoudingPersoonsgegevens", EmitDefaultValue=false)]
        public bool GeheimhoudingPersoonsgegevens { get; set; }

        /// <summary>
        /// Gets or Sets LandWaarnaarVertrokken
        /// </summary>
        [DataMember(Name="landWaarnaarVertrokken", EmitDefaultValue=false)]
        public Waardelijst LandWaarnaarVertrokken { get; set; }

        /// <summary>
        /// Gets or Sets HeeftPartnerschap
        /// </summary>
        [DataMember(Name="heeftPartnerschap", EmitDefaultValue=false)]
        public List<HeeftPartnerschap> HeeftPartnerschap { get; set; }

        /// <summary>
        /// Gets or Sets Naam
        /// </summary>
        [DataMember(Name="naam", EmitDefaultValue=false)]
        public NaamPersoon Naam { get; set; }

        /// <summary>
        /// Gets or Sets Geboorte
        /// </summary>
        [DataMember(Name="geboorte", EmitDefaultValue=false)]
        public Geboorte Geboorte { get; set; }

        /// <summary>
        /// Gets or Sets Overlijden
        /// </summary>
        [DataMember(Name="overlijden", EmitDefaultValue=false)]
        public Overlijden Overlijden { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KadasterNatuurlijkPersoon {\n");
            sb.Append("  Identificatie: ").Append(Identificatie).Append("\n");
            sb.Append("  Omschrijving: ").Append(Omschrijving).Append("\n");
            sb.Append("  Domein: ").Append(Domein).Append("\n");
            sb.Append("  IndicatieNietToonbareDiakriet: ").Append(IndicatieNietToonbareDiakriet).Append("\n");
            sb.Append("  Beschikkingsbevoegdheid: ").Append(Beschikkingsbevoegdheid).Append("\n");
            sb.Append("  Woonadres: ").Append(Woonadres).Append("\n");
            sb.Append("  Postadres: ").Append(Postadres).Append("\n");
            sb.Append("  KadastraalOnroerendeZaakIdentificaties: ").Append(KadastraalOnroerendeZaakIdentificaties).Append("\n");
            sb.Append("  GeheimhoudingPersoonsgegevens: ").Append(GeheimhoudingPersoonsgegevens).Append("\n");
            sb.Append("  LandWaarnaarVertrokken: ").Append(LandWaarnaarVertrokken).Append("\n");
            sb.Append("  Geslachtsaanduiding: ").Append(Geslachtsaanduiding).Append("\n");
            sb.Append("  HeeftPartnerschap: ").Append(HeeftPartnerschap).Append("\n");
            sb.Append("  Naam: ").Append(Naam).Append("\n");
            sb.Append("  Geboorte: ").Append(Geboorte).Append("\n");
            sb.Append("  Overlijden: ").Append(Overlijden).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KadasterNatuurlijkPersoon);
        }

        /// <summary>
        /// Returns true if KadasterNatuurlijkPersoon instances are equal
        /// </summary>
        /// <param name="input">Instance of KadasterNatuurlijkPersoon to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KadasterNatuurlijkPersoon input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Identificatie == input.Identificatie ||
                    (this.Identificatie != null &&
                    this.Identificatie.Equals(input.Identificatie))
                ) && 
                (
                    this.Omschrijving == input.Omschrijving ||
                    (this.Omschrijving != null &&
                    this.Omschrijving.Equals(input.Omschrijving))
                ) && 
                (
                    this.Domein == input.Domein ||
                    (this.Domein != null &&
                    this.Domein.Equals(input.Domein))
                ) && 
                (
                    this.IndicatieNietToonbareDiakriet == input.IndicatieNietToonbareDiakriet ||
                    this.IndicatieNietToonbareDiakriet.Equals(input.IndicatieNietToonbareDiakriet)
                ) && 
                (
                    this.Beschikkingsbevoegdheid == input.Beschikkingsbevoegdheid ||
                    (this.Beschikkingsbevoegdheid != null &&
                    this.Beschikkingsbevoegdheid.Equals(input.Beschikkingsbevoegdheid))
                ) && 
                (
                    this.Woonadres == input.Woonadres ||
                    (this.Woonadres != null &&
                    this.Woonadres.Equals(input.Woonadres))
                ) && 
                (
                    this.Postadres == input.Postadres ||
                    (this.Postadres != null &&
                    this.Postadres.Equals(input.Postadres))
                ) && 
                (
                    this.KadastraalOnroerendeZaakIdentificaties == input.KadastraalOnroerendeZaakIdentificaties ||
                    this.KadastraalOnroerendeZaakIdentificaties != null &&
                    input.KadastraalOnroerendeZaakIdentificaties != null &&
                    this.KadastraalOnroerendeZaakIdentificaties.SequenceEqual(input.KadastraalOnroerendeZaakIdentificaties)
                ) && 
                (
                    this.GeheimhoudingPersoonsgegevens == input.GeheimhoudingPersoonsgegevens ||
                    this.GeheimhoudingPersoonsgegevens.Equals(input.GeheimhoudingPersoonsgegevens)
                ) && 
                (
                    this.LandWaarnaarVertrokken == input.LandWaarnaarVertrokken ||
                    (this.LandWaarnaarVertrokken != null &&
                    this.LandWaarnaarVertrokken.Equals(input.LandWaarnaarVertrokken))
                ) && 
                (
                    this.Geslachtsaanduiding == input.Geslachtsaanduiding ||
                    this.Geslachtsaanduiding.Equals(input.Geslachtsaanduiding)
                ) && 
                (
                    this.HeeftPartnerschap == input.HeeftPartnerschap ||
                    this.HeeftPartnerschap != null &&
                    input.HeeftPartnerschap != null &&
                    this.HeeftPartnerschap.SequenceEqual(input.HeeftPartnerschap)
                ) && 
                (
                    this.Naam == input.Naam ||
                    (this.Naam != null &&
                    this.Naam.Equals(input.Naam))
                ) && 
                (
                    this.Geboorte == input.Geboorte ||
                    (this.Geboorte != null &&
                    this.Geboorte.Equals(input.Geboorte))
                ) && 
                (
                    this.Overlijden == input.Overlijden ||
                    (this.Overlijden != null &&
                    this.Overlijden.Equals(input.Overlijden))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Identificatie != null)
                    hashCode = hashCode * 59 + this.Identificatie.GetHashCode();
                if (this.Omschrijving != null)
                    hashCode = hashCode * 59 + this.Omschrijving.GetHashCode();
                if (this.Domein != null)
                    hashCode = hashCode * 59 + this.Domein.GetHashCode();
                hashCode = hashCode * 59 + this.IndicatieNietToonbareDiakriet.GetHashCode();
                if (this.Beschikkingsbevoegdheid != null)
                    hashCode = hashCode * 59 + this.Beschikkingsbevoegdheid.GetHashCode();
                if (this.Woonadres != null)
                    hashCode = hashCode * 59 + this.Woonadres.GetHashCode();
                if (this.Postadres != null)
                    hashCode = hashCode * 59 + this.Postadres.GetHashCode();
                if (this.KadastraalOnroerendeZaakIdentificaties != null)
                    hashCode = hashCode * 59 + this.KadastraalOnroerendeZaakIdentificaties.GetHashCode();
                hashCode = hashCode * 59 + this.GeheimhoudingPersoonsgegevens.GetHashCode();
                if (this.LandWaarnaarVertrokken != null)
                    hashCode = hashCode * 59 + this.LandWaarnaarVertrokken.GetHashCode();
                hashCode = hashCode * 59 + this.Geslachtsaanduiding.GetHashCode();
                if (this.HeeftPartnerschap != null)
                    hashCode = hashCode * 59 + this.HeeftPartnerschap.GetHashCode();
                if (this.Naam != null)
                    hashCode = hashCode * 59 + this.Naam.GetHashCode();
                if (this.Geboorte != null)
                    hashCode = hashCode * 59 + this.Geboorte.GetHashCode();
                if (this.Overlijden != null)
                    hashCode = hashCode * 59 + this.Overlijden.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
