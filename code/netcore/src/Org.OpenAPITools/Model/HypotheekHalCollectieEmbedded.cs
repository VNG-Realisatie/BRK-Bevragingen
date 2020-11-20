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
    /// HypotheekHalCollectieEmbedded
    /// </summary>
    [DataContract]
    public partial class HypotheekHalCollectieEmbedded :  IEquatable<HypotheekHalCollectieEmbedded>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HypotheekHalCollectieEmbedded" /> class.
        /// </summary>
        /// <param name="hypotheken">hypotheken.</param>
        public HypotheekHalCollectieEmbedded(List<HypotheekHal> hypotheken = default(List<HypotheekHal>))
        {
            this.Hypotheken = hypotheken;
        }
        
        /// <summary>
        /// Gets or Sets Hypotheken
        /// </summary>
        [DataMember(Name="hypotheken", EmitDefaultValue=false)]
        public List<HypotheekHal> Hypotheken { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HypotheekHalCollectieEmbedded {\n");
            sb.Append("  Hypotheken: ").Append(Hypotheken).Append("\n");
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
            return this.Equals(input as HypotheekHalCollectieEmbedded);
        }

        /// <summary>
        /// Returns true if HypotheekHalCollectieEmbedded instances are equal
        /// </summary>
        /// <param name="input">Instance of HypotheekHalCollectieEmbedded to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HypotheekHalCollectieEmbedded input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Hypotheken == input.Hypotheken ||
                    this.Hypotheken != null &&
                    input.Hypotheken != null &&
                    this.Hypotheken.SequenceEqual(input.Hypotheken)
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
                if (this.Hypotheken != null)
                    hashCode = hashCode * 59 + this.Hypotheken.GetHashCode();
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
