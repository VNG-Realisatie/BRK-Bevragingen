/*
 * Kadaster - BRK-Bevragen API
 *
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Waardelijst in deze component :   [aard](http://www.kadaster.nl/schemas/waardelijsten/AardAantekening/) 
    /// </summary>
    [DataContract(Name = "AantekeningBasis")]
    public partial class AantekeningBasis : IEquatable<AantekeningBasis>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AantekeningBasis" /> class.
        /// </summary>
        /// <param name="aard">aard.</param>
        /// <param name="omschrijving">omschrijving.</param>
        /// <param name="betreftGedeelteVanPerceel">betreftGedeelteVanPerceel.</param>
        public AantekeningBasis(Waardelijst aard = default(Waardelijst), string omschrijving = default(string), bool betreftGedeelteVanPerceel = default(bool))
        {
            this.Aard = aard;
            this.Omschrijving = omschrijving;
            this.BetreftGedeelteVanPerceel = betreftGedeelteVanPerceel;
        }

        /// <summary>
        /// Gets or Sets Aard
        /// </summary>
        [DataMember(Name = "aard", EmitDefaultValue = false)]
        public Waardelijst Aard { get; set; }

        /// <summary>
        /// Gets or Sets Omschrijving
        /// </summary>
        [DataMember(Name = "omschrijving", EmitDefaultValue = false)]
        public string Omschrijving { get; set; }

        /// <summary>
        /// Gets or Sets BetreftGedeelteVanPerceel
        /// </summary>
        [DataMember(Name = "betreftGedeelteVanPerceel", EmitDefaultValue = true)]
        public bool BetreftGedeelteVanPerceel { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AantekeningBasis {\n");
            sb.Append("  Aard: ").Append(Aard).Append("\n");
            sb.Append("  Omschrijving: ").Append(Omschrijving).Append("\n");
            sb.Append("  BetreftGedeelteVanPerceel: ").Append(BetreftGedeelteVanPerceel).Append("\n");
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
            return this.Equals(input as AantekeningBasis);
        }

        /// <summary>
        /// Returns true if AantekeningBasis instances are equal
        /// </summary>
        /// <param name="input">Instance of AantekeningBasis to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AantekeningBasis input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Aard == input.Aard ||
                    (this.Aard != null &&
                    this.Aard.Equals(input.Aard))
                ) && 
                (
                    this.Omschrijving == input.Omschrijving ||
                    (this.Omschrijving != null &&
                    this.Omschrijving.Equals(input.Omschrijving))
                ) && 
                (
                    this.BetreftGedeelteVanPerceel == input.BetreftGedeelteVanPerceel ||
                    this.BetreftGedeelteVanPerceel.Equals(input.BetreftGedeelteVanPerceel)
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
                if (this.Aard != null)
                    hashCode = hashCode * 59 + this.Aard.GetHashCode();
                if (this.Omschrijving != null)
                    hashCode = hashCode * 59 + this.Omschrijving.GetHashCode();
                hashCode = hashCode * 59 + this.BetreftGedeelteVanPerceel.GetHashCode();
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
