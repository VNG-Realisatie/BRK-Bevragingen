/*
 * Kadaster - BRK-Bevragen API
 *
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
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
    /// Een in de basisregistratie kadaster geregistreerde persoon.   Waardelijst in deze component :   [beschikkingsbevoegdheid](http://www.kadaster.nl/schemas/waardelijsten/Beschikkingsbevoegdheid/) 
    /// </summary>
    [DataContract]
    public partial class KadasterPersoonAllOf :  IEquatable<KadasterPersoonAllOf>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KadasterPersoonAllOf" /> class.
        /// </summary>
        /// <param name="domein">Het domein waartoe de identificatie behoort. .</param>
        /// <param name="indicatieNietToonbareDiakriet">indicatieNietToonbareDiakriet.</param>
        /// <param name="beschikkingsbevoegdheid">beschikkingsbevoegdheid.</param>
        /// <param name="woonadres">woonadres.</param>
        /// <param name="postadres">postadres.</param>
        /// <param name="kadastraalOnroerendeZaakIdentificaties">kadastraalOnroerendeZaakIdentificaties.</param>
        public KadasterPersoonAllOf(string domein = default(string), bool indicatieNietToonbareDiakriet = default(bool), Waardelijst beschikkingsbevoegdheid = default(Waardelijst), AdresUitgebreid woonadres = default(AdresUitgebreid), Postadres postadres = default(Postadres), List<string> kadastraalOnroerendeZaakIdentificaties = default(List<string>))
        {
            this.Domein = domein;
            this.IndicatieNietToonbareDiakriet = indicatieNietToonbareDiakriet;
            this.Beschikkingsbevoegdheid = beschikkingsbevoegdheid;
            this.Woonadres = woonadres;
            this.Postadres = postadres;
            this.KadastraalOnroerendeZaakIdentificaties = kadastraalOnroerendeZaakIdentificaties;
        }

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
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KadasterPersoonAllOf {\n");
            sb.Append("  Domein: ").Append(Domein).Append("\n");
            sb.Append("  IndicatieNietToonbareDiakriet: ").Append(IndicatieNietToonbareDiakriet).Append("\n");
            sb.Append("  Beschikkingsbevoegdheid: ").Append(Beschikkingsbevoegdheid).Append("\n");
            sb.Append("  Woonadres: ").Append(Woonadres).Append("\n");
            sb.Append("  Postadres: ").Append(Postadres).Append("\n");
            sb.Append("  KadastraalOnroerendeZaakIdentificaties: ").Append(KadastraalOnroerendeZaakIdentificaties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KadasterPersoonAllOf);
        }

        /// <summary>
        /// Returns true if KadasterPersoonAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of KadasterPersoonAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KadasterPersoonAllOf input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Domein == input.Domein ||
                    (this.Domein != null &&
                    this.Domein.Equals(input.Domein))
                ) && 
                (
                    this.IndicatieNietToonbareDiakriet == input.IndicatieNietToonbareDiakriet ||
                    (this.IndicatieNietToonbareDiakriet != null &&
                    this.IndicatieNietToonbareDiakriet.Equals(input.IndicatieNietToonbareDiakriet))
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
                if (this.Domein != null)
                    hashCode = hashCode * 59 + this.Domein.GetHashCode();
                if (this.IndicatieNietToonbareDiakriet != null)
                    hashCode = hashCode * 59 + this.IndicatieNietToonbareDiakriet.GetHashCode();
                if (this.Beschikkingsbevoegdheid != null)
                    hashCode = hashCode * 59 + this.Beschikkingsbevoegdheid.GetHashCode();
                if (this.Woonadres != null)
                    hashCode = hashCode * 59 + this.Woonadres.GetHashCode();
                if (this.Postadres != null)
                    hashCode = hashCode * 59 + this.Postadres.GetHashCode();
                if (this.KadastraalOnroerendeZaakIdentificaties != null)
                    hashCode = hashCode * 59 + this.KadastraalOnroerendeZaakIdentificaties.GetHashCode();
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
