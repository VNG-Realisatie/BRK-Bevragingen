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
    /// BeslagLinks
    /// </summary>
    [DataContract]
    public partial class BeslagLinks :  IEquatable<BeslagLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BeslagLinks" /> class.
        /// </summary>
        /// <param name="self">self.</param>
        /// <param name="beslagleggers">beslagleggers.</param>
        /// <param name="stukken">stukken.</param>
        /// <param name="isGebaseerdOpStukdeel">isGebaseerdOpStukdeel.</param>
        /// <param name="isVermeldInStukdelen">isVermeldInStukdelen.</param>
        public BeslagLinks(HalLink self = default(HalLink), List<HalLink> beslagleggers = default(List<HalLink>), List<HalLink> stukken = default(List<HalLink>), HalLink isGebaseerdOpStukdeel = default(HalLink), List<HalLink> isVermeldInStukdelen = default(List<HalLink>))
        {
            this.Self = self;
            this.Beslagleggers = beslagleggers;
            this.Stukken = stukken;
            this.IsGebaseerdOpStukdeel = isGebaseerdOpStukdeel;
            this.IsVermeldInStukdelen = isVermeldInStukdelen;
        }
        
        /// <summary>
        /// Gets or Sets Self
        /// </summary>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public HalLink Self { get; set; }

        /// <summary>
        /// Gets or Sets Beslagleggers
        /// </summary>
        [DataMember(Name="beslagleggers", EmitDefaultValue=false)]
        public List<HalLink> Beslagleggers { get; set; }

        /// <summary>
        /// Gets or Sets Stukken
        /// </summary>
        [DataMember(Name="stukken", EmitDefaultValue=false)]
        public List<HalLink> Stukken { get; set; }

        /// <summary>
        /// Gets or Sets IsGebaseerdOpStukdeel
        /// </summary>
        [DataMember(Name="isGebaseerdOpStukdeel", EmitDefaultValue=false)]
        public HalLink IsGebaseerdOpStukdeel { get; set; }

        /// <summary>
        /// Gets or Sets IsVermeldInStukdelen
        /// </summary>
        [DataMember(Name="isVermeldInStukdelen", EmitDefaultValue=false)]
        public List<HalLink> IsVermeldInStukdelen { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BeslagLinks {\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  Beslagleggers: ").Append(Beslagleggers).Append("\n");
            sb.Append("  Stukken: ").Append(Stukken).Append("\n");
            sb.Append("  IsGebaseerdOpStukdeel: ").Append(IsGebaseerdOpStukdeel).Append("\n");
            sb.Append("  IsVermeldInStukdelen: ").Append(IsVermeldInStukdelen).Append("\n");
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
            return this.Equals(input as BeslagLinks);
        }

        /// <summary>
        /// Returns true if BeslagLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of BeslagLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BeslagLinks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Self == input.Self ||
                    (this.Self != null &&
                    this.Self.Equals(input.Self))
                ) && 
                (
                    this.Beslagleggers == input.Beslagleggers ||
                    this.Beslagleggers != null &&
                    input.Beslagleggers != null &&
                    this.Beslagleggers.SequenceEqual(input.Beslagleggers)
                ) && 
                (
                    this.Stukken == input.Stukken ||
                    this.Stukken != null &&
                    input.Stukken != null &&
                    this.Stukken.SequenceEqual(input.Stukken)
                ) && 
                (
                    this.IsGebaseerdOpStukdeel == input.IsGebaseerdOpStukdeel ||
                    (this.IsGebaseerdOpStukdeel != null &&
                    this.IsGebaseerdOpStukdeel.Equals(input.IsGebaseerdOpStukdeel))
                ) && 
                (
                    this.IsVermeldInStukdelen == input.IsVermeldInStukdelen ||
                    this.IsVermeldInStukdelen != null &&
                    input.IsVermeldInStukdelen != null &&
                    this.IsVermeldInStukdelen.SequenceEqual(input.IsVermeldInStukdelen)
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
                if (this.Self != null)
                    hashCode = hashCode * 59 + this.Self.GetHashCode();
                if (this.Beslagleggers != null)
                    hashCode = hashCode * 59 + this.Beslagleggers.GetHashCode();
                if (this.Stukken != null)
                    hashCode = hashCode * 59 + this.Stukken.GetHashCode();
                if (this.IsGebaseerdOpStukdeel != null)
                    hashCode = hashCode * 59 + this.IsGebaseerdOpStukdeel.GetHashCode();
                if (this.IsVermeldInStukdelen != null)
                    hashCode = hashCode * 59 + this.IsVermeldInStukdelen.GetHashCode();
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
