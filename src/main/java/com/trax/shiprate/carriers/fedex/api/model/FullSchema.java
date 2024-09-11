package com.trax.shiprate.carriers.fedex.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The request elements for OAuth API.
 */
@Schema(description = "The request elements for OAuth API.")
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-10T20:55:07.300722839Z[GMT]")

public class FullSchema {
  @SerializedName("grant_type")
  private String grantType = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("client_secret")
  private String clientSecret = null;

  @SerializedName("child_Key")
  private String childKey = null;

  @SerializedName("child_secret")
  private String childSecret = null;

  public FullSchema grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * Specify Type of customer requesting the Oauth token.&lt;br&gt;Valid Values: client_credentials, csp_credentials, client_pc_credentials&lt;br&gt;Note:&lt;br&gt;client_credentials - should be used for customers and brand new Compatible Provider customers who are yet to unboard child accounts.&lt;br&gt;csp_credentials - should be used for Compatible Provider customers with existing child accounts.&lt;br&gt;client_pc_credentials – should be used for Proprietary Parent Child customers.
   * @return grantType
  **/
  @Schema(required = true, description = "Specify Type of customer requesting the Oauth token.<br>Valid Values: client_credentials, csp_credentials, client_pc_credentials<br>Note:<br>client_credentials - should be used for customers and brand new Compatible Provider customers who are yet to unboard child accounts.<br>csp_credentials - should be used for Compatible Provider customers with existing child accounts.<br>client_pc_credentials – should be used for Proprietary Parent Child customers.")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public FullSchema clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Specify the Client ID also known as API Key received during FedEx Developer portal registration.&lt;br&gt;Example: XXXX-XXX-XXXX-XXX
   * @return clientId
  **/
  @Schema(required = true, description = "Specify the Client ID also known as API Key received during FedEx Developer portal registration.<br>Example: XXXX-XXX-XXXX-XXX")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public FullSchema clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Specify the Client secret also known as Secret Key received during FedEx Developer portal registration.&lt;br&gt;Example: XXXX-XXX-XXXX-XXX
   * @return clientSecret
  **/
  @Schema(required = true, description = "Specify the Client secret also known as Secret Key received during FedEx Developer portal registration.<br>Example: XXXX-XXX-XXXX-XXX")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public FullSchema childKey(String childKey) {
    this.childKey = childKey;
    return this;
  }

   /**
   * Specify the Client ID also known as Customer Key. This element is used as a login credential for a Compatible customer or a Proprietary Parent Child customer to access the application on behalf of their customer.&lt;br&gt;Example: XXXX-XXX-XXXX-XXX&lt;br&gt;Note: This element should be used by Compatible and Proprietary Parent Child customers.
   * @return childKey
  **/
  @Schema(description = "Specify the Client ID also known as Customer Key. This element is used as a login credential for a Compatible customer or a Proprietary Parent Child customer to access the application on behalf of their customer.<br>Example: XXXX-XXX-XXXX-XXX<br>Note: This element should be used by Compatible and Proprietary Parent Child customers.")
  public String getChildKey() {
    return childKey;
  }

  public void setChildKey(String childKey) {
    this.childKey = childKey;
  }

  public FullSchema childSecret(String childSecret) {
    this.childSecret = childSecret;
    return this;
  }

   /**
   * Specify the Client secret also known as Customer Secret. This element is used as a login credential for a Compatible customer or a Proprietary Parent Child customer to access the application on behalf of their customer.&lt;br&gt;Example: XXXX-XXX-XXXX-XXX&lt;br&gt;Note: This element should be used by Compatible and Proprietary Parent Child customers.
   * @return childSecret
  **/
  @Schema(description = "Specify the Client secret also known as Customer Secret. This element is used as a login credential for a Compatible customer or a Proprietary Parent Child customer to access the application on behalf of their customer.<br>Example: XXXX-XXX-XXXX-XXX<br>Note: This element should be used by Compatible and Proprietary Parent Child customers.")
  public String getChildSecret() {
    return childSecret;
  }

  public void setChildSecret(String childSecret) {
    this.childSecret = childSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullSchema fullSchema = (FullSchema) o;
    return Objects.equals(this.grantType, fullSchema.grantType) &&
        Objects.equals(this.clientId, fullSchema.clientId) &&
        Objects.equals(this.clientSecret, fullSchema.clientSecret) &&
        Objects.equals(this.childKey, fullSchema.childKey) &&
        Objects.equals(this.childSecret, fullSchema.childSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, clientId, clientSecret, childKey, childSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullSchema {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    childKey: ").append(toIndentedString(childKey)).append("\n");
    sb.append("    childSecret: ").append(toIndentedString(childSecret)).append("\n");
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
